package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class d0 extends gim.c {
    public long A;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f290010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y f290011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f290012y;
    public Throwable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(y yVar, Continuation continuation) {
        super(continuation);
        this.f290010w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290010w.collect(null, this);
    }
}
