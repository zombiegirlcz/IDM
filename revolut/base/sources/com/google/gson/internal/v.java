package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class v extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f49658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49659c;

    public v(Method method, Object obj2) {
        this.f49658b = method;
        this.f49659c = obj2;
    }

    @Override // com.google.gson.internal.z
    public final Object a(Class cls) {
        String strA = r8.q.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f49658b.invoke(this.f49659c, cls);
    }
}
