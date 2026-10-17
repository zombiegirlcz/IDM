package j54;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 extends gim.c {
    public aii.o u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d f171512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f171513x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar, gim.c cVar) {
        super(cVar);
        this.f171512w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f171513x |= Integer.MIN_VALUE;
        return this.f171512w.f3(this);
    }
}
