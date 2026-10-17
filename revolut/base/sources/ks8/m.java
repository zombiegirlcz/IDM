package ks8;

import cu8.l0;
import cu8.r0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public interface m {
    static ufm.b a(m mVar) {
        c.Companion.getClass();
        c checkConfig = b.a();
        r0 r0Var = (r0) mVar;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(checkConfig, "checkConfig");
        return w.o0(kotlin.coroutines.g.f186406a, new l0(r0Var, checkConfig, (Continuation) null));
    }

    static /* synthetic */ Object b(m mVar, Continuation continuation) {
        c.Companion.getClass();
        return ((r0) mVar).f(b.a(), continuation);
    }
}
