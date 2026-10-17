package cie;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f24473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f24474x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24475y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(a1 a1Var, Continuation continuation) {
        super(continuation);
        this.f24473w = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f24473w.emit(null, this);
    }
}
