package lk5;

import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public TransactionCryptoRemittanceAction u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f196226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f196227x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f196226w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f196227x |= Integer.MIN_VALUE;
        return this.f196226w.c(null, this);
    }
}
