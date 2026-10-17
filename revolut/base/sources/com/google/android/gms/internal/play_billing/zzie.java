package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
final class zzie implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() throws Exception {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj2 = field.get(null);
            if (Unsafe.class.isInstance(obj2)) {
                return (Unsafe) Unsafe.class.cast(obj2);
            }
        }
        return null;
    }
}
