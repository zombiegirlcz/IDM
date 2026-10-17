package lkf;

import kkf.i8;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f196409w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f196409w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f196409w.emit(null, this);
    }
}
