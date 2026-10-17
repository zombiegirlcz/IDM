package com.google.android.gms.internal.play_billing;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzfm {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final zzfm f45998zzd = new zzfm(true);

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final zzht f45999zza = new zzho();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    boolean f46000zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    boolean f46001zzc;

    private zzfm() {
    }

    public static int zza(zzir zzirVar, int i, Object obj2) {
        int iZzy = zzfc.zzy(i << 3);
        if (zzirVar == zzir.f46146zzj) {
            iZzy += iZzy;
        }
        return iZzy + zzb(zzirVar, obj2);
    }

    public static int zzb(zzir zzirVar, Object obj2) {
        int iZzb;
        int iZzy;
        zzir zzirVar2 = zzir.f46137zza;
        zzis zzisVar = zzis.INT;
        switch (zzirVar.ordinal()) {
            case 0:
                ((Double) obj2).getClass();
                int i = zzfc.f45984zzb;
                return 8;
            case 1:
                ((Float) obj2).getClass();
                int i2 = zzfc.f45984zzb;
                return 4;
            case 2:
                return zzfc.zzz(((Long) obj2).longValue());
            case 3:
                return zzfc.zzz(((Long) obj2).longValue());
            case 4:
                return zzfc.zzz(((Integer) obj2).intValue());
            case 5:
                ((Long) obj2).getClass();
                int i3 = zzfc.f45984zzb;
                return 8;
            case 6:
                ((Integer) obj2).getClass();
                int i5 = zzfc.f45984zzb;
                return 4;
            case 7:
                ((Boolean) obj2).getClass();
                int i6 = zzfc.f45984zzb;
                return 1;
            case 8:
                if (!(obj2 instanceof zzev)) {
                    int i21 = zzfc.f45984zzb;
                    iZzb = zzin.zzb((String) obj2);
                    iZzy = zzfc.zzy(iZzb);
                } else {
                    int i22 = zzfc.f45984zzb;
                    iZzb = ((zzev) obj2).zze();
                    iZzy = zzfc.zzy(iZzb);
                }
                break;
            case 9:
                return ((zzhb) obj2).zzn();
            case 10:
                if (!(obj2 instanceof zzgh)) {
                    return zzfc.zzx((zzhb) obj2);
                }
                iZzb = ((zzgh) obj2).zza();
                iZzy = zzfc.zzy(iZzb);
                break;
                break;
            case 11:
                if (!(obj2 instanceof zzev)) {
                    int i32 = zzfc.f45984zzb;
                    iZzb = ((byte[]) obj2).length;
                    iZzy = zzfc.zzy(iZzb);
                } else {
                    int i33 = zzfc.f45984zzb;
                    iZzb = ((zzev) obj2).zze();
                    iZzy = zzfc.zzy(iZzb);
                }
                break;
            case 12:
                return zzfc.zzy(((Integer) obj2).intValue());
            case 13:
                return obj2 instanceof zzfw ? zzfc.zzz(((zzfw) obj2).zza()) : zzfc.zzz(((Integer) obj2).intValue());
            case 14:
                ((Integer) obj2).getClass();
                int i43 = zzfc.f45984zzb;
                return 4;
            case 15:
                ((Long) obj2).getClass();
                int i59 = zzfc.f45984zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj2).intValue();
                return zzfc.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj2).longValue();
                return zzfc.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzy + iZzb;
    }

    public static int zzc(zzfl zzflVar, Object obj2) {
        zzir zzirVarZzb = zzflVar.zzb();
        int iZza = zzflVar.zza();
        if (!zzflVar.zze()) {
            return zza(zzirVarZzb, iZza, obj2);
        }
        List list = (List) obj2;
        int size = list.size();
        int i = 0;
        if (!zzflVar.zzd()) {
            int iZza2 = 0;
            while (i < size) {
                iZza2 += zza(zzirVarZzb, iZza, list.get(i));
                i++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i < size) {
            iZzb += zzb(zzirVarZzb, list.get(i));
            i++;
        }
        return zzfc.zzy(iZzb) + zzfc.zzy(iZza << 3) + iZzb;
    }

    public static zzfm zze() {
        return f45998zzd;
    }

    public static void zzi(zzfc zzfcVar, zzir zzirVar, int i, Object obj2) throws IOException {
        if (zzirVar == zzir.f46146zzj) {
            zzfcVar.zzs(i, 3);
            ((zzhb) obj2).zzD(zzfcVar);
            zzfcVar.zzs(i, 4);
            return;
        }
        zzfcVar.zzs(i, zzirVar.zza());
        zzis zzisVar = zzis.INT;
        switch (zzirVar.ordinal()) {
            case 0:
                zzfcVar.zzk(Double.doubleToRawLongBits(((Double) obj2).doubleValue()));
                break;
            case 1:
                zzfcVar.zzi(Float.floatToRawIntBits(((Float) obj2).floatValue()));
                break;
            case 2:
                zzfcVar.zzw(((Long) obj2).longValue());
                break;
            case 3:
                zzfcVar.zzw(((Long) obj2).longValue());
                break;
            case 4:
                zzfcVar.zzm(((Integer) obj2).intValue());
                break;
            case 5:
                zzfcVar.zzk(((Long) obj2).longValue());
                break;
            case 6:
                zzfcVar.zzi(((Integer) obj2).intValue());
                break;
            case 7:
                zzfcVar.zzb(((Boolean) obj2).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj2 instanceof zzev)) {
                    zzfcVar.zzr((String) obj2);
                } else {
                    zzfcVar.zzg((zzev) obj2);
                }
                break;
            case 9:
                ((zzhb) obj2).zzD(zzfcVar);
                break;
            case 10:
                zzfcVar.zzn((zzhb) obj2);
                break;
            case 11:
                if (!(obj2 instanceof zzev)) {
                    byte[] bArr = (byte[]) obj2;
                    zzfcVar.zze(bArr, 0, bArr.length);
                } else {
                    zzfcVar.zzg((zzev) obj2);
                }
                break;
            case 12:
                zzfcVar.zzu(((Integer) obj2).intValue());
                break;
            case 13:
                if (!(obj2 instanceof zzfw)) {
                    zzfcVar.zzm(((Integer) obj2).intValue());
                } else {
                    zzfcVar.zzm(((zzfw) obj2).zza());
                }
                break;
            case 14:
                zzfcVar.zzi(((Integer) obj2).intValue());
                break;
            case 15:
                zzfcVar.zzk(((Long) obj2).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj2).intValue();
                zzfcVar.zzu((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj2).longValue();
                zzfcVar.zzw((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzfl zzflVar = (zzfl) entry.getKey();
        if (zzflVar.zzc() != zzis.MESSAGE) {
            return true;
        }
        if (!zzflVar.zze()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj2) {
        if (obj2 instanceof zzhc) {
            return ((zzhc) obj2).zzo();
        }
        if (obj2 instanceof zzgh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int iZzy;
        int iZzx;
        zzfl zzflVar = (zzfl) entry.getKey();
        Object value = entry.getValue();
        if (zzflVar.zzc() != zzis.MESSAGE || zzflVar.zze() || zzflVar.zzd()) {
            return zzc(zzflVar, value);
        }
        if (value instanceof zzgh) {
            int iZza = ((zzfl) entry.getKey()).zza();
            int iZzy2 = zzfc.zzy(8);
            i = iZzy2 + iZzy2;
            iZzy = zzfc.zzy(iZza) + zzfc.zzy(16);
            int iZzy3 = zzfc.zzy(24);
            int iZza2 = ((zzgh) value).zza();
            iZzx = a.z(iZza2, iZza2, iZzy3);
        } else {
            int iZza3 = ((zzfl) entry.getKey()).zza();
            int iZzy4 = zzfc.zzy(8);
            i = iZzy4 + iZzy4;
            iZzy = zzfc.zzy(iZza3) + zzfc.zzy(16);
            iZzx = zzfc.zzx((zzhb) value) + zzfc.zzy(24);
        }
        return i + iZzy + iZzx;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzn(com.google.android.gms.internal.play_billing.zzfl r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.play_billing.zzir r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.play_billing.zzga.f46030zzb
            r3.getClass()
            com.google.android.gms.internal.play_billing.zzir r1 = com.google.android.gms.internal.play_billing.zzir.f46137zza
            com.google.android.gms.internal.play_billing.zzis r1 = com.google.android.gms.internal.play_billing.zzis.INT
            com.google.android.gms.internal.play_billing.zzis r0 = r0.zzb()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzhb
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzgh
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzfw
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzev
            if (r0 != 0) goto L33
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.play_billing.zzir r2 = r2.zzb()
            com.google.android.gms.internal.play_billing.zzis r2 = r2.zzb()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzfm.zzn(com.google.android.gms.internal.play_billing.zzfl, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzfm zzfmVar = new zzfm();
        zzht zzhtVar = this.f45999zza;
        int iZzc = zzhtVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = zzhtVar.zzg(i);
            zzfmVar.zzh((zzfl) ((zzhp) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzhtVar.zzd()) {
            zzfmVar.zzh((zzfl) entry.getKey(), entry.getValue());
        }
        zzfmVar.f46001zzc = this.f46001zzc;
        return zzfmVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzfm) {
            return this.f45999zza.equals(((zzfm) obj2).f45999zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45999zza.hashCode();
    }

    public final int zzd() {
        zzht zzhtVar = this.f45999zza;
        int iZzc = zzhtVar.zzc();
        int iZzm = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzm += zzm(zzhtVar.zzg(i));
        }
        Iterator it8 = zzhtVar.zzd().iterator();
        while (it8.hasNext()) {
            iZzm += zzm((Map.Entry) it8.next());
        }
        return iZzm;
    }

    public final Iterator zzf() {
        zzht zzhtVar = this.f45999zza;
        return zzhtVar.isEmpty() ? Collections.emptyIterator() : this.f46001zzc ? new zzgf(zzhtVar.entrySet().iterator()) : zzhtVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.f46000zzb) {
            return;
        }
        zzht zzhtVar = this.f45999zza;
        int iZzc = zzhtVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = zzhtVar.zzg(i).getValue();
            if (value instanceof zzfu) {
                ((zzfu) value).zzz();
            }
        }
        Iterator it8 = zzhtVar.zzd().iterator();
        while (it8.hasNext()) {
            Object value2 = ((Map.Entry) it8.next()).getValue();
            if (value2 instanceof zzfu) {
                ((zzfu) value2).zzz();
            }
        }
        zzhtVar.zza();
        this.f46000zzb = true;
    }

    public final void zzh(zzfl zzflVar, Object obj2) {
        if (!zzflVar.zze()) {
            zzn(zzflVar, obj2);
        } else {
            if (!(obj2 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj3 = list.get(i);
                zzn(zzflVar, obj3);
                arrayList.add(obj3);
            }
            obj2 = arrayList;
        }
        if (obj2 instanceof zzgh) {
            this.f46001zzc = true;
        }
        this.f45999zza.put(zzflVar, obj2);
    }

    public final boolean zzj() {
        zzht zzhtVar = this.f45999zza;
        int iZzc = zzhtVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzk(zzhtVar.zzg(i))) {
                return false;
            }
        }
        Iterator it8 = zzhtVar.zzd().iterator();
        while (it8.hasNext()) {
            if (!zzk((Map.Entry) it8.next())) {
                return false;
            }
        }
        return true;
    }

    private zzfm(boolean z) {
        zzg();
        zzg();
    }
}
