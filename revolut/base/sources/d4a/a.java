package d4a;

import ble.e1;
import gim.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f111256w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f111256w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f111256w.emit(null, this);
    }
}
