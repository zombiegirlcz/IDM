package wuh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.workflow.engine.sdk_flow.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f300154w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.workflow.engine.sdk_flow.f fVar, Continuation continuation) {
        super(continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f300154w |= Integer.MIN_VALUE;
        return this.v.J2(null, null, null, null, this);
    }
}
