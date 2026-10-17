package ew2;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_add_to_googlepay.impl.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f130035w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.revolut.feature.card_add_to_googlepay.impl.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f130035w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_add_to_googlepay.impl.a.I2(this.v, this);
    }
}
