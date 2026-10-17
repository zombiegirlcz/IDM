package lk5;

import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.c {
    public TransactionCryptoRemittanceAction u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f196224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f196225x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.f196224w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f196225x |= Integer.MIN_VALUE;
        return this.f196224w.b(null, this);
    }
}
