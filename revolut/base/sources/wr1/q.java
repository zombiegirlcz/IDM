package wr1;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.s0;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f299502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f299503x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f299504y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f299502w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299502w.emit(null, this);
    }
}
