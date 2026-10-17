package arb;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f8627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f8628x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8629y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, Continuation continuation) {
        super(continuation);
        this.f8627w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f8627w.emit(null, this);
    }
}
