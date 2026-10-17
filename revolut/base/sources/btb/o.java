package btb;

import ble.e1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f18549w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f18549w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f18549w.emit(null, this);
    }
}
