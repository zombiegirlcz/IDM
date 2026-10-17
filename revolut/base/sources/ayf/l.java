package ayf;

import aqd.w0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f11170w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w0 w0Var, Continuation continuation) {
        super(continuation);
        this.f11170w = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f11170w.emit(null, this);
    }
}
