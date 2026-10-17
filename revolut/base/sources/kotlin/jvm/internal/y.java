package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1$Getter;

/* JADX INFO: loaded from: classes13.dex */
public abstract class y extends c0 implements wim.h {
    @Override // kotlin.jvm.internal.h
    public KCallable computeReflected() {
        return o0.f186429a.f(this);
    }

    @Override // wim.p
    public Object getDelegate(Object obj2) {
        return ((wim.h) getReflected()).getDelegate(obj2);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj2) {
        return get(obj2);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty1$Getter getGetter() {
        return ((wim.h) getReflected()).getGetter();
    }

    @Override // wim.k
    public wim.g getSetter() {
        return ((wim.h) getReflected()).getSetter();
    }
}
