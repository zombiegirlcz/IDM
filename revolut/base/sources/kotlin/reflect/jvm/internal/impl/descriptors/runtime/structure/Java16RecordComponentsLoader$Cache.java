package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public final class Java16RecordComponentsLoader$Cache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f186691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f186692b;

    public Java16RecordComponentsLoader$Cache(Method method, Method method2) {
        this.f186691a = method;
        this.f186692b = method2;
    }

    public final Method getGetAccessor() {
        return this.f186692b;
    }

    public final Method getGetType() {
        return this.f186691a;
    }
}
