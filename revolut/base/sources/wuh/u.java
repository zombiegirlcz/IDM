package wuh;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f300166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.sdk_flow.f f300167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f300168y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.workflow.engine.sdk_flow.f fVar, gim.c cVar) {
        super(cVar);
        this.f300167x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f300166w = obj2;
        this.f300168y |= Integer.MIN_VALUE;
        return com.revolut.feature.workflow.engine.sdk_flow.f.I2(this.f300167x, null, null, this);
    }
}
