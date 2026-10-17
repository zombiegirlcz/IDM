package lkf;

import kkf.i8;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f196387w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f196387w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f196387w.emit(null, this);
    }
}
