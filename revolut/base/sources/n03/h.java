package n03;

import com.revolut.core.model.account.AccountId;
import h93.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d A;
    public int B;
    public String u;
    public wy2.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f0 f210863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountId f210864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public z03.c f210865y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d dVar, gim.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.M2(null, null, this);
    }
}
