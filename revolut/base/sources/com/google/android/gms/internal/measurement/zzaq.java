package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzaq implements zzap {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f39840zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ArrayList f39841zzb;

    public zzaq(String str, List list) {
        this.f39840zza = str;
        ArrayList arrayList = new ArrayList();
        this.f39841zzb = arrayList;
        arrayList.addAll(list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzaq)) {
            return false;
        }
        zzaq zzaqVar = (zzaq) obj2;
        String str = this.f39840zza;
        if (str == null ? zzaqVar.f39840zza == null : str.equals(zzaqVar.f39840zza)) {
            return this.f39841zzb.equals(zzaqVar.f39841zzb);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39840zza;
        return this.f39841zzb.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final String zzb() {
        return this.f39840zza;
    }

    public final ArrayList zzc() {
        return this.f39841zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzcz(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
