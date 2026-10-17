package at;

import aqd.w0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f8959w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w0 w0Var, Continuation continuation) {
        super(continuation);
        this.f8959w = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f8959w.emit(null, this);
    }
}
