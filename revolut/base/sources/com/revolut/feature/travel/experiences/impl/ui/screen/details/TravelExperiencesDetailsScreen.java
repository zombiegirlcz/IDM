package com.revolut.feature.travel.experiences.impl.ui.screen.details;

import a08.b;
import a2g.c;
import a2g.d;
import a2g.f;
import a2g.j;
import a2g.k;
import a2g.l;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.f2;
import au0.u0;
import aw0.s8;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PropertyCardDelegate;
import com.revolut.core.ui_kit.delegates.ReviewCardDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import frl.a;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import te0.w;
import vc.s;
import w0g.g;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/details/TravelExperiencesDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "La2g/l;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/details/TravelExperiencesDetailsScreenContract$InputData;", "La2g/j;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesDetailsScreen extends BaseRecyclerViewScreen<l, TravelExperiencesDetailsScreenContract$InputData, j> implements m {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(TravelExperiencesDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesDetailsBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93054a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93055b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f93056d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f93057e0;
    public final h f0;
    public final List g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f93058h0;
    public final Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesDetailsScreen(TravelExperiencesDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137510y;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_experiences_details;
        this.W = R$id.experiencesDetails_recyclerView;
        Lazy lazyY0 = w.y0(new b(20));
        this.X = lazyY0;
        Lazy lazyY02 = w.y0(new b(21));
        this.Y = lazyY02;
        Lazy lazyY03 = w.y0(new b(22));
        this.Z = lazyY03;
        Lazy lazyY04 = w.y0(new b(23));
        this.f93054a0 = lazyY04;
        Lazy lazyY05 = w.y0(new b(24));
        this.f93055b0 = lazyY05;
        Lazy lazyY06 = w.y0(new b(25));
        this.c0 = lazyY06;
        Lazy lazyY07 = w.y0(new b(26));
        this.f93056d0 = lazyY07;
        Lazy lazyY08 = w.y0(new b(27));
        this.f93057e0 = lazyY08;
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(u.c(new ReviewCardDelegate()), false);
        this.f0 = s.t(this, a2g.b.f);
        this.g0 = v.k((PropertyCardDelegate) lazyY0.getValue(), (CellDetailsPriceDelegate) lazyY02.getValue(), (CellDetailsBadgeDelegate) lazyY03.getValue(), (CellDetailsChevronDelegate) lazyY04.getValue(), (PlainTextDelegate) lazyY05.getValue(), (ListSubheaderDelegate) lazyY06.getValue(), (CellDetailsActionListDelegate) lazyY07.getValue(), (CellDetailsRevPointsDelegate) lazyY08.getValue(), scrollerDelegate, new ListCellDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new PlainTextLoadingDelegate());
        this.f93058h0 = w.y0(new a07.b(this, inputData, 3));
        this.i0 = w.y0(new a2g.a(this, 0));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (b2g.a) this.f93058h0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f293705b.f59357t), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f293706c.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CellDetailsChevronDelegate) this.f93054a0.getValue()).f51821c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((PlainTextDelegate) this.f93055b0.getValue()).f.f121375b), null, new a2g.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ListSubheaderDelegate) this.c0.getValue()).f52707c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f293705b.f59360y.m0()), null, new c(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f293705b.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        h3().f293706c.setVisibility(8);
        h3().f293706c.o(LargeActionButton.ButtonStyle.f58725a);
        h3().f293706c.setText(new TextLocalisedClause(R$string.experiences_details_action_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getG0() {
        return this.g0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithBigTile experiencesDetailsNavBarWithBigTile = h3().f293705b;
        Intrinsics.checkNotNullExpressionValue(experiencesDetailsNavBarWithBigTile, "experiencesDetailsNavBarWithBigTile");
        List list = uiState.f843b.f839a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new u0(new NavBarWithContainerBackground.ImageBackground((Image) it8.next(), (s8) null, (Color.SolidRes) null, 14), null, null, null));
        }
        c1.S(experiencesDetailsNavBarWithBigTile, arrayList, f2.COUNT_TAG, null, 4);
        h3().f293706c.setVisibility(uiState.f844c ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    public final g h3() {
        ViewBinding value = this.f0.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final k T2() {
        return (k) this.i0.getValue();
    }
}
