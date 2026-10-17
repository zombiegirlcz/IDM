package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f290139w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y f290140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f290141y;
    public wkm.t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Continuation continuation) {
        super(continuation);
        this.f290139w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290139w.collect(null, this);
    }
}
