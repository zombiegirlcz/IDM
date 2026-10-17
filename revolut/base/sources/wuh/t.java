package wuh;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.workflow.engine.sdk_flow.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f300165w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.workflow.engine.sdk_flow.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f300165w |= Integer.MIN_VALUE;
        return this.v.Q2(null, null, this);
    }
}
