package com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreen;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nng.p;
import qh0.d;
import qng.b;
import qng.c;
import qng.h;
import qng.i;
import qng.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/address_suggestion/screen/AddressSuggestionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqng/h;", "Ldli/a;", "Lqng/j;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressSuggestionScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AddressSuggestionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final AddressSuggestionScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final ao.h Q;

    public AddressSuggestionScreen(AddressSuggestionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSuggestionScreen f247940b;

            {
                this.f247940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddressSuggestionScreen addressSuggestionScreen = this.f247940b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddressSuggestionScreen.R;
                        qji.b bVarU2 = addressSuggestionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.di.AddressSuggestionScreenInjector");
                        }
                        nng.a aVar = (nng.a) bVarU2;
                        p pVar = aVar.f217632b;
                        nng.a aVar2 = aVar.f217633c;
                        AddressSuggestionScreenContract$InputData addressSuggestionScreenContract$InputData = addressSuggestionScreen.K;
                        addressSuggestionScreenContract$InputData.getClass();
                        return new nng.b(pVar, aVar2, addressSuggestionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressSuggestionScreen.R;
                        return (i) ((nng.b) addressSuggestionScreen.L.getValue()).f217636c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressSuggestionScreen.R;
                        AddressSuggestionScreen addressSuggestionScreen2 = this.f247940b;
                        return dli.f.a(addressSuggestionScreen2, addressSuggestionScreen2.R2(), u.c((SelectableDelegate) addressSuggestionScreen2.N.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: qng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSuggestionScreen f247940b;

            {
                this.f247940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddressSuggestionScreen addressSuggestionScreen = this.f247940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressSuggestionScreen.R;
                        qji.b bVarU2 = addressSuggestionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.di.AddressSuggestionScreenInjector");
                        }
                        nng.a aVar = (nng.a) bVarU2;
                        p pVar = aVar.f217632b;
                        nng.a aVar2 = aVar.f217633c;
                        AddressSuggestionScreenContract$InputData addressSuggestionScreenContract$InputData = addressSuggestionScreen.K;
                        addressSuggestionScreenContract$InputData.getClass();
                        return new nng.b(pVar, aVar2, addressSuggestionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressSuggestionScreen.R;
                        return (i) ((nng.b) addressSuggestionScreen.L.getValue()).f217636c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressSuggestionScreen.R;
                        AddressSuggestionScreen addressSuggestionScreen2 = this.f247940b;
                        return dli.f.a(addressSuggestionScreen2, addressSuggestionScreen2.R2(), u.c((SelectableDelegate) addressSuggestionScreen2.N.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new d(29));
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: qng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressSuggestionScreen f247940b;

            {
                this.f247940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddressSuggestionScreen addressSuggestionScreen = this.f247940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressSuggestionScreen.R;
                        qji.b bVarU2 = addressSuggestionScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.di.AddressSuggestionScreenInjector");
                        }
                        nng.a aVar = (nng.a) bVarU2;
                        p pVar = aVar.f217632b;
                        nng.a aVar2 = aVar.f217633c;
                        AddressSuggestionScreenContract$InputData addressSuggestionScreenContract$InputData = addressSuggestionScreen.K;
                        addressSuggestionScreenContract$InputData.getClass();
                        return new nng.b(pVar, aVar2, addressSuggestionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressSuggestionScreen.R;
                        return (i) ((nng.b) addressSuggestionScreen.L.getValue()).f217636c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressSuggestionScreen.R;
                        AddressSuggestionScreen addressSuggestionScreen2 = this.f247940b;
                        return dli.f.a(addressSuggestionScreen2, addressSuggestionScreen2.R2(), u.c((SelectableDelegate) addressSuggestionScreen2.N.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_two_buttons;
        this.Q = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174573b.setEnabled(uiState.f247946b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nng.b) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AddressSuggestionScreenContract$InputData addressSuggestionScreenContract$InputData = this.K;
        this.z = addressSuggestionScreenContract$InputData.f94622g.b();
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setTitle(new TextClause(addressSuggestionScreenContract$InputData.f94619a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextClause(addressSuggestionScreenContract$InputData.f94620b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setNavigationButtonIcon(addressSuggestionScreenContract$InputData.f94622g.a());
        LargeActionButton largeActionButton = d3().f174573b;
        largeActionButton.setText(new TextClause(addressSuggestionScreenContract$InputData.f94621c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        LargeActionButton largeActionButton2 = d3().e;
        String str = addressSuggestionScreenContract$InputData.d;
        largeActionButton2.setVisibility(str != null ? 0 : 8);
        if (str != null) {
            largeActionButton2.setText(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174574c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((SelectableDelegate) this.N.getValue()).r()), new qng.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174573b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o), new c(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
