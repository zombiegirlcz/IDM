package ocb;

import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.RetailPrivacyScreen;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.RetailPrivacyScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RetailPrivacyScreen f224172b;

    public /* synthetic */ b(RetailPrivacyScreen retailPrivacyScreen, int i) {
        this.f224171a = i;
        this.f224172b = retailPrivacyScreen;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f224171a;
        RetailPrivacyScreen retailPrivacyScreen = this.f224172b;
        switch (i) {
            case 0:
                ViewBinding value = retailPrivacyScreen.U.getValue(retailPrivacyScreen, RetailPrivacyScreen.f82779e0[0]);
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                return navBarWithToolbar;
            case 1:
                return zhm.v.k(retailPrivacyScreen.W, new RowLoadingDelegate(), new FullScreenStateDelegate());
            case 2:
                KProperty[] kPropertyArr = RetailPrivacyScreen.f82779e0;
                qji.b bVarQ2 = retailPrivacyScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.retail.privacy.impl.ui.flow.screen.di.RetailPrivacyScreenInjector");
                lcb.b bVar = (lcb.b) bVarQ2;
                return new lcb.c(bVar.f193827b, bVar.f193828c, retailPrivacyScreen);
            default:
                KProperty[] kPropertyArr2 = RetailPrivacyScreen.f82779e0;
                return (k) ((lcb.c) retailPrivacyScreen.c0.getValue()).i.get();
        }
    }

    public /* synthetic */ b(RetailPrivacyScreen retailPrivacyScreen, RetailPrivacyScreenContract$InputData retailPrivacyScreenContract$InputData) {
        this.f224171a = 2;
        this.f224172b = retailPrivacyScreen;
    }
}
