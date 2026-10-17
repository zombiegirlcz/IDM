package kotlin.jvm.internal;

import kotlin.reflect.KCallable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class w extends c0 implements wim.f {
    @Override // kotlin.jvm.internal.h
    public KCallable computeReflected() {
        return o0.f186429a.e(this);
    }

    @Override // wim.o
    public Object getDelegate() {
        return ((wim.f) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public kotlin.reflect.a getGetter() {
        return ((wim.f) getReflected()).getGetter();
    }

    @Override // wim.k
    public wim.e getSetter() {
        return ((wim.f) getReflected()).getSetter();
    }
}
