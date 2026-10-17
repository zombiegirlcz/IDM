package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v0.a;
import zsc.p;

/* JADX INFO: loaded from: classes16.dex */
final class zznj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final char[] f40495zza;

    static {
        char[] cArr = new char[80];
        f40495zza = cArr;
        Arrays.fill(cArr, p.SPACE_CHAR);
    }

    public static String zza(zznh zznhVar, String str) {
        StringBuilder sbL = a.l("# ", str);
        zzd(zznhVar, sbL, 0);
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
            zzld zzldVar = zzld.f40408zzb;
            sb6.append(zzoc.zza(new zzlb(((String) obj2).getBytes(zzmk.f40465zza))));
            sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj2 instanceof zzld) {
            sb6.append(": \"");
            sb6.append(zzoc.zza((zzld) obj2));
            sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj2 instanceof zzmd) {
            sb6.append(" {");
            zzd((zzmd) obj2, sb6, i + 2);
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
            sb6.append(f40495zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzd(com.google.android.gms.internal.measurement.zznh r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznj.zzd(com.google.android.gms.internal.measurement.zznh, java.lang.StringBuilder, int):void");
    }
}
