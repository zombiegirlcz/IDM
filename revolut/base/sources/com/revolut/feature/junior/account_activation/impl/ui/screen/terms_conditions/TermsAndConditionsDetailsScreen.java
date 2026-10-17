package com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import cli.o;
import cli.q;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions.TermsAndConditionsDetailsScreen;
import com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions.TermsAndConditionsDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p68.b;
import p68.c;
import p68.d;
import p68.f;
import p68.g;
import s58.a;
import te0.w;
import vc.s;
import z58.j;
import z58.k;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/terms_conditions/TermsAndConditionsDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls58/a;", "Ldli/a;", "Lp68/g;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TermsAndConditionsDetailsScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TermsAndConditionsDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final TermsAndConditionsDetailsScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final Object R;

    public TermsAndConditionsDetailsScreen(TermsAndConditionsDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: p68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsAndConditionsDetailsScreen f233224b;

            {
                this.f233224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen = this.f233224b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TermsAndConditionsDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(termsAndConditionsDetailsScreen.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).o;
                        TermsAndConditionsDetailsScreenContract$InputData termsAndConditionsDetailsScreenContract$InputData = termsAndConditionsDetailsScreen.K;
                        termsAndConditionsDetailsScreenContract$InputData.getClass();
                        return new k(jVar, termsAndConditionsDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsAndConditionsDetailsScreen.S;
                        return (f) ((k) termsAndConditionsDetailsScreen.O.getValue()).f319584c.get();
                    default:
                        KProperty[] kPropertyArr3 = TermsAndConditionsDetailsScreen.S;
                        TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen2 = this.f233224b;
                        return dli.f.a(termsAndConditionsDetailsScreen2, termsAndConditionsDetailsScreen2.R2(), u.c(termsAndConditionsDetailsScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: p68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsAndConditionsDetailsScreen f233224b;

            {
                this.f233224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen = this.f233224b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TermsAndConditionsDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(termsAndConditionsDetailsScreen.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).o;
                        TermsAndConditionsDetailsScreenContract$InputData termsAndConditionsDetailsScreenContract$InputData = termsAndConditionsDetailsScreen.K;
                        termsAndConditionsDetailsScreenContract$InputData.getClass();
                        return new k(jVar, termsAndConditionsDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsAndConditionsDetailsScreen.S;
                        return (f) ((k) termsAndConditionsDetailsScreen.O.getValue()).f319584c.get();
                    default:
                        KProperty[] kPropertyArr3 = TermsAndConditionsDetailsScreen.S;
                        TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen2 = this.f233224b;
                        return dli.f.a(termsAndConditionsDetailsScreen2, termsAndConditionsDetailsScreen2.R2(), u.c(termsAndConditionsDetailsScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: p68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsAndConditionsDetailsScreen f233224b;

            {
                this.f233224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen = this.f233224b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TermsAndConditionsDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(termsAndConditionsDetailsScreen.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).o;
                        TermsAndConditionsDetailsScreenContract$InputData termsAndConditionsDetailsScreenContract$InputData = termsAndConditionsDetailsScreen.K;
                        termsAndConditionsDetailsScreenContract$InputData.getClass();
                        return new k(jVar, termsAndConditionsDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsAndConditionsDetailsScreen.S;
                        return (f) ((k) termsAndConditionsDetailsScreen.O.getValue()).f319584c.get();
                    default:
                        KProperty[] kPropertyArr3 = TermsAndConditionsDetailsScreen.S;
                        TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen2 = this.f233224b;
                        return dli.f.a(termsAndConditionsDetailsScreen2, termsAndConditionsDetailsScreen2.R2(), u.c(termsAndConditionsDetailsScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        jii.k kVarD3 = d3();
        kVarD3.f174534c.setNavigationButtonImage(uiState.f233228b);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = kVarD3.f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f233229c;
        screenRecyclerNavbarActionFooterNavBar.setToolbarTitle(textLocalisedClause);
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setTitle(textLocalisedClause, null);
        screenRecyclerNavbarActionFooterNavBar.setDescriptionVisible(false);
        ActionFooterView actionFooterView = kVarD3.f174533b;
        Clause clause = uiState.d;
        actionFooterView.setModel(new e(clause != null, clause, null, new n6(uiState.e, LargeActionButton.ButtonStyle.f58725a, null, "CTA_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 52));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53226s), new c(this, null, 1), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
