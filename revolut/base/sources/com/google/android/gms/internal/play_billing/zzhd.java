package com.google.android.gms.internal.play_billing;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v0.a;
import zsc.p;

/* JADX INFO: loaded from: classes16.dex */
final class zzhd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final char[] f46069zza;

    static {
        char[] cArr = new char[80];
        f46069zza = cArr;
        Arrays.fill(cArr, p.SPACE_CHAR);
    }

    public static String zza(zzhb zzhbVar, String str) {
        StringBuilder sbL = a.l("# ", str);
        zzd(zzhbVar, sbL, 0);
        return sbL.toString();
    }

    public static void zzb(StringBuilder sb6, int i, String str, Object obj2) {
        if (obj2 instanceof List) {
            Iterator it8 = ((List) obj2).iterator();
            while (it8.hasNext()) {
                zzb(sb6, i, str, it8.next());
            }
            return;
        }
        if (obj2 instanceof Map) {
            Iterator it9 = ((Map) obj2).entrySet().iterator();
            while (it9.hasNext()) {
                zzb(sb6, i, str, (Map.Entry) it9.next());
            }
            return;
        }
        sb6.append('\n');
        zzc(i, sb6);
        if (!str.isEmpty()) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb9.append("_");
                }
                sb9.append(Character.toLowerCase(cCharAt));
            }
            str = sb9.toString();
        }
        sb6.append(str);
        if (obj2 instanceof String) {
            sb6.append(": \"");
            String str2 = (String) obj2;
            zzev zzevVar = zzev.f45974zza;
            sb6.append(zzhz.zza(str2.isEmpty() ? zzev.f45974zza : new zzet(str2.getBytes(zzga.f46029zza))));
            sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj2 instanceof zzev) {
            sb6.append(": \"");
            sb6.append(zzhz.zza((zzev) obj2));
            sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj2 instanceof zzfu) {
            sb6.append(" {");
            zzd((zzfu) obj2, sb6, i + 2);
            sb6.append("\n");
            zzc(i, sb6);
            sb6.append("}");
            return;
        }
        if (!(obj2 instanceof Map.Entry)) {
            sb6.append(": ");
            sb6.append(obj2);
            return;
        }
        int i3 = i + 2;
        sb6.append(" {");
        Map.Entry entry = (Map.Entry) obj2;
        zzb(sb6, i3, "key", entry.getKey());
        zzb(sb6, i3, "value", entry.getValue());
        sb6.append("\n");
        zzc(i, sb6);
        sb6.append("}");
    }

    private static void zzc(int i, StringBuilder sb6) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb6.append(f46069zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzd(com.google.android.gms.internal.play_billing.zzhb r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhd.zzd(com.google.android.gms.internal.play_billing.zzhb, java.lang.StringBuilder, int):void");
    }
}
