package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public final class x extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f49662b;

    public x(Method method) {
        this.f49662b = method;
    }

    @Override // com.google.gson.internal.z
    public final Object a(Class cls) {
        String strA = r8.q.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f49662b.invoke(null, cls, Object.class);
    }
}
