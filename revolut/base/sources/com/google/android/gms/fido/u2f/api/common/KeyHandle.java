package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "KeyHandleCreator")
@Deprecated
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new zze();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int f38694zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBytes", id = 2)
    private final byte[] f38695zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final ProtocolVersion f38696zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransports", id = 4)
    private final List f38697zzd;

    @SafeParcelable.Constructor
    public KeyHandle(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) List list) {
        this.f38694zza = i;
        this.f38695zzb = bArr;
        try {
            this.f38696zzc = ProtocolVersion.fromString(str);
            this.f38697zzd = list;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static KeyHandle parseFromJson(@NonNull JSONObject jSONObject) throws JSONException {
        try {
            try {
                return new KeyHandle(Base64.decode(jSONObject.getString("keyHandle"), 8), ProtocolVersion.fromString(jSONObject.has("version") ? jSONObject.getString("version") : null), jSONObject.has("transports") ? Transport.parseTransports(jSONObject.getJSONArray("transports")) : null);
            } catch (IllegalArgumentException e) {
                throw new JSONException(e.toString());
            }
        } catch (ProtocolVersion.UnsupportedProtocolException e2) {
            throw new JSONException(e2.toString());
        }
    }

    public boolean equals(@NonNull Object obj2) {
        List list;
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj2;
        if (!Arrays.equals(this.f38695zzb, keyHandle.f38695zzb) || !this.f38696zzc.equals(keyHandle.f38696zzc)) {
            return false;
        }
        List list2 = this.f38697zzd;
        if (list2 == null && keyHandle.f38697zzd == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.f38697zzd) != null && list2.containsAll(list) && keyHandle.f38697zzd.containsAll(this.f38697zzd);
    }

    @NonNull
    public byte[] getBytes() {
        return this.f38695zzb;
    }

    @NonNull
    public ProtocolVersion getProtocolVersion() {
        return this.f38696zzc;
    }

    @NonNull
    public List<Transport> getTransports() {
        return this.f38697zzd;
    }

    public int getVersionCode() {
        return this.f38694zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f38695zzb)), this.f38696zzc, this.f38697zzd);
    }

    @NonNull
    public JSONObject toJson() {
        return zza();
    }

    @NonNull
    public String toString() {
        List list = this.f38697zzd;
        String string = list == null ? "null" : list.toString();
        String strEncode = Base64Utils.encode(this.f38695zzb);
        ProtocolVersion protocolVersion = this.f38696zzc;
        StringBuilder sb6 = new StringBuilder("{keyHandle: ");
        sb6.append(strEncode);
        sb6.append(", version: ");
        sb6.append(protocolVersion);
        sb6.append(", transports: ");
        return a.i(sb6, string, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeByteArray(parcel, 2, getBytes(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f38696zzc.toString(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte[] bArr = this.f38695zzb;
            if (bArr != null) {
                jSONObject.put("keyHandle", Base64.encodeToString(bArr, 11));
            }
            ProtocolVersion protocolVersion = this.f38696zzc;
            if (protocolVersion != null) {
                jSONObject.put("version", protocolVersion.toString());
            }
            if (this.f38697zzd != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it8 = this.f38697zzd.iterator();
                while (it8.hasNext()) {
                    jSONArray.put(((Transport) it8.next()).toString());
                }
                jSONObject.put("transports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public KeyHandle(@NonNull byte[] bArr, @NonNull ProtocolVersion protocolVersion, List<Transport> list) {
        this.f38694zza = 1;
        this.f38695zzb = bArr;
        this.f38696zzc = protocolVersion;
        this.f38697zzd = list;
    }
}
