package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreen;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kyk.a;
import no.m;
import rbh.k;
import rd0.e;
import rlh.c;
import rwg.e0;
import s0l.b;
import s0l.d;
import s0l.f;
import s0l.g;
import s0l.i;
import te0.w;
import vc.s;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_request/consent_request/ConsentRequestScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ls0l/i;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Ls0l/g;", "Lno/m;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentRequestScreen extends BaseRecyclerViewScreen<i, IOData$EmptyInput, g> implements m {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f104269d0 = {o0.f186429a.j(new h0(ConsentRequestScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AnalyticsProduct U;
    public final boolean V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f104270a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f104271b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentRequestScreen(ConsentRequestScreenContract$InputData inputData) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = inputData.f104272a.getE();
        this.V = true;
        this.W = R$layout.screen_recycler_navbar_nextbutton;
        this.X = s.t(this, b.f);
        this.Y = w.y0(new e0(25));
        this.Z = w.y0(new e0(26));
        final int i = 0;
        this.f104270a0 = w.y0(new Function0(this) { // from class: s0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentRequestScreen f258973b;

            {
                this.f258973b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConsentRequestScreen consentRequestScreen = this.f258973b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentRequestScreen.f104269d0;
                        return v.k((RowDelegate) consentRequestScreen.Y.getValue(), (ListCellDelegate) consentRequestScreen.Z.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentRequestScreen.f104269d0;
                        qji.b bVarQ2 = consentRequestScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreenInjector");
                        kyk.o oVar = (kyk.o) bVarQ2;
                        kyk.v vVar = oVar.f190964b;
                        kyk.o oVar2 = oVar.f190965c;
                        kyk.a aVar = new kyk.a();
                        aVar.f190910a = e4m.b.b(e4m.c.a(consentRequestScreen));
                        int i3 = 20;
                        aVar.f190911b = e4m.b.b(new il8.d(vVar, oVar2, aVar, 2, i3));
                        aVar.f190912c = e4m.b.b(new il8.d(vVar, oVar2, aVar, 1, i3));
                        aVar.d = e4m.b.b(new il8.d(vVar, oVar2, aVar, 0, i3));
                        aVar.e = e4m.b.b(new il8.d(vVar, oVar2, aVar, 4, i3));
                        aVar.f = e4m.b.b(new il8.d(vVar, oVar2, aVar, 3, i3));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = ConsentRequestScreen.f104269d0;
                        return (h) ((kyk.a) consentRequestScreen.f104271b0.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.f104271b0 = w.y0(new Function0(this) { // from class: s0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentRequestScreen f258973b;

            {
                this.f258973b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConsentRequestScreen consentRequestScreen = this.f258973b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentRequestScreen.f104269d0;
                        return v.k((RowDelegate) consentRequestScreen.Y.getValue(), (ListCellDelegate) consentRequestScreen.Z.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentRequestScreen.f104269d0;
                        qji.b bVarQ2 = consentRequestScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreenInjector");
                        kyk.o oVar = (kyk.o) bVarQ2;
                        kyk.v vVar = oVar.f190964b;
                        kyk.o oVar2 = oVar.f190965c;
                        kyk.a aVar = new kyk.a();
                        aVar.f190910a = e4m.b.b(e4m.c.a(consentRequestScreen));
                        int i3 = 20;
                        aVar.f190911b = e4m.b.b(new il8.d(vVar, oVar2, aVar, 2, i3));
                        aVar.f190912c = e4m.b.b(new il8.d(vVar, oVar2, aVar, 1, i3));
                        aVar.d = e4m.b.b(new il8.d(vVar, oVar2, aVar, 0, i3));
                        aVar.e = e4m.b.b(new il8.d(vVar, oVar2, aVar, 4, i3));
                        aVar.f = e4m.b.b(new il8.d(vVar, oVar2, aVar, 3, i3));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = ConsentRequestScreen.f104269d0;
                        return (h) ((kyk.a) consentRequestScreen.f104271b0.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: s0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentRequestScreen f258973b;

            {
                this.f258973b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConsentRequestScreen consentRequestScreen = this.f258973b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentRequestScreen.f104269d0;
                        return v.k((RowDelegate) consentRequestScreen.Y.getValue(), (ListCellDelegate) consentRequestScreen.Z.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentRequestScreen.f104269d0;
                        qji.b bVarQ2 = consentRequestScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreenInjector");
                        kyk.o oVar = (kyk.o) bVarQ2;
                        kyk.v vVar = oVar.f190964b;
                        kyk.o oVar2 = oVar.f190965c;
                        kyk.a aVar = new kyk.a();
                        aVar.f190910a = e4m.b.b(e4m.c.a(consentRequestScreen));
                        int i32 = 20;
                        aVar.f190911b = e4m.b.b(new il8.d(vVar, oVar2, aVar, 2, i32));
                        aVar.f190912c = e4m.b.b(new il8.d(vVar, oVar2, aVar, 1, i32));
                        aVar.d = e4m.b.b(new il8.d(vVar, oVar2, aVar, 0, i32));
                        aVar.e = e4m.b.b(new il8.d(vVar, oVar2, aVar, 4, i32));
                        aVar.f = e4m.b.b(new il8.d(vVar, oVar2, aVar, 3, i32));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = ConsentRequestScreen.f104269d0;
                        return (h) ((kyk.a) consentRequestScreen.f104271b0.getValue()).f.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (a) this.f104271b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (s0l.h) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, new ryj.w(e.b(((RowDelegate) this.Y.getValue()).f53220l), 2), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new c(this, continuation, 29), 3);
        LargeActionButton largeActionButton = h3().f174564b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        com.revolut.kompot.navigable.a.g2(this, e.b(largeActionButton.o), null, new k(this, continuation, 23), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ScreenContentRecyclerView recyclerView = h3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.g(recyclerView, m2());
        h3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF80882d0() {
        return (List) this.f104270a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f258985a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f258986b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
        LargeActionButton largeActionButton = h3().f174564b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        f fVar = uiState.f258987c;
        largeActionButton.setText(fVar.f258979a);
        largeActionButton.setEnabled(fVar.f258980b);
        if (fVar.f258981c) {
            largeActionButton.setIcon(new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 12, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite)));
        } else {
            largeActionButton.setIcon(null);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    public final u h3() {
        ViewBinding value = this.X.getValue(this, f104269d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
