package ax9;

import aqd.w0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f10908w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w0 w0Var, Continuation continuation) {
        super(continuation);
        this.f10908w = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f10908w.emit(null, this);
    }
}
