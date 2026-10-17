package knd;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ aci.d f186067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f186068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f186069y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(aci.d dVar, Continuation continuation) {
        super(continuation);
        this.f186067w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f186067w.emit(null, this);
    }
}
