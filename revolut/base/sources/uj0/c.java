package uj0;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.c {
    public b80.c u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f280465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280466x;

    public c(Continuation continuation) {
        super(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280465w = obj2;
        this.f280466x |= Integer.MIN_VALUE;
        return w.m0(null, null, this);
    }
}
