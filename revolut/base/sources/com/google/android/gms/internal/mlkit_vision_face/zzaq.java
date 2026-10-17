package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzaq implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            if (zzx.zza(getKey(), entry.getKey()) && zzx.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
