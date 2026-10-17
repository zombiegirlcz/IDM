package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
final class zzca extends zzcc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final transient zzcc f39319zza;

    public zzca(zzcc zzccVar) {
        this.f39319zza = zzccVar;
    }

    private final int zzl(int i) {
        return (this.f39319zza.size() - 1) - i;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f39319zza.contains(obj2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.zza(i, this.f39319zza.size(), "index");
        return this.f39319zza.get(zzl(i));
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(Object obj2) {
        int iLastIndexOf = this.f39319zza.lastIndexOf(obj2);
        if (iLastIndexOf >= 0) {
            return zzl(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(Object obj2) {
        int iIndexOf = this.f39319zza.indexOf(obj2);
        if (iIndexOf >= 0) {
            return zzl(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39319zza.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc zzf() {
        return this.f39319zza;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzcc subList(int i, int i2) {
        zzbm.zze(i, i2, this.f39319zza.size());
        zzcc zzccVar = this.f39319zza;
        return zzccVar.subList(zzccVar.size() - i2, this.f39319zza.size() - i).zzf();
    }
}
