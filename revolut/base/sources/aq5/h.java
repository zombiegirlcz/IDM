package aq5;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f8266w |= Integer.MIN_VALUE;
        return com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b.I2(this.v, this);
    }
}
