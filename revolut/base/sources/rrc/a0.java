package rrc;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qx4.b f256751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f256752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f256753y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(qx4.b bVar, Continuation continuation) {
        super(continuation);
        this.f256751w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f256751w.emit(null, this);
    }
}
