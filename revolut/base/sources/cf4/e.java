package cf4;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public bv3.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer.e f23542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23543x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar, gim.c cVar) {
        super(cVar);
        this.f23542w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f23543x |= Integer.MIN_VALUE;
        return this.f23542w.P2(null, this);
    }
}
