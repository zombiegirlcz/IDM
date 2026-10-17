package k52;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public ApmTransferWrapperNavigation$InputData.AcceptMoneyRequest u;
    public MoneyRequest v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f181378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f181379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f181380y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f181379x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f181378w = obj2;
        this.f181380y |= Integer.MIN_VALUE;
        return e.I2(this.f181379x, null, this);
    }
}
