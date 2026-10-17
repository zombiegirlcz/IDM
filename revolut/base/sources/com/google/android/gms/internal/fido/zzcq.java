package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
final class zzcq extends zzcs implements Serializable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcq f39340zza = new zzcq();

    private zzcq() {
    }

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj2, Object obj3) {
        Comparable comparable = (Comparable) obj2;
        Comparable comparable2 = (Comparable) obj3;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        return zzcw.f39353zza;
    }
}
