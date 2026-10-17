package com.revolut.feature.credit.card.impl.ui.description;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import grl.k9;
import h30.l;
import java.util.List;
import jii.u;
import jki.o;
import jm4.w3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import rd0.e;
import te0.w;
import vc.s;
import xq4.b;
import xq4.c;
import xq4.g;
import xq4.i;
import xq4.j;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxq4/j;", "Lcom/revolut/feature/credit/card/impl/ui/description/CreditCardDescriptionScreenContract$InputData;", "Laii/q;", "Lno/m;", "Lno/k;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardDescriptionScreen extends BaseRecyclerViewScreen<j, CreditCardDescriptionScreenContract$InputData, q> implements m, k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f69205e0 = {o0.f186429a.j(new h0(CreditCardDescriptionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public AnalyticsContext V;
    public final int W;
    public final boolean X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f69206a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ListCellDelegate f69207b0;
    public final NotificationCentreItemDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f69208d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardDescriptionScreen(CreditCardDescriptionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.W = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 1;
        this.X = true;
        this.Y = s.t(this, b.f);
        this.Z = w.y0(new xfj.a(this, inputData, 11));
        final int i2 = 0;
        this.f69206a0 = w.y0(new Function0(this) { // from class: xq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDescriptionScreen f308105b;

            {
                this.f308105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CreditCardDescriptionScreen creditCardDescriptionScreen = this.f308105b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardDescriptionScreen.f69205e0;
                        w3 w3Var = (w3) creditCardDescriptionScreen.Z.getValue();
                        switch (w3Var.f176423a) {
                            case 0:
                                return (g) w3Var.e.get();
                            default:
                                return (g) w3Var.e.get();
                        }
                    default:
                        return v.k(creditCardDescriptionScreen.f69207b0, creditCardDescriptionScreen.c0);
                }
            }
        });
        this.f69207b0 = new ListCellDelegate();
        this.c0 = new NotificationCentreItemDelegate();
        this.f69208d0 = w.y0(new Function0(this) { // from class: xq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDescriptionScreen f308105b;

            {
                this.f308105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CreditCardDescriptionScreen creditCardDescriptionScreen = this.f308105b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardDescriptionScreen.f69205e0;
                        w3 w3Var = (w3) creditCardDescriptionScreen.Z.getValue();
                        switch (w3Var.f176423a) {
                            case 0:
                                return (g) w3Var.e.get();
                            default:
                                return (g) w3Var.e.get();
                        }
                    default:
                        return v.k(creditCardDescriptionScreen.f69207b0, creditCardDescriptionScreen.c0);
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.V = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.U;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (w3) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f69206a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(this.f69207b0.d, this.c0.d, "merge(...)"), null, new xjl.g(this, continuation, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF95992b0() {
        return (List) this.f69208d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        i iVar = uiState.f308111a;
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setNavigationButtonImage(iVar.f308110c);
        navBarWithToolbar.setTitle(iVar.f308108a, null);
        navBarWithToolbar.setToolbarTitle(iVar.f308109b);
        xq4.h hVar = uiState.f308113c;
        LargeActionButton largeActionButton = h3().f174564b;
        hVar.getClass();
        largeActionButton.setVisibility(8);
        largeActionButton.setText((Clause) null);
        this.V = uiState.d;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    public final u h3() {
        ViewBinding value = this.Y.getValue(this, f69205e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
