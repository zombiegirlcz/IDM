package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjt {
    public static Object zza(@NonNull Bundle bundle, String str, Class cls, Object obj2) {
        Object obj3 = bundle.get(str);
        if (obj3 == null) {
            return obj2;
        }
        if (cls.isAssignableFrom(obj3.getClass())) {
            return obj3;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(a.i(a.m("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj3.getClass().getCanonicalName(), "]"));
    }

    public static void zzb(@NonNull Bundle bundle, @NonNull Object obj2) {
        if (obj2 instanceof Double) {
            bundle.putDouble("value", ((Double) obj2).doubleValue());
        } else if (obj2 instanceof Long) {
            bundle.putLong("value", ((Long) obj2).longValue());
        } else {
            bundle.putString("value", obj2.toString());
        }
    }
}
