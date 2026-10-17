package x0f;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.s0;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f301602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f301603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f301604y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f301602w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f301602w.emit(null, this);
    }
}
