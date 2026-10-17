package com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_remote_login.impl.R$id;
import com.revolut.feature.junior_remote_login.impl.R$layout;
import com.revolut.feature.junior_remote_login.impl.R$string;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import il8.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wl8.b;
import wl8.c;
import wl8.d;
import wl8.h;
import wl8.i;
import wl8.j;
import xki.e;
import yp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/screen/contact_picker/JuniorContactPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwl8/h;", "Ldli/a;", "Lwl8/j;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorContactPickerScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorContactPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/junior_remote_login/impl/databinding/ScreenJuniorContactPickerBinding;", 0))};
    public final JuniorContactPickerScreenContract$InputData K;
    public final FullScreenStateDelegate L;
    public final RowDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final ao.h R;

    public JuniorContactPickerScreen(JuniorContactPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new FullScreenStateDelegate();
        this.M = new RowDelegate(null, null, 7);
        this.N = R$layout.screen_junior_contact_picker;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: wl8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorContactPickerScreen f298444b;

            {
                this.f298444b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorContactPickerScreen juniorContactPickerScreen = this.f298444b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorContactPickerScreen.S;
                        JuniorContactPickerScreen juniorContactPickerScreen2 = this.f298444b;
                        return dli.f.a(juniorContactPickerScreen2, juniorContactPickerScreen2.d(), v.k(juniorContactPickerScreen2.L, juniorContactPickerScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.juniorContactPicker_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorContactPickerScreen.S;
                        qji.b bVarU2 = juniorContactPickerScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.di.JuniorContactPickerScreenInjector");
                        }
                        il8.c cVar = (il8.c) bVarU2;
                        il8.k kVar = cVar.f162141b;
                        il8.c cVar2 = cVar.f162142c;
                        JuniorContactPickerScreenContract$InputData juniorContactPickerScreenContract$InputData = juniorContactPickerScreen.K;
                        juniorContactPickerScreenContract$InputData.getClass();
                        return new il8.f(kVar, cVar2, juniorContactPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorContactPickerScreen.S;
                        return (i) ((il8.f) juniorContactPickerScreen.P.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wl8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorContactPickerScreen f298444b;

            {
                this.f298444b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorContactPickerScreen juniorContactPickerScreen = this.f298444b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorContactPickerScreen.S;
                        JuniorContactPickerScreen juniorContactPickerScreen2 = this.f298444b;
                        return dli.f.a(juniorContactPickerScreen2, juniorContactPickerScreen2.d(), v.k(juniorContactPickerScreen2.L, juniorContactPickerScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.juniorContactPicker_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorContactPickerScreen.S;
                        qji.b bVarU2 = juniorContactPickerScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.di.JuniorContactPickerScreenInjector");
                        }
                        il8.c cVar = (il8.c) bVarU2;
                        il8.k kVar = cVar.f162141b;
                        il8.c cVar2 = cVar.f162142c;
                        JuniorContactPickerScreenContract$InputData juniorContactPickerScreenContract$InputData = juniorContactPickerScreen.K;
                        juniorContactPickerScreenContract$InputData.getClass();
                        return new il8.f(kVar, cVar2, juniorContactPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorContactPickerScreen.S;
                        return (i) ((il8.f) juniorContactPickerScreen.P.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wl8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorContactPickerScreen f298444b;

            {
                this.f298444b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorContactPickerScreen juniorContactPickerScreen = this.f298444b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorContactPickerScreen.S;
                        JuniorContactPickerScreen juniorContactPickerScreen2 = this.f298444b;
                        return dli.f.a(juniorContactPickerScreen2, juniorContactPickerScreen2.d(), v.k(juniorContactPickerScreen2.L, juniorContactPickerScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.juniorContactPicker_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorContactPickerScreen.S;
                        qji.b bVarU2 = juniorContactPickerScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.di.JuniorContactPickerScreenInjector");
                        }
                        il8.c cVar = (il8.c) bVarU2;
                        il8.k kVar = cVar.f162141b;
                        il8.c cVar2 = cVar.f162142c;
                        JuniorContactPickerScreenContract$InputData juniorContactPickerScreenContract$InputData = juniorContactPickerScreen.K;
                        juniorContactPickerScreenContract$InputData.getClass();
                        return new il8.f(kVar, cVar2, juniorContactPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorContactPickerScreen.S;
                        return (i) ((il8.f) juniorContactPickerScreen.P.getValue()).f.get();
                }
            }
        });
        this.R = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton juniorContactPickerContinueButton = d3().f144574b;
        Intrinsics.checkNotNullExpressionValue(juniorContactPickerContinueButton, "juniorContactPickerContinueButton");
        juniorContactPickerContinueButton.setVisibility(uiState.f298451b ? 0 : 8);
        d3().f144575c.setSearchButtonActive(uiState.f298452c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        NavBarWithToolbar navBarWithToolbar = d3().f144575c;
        if (!navBarWithToolbar.f59421x0) {
            return super.F2();
        }
        navBarWithToolbar.i0();
        navBarWithToolbar.m0(j4.FADE);
        navBarWithToolbar.setExpanded(true);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f144575c;
        int i = R$string.junior_child_phone_picker_header_title_with_name;
        JuniorContactPickerScreenContract$InputData juniorContactPickerScreenContract$InputData = this.K;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(juniorContactPickerScreenContract$InputData.f77211a), null, 12);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.junior_child_phone_picker_header_subtitle_without_name, null, null, 14));
        navBarWithToolbar.setMenuItems(u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_NEW", new TextLocalisedClause(R$string.junior_child_phone_picker_header_action_new, null, null, 14), null, 60)));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.junior_child_phone_picker_search_placeholder, u.c(juniorContactPickerScreenContract$InputData.f77211a), null, 12));
        LargeActionButton largeActionButton = d3().f144574b;
        largeActionButton.setLoadingButtonTag("BUTTON_LOADING_ID");
        largeActionButton.setText(new TextLocalisedClause(R$string.junior_child_phone_picker_action_confirm, null, null, 14));
        ScreenContentRecyclerView juniorContactPickerRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(juniorContactPickerRecyclerView, "juniorContactPickerRecyclerView");
        y.g(juniorContactPickerRecyclerView, m2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f144575c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f144574b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f144575c.o.f57403b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f144575c.f59409p.f57337m), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new wl8.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new wl8.f(this, null), 3);
    }

    public final gl8.b d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gl8.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
