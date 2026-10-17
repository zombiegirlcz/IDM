package zhl;

import kotlin.coroutines.Continuation;
import xkf.b2;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f322450w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b2 b2Var, Continuation continuation) {
        super(continuation);
        this.f322450w = b2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f322450w.emit(null, this);
    }
}
