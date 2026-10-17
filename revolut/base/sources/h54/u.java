package h54;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.c {
    public int A;
    public com.revolut.feature.credit.application.plugins.impl.ui.application.d u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f149492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f149493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f149494y;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, gim.c cVar) {
        super(cVar);
        this.z = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149494y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.R2(null, null, this);
    }
}
