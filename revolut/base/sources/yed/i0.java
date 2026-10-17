package yed;

import kotlin.coroutines.Continuation;
import xkf.b2;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f312864w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(b2 b2Var, Continuation continuation) {
        super(continuation);
        this.f312864w = b2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f312864w.emit(null, this);
    }
}
