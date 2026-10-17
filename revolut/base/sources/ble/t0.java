package ble;

import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ itb.b f16596b;

    public /* synthetic */ t0(itb.b bVar, int i) {
        this.f16595a = i;
        this.f16596b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16595a) {
            case 0:
                return TabInvestControllerContract$State.c((TabInvestControllerContract$State) obj2, null, null, this.f16596b, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483643);
            case 1:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, this.f16596b, null, false, false, null, 4063231);
            case 2:
                return qje.o.a((qje.o) obj2, null, this.f16596b, false, null, 13);
            default:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, this.f16596b, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268435454);
        }
    }
}
