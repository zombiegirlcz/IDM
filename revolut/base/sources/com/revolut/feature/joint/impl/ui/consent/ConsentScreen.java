package com.revolut.feature.joint.impl.ui.consent;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$id;
import com.revolut.feature.joint.impl.R$layout;
import com.revolut.feature.joint.impl.ui.consent.ConsentScreen;
import com.revolut.feature.joint.impl.ui.consent.ConsentScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e48.d;
import efm.r;
import frl.a;
import grl.k9;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import t3b.g;
import t48.b;
import t48.c;
import t48.f;
import t48.n;
import t48.q;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/consent/ConsentScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lt48/q;", "Lcom/revolut/feature/joint/impl/ui/consent/ConsentScreenContract$InputData;", "Lt48/n;", "Lno/m;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentScreen extends BaseRecyclerViewScreen<q, ConsentScreenContract$InputData, n> implements m {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f76523d0 = {o0.f186429a.j(new h0(ConsentScreen.class, "binding", "getBinding()Lcom/revolut/feature/joint/impl/databinding/ScreenConsentBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final InputChecklistDelegate X;
    public final RowDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f76524a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f76525b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentScreen(ConsentScreenContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = R$layout.screen_consent;
        this.V = R$id.consentScreen_recyclerView;
        this.W = s.t(this, b.f);
        TextDelegate textDelegate = new TextDelegate();
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.X = inputChecklistDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Y = rowDelegate;
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: t48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f267913b;

            {
                this.f267913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConsentScreen consentScreen = this.f267913b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentScreen.f76523d0;
                        qji.b bVarQ2 = consentScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.consent.di.ConsentScreenInjector");
                        e48.m mVar = (e48.m) bVarQ2;
                        e48.g gVar = mVar.f122456b;
                        e48.m mVar2 = mVar.f122457c;
                        ConsentScreenContract$InputData consentScreenContract$InputData = (ConsentScreenContract$InputData) consentScreen.G;
                        consentScreenContract$InputData.getClass();
                        return new e48.d(gVar, mVar2, consentScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = ConsentScreen.f76523d0;
                        return (o) ((e48.d) consentScreen.Z.getValue()).f122418c.get();
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137508w;
        this.f76524a0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        final int i2 = 1;
        this.f76525b0 = w.y0(new Function0(this) { // from class: t48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f267913b;

            {
                this.f267913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConsentScreen consentScreen = this.f267913b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentScreen.f76523d0;
                        qji.b bVarQ2 = consentScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.consent.di.ConsentScreenInjector");
                        e48.m mVar = (e48.m) bVarQ2;
                        e48.g gVar = mVar.f122456b;
                        e48.m mVar2 = mVar.f122457c;
                        ConsentScreenContract$InputData consentScreenContract$InputData = (ConsentScreenContract$InputData) consentScreen.G;
                        consentScreenContract$InputData.getClass();
                        return new e48.d(gVar, mVar2, consentScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = ConsentScreen.f76523d0;
                        return (o) ((e48.d) consentScreen.Z.getValue()).f122418c.get();
                }
            }
        });
        this.c0 = v.k(textDelegate, new ListCellDelegate(), new ListSubheaderDelegate(), rowDelegate, inputChecklistDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.f76524a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f111246b.f59410q), null, new c(this, continuation, 0), 3);
        TwinVerticalButton twinVerticalButton = h3().f111247c;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinVerticalButton.o0()), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinVerticalButton.p0()), null, new c(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.Y;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new t48.d(this, null), 3);
        r rVarFilter = rowDelegate.f53220l.filter(new t45.a(new g(13), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new t48.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f52518c), null, new f(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f111246b;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(q uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f111246b;
        TextLocalisedClause textLocalisedClause = uiState.f267931a;
        Clause clause = uiState.e;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(uiState.f267932b);
        Image image = uiState.f267933c;
        if (image != null) {
            navBarWithToolbar.setEndIconImage(image);
        }
        TwinVerticalButton twinVerticalButton = h3().f111247c;
        twinVerticalButton.setMainButtonEnabled(uiState.f);
        Clause clause2 = uiState.d;
        if (clause2 != null) {
            twinVerticalButton.setMainButtonText(clause2);
        }
        if (clause == null) {
            twinVerticalButton.setSecondaryButtonVisible(false);
            return;
        }
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinVerticalButton.setSecondaryButtonText(clause);
        twinVerticalButton.setSecondaryButtonVisible(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final d48.b h3() {
        ViewBinding value = this.W.getValue(this, f76523d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d48.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final t48.o T2() {
        return (t48.o) this.f76525b0.getValue();
    }
}
