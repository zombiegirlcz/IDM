package kkf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class d7 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ard.b0 f184645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f184646x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f184647y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(ard.b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f184645w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184645w.emit(null, this);
    }
}
