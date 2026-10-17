package jb1;

import iyg.a0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f172569w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f172569w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f172569w.emit(null, this);
    }
}
