package hea;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g23.e0 f151626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f151627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public io3.d f151628y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g23.e0 e0Var, Continuation continuation) {
        super(continuation);
        this.f151626w = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f151626w.emit(null, this);
    }
}
