package dcj;

import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public CryptoDepositsOverviewFlowContract$InputData u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f112996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.c f112997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f112998y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f112997x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f112996w = obj2;
        this.f112998y |= Integer.MIN_VALUE;
        return this.f112997x.a(null, this);
    }
}
