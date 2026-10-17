package com.revolut.feature.travel.experiences.impl.ui.screen.questions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import czc.d0;
import d3g.c;
import d3g.d;
import d3g.f;
import d3g.g;
import d3g.i;
import d3g.n;
import d3g.o;
import grl.k9;
import h30.l;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperienceQuestionsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ld3g/o;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperiencesQuestionsScreenContract$InputData;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/a;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperienceQuestionsScreen extends BaseRecyclerViewScreen<o, TravelExperiencesQuestionsScreenContract$InputData, a> implements m {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(TravelExperienceQuestionsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesVisitorsDetailsBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final boolean X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93113a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93114b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f93115d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f93116e0;
    public final List f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f93117h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperienceQuestionsScreen(TravelExperiencesQuestionsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137510y;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_experiences_visitors_details;
        this.W = R$id.experiencesVisitorsDetails_recyclerView;
        final int i = 1;
        this.X = true;
        this.Y = s.t(this, c.f);
        final int i2 = 0;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: d3g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperienceQuestionsScreen f111106b;

            {
                this.f111106b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = this.f111106b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperienceQuestionsScreen.i0;
                        return new InputTextDelegate(new cwj.h(travelExperienceQuestionsScreen, 7));
                    default:
                        KProperty[] kPropertyArr2 = TravelExperienceQuestionsScreen.i0;
                        return (n) ((z0g.s) travelExperienceQuestionsScreen.g0.getValue()).f318453h.get();
                }
            }
        });
        this.Z = lazyY0;
        Lazy lazyY02 = w.y0(new d0(5));
        this.f93113a0 = lazyY02;
        this.f93114b0 = w.y0(new d0(6));
        this.c0 = w.y0(new d0(7));
        this.f93115d0 = w.y0(new d0(8));
        this.f93116e0 = w.y0(new d0(9));
        this.f0 = v.k((InputTextDelegate) lazyY0.getValue(), (ListSubheaderDelegate) lazyY02.getValue());
        this.g0 = w.y0(new cvi.b(this, inputData, 13));
        this.f93117h0 = w.y0(new Function0(this) { // from class: d3g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperienceQuestionsScreen f111106b;

            {
                this.f111106b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = this.f111106b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperienceQuestionsScreen.i0;
                        return new InputTextDelegate(new cwj.h(travelExperienceQuestionsScreen, 7));
                    default:
                        KProperty[] kPropertyArr2 = TravelExperienceQuestionsScreen.i0;
                        return (n) ((z0g.s) travelExperienceQuestionsScreen.g0.getValue()).f318453h.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z0g.s) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f293727b.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f293728c.o), null, new d(this, null, 1), 3);
        ?? r62 = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r62.getValue()).f.f121375b), null, new d3g.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r62.getValue()).e.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(((InputTextDelegate) r62.getValue()).f52575g.f121375b, ((InputTextDelegate) r62.getValue()).i.f121375b, "merge(...)"), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((PickerDelegate) this.f93114b0.getValue()).f52922c), null, new d3g.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.c0.getValue()).d.f121375b), null, new d3g.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SingleChoiceDelegate) this.f93115d0.getValue()).p()), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TimePickerDelegate) this.f93116e0.getValue()).p()), null, new d3g.e(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((z0g.s) this.g0.getValue()).e.get()).d(v.k((PickerDelegate) this.f93114b0.getValue(), (LargeActionButtonDelegate) this.c0.getValue(), (SingleChoiceDelegate) this.f93115d0.getValue(), (TimePickerDelegate) this.f93116e0.getValue()));
        h3().f293727b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        h3().f293728c.o(LargeActionButton.ButtonStyle.f58725a);
        h3().f293728c.setText(new TextLocalisedClause(R$string.experiences_common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f293727b;
        TextLocalisedClause textLocalisedClause = uiState.f111129b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        h3().f293728c.setEnabled(uiState.f111130c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final w0g.o h3() {
        ViewBinding value = this.Y.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.o) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.f93117h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
