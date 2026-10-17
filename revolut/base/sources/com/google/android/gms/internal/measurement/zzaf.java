package com.google.android.gms.internal.measurement;

import j6.a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzaf implements zzap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final boolean f39822zza;

    public zzaf(Boolean bool) {
        this.f39822zza = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof zzaf) && this.f39822zza == ((zzaf) obj2).f39822zza;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f39822zza).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f39822zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzcz(String str, zzg zzgVar, List list) {
        if ("toString".equals(str)) {
            return new zzat(Boolean.toString(this.f39822zza));
        }
        throw new IllegalArgumentException(a.r(Boolean.toString(this.f39822zza), ".", str, " is not a function."));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzaf(Boolean.valueOf(this.f39822zza));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(this.f39822zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return Double.valueOf(true != this.f39822zza ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return Boolean.toString(this.f39822zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
