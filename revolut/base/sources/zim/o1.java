package zim;

import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public abstract class o1 extends u implements KFunction, wim.n {
    @Override // zim.u
    public final l0 d() {
        return r().f322708h;
    }

    @Override // zim.u
    public final ajm.i g() {
        return null;
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return q().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return q().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return q().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return q().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return q().isSuspend();
    }

    @Override // zim.u
    public final boolean p() {
        return r().p();
    }

    public abstract PropertyAccessorDescriptor q();

    public abstract u1 r();
}
