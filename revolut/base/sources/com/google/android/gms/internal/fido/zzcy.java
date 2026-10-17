package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcy {
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
