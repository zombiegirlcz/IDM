package com.revolut.feature.travel.miles.impl.ui.screen.account_registration;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.cbeff.ISO781611;
import q97.p1;
import qba.b;
import qba.c;
import qgg.d;
import qgg.f;
import qgg.i;
import qgg.j;
import qgg.o;
import rd0.e;
import te0.w;
import ufg.y;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/account_registration/TravelMilesAccountRegistrationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqgg/j;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/account_registration/TravelMilesAccountRegistrationScreenContract$InputData;", "Lqgg/i;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesAccountRegistrationScreen extends BaseRecyclerViewScreen<j, TravelMilesAccountRegistrationScreenContract$InputData, i> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(TravelMilesAccountRegistrationScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenMilesAccountRegistrationBinding;", 0))};
    public final h U;
    public final Object V;
    public final int W;
    public final int X;
    public final boolean Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f94257a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f94258b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelMilesAccountRegistrationScreen(TravelMilesAccountRegistrationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, d.f);
        Lazy lazyY0 = w.y0(new c(25));
        this.V = lazyY0;
        this.W = R$layout.screen_miles_account_registration;
        this.X = R$id.milesAccountRegistration_recyclerView;
        this.Y = true;
        this.Z = w.y0(new b(this, inputData, 10));
        this.f94257a0 = w.y0(new p1(this, 8));
        this.f94258b0 = u.c((InputTextDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (y) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (o) this.f94257a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, e.b(h3().f253780c.f59410q), null, new qgg.e(this, continuation, 0), 3);
        a.g2(this, e.b(((InputTextDelegate) this.V.getValue()).e.f121375b), null, new f(this, null), 3);
        a.g2(this, e.b(h3().d.o), null, new qgg.e(this, continuation, 1), 3);
        a.g2(this, e.b(h3().f253779b.f58608l), null, new qgg.e(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f253780c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        TravelMilesAccountRegistrationScreenContract$InputData travelMilesAccountRegistrationScreenContract$InputData = (TravelMilesAccountRegistrationScreenContract$InputData) this.G;
        navBarWithToolbar.setTitle(new TextClause(travelMilesAccountRegistrationScreenContract$InputData.f94259a.f94104b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setToolbarTitle(new TextClause(travelMilesAccountRegistrationScreenContract$InputData.f94259a.f94104b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setEndIconImage(new UrlImage(travelMilesAccountRegistrationScreenContract$InputData.f94259a.d, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090));
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = h3().d;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.miles_common_next_button_title, null, null, 14));
        largeActionButton.setLoadingButtonTag("REGISTER_ACCOUNT_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF94258b0() {
        return this.f94258b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().d.setEnabled(uiState.f245838c);
        h3().f253779b.setTextClause(uiState.f245837b);
        h3().f253780c.setDescriptionText(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    public final rfg.b h3() {
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.b) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
