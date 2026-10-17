package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzbj extends zzde {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbl f41256zza;

    public zzbj(zzbl zzblVar) {
        this.f41256zza = zzblVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzde, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Set setEntrySet = this.f41256zza.f41260zza.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzbk(this.f41256zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzde, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        if (!contains(obj2)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        entry.getClass();
        zzbu.zzr(this.f41256zza.f41261zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzde
    public final Map zza() {
        return this.f41256zza;
    }
}
