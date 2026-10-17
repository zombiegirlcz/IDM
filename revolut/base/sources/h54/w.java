package h54;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.c {
    public j54.d u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149499y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, gim.c cVar) {
        super(cVar);
        this.f149498x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149497w = obj2;
        this.f149499y |= Integer.MIN_VALUE;
        return this.f149498x.U2(null, null, null, null, this);
    }
}
