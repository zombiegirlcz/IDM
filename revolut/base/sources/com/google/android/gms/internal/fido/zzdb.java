package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes16.dex */
final class zzdb {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zzcq.f39340zza;
            }
        } else {
            if (!(iterable instanceof zzda)) {
                return false;
            }
            comparator2 = ((zzda) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
