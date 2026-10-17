package rqd;

import ard.b0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f256530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256531x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f256530w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f256530w.emit(null, this);
    }
}
