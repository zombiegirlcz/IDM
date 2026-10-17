package nz6;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f220966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.onboarding.flow.b f220967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f220968y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f220967x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f220966w = obj2;
        this.f220968y |= Integer.MIN_VALUE;
        return this.f220967x.N2(this);
    }
}
