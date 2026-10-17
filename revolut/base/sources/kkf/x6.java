package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class x6 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s2 f185019w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(s2 s2Var, Continuation continuation) {
        super(continuation);
        this.f185019w = s2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185019w.emit(null, this);
    }
}
