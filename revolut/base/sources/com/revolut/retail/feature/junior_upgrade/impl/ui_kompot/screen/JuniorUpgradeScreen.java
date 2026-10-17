package com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.junior_upgrade.impl.R$id;
import com.revolut.retail.feature.junior_upgrade.impl.R$layout;
import com.revolut.retail.feature.junior_upgrade.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import eq8.b;
import euf.a;
import eyj.e;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import yxj.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/junior_upgrade/impl/ui_kompot/screen/JuniorUpgradeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Leyj/e;", "Lcom/revolut/retail/feature/junior_upgrade/impl/ui_kompot/screen/JuniorUpgradeScreenContract$InputData;", "Laii/q;", "feature_junior_upgrade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorUpgradeScreen extends BaseRecyclerViewScreen<e, JuniorUpgradeScreenContract$InputData, q> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101760a0 = {o0.f186429a.j(new h0(JuniorUpgradeScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/junior_upgrade/impl/databinding/ScreenJuniorUpgradeBinding;", 0))};
    public final Object U;
    public final Object V;
    public final int W;
    public final int X;
    public final Object Y;
    public final h Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorUpgradeScreen(JuniorUpgradeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new b(this, inputData, 17));
        this.V = w.y0(new es.e(this, 9));
        this.W = R$layout.screen_junior_upgrade;
        this.X = R$id.screen_recyclerView;
        this.Y = w.y0(new a(16));
        this.Z = s.t(this, eyj.a.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        e uiState = (e) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f300999c.setSecondaryButtonVisible(uiState.f130868a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (eyj.d) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f300998b.f59328m), null, new eyj.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f300999c.o0()), null, new eyj.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f300999c.p0()), null, new eyj.b(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarVaults navBarVaults = g3().f300998b;
        navBarVaults.setHeaderTitleText(new TextLocalisedClause(R$string.rev_u18_upgrade_no_feature_title, null, null, 14));
        navBarVaults.setToolbarTitle(new TextLocalisedClause(R$string.rev_u18_upgrade_no_feature_title, null, null, 14));
        navBarVaults.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarVaults.setBackgroundImage(new CdnImage("rev_u18_upgrade_plan_background", "mobile/youth", null, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), UrlImageDrawable.Shimmering.INSTANCE, null, Constants.TAG_E4_CUSTOMER_DATA));
        TwinVerticalButton twinVerticalButton = g3().f300999c;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.junior_upgrade_actions_upgrade, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.junior_upgrade_actions_not_now, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        e uiState = (e) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f300999c.setSecondaryButtonVisible(uiState.f130868a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF67178a0() {
        return (List) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    public final wxj.a g3() {
        ViewBinding value = this.Z.getValue(this, f101760a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wxj.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.W;
    }
}
