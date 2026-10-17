package kotlin.jvm.internal;

import kotlin.reflect.KCallable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i0 extends k0 implements wim.q {
    @Override // kotlin.jvm.internal.h
    public final KCallable computeReflected() {
        return o0.f186429a.k(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((zim.u) ((j0) this).getGetter()).call(obj2, obj3);
    }

    @Override // kotlin.reflect.KProperty
    public final kotlin.reflect.b getGetter() {
        return ((wim.q) getReflected()).getGetter();
    }
}
