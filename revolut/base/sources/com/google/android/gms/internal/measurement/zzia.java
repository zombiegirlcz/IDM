package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzia extends zzmd implements zzni {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzia f40240zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40241zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private int f40242zze = 1;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzmj f40243zzf = zzmd.zzcn();

    static {
        zzia zziaVar = new zzia();
        f40240zzb = zziaVar;
        zzmd.zzct(zzia.class, zziaVar);
    }

    private zzia() {
    }

    public static zzhy zza() {
        return (zzhy) f40240zzb.zzcg();
    }

    public static /* synthetic */ void zzc(zzia zziaVar, zzho zzhoVar) {
        zzhoVar.getClass();
        zzmj zzmjVar = zziaVar.f40243zzf;
        if (!zzmjVar.zzc()) {
            zziaVar.f40243zzf = zzmd.zzco(zzmjVar);
        }
        zziaVar.f40243zzf.add(zzhoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i, Object obj2, Object obj3) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzmd.zzcq(f40240zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzd", "zze", zzhz.f40239zza, "zzf", zzho.class});
        }
        if (i2 == 3) {
            return new zzia();
        }
        zzip zzipVar = null;
        if (i2 == 4) {
            return new zzhy(zzipVar);
        }
        if (i2 == 5) {
            return f40240zzb;
        }
        throw null;
    }
}
