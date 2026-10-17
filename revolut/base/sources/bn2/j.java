package bn2;

import ble.e1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f17018w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f17018w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17018w.emit(null, this);
    }
}
