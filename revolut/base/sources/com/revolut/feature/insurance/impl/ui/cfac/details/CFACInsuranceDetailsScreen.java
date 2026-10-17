package com.revolut.feature.insurance.impl.ui.cfac.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$id;
import com.revolut.feature.insurance.impl.R$layout;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lea.b;
import lhi.v;
import ljl.n1;
import lk7.d;
import lk7.f;
import lk7.i;
import lk7.j;
import lk7.k;
import nk7.m;
import rd0.e;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/details/CFACInsuranceDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Llk7/k;", "Lcom/revolut/feature/insurance/impl/ui/cfac/details/CFACInsuranceDetailsScreenContract$InputData;", "Llk7/i;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceDetailsScreen extends BaseRecyclerViewScreen<k, CFACInsuranceDetailsScreenContract$InputData, i> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CFACInsuranceDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance/impl/databinding/ScreenCfacInsuranceDetailsBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75119a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75120b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceDetailsScreen(CFACInsuranceDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_cfac_insurance_details;
        this.V = s.t(this, d.f);
        this.W = R$id.screenCFACInsuranceDetails_recyclerView;
        this.X = w.y0(new b(this, inputData, 8));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: lk7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceDetailsScreen f196274b;

            {
                this.f196274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceDetailsScreen cFACInsuranceDetailsScreen = this.f196274b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceDetailsScreen.c0;
                        return (j) ((nk7.m) cFACInsuranceDetailsScreen.X.getValue()).f216698c.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceDetailsScreen.c0;
                        return zhm.v.k(new ListSubheaderDelegate(), (PlainTextDelegate) cFACInsuranceDetailsScreen.f75119a0.getValue(), new RowDelegate(null, null, 7), (CellDetailsDelegate) cFACInsuranceDetailsScreen.Z.getValue(), new TextDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate());
                }
            }
        });
        this.Z = w.y0(new lh9.b(8));
        this.f75119a0 = w.y0(new lh9.b(9));
        final int i2 = 1;
        this.f75120b0 = w.y0(new Function0(this) { // from class: lk7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceDetailsScreen f196274b;

            {
                this.f196274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceDetailsScreen cFACInsuranceDetailsScreen = this.f196274b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceDetailsScreen.c0;
                        return (j) ((nk7.m) cFACInsuranceDetailsScreen.X.getValue()).f216698c.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceDetailsScreen.c0;
                        return zhm.v.k(new ListSubheaderDelegate(), (PlainTextDelegate) cFACInsuranceDetailsScreen.f75119a0.getValue(), new RowDelegate(null, null, 7), (CellDetailsDelegate) cFACInsuranceDetailsScreen.Z.getValue(), new TextDelegate(), new PlainTextLoadingDelegate(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (m) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithBigTile navBarWithBigTile = h3().f24624c;
        a.g2(this, e.b(navBarWithBigTile.f59357t), null, new lk7.e(this, null, 0), 3);
        a.g2(this, e.b(navBarWithBigTile.K()), null, new f(this, null), 3);
        a.g2(this, e.b(navBarWithBigTile.b()), null, new lk7.e(this, null, 1), 3);
        r rVarMergeWith = h3().f24623b.o.map(new v(18, new n1(10))).mergeWith(((CellDetailsDelegate) this.Z.getValue()).e.filter(new v(19, new n1(11))).map(new v(15, new n1(12)))).mergeWith(((PlainTextDelegate) this.f75119a0.getValue()).d.f121375b.filter(new v(16, new n1(8))).map(new v(17, new n1(9))));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        a.g2(this, e.b(rVarMergeWith), null, new le8.d(this, (Continuation) null, 12), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f24624c.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        h3().f24623b.setText(new TextLocalisedClause(R$string.cfac_policy_details_make_a_claim, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f75120b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithBigTile navBarWithBigTile = h3().f24624c;
        lk7.h hVar = uiState.f196282b;
        navBarWithBigTile.setToolbarTitle(hVar.f196277a);
        navBarWithBigTile.setTitle(hVar.f196277a);
        navBarWithBigTile.setBackgroundImage(hVar.f196278b);
        navBarWithBigTile.setActions(hVar.d);
        navBarWithBigTile.setMenuItems(hVar.e);
        navBarWithBigTile.setActionStatusLabel(hVar.f196279c);
        LargeActionButton screenCFACInsuranceDetailsButton = h3().f24623b;
        Intrinsics.checkNotNullExpressionValue(screenCFACInsuranceDetailsButton, "screenCFACInsuranceDetailsButton");
        screenCFACInsuranceDetailsButton.setVisibility(uiState.f196283c ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.U;
    }

    public final cj7.a h3() {
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (cj7.a) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
