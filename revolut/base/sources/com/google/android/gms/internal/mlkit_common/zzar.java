package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzar {
    public static int zza(Set set) {
        Iterator it8 = set.iterator();
        int iHashCode = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
