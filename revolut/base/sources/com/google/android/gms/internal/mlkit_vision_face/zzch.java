package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
final class zzch extends zzbp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzbp f43533zza = new zzch(null, new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f43534zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f43535zzc;

    private zzch(Object obj2, Object[] objArr, int i) {
        this.f43534zzb = objArr;
        this.f43535zzc = i;
    }

    public static zzch zzg(int i, Object[] objArr, zzbo zzboVar) {
        Object obj2 = objArr[0];
        obj2.getClass();
        Object obj3 = objArr[1];
        obj3.getClass();
        zzau.zzb(obj2, obj3);
        return new zzch(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f43534zzb
            int r1 = r4.f43535zzc
            r2 = 0
            if (r5 != 0) goto L9
        L7:
            r5 = r2
            goto L1d
        L9:
            r3 = 1
            if (r1 != r3) goto L7
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L7
            r5 = r0[r3]
            r5.getClass()
        L1d:
            if (r5 != 0) goto L20
            return r2
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzch.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f43535zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbi zza() {
        return new zzcg(this.f43534zzb, 1, this.f43535zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbq zzd() {
        return new zzce(this, this.f43534zzb, 0, this.f43535zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbq zze() {
        return new zzcf(this, new zzcg(this.f43534zzb, 0, this.f43535zzc));
    }
}
