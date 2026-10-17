package h6i;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f149650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f149651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149652y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y yVar, Continuation continuation) {
        super(continuation);
        this.f149650w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f149650w.emit(null, this);
    }
}
