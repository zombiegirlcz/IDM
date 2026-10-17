package gh3;

import g23.e0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f143843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e0 e0Var, Continuation continuation) {
        super(continuation);
        this.f143843w = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f143843w.emit(null, this);
    }
}
