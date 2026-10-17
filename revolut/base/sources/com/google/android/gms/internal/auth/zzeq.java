package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzeq {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzeq f39028zzb = new zzeq(true);

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final zzgv f39029zza = new zzgl(16);

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f39030zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f39031zzd;

    private zzeq() {
    }

    public static zzeq zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzd(com.google.android.gms.internal.auth.zzep r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.auth.zzho r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.auth.zzfa.f39048zzd
            r3.getClass()
            com.google.android.gms.internal.auth.zzho r1 = com.google.android.gms.internal.auth.zzho.f39138zza
            com.google.android.gms.internal.auth.zzhp r1 = com.google.android.gms.internal.auth.zzhp.INT
            com.google.android.gms.internal.auth.zzhp r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzfx
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzfc
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzex
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.auth.zzef
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
            com.google.android.gms.internal.auth.zzho r2 = r2.zzb()
            com.google.android.gms.internal.auth.zzhp r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzeq.zzd(com.google.android.gms.internal.auth.zzep, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzeq zzeqVar = new zzeq();
        for (int i = 0; i < this.f39029zza.zzb(); i++) {
            Map.Entry entryZzg = this.f39029zza.zzg(i);
            zzeqVar.zzc((zzep) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.f39029zza.zzc()) {
            zzeqVar.zzc((zzep) entry.getKey(), entry.getValue());
        }
        zzeqVar.f39031zzd = this.f39031zzd;
        return zzeqVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzeq) {
            return this.f39029zza.equals(((zzeq) obj2).f39029zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39029zza.hashCode();
    }

    public final void zzb() {
        if (this.f39030zzc) {
            return;
        }
        for (int i = 0; i < this.f39029zza.zzb(); i++) {
            Map.Entry entryZzg = this.f39029zza.zzg(i);
            if (entryZzg.getValue() instanceof zzev) {
                ((zzev) entryZzg.getValue()).zzi();
            }
        }
        this.f39029zza.zza();
        this.f39030zzc = true;
    }

    public final void zzc(zzep zzepVar, Object obj2) {
        if (!zzepVar.zzc()) {
            zzd(zzepVar, obj2);
        } else {
            if (!(obj2 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj2);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzepVar, arrayList.get(i));
            }
            obj2 = arrayList;
        }
        if (obj2 instanceof zzfc) {
            this.f39031zzd = true;
        }
        this.f39029zza.put(zzepVar, obj2);
    }

    private zzeq(boolean z) {
        zzb();
        zzb();
    }
}
