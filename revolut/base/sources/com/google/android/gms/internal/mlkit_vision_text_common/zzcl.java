package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcl {
    public static int zza(Set set) {
        Iterator it8 = set.iterator();
        int iHashCode = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static boolean zzb(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzcd) {
            collection = ((zzcd) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzc(set, collection.iterator());
        }
        Iterator it8 = set.iterator();
        boolean z = false;
        while (it8.hasNext()) {
            if (collection.contains(it8.next())) {
                it8.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean zzc(Set set, Iterator it8) {
        boolean zRemove = false;
        while (it8.hasNext()) {
            zRemove |= set.remove(it8.next());
        }
        return zRemove;
    }
}
