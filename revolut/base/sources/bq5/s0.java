package bq5;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends gim.c {
    public int A;
    public wk5.a u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f17754y;
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, gim.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f17754y = obj2;
        this.A |= Integer.MIN_VALUE;
        return com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.I2(this.z, this);
    }
}
