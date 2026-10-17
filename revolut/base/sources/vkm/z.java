package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f290155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y f290156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f290157y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, Continuation continuation) {
        super(continuation);
        this.f290155w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290155w.collect(null, this);
    }
}
