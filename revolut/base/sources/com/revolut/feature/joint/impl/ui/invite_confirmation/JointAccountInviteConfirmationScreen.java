package com.revolut.feature.joint.impl.ui.invite_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$id;
import com.revolut.feature.joint.impl.R$layout;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.ui.invite_confirmation.JointAccountInviteConfirmationScreen;
import com.revolut.feature.joint.impl.ui.invite_confirmation.JointAccountInviteConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e48.e;
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
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import z48.b;
import z48.c;
import z48.g;
import z48.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/invite_confirmation/JointAccountInviteConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lz48/i;", "Lcom/revolut/feature/joint/impl/ui/invite_confirmation/JointAccountInviteConfirmationScreenContract$InputData;", "Lz48/g;", "Lno/m;", "Companion", "a", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointAccountInviteConfirmationScreen extends BaseRecyclerViewScreen<i, JointAccountInviteConfirmationScreenContract$InputData, g> implements m {
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final AnalyticsProduct.Retail Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f76553a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f76552b0 = {o0.f186429a.j(new h0(JointAccountInviteConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/joint/impl/databinding/ScreenConsentBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.joint.impl.ui.invite_confirmation.JointAccountInviteConfirmationScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountInviteConfirmationScreen(JointAccountInviteConfirmationScreenContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = R$layout.screen_consent;
        this.V = R$id.consentScreen_recyclerView;
        this.W = s.t(this, b.f);
        TextDelegate textDelegate = new TextDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: z48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointAccountInviteConfirmationScreen f319340b;

            {
                this.f319340b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JointAccountInviteConfirmationScreen jointAccountInviteConfirmationScreen = this.f319340b;
                switch (i2) {
                    case 0:
                        JointAccountInviteConfirmationScreen.Companion companion = JointAccountInviteConfirmationScreen.INSTANCE;
                        qji.b bVarQ2 = jointAccountInviteConfirmationScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.invite_confirmation.di.JointAccountInviteConfirmationScreenInjector");
                        e48.m mVar = (e48.m) bVarQ2;
                        e48.g gVar = mVar.f122456b;
                        e48.m mVar2 = mVar.f122457c;
                        JointAccountInviteConfirmationScreenContract$InputData jointAccountInviteConfirmationScreenContract$InputData = (JointAccountInviteConfirmationScreenContract$InputData) jointAccountInviteConfirmationScreen.G;
                        jointAccountInviteConfirmationScreenContract$InputData.getClass();
                        return new e48.e(gVar, mVar2, jointAccountInviteConfirmationScreenContract$InputData);
                    default:
                        JointAccountInviteConfirmationScreen.Companion companion2 = JointAccountInviteConfirmationScreen.INSTANCE;
                        return (h) ((e48.e) jointAccountInviteConfirmationScreen.X.getValue()).d.get();
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137508w;
        this.Y = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: z48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointAccountInviteConfirmationScreen f319340b;

            {
                this.f319340b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JointAccountInviteConfirmationScreen jointAccountInviteConfirmationScreen = this.f319340b;
                switch (i22) {
                    case 0:
                        JointAccountInviteConfirmationScreen.Companion companion2 = JointAccountInviteConfirmationScreen.INSTANCE;
                        qji.b bVarQ2 = jointAccountInviteConfirmationScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.invite_confirmation.di.JointAccountInviteConfirmationScreenInjector");
                        e48.m mVar = (e48.m) bVarQ2;
                        e48.g gVar = mVar.f122456b;
                        e48.m mVar2 = mVar.f122457c;
                        JointAccountInviteConfirmationScreenContract$InputData jointAccountInviteConfirmationScreenContract$InputData = (JointAccountInviteConfirmationScreenContract$InputData) jointAccountInviteConfirmationScreen.G;
                        jointAccountInviteConfirmationScreenContract$InputData.getClass();
                        return new e48.e(gVar, mVar2, jointAccountInviteConfirmationScreenContract$InputData);
                    default:
                        JointAccountInviteConfirmationScreen.Companion companion22 = JointAccountInviteConfirmationScreen.INSTANCE;
                        return (h) ((e48.e) jointAccountInviteConfirmationScreen.X.getValue()).d.get();
                }
            }
        });
        this.f76553a0 = v.k(textDelegate, new ListCellDelegate(), rowDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (e) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (z48.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f111246b.f59410q), null, new c(this, null, 0), 3);
        TwinVerticalButton twinVerticalButton = g3().f111247c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.o0()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.p0()), null, new c(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f111246b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.joint_confirm_details_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.joint_confirm_details_description, u.c(((JointAccountInviteConfirmationScreenContract$InputData) this.G).f76554a.e5()), null, 12));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = g3().f111247c;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.joint_consent_action_accept_invitation, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.joint_consent_action_decline_invitation, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f76553a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    public final d48.b g3() {
        ViewBinding value = this.W.getValue(this, f76552b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d48.b) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }
}
