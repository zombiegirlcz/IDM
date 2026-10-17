package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzmo implements Map.Entry {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map.Entry f40479zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f40479zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzmr) this.f40479zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        if (obj2 instanceof zznh) {
            return ((zzmr) this.f40479zza.getValue()).zzc((zznh) obj2);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzmr zza() {
        return (zzmr) this.f40479zza.getValue();
    }
}
