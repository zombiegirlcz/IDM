package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzge implements Map.Entry {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map.Entry f46043zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f46043zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzgh) this.f46043zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        if (obj2 instanceof zzhb) {
            return ((zzgh) this.f46043zza.getValue()).zzc((zzhb) obj2);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzgh zza() {
        return (zzgh) this.f46043zza.getValue();
    }
}
