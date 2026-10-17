package com.revolut.feature.joint.impl.ui.phone_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$id;
import com.revolut.feature.joint.impl.R$layout;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e48.k;
import fx5.a;
import g58.c;
import g58.d;
import g58.e;
import g58.f;
import g58.g;
import grl.k9;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/phone_confirmation/JointContactPhoneConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lg58/e;", "Lcom/revolut/feature/joint/impl/ui/phone_confirmation/JointContactPhoneConfirmationContract$InputData;", "Lg58/c;", "Lno/m;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointContactPhoneConfirmationScreen extends BaseRecyclerViewScreen<e, JointContactPhoneConfirmationContract$InputData, c> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(JointContactPhoneConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/joint/impl/databinding/ScreenConfirmationBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final AnalyticsProduct.Retail Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CodeEditorDelegate f76593a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f76594b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointContactPhoneConfirmationScreen(JointContactPhoneConfirmationContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_confirmation;
        this.V = R$id.confirmation_recyclerView;
        this.W = s.t(this, f.f);
        this.X = w.y0(new a(this, inputData, 9));
        this.Y = w.y0(new fp3.a(this, 23));
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137508w;
        this.Z = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        CodeEditorDelegate codeEditorDelegate = new CodeEditorDelegate();
        this.f76593a0 = codeEditorDelegate;
        this.f76594b0 = u.c(codeEditorDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.Z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (k) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f111243b.f59410q), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f111244c.o0()), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f111244c.p0()), null, new g(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f76593a0.d.f121375b), null, new exe.k(2, (d) this.Y.getValue(), d.class, "inputCodeChanged", "inputCodeChanged(Ljava/lang/String;)V", 4, 15), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f111243b;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f76594b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f111243b;
        TextLocalisedClause textLocalisedClause = uiState.f140690a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(uiState.f140691b);
        TwinVerticalButton twinVerticalButton = h3().f111244c;
        twinVerticalButton.setMainButtonText(uiState.f140692c);
        twinVerticalButton.setMainButtonEnabled(uiState.d == g58.a.ACTIVE);
        twinVerticalButton.setSecondaryButtonVisible(true);
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.joint_confirm_details_decline_invitation, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final d48.a h3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d48.a) value;
    }
}
