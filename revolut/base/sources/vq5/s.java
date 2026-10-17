package vq5;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.c {
    public String u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f291336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a f291337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f291338y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar, gim.c cVar) {
        super(cVar);
        this.f291337x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f291336w = obj2;
        this.f291338y |= Integer.MIN_VALUE;
        return com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a.I2(this.f291337x, null, null, this);
    }
}
