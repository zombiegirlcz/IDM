package kotlin.jvm.internal;

import kotlin.reflect.KCallable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a0 extends c0 implements wim.j {
    @Override // kotlin.jvm.internal.h
    public final KCallable computeReflected() {
        return o0.f186429a.g(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((zim.u) ((b0) this).getGetter()).call(obj2, obj3);
    }

    @Override // kotlin.reflect.KProperty
    public final kotlin.reflect.b getGetter() {
        return ((wim.j) getReflected()).getGetter();
    }

    @Override // wim.k
    public final wim.i getSetter() {
        return ((wim.j) getReflected()).getSetter();
    }
}
