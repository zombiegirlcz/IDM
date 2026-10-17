package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes16.dex */
final class zztz extends zzua {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f45732zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f45733zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzua f45734zzc;

    public zztz(zzua zzuaVar, int i, int i2) {
        this.f45734zzc = zzuaVar;
        this.f45732zza = i;
        this.f45733zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zztq.zza(i, this.f45733zzb, "index");
        return this.f45734zzc.get(i + this.f45732zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45733zzb;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final int zzb() {
        return this.f45734zzc.zzc() + this.f45732zza + this.f45733zzb;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final int zzc() {
        return this.f45734zzc.zzc() + this.f45732zza;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.nearby.zztx
    public final Object[] zzg() {
        return this.f45734zzc.zzg();
    }

    @Override // com.google.android.gms.internal.nearby.zzua, java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzua subList(int i, int i2) {
        zztq.zzh(i, i2, this.f45733zzb);
        int i3 = this.f45732zza;
        return this.f45734zzc.subList(i + i3, i2 + i3);
    }
}
