package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1$Getter;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g0 extends k0 implements wim.p {
    @Override // kotlin.jvm.internal.h
    public KCallable computeReflected() {
        return o0.f186429a.j(this);
    }

    @Override // wim.p
    public Object getDelegate(Object obj2) {
        return ((wim.p) getReflected()).getDelegate(obj2);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj2) {
        return get(obj2);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty1$Getter getGetter() {
        return ((wim.p) getReflected()).getGetter();
    }
}
