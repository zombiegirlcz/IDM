package com.google.gson.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public final class w extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f49660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f49661c;

    public w(Method method, int i) {
        this.f49660b = method;
        this.f49661c = i;
    }

    @Override // com.google.gson.internal.z
    public final Object a(Class cls) {
        String strA = r8.q.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f49660b.invoke(null, cls, Integer.valueOf(this.f49661c));
    }
}
