package j54;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 extends gim.c {
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d A;
    public int B;
    public com.revolut.feature.credit.application.plugins.impl.ui.application.a u;
    public zja.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d f171501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f171502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f171503y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar, gim.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c3(null, this);
    }
}
