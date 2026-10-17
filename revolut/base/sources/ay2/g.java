package ay2;

import aqd.w0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f11036w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w0 w0Var, Continuation continuation) {
        super(continuation);
        this.f11036w = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f11036w.emit(null, this);
    }
}
