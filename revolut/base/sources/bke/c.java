package bke;

import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountSelectionNavBarContentView.b f16360b;

    public /* synthetic */ c(AccountSelectionNavBarContentView.b bVar, int i) {
        this.f16359a = i;
        this.f16360b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16359a) {
            case 0:
                ake.a updateState = (ake.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ake.a.a(updateState, null, null, null, null, null, null, this.f16360b, null, null, null, 959);
            default:
                TabInvestControllerContract$State update = (TabInvestControllerContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return TabInvestControllerContract$State.c(update, null, null, null, false, false, false, false, this.f16360b, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483519);
        }
    }
}
