package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzgl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final String f39490zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final Comparator f39491zzb;

    static {
        Comparator comparator;
        String strConcat = zzgl.class.getName().concat("$UnsafeComparator");
        f39490zza = strConcat;
        try {
            Object[] enumConstants = Class.forName(strConcat).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = zzgk.INSTANCE;
        }
        f39491zzb = comparator;
    }
}
