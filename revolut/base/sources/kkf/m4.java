package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class m4 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f4 f184824w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(f4 f4Var, Continuation continuation) {
        super(continuation);
        this.f184824w = f4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184824w.emit(null, this);
    }
}
