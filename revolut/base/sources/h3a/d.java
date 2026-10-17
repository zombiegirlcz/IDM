package h3a;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public zm3.a u;
    public TransferFlowType v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TransferMoneyPocket f149047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f149048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f149049y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, gim.c cVar) {
        super(cVar);
        this.f149049y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149048x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f149049y.d(null, null, null, this);
    }
}
