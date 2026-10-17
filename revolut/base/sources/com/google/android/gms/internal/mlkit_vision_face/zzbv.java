package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzbv extends zzci {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            Object key = entry.getKey();
            Object objZza = zzbz.zza(zza(), key);
            if (zzx.zza(objZza, entry.getValue())) {
                return objZza != null || zzbz.zzb(((zzah) zza()).f43457zza, key);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj2) {
        if (contains(obj2) && (obj2 instanceof Map.Entry)) {
            return ((zzah) zza()).f43458zzb.zzq().remove(((Map.Entry) obj2).getKey());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzci, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return zzcj.zzb(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return zzcj.zzc(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzci, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int iCeil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzau.zza(size, "expectedSize");
                iCeil = size + 1;
            } else {
                iCeil = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(iCeil);
            for (Object obj2 : collection) {
                if (contains(obj2) && (obj2 instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj2).getKey());
                }
            }
            return ((zzah) zza()).f43458zzb.zzq().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza().size();
    }

    public abstract Map zza();
}
