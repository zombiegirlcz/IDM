package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends gim.c {
    public int A;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v0f.p f290059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v0f.p f290060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f290061y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v0f.p pVar, Continuation continuation) {
        super(continuation);
        this.f290059w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290059w.collect(null, this);
    }
}
