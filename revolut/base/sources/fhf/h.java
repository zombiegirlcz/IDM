package fhf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f135219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f135220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f135221y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f135219w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f135219w.emit(null, this);
    }
}
