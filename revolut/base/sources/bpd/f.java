package bpd;

import ard.b0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f17605w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f17605w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17605w.emit(null, this);
    }
}
