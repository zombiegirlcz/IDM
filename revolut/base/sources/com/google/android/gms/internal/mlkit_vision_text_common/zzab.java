package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzab extends zzbx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzad f44428zza;

    public zzab(zzad zzadVar) {
        this.f44428zza = zzadVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        Set setEntrySet = this.f44428zza.f44432zza.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzac(this.f44428zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        if (!contains(obj2)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        Objects.requireNonNull(entry);
        zzad zzadVar = this.f44428zza;
        zzal.zzk(zzadVar.f44433zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx
    public final Map zza() {
        return this.f44428zza;
    }
}
