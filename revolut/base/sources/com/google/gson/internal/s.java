package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public final class s extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f49656b;

    public s(Method method) {
        this.f49656b = method;
    }

    @Override // com.google.gson.internal.u
    public final boolean a(Object obj2, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f49656b.invoke(accessibleObject, obj2)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
