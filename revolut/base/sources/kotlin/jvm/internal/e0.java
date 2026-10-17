package kotlin.jvm.internal;

import kotlin.reflect.KCallable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e0 extends k0 implements wim.o {
    @Override // kotlin.jvm.internal.h
    public KCallable computeReflected() {
        return o0.f186429a.i(this);
    }

    @Override // wim.o
    public Object getDelegate() {
        return ((wim.o) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public kotlin.reflect.a getGetter() {
        return ((wim.o) getReflected()).getGetter();
    }
}
