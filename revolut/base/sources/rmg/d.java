package rmg;

import kotlin.coroutines.Continuation;
import r74.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f255316w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f255316w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f255316w.emit(null, this);
    }
}
