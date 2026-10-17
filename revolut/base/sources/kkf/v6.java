package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class v6 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s2 f184984w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(s2 s2Var, Continuation continuation) {
        super(continuation);
        this.f184984w = s2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184984w.emit(null, this);
    }
}
