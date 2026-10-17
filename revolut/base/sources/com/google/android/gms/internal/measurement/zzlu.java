package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.util.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzlu {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzlu f40434zzb = new zzlu(true);

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final zzoa f40435zza = new zznv();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f40436zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f40437zzd;

    private zzlu() {
    }

    public static int zza(zzop zzopVar, int i, Object obj2) {
        zzlk.zzz(i << 3);
        if (zzop.f40567zzj == null) {
            byte[] bArr = zzmk.f40466zzb;
            if (((zznh) obj2) instanceof zzkp) {
                throw null;
            }
        }
        zzoq zzoqVar = zzoq.INT;
        throw null;
    }

    public static int zzb(zzlt zzltVar, Object obj2) {
        zzop zzopVarZzb = zzltVar.zzb();
        int iZza = zzltVar.zza();
        if (!zzltVar.zze()) {
            return zza(zzopVarZzb, iZza, obj2);
        }
        List list = (List) obj2;
        int size = list.size();
        if (!zzltVar.zzd()) {
            int iZza2 = 0;
            for (int i = 0; i < size; i++) {
                iZza2 += zza(zzopVarZzb, iZza, list.get(i));
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return zzlk.zzz(0) + zzlk.zzz(iZza << 3);
        }
        list.get(0);
        zzop zzopVar = zzop.f40558zza;
        zzoq zzoqVar = zzoq.INT;
        throw null;
    }

    public static zzlu zzd() {
        return f40434zzb;
    }

    private static boolean zzi(Map.Entry entry) {
        zzlt zzltVar = (zzlt) entry.getKey();
        if (zzltVar.zzc() != zzoq.MESSAGE) {
            return true;
        }
        if (!zzltVar.zze()) {
            return zzj(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzj(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzj(Object obj2) {
        if (obj2 instanceof zzni) {
            return ((zzni) obj2).zzcD();
        }
        if (obj2 instanceof zzmr) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzk(Map.Entry entry) {
        int i;
        int iZzz;
        int iA;
        zzlt zzltVar = (zzlt) entry.getKey();
        Object value = entry.getValue();
        if (zzltVar.zzc() != zzoq.MESSAGE || zzltVar.zze() || zzltVar.zzd()) {
            return zzb(zzltVar, value);
        }
        if (value instanceof zzmr) {
            int iZza = ((zzlt) entry.getKey()).zza();
            int iZzz2 = zzlk.zzz(8);
            i = iZzz2 + iZzz2;
            iZzz = zzlk.zzz(iZza) + zzlk.zzz(16);
            int iZzz3 = zzlk.zzz(24);
            int iZza2 = ((zzmr) value).zza();
            iA = a.a(iZza2, iZza2, iZzz3);
        } else {
            int iZza3 = ((zzlt) entry.getKey()).zza();
            int iZzz4 = zzlk.zzz(8);
            i = iZzz4 + iZzz4;
            iZzz = zzlk.zzz(iZza3) + zzlk.zzz(16);
            int iZzz5 = zzlk.zzz(24);
            int iZzcf = ((zznh) value).zzcf();
            iA = a.a(iZzcf, iZzcf, iZzz5);
        }
        return i + iZzz + iA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzl(com.google.android.gms.internal.measurement.zzlt r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzop r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.measurement.zzmk.f40466zzb
            r3.getClass()
            com.google.android.gms.internal.measurement.zzop r1 = com.google.android.gms.internal.measurement.zzop.f40558zza
            com.google.android.gms.internal.measurement.zzoq r1 = com.google.android.gms.internal.measurement.zzoq.INT
            com.google.android.gms.internal.measurement.zzoq r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zznh
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzmr
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzmf
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzld
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
            com.google.android.gms.internal.measurement.zzop r2 = r2.zzb()
            com.google.android.gms.internal.measurement.zzoq r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlu.zzl(com.google.android.gms.internal.measurement.zzlt, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzlu zzluVar = new zzlu();
        zzoa zzoaVar = this.f40435zza;
        int iZzc = zzoaVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = zzoaVar.zzg(i);
            zzluVar.zzg((zzlt) ((zznw) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzoaVar.zzd()) {
            zzluVar.zzg((zzlt) entry.getKey(), entry.getValue());
        }
        zzluVar.f40437zzd = this.f40437zzd;
        return zzluVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzlu) {
            return this.f40435zza.equals(((zzlu) obj2).f40435zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40435zza.hashCode();
    }

    public final int zzc() {
        zzoa zzoaVar = this.f40435zza;
        int iZzc = zzoaVar.zzc();
        int iZzk = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzk += zzk(zzoaVar.zzg(i));
        }
        Iterator it8 = zzoaVar.zzd().iterator();
        while (it8.hasNext()) {
            iZzk += zzk((Map.Entry) it8.next());
        }
        return iZzk;
    }

    public final Iterator zze() {
        zzoa zzoaVar = this.f40435zza;
        return zzoaVar.isEmpty() ? Collections.emptyIterator() : this.f40437zzd ? new zzmp(zzoaVar.entrySet().iterator()) : zzoaVar.entrySet().iterator();
    }

    public final void zzf() {
        if (this.f40436zzc) {
            return;
        }
        zzoa zzoaVar = this.f40435zza;
        int iZzc = zzoaVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = zzoaVar.zzg(i).getValue();
            if (value instanceof zzmd) {
                ((zzmd) value).zzcr();
            }
        }
        Iterator it8 = zzoaVar.zzd().iterator();
        while (it8.hasNext()) {
            Object value2 = ((Map.Entry) it8.next()).getValue();
            if (value2 instanceof zzmd) {
                ((zzmd) value2).zzcr();
            }
        }
        zzoaVar.zza();
        this.f40436zzc = true;
    }

    public final void zzg(zzlt zzltVar, Object obj2) {
        if (!zzltVar.zze()) {
            zzl(zzltVar, obj2);
        } else {
            if (!(obj2 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj3 = list.get(i);
                zzl(zzltVar, obj3);
                arrayList.add(obj3);
            }
            obj2 = arrayList;
        }
        if (obj2 instanceof zzmr) {
            this.f40437zzd = true;
        }
        this.f40435zza.put(zzltVar, obj2);
    }

    public final boolean zzh() {
        zzoa zzoaVar = this.f40435zza;
        int iZzc = zzoaVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzi(zzoaVar.zzg(i))) {
                return false;
            }
        }
        Iterator it8 = zzoaVar.zzd().iterator();
        while (it8.hasNext()) {
            if (!zzi((Map.Entry) it8.next())) {
                return false;
            }
        }
        return true;
    }

    private zzlu(boolean z) {
        zzf();
        zzf();
    }
}
