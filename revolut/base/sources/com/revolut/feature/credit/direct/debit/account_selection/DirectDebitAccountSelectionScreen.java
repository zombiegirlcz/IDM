package com.revolut.feature.credit.direct.debit.account_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dw3.o;
import efm.r;
import in0.g;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tml.a;
import tna.p;
import ty4.b;
import ty4.c;
import ty4.i;
import ty4.k;
import vc.s;
import yhm.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_selection/DirectDebitAccountSelectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lty4/k;", "Lcom/revolut/feature/credit/direct/debit/account_selection/DirectDebitAccountSelectionScreenContract$InputData;", "Lty4/i;", "Lin0/g;", "Lno/k;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitAccountSelectionScreen extends BaseRecyclerViewScreen<k, DirectDebitAccountSelectionScreenContract$InputData, i> implements g, no.k {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(DirectDebitAccountSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public AnalyticsContext U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Lazy Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Lazy f69883a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Lazy f69884b0;
    public final Lazy c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f69885d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f69886e0;
    public final h f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDebitAccountSelectionScreen(DirectDebitAccountSelectionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = inputData.f69889c;
        this.V = R$layout.screen_recycler_navbar;
        final int i = 1;
        this.W = true;
        this.X = w.y0(new a(this, inputData, 26));
        final int i2 = 0;
        this.Y = w.y0(new Function0(this) { // from class: ty4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitAccountSelectionScreen f275465b;

            {
                this.f275465b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                DirectDebitAccountSelectionScreen directDebitAccountSelectionScreen = this.f275465b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitAccountSelectionScreen.g0;
                        dw3.o oVar = (dw3.o) directDebitAccountSelectionScreen.X.getValue();
                        switch (oVar.f119375a) {
                            case 0:
                                return (j) oVar.i.get();
                            case 1:
                                return (j) oVar.i.get();
                            default:
                                return (j) oVar.i.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitAccountSelectionScreen.g0;
                        dw3.o oVar2 = (dw3.o) directDebitAccountSelectionScreen.X.getValue();
                        switch (oVar2.f119375a) {
                            case 0:
                                return (j60.a) oVar2.e.get();
                            case 1:
                                return (j60.a) oVar2.e.get();
                            default:
                                return (j60.a) oVar2.e.get();
                        }
                }
            }
        });
        Lazy lazyB = j.b(new ty.a(2));
        this.Z = lazyB;
        Lazy lazyB2 = j.b(new ty.a(3));
        this.f69883a0 = lazyB2;
        Lazy lazyB3 = j.b(new ty.a(4));
        this.f69884b0 = lazyB3;
        Lazy lazyB4 = j.b(new ty.a(5));
        this.c0 = lazyB4;
        this.f69885d0 = v.k((ListSubheaderDelegate) lazyB.getValue(), (RowDelegate) lazyB2.getValue(), (TextDelegate) lazyB3.getValue(), (LargeActionButtonDelegate) lazyB4.getValue(), new RowLoadingDelegate());
        this.f69886e0 = w.y0(new Function0(this) { // from class: ty4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitAccountSelectionScreen f275465b;

            {
                this.f275465b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                DirectDebitAccountSelectionScreen directDebitAccountSelectionScreen = this.f275465b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitAccountSelectionScreen.g0;
                        dw3.o oVar = (dw3.o) directDebitAccountSelectionScreen.X.getValue();
                        switch (oVar.f119375a) {
                            case 0:
                                return (j) oVar.i.get();
                            case 1:
                                return (j) oVar.i.get();
                            default:
                                return (j) oVar.i.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitAccountSelectionScreen.g0;
                        dw3.o oVar2 = (dw3.o) directDebitAccountSelectionScreen.X.getValue();
                        switch (oVar2.f119375a) {
                            case 0:
                                return (j60.a) oVar2.e.get();
                            case 1:
                                return (j60.a) oVar2.e.get();
                            default:
                                return (j60.a) oVar2.e.get();
                        }
                }
            }
        });
        this.f0 = s.t(this, b.f);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF0() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (o) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ty4.j) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Lazy lazy = this.f69883a0;
        r rVarMerge = r.merge(((RowDelegate) lazy.getValue()).f53218h, ((ListSubheaderDelegate) this.Z.getValue()).f52707c, ((LargeActionButtonDelegate) this.c0.getValue()).d.f121375b, ((TextDelegate) this.f69884b0.getValue()).d);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge), null, new p(this, continuation, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) lazy.getValue()).k), null, new c(this, null), 3);
        ViewBinding value = this.f0.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new tk5.c(this, continuation, 25), 3);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.f0.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_direct_debit_account_selection_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.credit_direct_debit_account_selection_loan_subtitle, null, null, 14));
        ((j60.a) this.f69886e0.getValue()).d(u.c((LargeActionButtonDelegate) this.c0.getValue()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.f69885d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // in0.g
    public final boolean p0() {
        return ((DirectDebitAccountSelectionScreenContract$InputData) this.G).f69888b;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
