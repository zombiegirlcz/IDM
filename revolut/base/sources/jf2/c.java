package jf2;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public UpiTransferFlowContract$Recipient u;
    public ResolveAlias v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f173636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f173637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f173638y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f173637x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f173636w = obj2;
        this.f173638y |= Integer.MIN_VALUE;
        return this.f173637x.b3(null, this);
    }
}
