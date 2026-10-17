package com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr.h2;
import kv7.b;
import kv7.c;
import kv7.d;
import kv7.f;
import kv7.i;
import lu7.s;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/eligible_cards/InsuranceEligibleCardsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lkv7/f;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceEligibleCardsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InsuranceEligibleCardsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final InsuranceEligibleCardsScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public InsuranceEligibleCardsScreen(InsuranceEligibleCardsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new h2(27));
        this.N = w.y0(new h2(28));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: kv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceEligibleCardsScreen f189983b;

            {
                this.f189983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsuranceEligibleCardsScreen insuranceEligibleCardsScreen = this.f189983b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceEligibleCardsScreen.S;
                        InsuranceEligibleCardsScreen insuranceEligibleCardsScreen2 = this.f189983b;
                        return dli.f.a(insuranceEligibleCardsScreen2, (i) insuranceEligibleCardsScreen2.R.getValue(), v.k((RowDelegate) insuranceEligibleCardsScreen2.M.getValue(), new RowLoadingDelegate(), (LargeActionButtonDelegate) insuranceEligibleCardsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceEligibleCardsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceEligibleCardsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceEligibleCardsScreenContract$InputData insuranceEligibleCardsScreenContract$InputData = insuranceEligibleCardsScreen.K;
                        insuranceEligibleCardsScreenContract$InputData.getClass();
                        return new lu7.q(sVar, insuranceEligibleCardsScreen, insuranceEligibleCardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceEligibleCardsScreen.S;
                        return (i) ((lu7.q) insuranceEligibleCardsScreen.Q.getValue()).f.get();
                }
            }
        });
        this.P = vc.s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: kv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceEligibleCardsScreen f189983b;

            {
                this.f189983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsuranceEligibleCardsScreen insuranceEligibleCardsScreen = this.f189983b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceEligibleCardsScreen.S;
                        InsuranceEligibleCardsScreen insuranceEligibleCardsScreen2 = this.f189983b;
                        return dli.f.a(insuranceEligibleCardsScreen2, (i) insuranceEligibleCardsScreen2.R.getValue(), v.k((RowDelegate) insuranceEligibleCardsScreen2.M.getValue(), new RowLoadingDelegate(), (LargeActionButtonDelegate) insuranceEligibleCardsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceEligibleCardsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceEligibleCardsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceEligibleCardsScreenContract$InputData insuranceEligibleCardsScreenContract$InputData = insuranceEligibleCardsScreen.K;
                        insuranceEligibleCardsScreenContract$InputData.getClass();
                        return new lu7.q(sVar, insuranceEligibleCardsScreen, insuranceEligibleCardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceEligibleCardsScreen.S;
                        return (i) ((lu7.q) insuranceEligibleCardsScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: kv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceEligibleCardsScreen f189983b;

            {
                this.f189983b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsuranceEligibleCardsScreen insuranceEligibleCardsScreen = this.f189983b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceEligibleCardsScreen.S;
                        InsuranceEligibleCardsScreen insuranceEligibleCardsScreen2 = this.f189983b;
                        return dli.f.a(insuranceEligibleCardsScreen2, (i) insuranceEligibleCardsScreen2.R.getValue(), v.k((RowDelegate) insuranceEligibleCardsScreen2.M.getValue(), new RowLoadingDelegate(), (LargeActionButtonDelegate) insuranceEligibleCardsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceEligibleCardsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceEligibleCardsScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceEligibleCardsScreenContract$InputData insuranceEligibleCardsScreenContract$InputData = insuranceEligibleCardsScreen.K;
                        insuranceEligibleCardsScreenContract$InputData.getClass();
                        return new lu7.q(sVar, insuranceEligibleCardsScreen, insuranceEligibleCardsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceEligibleCardsScreen.S;
                        return (i) ((lu7.q) insuranceEligibleCardsScreen.Q.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f189985a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174564b.setText(uiState.f189986b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lu7.q) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
