package skm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public final class s1 extends h0 {
    public final Continuation d;

    public s1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, true, false);
        this.d = fim.h.a(this, this, function2);
    }

    @Override // skm.r1
    public final void b0() throws Throwable {
        alm.a.c(this.d, this);
    }
}
