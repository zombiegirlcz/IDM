package aem;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class x0 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function3 f3793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f3794b;

    public x0(Function3 interceptor, h1 nextSender) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(nextSender, "nextSender");
        this.f3793a = interceptor;
        this.f3794b = nextSender;
    }

    @Override // aem.h1
    public final Object a(fem.d dVar, gim.c cVar) {
        return this.f3793a.invoke(this.f3794b, dVar, cVar);
    }
}
