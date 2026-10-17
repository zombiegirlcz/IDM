package h8d;

import g23.e0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f150010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e0 e0Var, Continuation continuation) {
        super(continuation);
        this.f150010w = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f150010w.emit(null, this);
    }
}
