package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzqr;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class zzho {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzht f47072zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47073zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Bundle f47074zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Bundle f47075zzd;

    public zzho(zzht zzhtVar, String str, Bundle bundle) {
        this.f47072zza = zzhtVar;
        Preconditions.checkNotEmpty(str);
        this.f47073zzb = str;
        this.f47074zzc = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[Catch: NumberFormatException | JSONException -> 0x010d, NumberFormatException | JSONException -> 0x010d, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x010d, blocks: (B:10:0x0027, B:24:0x005c, B:24:0x005c, B:26:0x006d, B:26:0x006d, B:28:0x007f, B:28:0x007f, B:29:0x0088, B:29:0x0088, B:51:0x00fd, B:51:0x00fd, B:33:0x0095, B:33:0x0095, B:35:0x00a6, B:35:0x00a6, B:37:0x00b8, B:37:0x00b8, B:38:0x00c1, B:38:0x00c1, B:42:0x00cd, B:42:0x00cd, B:46:0x00dd, B:46:0x00dd, B:50:0x00f1, B:50:0x00f1), top: B:65:0x0027, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zza() {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzho.zza():android.os.Bundle");
    }

    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzht zzhtVar = this.f47072zza;
        SharedPreferences.Editor editorEdit = zzhtVar.zzb().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.f47073zzb);
        } else {
            String str = this.f47073zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj2 = bundle2.get(str2);
                if (obj2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzqr.zzb();
                        zzio zzioVar = zzhtVar.zzu;
                        if (zzioVar.zzf().zzx(null, zzgi.zzaW)) {
                            if (obj2 instanceof String) {
                                jSONObject.put("v", obj2.toString());
                                jSONObject.put("t", "s");
                            } else if (obj2 instanceof Long) {
                                jSONObject.put("v", obj2.toString());
                                jSONObject.put("t", "l");
                            } else if (obj2 instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj2));
                                jSONObject.put("t", "ia");
                            } else if (obj2 instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj2));
                                jSONObject.put("t", "la");
                            } else if (obj2 instanceof Double) {
                                jSONObject.put("v", obj2.toString());
                                jSONObject.put("t", "d");
                            } else {
                                zzioVar.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj2.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj2.toString());
                            if (obj2 instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj2 instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj2 instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzioVar.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj2.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        this.f47072zza.zzu.zzaW().zze().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f47075zzd = bundle2;
    }
}
