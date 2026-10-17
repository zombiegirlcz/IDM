package vha;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class j1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u97.e f289395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f289396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f289397y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(u97.e eVar, Continuation continuation) {
        super(continuation);
        this.f289395w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f289395w.emit(null, this);
    }
}
