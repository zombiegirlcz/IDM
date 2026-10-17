package li4;

import ii4.g0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xq3.j;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f195413a;

    public c(j creditApplicationLifecycleInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        this.f195413a = creditApplicationLifecycleInteractor;
    }

    @Override // li4.b
    public final Object b(g0 g0Var, Continuation continuation) {
        return this.f195413a.f(g0Var.f161524a, (gim.c) continuation);
    }
}
