package bpc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1h.t;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f17576c;
    public final t d;

    public c(g screenModelExtension, t view) {
        Intrinsics.checkNotNullParameter(screenModelExtension, "screenModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f17576c = screenModelExtension;
        this.d = view;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        WealthAddMoneyScreen wealthAddMoneyScreen = (WealthAddMoneyScreen) this.d;
        NavBarWithAvatar navBarWithAvatar = wealthAddMoneyScreen.d3().f243078b;
        Intrinsics.checkNotNullExpressionValue(navBarWithAvatar, "wealthAddMoneyScreenNavBar");
        LargeActionButtonDelegate largeActionButtonDelegate = wealthAddMoneyScreen.R;
        j60.a bottomExpandableDialogControllerExtension = (j60.a) wealthAddMoneyScreen.N.getValue();
        Intrinsics.checkNotNullParameter(navBarWithAvatar, "navBarWithAvatar");
        Intrinsics.checkNotNullParameter(largeActionButtonDelegate, "largeActionButtonDelegate");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Continuation continuation = null;
        yji.d.H(this, rd0.e.b(navBarWithAvatar.f59339b), new aza.g(this, continuation, 21), 3);
        yji.d.H(this, vkm.q.J(new bk6.c(rd0.e.b(largeActionButtonDelegate.d.f121375b), 10), new bk6.c(rd0.e.b(bottomExpandableDialogControllerExtension.C()), 11)), new bi2.n(this, continuation, 15), 3);
    }
}
