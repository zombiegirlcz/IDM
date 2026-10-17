package rh8;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qx4.b f254365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f254366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f254367y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qx4.b bVar, Continuation continuation) {
        super(continuation);
        this.f254365w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f254365w.emit(null, this);
    }
}
