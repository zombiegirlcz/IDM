package c2d;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0 f20729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f20730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Data f20731y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(l0 l0Var, Continuation continuation) {
        super(continuation);
        this.f20729w = l0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f20729w.emit(null, this);
    }
}
