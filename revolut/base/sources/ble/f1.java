package ble;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarMessage f16574b;

    public /* synthetic */ f1(NavBarMessage navBarMessage, int i) {
        this.f16573a = i;
        this.f16574b = navBarMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16573a) {
            case 0:
                return TabInvestControllerContract$State.c((TabInvestControllerContract$State) obj2, null, null, null, false, false, false, false, null, this.f16574b, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483391);
            case 1:
                return c5a.l.a((c5a.l) obj2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, false, this.f16574b, false, null, 458751);
            case 2:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, this.f16574b, null, null, false, false, null, 4128767);
            case 3:
                return qje.o.a((qje.o) obj2, null, null, false, this.f16574b, 7);
            case 4:
                return l5a.l.a((l5a.l) obj2, null, null, null, null, null, false, null, this.f16574b, false, null, 895);
            default:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, this.f16574b, null, false, null, null, null, 264241151);
        }
    }
}
