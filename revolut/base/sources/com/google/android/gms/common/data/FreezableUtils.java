package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import z4l.h;

/* JADX INFO: loaded from: classes16.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        h hVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hVar.add(arrayList.get(i).freeze());
        }
        return hVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        h hVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it8 = iterable.iterator();
        while (it8.hasNext()) {
            hVar.add(it8.next().freeze());
        }
        return hVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        h hVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            hVar.add(e.freeze());
        }
        return hVar;
    }
}
