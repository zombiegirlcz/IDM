package h54;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.c {
    public com.revolut.feature.credit.application.plugins.impl.ui.application.d u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149503y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, gim.c cVar) {
        super(cVar);
        this.f149502x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149501w = obj2;
        this.f149503y |= Integer.MIN_VALUE;
        return this.f149502x.Y2(this);
    }
}
