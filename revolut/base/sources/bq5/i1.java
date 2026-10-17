package bq5;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends gim.c {
    public String u;
    public wk5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f17722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a f17723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17724y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, gim.c cVar) {
        super(cVar);
        this.f17723x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17722w = obj2;
        this.f17724y |= Integer.MIN_VALUE;
        return com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.K2(this.f17723x, null, null, this);
    }
}
