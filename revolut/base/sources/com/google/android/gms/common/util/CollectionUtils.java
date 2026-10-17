package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k, @NonNull V v, @NonNull K k3, @NonNull V v2, @NonNull K k5, @NonNull V v4) {
        Map mapZzb = zzb(3, false);
        mapZzb.put(k, v);
        mapZzb.put(k3, v2);
        mapZzb.put(k5, v4);
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb6 = new StringBuilder(String.valueOf(length).length() + 44 + String.valueOf(length2).length());
            sb6.append("Key and values array lengths not equal: ");
            sb6.append(length);
            sb6.append(" != ");
            sb6.append(length2);
            throw new IllegalArgumentException(sb6.toString());
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZzb = zzb(length, false);
        for (int i = 0; i < kArr.length; i++) {
            mapZzb.put(kArr[i], vArr[i]);
        }
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new ArraySet() : zza(i, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t2, @NonNull T t3, @NonNull T t5) {
        Set setZza = zza(3, false);
        setZza.add(t2);
        setZza.add(t3);
        setZza.add(t5);
        return Collections.unmodifiableSet(setZza);
    }

    private static Set zza(int i, boolean z) {
        if (i <= (true != z ? 256 : 128)) {
            return new ArraySet(i);
        }
        return new HashSet(i, true != z ? 1.0f : 0.75f);
    }

    private static Map zzb(int i, boolean z) {
        return i <= 256 ? new ArrayMap(i) : new HashMap(i, 1.0f);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t2) {
        return Collections.singletonList(t2);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k, @NonNull V v, @NonNull K k3, @NonNull V v2, @NonNull K k5, @NonNull V v4, @NonNull K k6, @NonNull V v5, @NonNull K k31, @NonNull V v6, @NonNull K k32, @NonNull V v7) {
        Map mapZzb = zzb(6, false);
        mapZzb.put(k, v);
        mapZzb.put(k3, v2);
        mapZzb.put(k5, v4);
        mapZzb.put(k6, v5);
        mapZzb.put(k31, v6);
        mapZzb.put(k32, v7);
        return Collections.unmodifiableMap(mapZzb);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t2 = tArr[0];
            T t3 = tArr[1];
            Set setZza = zza(2, false);
            setZza.add(t2);
            setZza.add(t3);
            return Collections.unmodifiableSet(setZza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZza2 = zza(length, false);
            Collections.addAll(setZza2, tArr);
            return Collections.unmodifiableSet(setZza2);
        }
        T t5 = tArr[0];
        T t7 = tArr[1];
        T t16 = tArr[2];
        T t19 = tArr[3];
        Set setZza3 = zza(4, false);
        setZza3.add(t5);
        setZza3.add(t7);
        setZza3.add(t16);
        setZza3.add(t19);
        return Collections.unmodifiableSet(setZza3);
    }
}
