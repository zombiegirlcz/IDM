package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f49657a;

    static {
        u sVar;
        if (k.f49643a >= 9) {
            try {
                sVar = new s(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                sVar = null;
            }
        } else {
            sVar = null;
        }
        if (sVar == null) {
            sVar = new t();
        }
        f49657a = sVar;
    }

    public abstract boolean a(Object obj2, AccessibleObject accessibleObject);
}
