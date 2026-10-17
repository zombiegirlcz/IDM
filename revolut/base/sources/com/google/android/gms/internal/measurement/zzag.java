package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzag implements zzap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzap f39823zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39824zzb;

    public zzag() {
        this.f39823zza = zzap.f39833zzf;
        this.f39824zzb = "return";
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj2;
        return this.f39824zzb.equals(zzagVar.f39824zzb) && this.f39823zza.equals(zzagVar.f39823zza);
    }

    public final int hashCode() {
        return this.f39823zza.hashCode() + (this.f39824zzb.hashCode() * 31);
    }

    public final zzap zzb() {
        return this.f39823zza;
    }

    public final String zzc() {
        return this.f39824zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzcz(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzag(this.f39824zzb, this.f39823zza.zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }

    public zzag(String str) {
        this.f39823zza = zzap.f39833zzf;
        this.f39824zzb = str;
    }

    public zzag(String str, zzap zzapVar) {
        this.f39823zza = zzapVar;
        this.f39824zzb = str;
    }
}
