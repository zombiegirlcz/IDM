package ew2;

/* JADX INFO: loaded from: classes21.dex */
public final class u0 extends gim.c {
    public h93.f0 u;
    public jg1.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f130052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_add_to_googlepay.impl.a f130053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f130054y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.feature.card_add_to_googlepay.impl.a aVar, gim.c cVar) {
        super(cVar);
        this.f130053x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f130052w = obj2;
        this.f130054y |= Integer.MIN_VALUE;
        return com.revolut.feature.card_add_to_googlepay.impl.a.J2(this.f130053x, null, this);
    }
}
