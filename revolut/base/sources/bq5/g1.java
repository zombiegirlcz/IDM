package bq5;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17715w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f17715w |= Integer.MIN_VALUE;
        return com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.J2(this.v, this);
    }
}
