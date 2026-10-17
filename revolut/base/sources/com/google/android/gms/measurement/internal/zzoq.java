package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzoq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f47622zza;

    public zzoq(Map map) {
        HashMap map2 = new HashMap();
        this.f47622zza = map2;
        map2.putAll(map);
    }

    private final int zzf() {
        try {
            String str = (String) this.f47622zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final Bundle zzg() {
        int iZzf;
        Map map = this.f47622zza;
        if ("1".equals(map.get("GoogleConsent")) && (iZzf = zzf()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(zzjw.AD_STORAGE.f47267zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(zzjw.AD_PERSONALIZATION.f47267zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iZzf >= 4) {
                    String str3 = zzjw.AD_USER_DATA.f47267zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzoq) {
            return zze().equalsIgnoreCase(((zzoq) obj2).zze());
        }
        return false;
    }

    public final int hashCode() {
        return zze().hashCode();
    }

    public final String toString() {
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zza() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzoq.zza():android.os.Bundle");
    }

    public final String zzb() {
        String str = (String) this.f47622zza.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String zzc(zzoq zzoqVar) {
        Map map = zzoqVar.f47622zza;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle bundleZza = zza();
        Bundle bundleZza2 = zzoqVar.zza();
        return str.concat((bundleZza.size() == bundleZza2.size() && Objects.equals(bundleZza.getString("ad_storage"), bundleZza2.getString("ad_storage")) && Objects.equals(bundleZza.getString("ad_personalization"), bundleZza2.getString("ad_personalization")) && Objects.equals(bundleZza.getString("ad_user_data"), bundleZza2.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String zzd() {
        StringBuilder sb6 = new StringBuilder("1");
        int i = -1;
        try {
            String str = (String) this.f47622zza.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb6.append("00");
        } else {
            sb6.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb6.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int iZzf = zzf();
        if (iZzf < 0 || iZzf > 63) {
            sb6.append("0");
        } else {
            sb6.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzf));
        }
        Preconditions.checkArgument(true);
        Map map = this.f47622zza;
        int i2 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i3 = i2 | 4;
        if (zEquals) {
            i3 = i2 | 12;
        }
        sb6.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zze() {
        StringBuilder sb6 = new StringBuilder();
        ImmutableList immutableList = zzot.f47628zza;
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) immutableList.get(i);
            Map map = this.f47622zza;
            if (map.containsKey(str)) {
                if (sb6.length() > 0) {
                    sb6.append(";");
                }
                sb6.append(str);
                sb6.append("=");
                sb6.append((String) map.get(str));
            }
        }
        return sb6.toString();
    }
}
