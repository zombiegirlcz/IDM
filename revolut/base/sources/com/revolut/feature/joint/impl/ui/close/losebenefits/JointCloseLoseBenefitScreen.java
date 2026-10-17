package com.revolut.feature.joint.impl.ui.close.losebenefits;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$id;
import com.revolut.feature.joint.impl.R$layout;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.ui.close.losebenefits.JointCloseLoseBenefitContract$InputData;
import com.revolut.feature.joint.impl.ui.close.losebenefits.JointCloseLoseBenefitScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import frl.a;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import o48.c;
import o48.d;
import o48.e;
import o48.g;
import o48.i;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/close/losebenefits/JointCloseLoseBenefitScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lo48/e;", "Lcom/revolut/feature/joint/impl/ui/close/losebenefits/JointCloseLoseBenefitContract$InputData;", "Lo48/d;", "Lno/m;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointCloseLoseBenefitScreen extends BaseRecyclerViewScreen<e, JointCloseLoseBenefitContract$InputData, d> implements m {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f76510b0 = {o0.f186429a.j(new h0(JointCloseLoseBenefitScreen.class, "binding", "getBinding()Lcom/revolut/feature/joint/impl/databinding/ScreenLoseBenefitBinding;", 0))};
    public final int U;
    public final int V;
    public final AnalyticsProduct.Retail W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f76511a0;

    /* JADX WARN: Illegal instructions before constructor call */
    public JointCloseLoseBenefitScreen() {
        JointCloseLoseBenefitContract$InputData input = JointCloseLoseBenefitContract$InputData.f76509a;
        Intrinsics.checkNotNullParameter(input, "input");
        super(input);
        this.U = R$layout.screen_lose_benefit;
        this.V = R$id.loseBenefitScreen_recyclerView;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137508w;
        this.W = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.X = s.t(this, g.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: o48.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointCloseLoseBenefitScreen f222171b;

            {
                this.f222171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JointCloseLoseBenefitScreen jointCloseLoseBenefitScreen = this.f222171b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JointCloseLoseBenefitScreen.f76510b0;
                        qji.b bVarQ2 = jointCloseLoseBenefitScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.close_flow.di.JointCloseFlowComponent");
                        e48.h hVar = (e48.h) bVarQ2;
                        e48.g gVar = hVar.f122442b;
                        e48.h hVar2 = hVar.f122443c;
                        JointCloseLoseBenefitContract$InputData jointCloseLoseBenefitContract$InputData = (JointCloseLoseBenefitContract$InputData) jointCloseLoseBenefitScreen.G;
                        jointCloseLoseBenefitContract$InputData.getClass();
                        return new e48.i(gVar, hVar2, jointCloseLoseBenefitContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = JointCloseLoseBenefitScreen.f76510b0;
                        return (i) ((e48.i) jointCloseLoseBenefitScreen.Y.getValue()).f122445b.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: o48.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointCloseLoseBenefitScreen f222171b;

            {
                this.f222171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JointCloseLoseBenefitScreen jointCloseLoseBenefitScreen = this.f222171b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointCloseLoseBenefitScreen.f76510b0;
                        qji.b bVarQ2 = jointCloseLoseBenefitScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.close_flow.di.JointCloseFlowComponent");
                        e48.h hVar = (e48.h) bVarQ2;
                        e48.g gVar = hVar.f122442b;
                        e48.h hVar2 = hVar.f122443c;
                        JointCloseLoseBenefitContract$InputData jointCloseLoseBenefitContract$InputData = (JointCloseLoseBenefitContract$InputData) jointCloseLoseBenefitScreen.G;
                        jointCloseLoseBenefitContract$InputData.getClass();
                        return new e48.i(gVar, hVar2, jointCloseLoseBenefitContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = JointCloseLoseBenefitScreen.f76510b0;
                        return (i) ((e48.i) jointCloseLoseBenefitScreen.Y.getValue()).f122445b.get();
                }
            }
        });
        this.f76511a0 = v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((i) this.Z.getValue()).v2(c.f222168a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (e48.i) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        TwinVerticalButton twinVerticalButton = g3().f111252c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.o0()), null, new o48.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.p0()), null, new o48.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f111251b.f59410q), null, new o48.h(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        d48.d dVarG3 = g3();
        dVarG3.f111251b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        NavBarWithToolbar loseBenefitScreenNavBar = dVarG3.f111251b;
        Intrinsics.checkNotNullExpressionValue(loseBenefitScreenNavBar, "loseBenefitScreenNavBar");
        loseBenefitScreenNavBar.setTitle(new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_title, null, null, 14), null);
        loseBenefitScreenNavBar.setDescriptionVisible(true);
        loseBenefitScreenNavBar.setHeaderTitleMode(j0.MULTILINE);
        loseBenefitScreenNavBar.setDescriptionText(new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_subtitle, null, null, 14));
        TwinVerticalButton twinVerticalButton = dVarG3.f111252c;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.joint_offboarding_confirmation_action_keep_joint_account, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f76511a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    public final d48.d g3() {
        ViewBinding value = this.X.getValue(this, f76510b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d48.d) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
