package com.youTransactor.uCube.mdm;

import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.log.LogManager;
import defpackage.v1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class BinaryUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Config f107592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f107593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f107594c;
    public byte[] d;
    public List e;

    public BinaryUpdate(@NonNull Config config, boolean z) {
        this.f107592a = config;
        this.f107593b = z;
    }

    public static ArrayList a(byte[] bArr) {
        if (bArr == null) {
            v1.b("Error ! binary input null", new Exception[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 2;
            if (bArr.length < i2) {
                v1.b("Error ! binary input length < 2", new Exception[0]);
                return null;
            }
            int iMakeShort = Tools.makeShort(bArr[i], bArr[i + 1]);
            if (iMakeShort == 0) {
                break;
            }
            int i3 = i2 + iMakeShort;
            if (bArr.length < i3) {
                v1.b("Error ! binary input length < content length + offset", new Exception[0]);
                return null;
            }
            byte[] bArr2 = new byte[iMakeShort];
            System.arraycopy(bArr, i2, bArr2, 0, iMakeShort);
            arrayList.add(bArr2);
            i = i3;
        }
        return arrayList;
    }

    public static List<BinaryUpdate> fromZip(@NonNull Config config, boolean z, Map<String, byte[]> map) {
        String next;
        String next2;
        if (map == null || map.isEmpty()) {
            v1.b("Error ! zip folder empty", new Exception[0]);
            return null;
        }
        if (map.get("key") == null || map.get("manifest.json") == null) {
            v1.b("Error! key or manifest is null", new Exception[0]);
            return null;
        }
        byte[] bArr = map.get("key");
        String str = new String(map.get("manifest.json"), StandardCharsets.UTF_8);
        v1.a("manifest content : ".concat(str));
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("binary_list");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                v1.a("binary [" + i + "] : " + jSONArray.getString(i));
                Set<String> setKeySet = map.keySet();
                String string = jSONArray.getString(i);
                Iterator<String> it8 = setKeySet.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next.startsWith(string) && next.endsWith(".sig")) {
                        break;
                    }
                }
                Set<String> setKeySet2 = map.keySet();
                String string2 = jSONArray.getString(i);
                Iterator<String> it9 = setKeySet2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it9.next();
                    if (next2.startsWith(string2) && next2.endsWith(".bin")) {
                        break;
                    }
                }
                if (next == null || next2 == null) {
                    String str2 = "Warning! No bin or sig file in zip with Name start with " + jSONArray.getString(i);
                    if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.MDM.getCode()) {
                        LogManager.w("[MDM]", str2);
                    }
                } else {
                    byte[] bArr2 = map.get(next);
                    int type = config.getType();
                    if (bArr2 != null && bArr2.length > 258) {
                        type = bArr2[258] & Ascii.DEL;
                    }
                    int i2 = type;
                    v1.a("bin: " + next2 + " sig: " + next + " Type: " + i2);
                    BinaryUpdate binaryUpdate = new BinaryUpdate(new Config(i2, jSONArray.getString(i), config.isCiphered(), config.getMinVersion(), config.getCurrentVersion()), z);
                    binaryUpdate.setSignature(map.get(next));
                    binaryUpdate.setKey(bArr);
                    ArrayList arrayListA = a(map.get(next2));
                    if (arrayListA != null && !arrayListA.isEmpty()) {
                        binaryUpdate.setBinaryBlock(arrayListA);
                        arrayList.add(binaryUpdate);
                    } else if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.MDM.getCode()) {
                        LogManager.w("[MDM]", "Warning! binary blocks empty ");
                    }
                }
            }
            if (jSONArray.length() != arrayList.size() && LogManager.getLogLevel().getCode() >= LogManager.LogLevel.MDM.getCode()) {
                LogManager.w("[MDM]", "Warning! the binary list size not the same as described in manifest");
            }
            v1.a("binary list size " + arrayList.size());
            return arrayList;
        } catch (JSONException e) {
            v1.b("Error to convert manifest byte content tofabien  json ", e);
            return null;
        }
    }

    public List<byte[]> getBinaryBlock() {
        return this.e;
    }

    public Config getCfg() {
        return this.f107592a;
    }

    public byte[] getKey() {
        return this.d;
    }

    public byte[] getSignature() {
        return this.f107594c;
    }

    public boolean isMandatory() {
        return this.f107593b;
    }

    public void setBinaryBlock(List<byte[]> list) {
        this.e = list;
    }

    public void setKey(byte[] bArr) {
        this.d = bArr;
    }

    public void setMandatory(boolean z) {
        this.f107593b = z;
    }

    public void setSignature(byte[] bArr) {
        this.f107594c = bArr;
    }
}
