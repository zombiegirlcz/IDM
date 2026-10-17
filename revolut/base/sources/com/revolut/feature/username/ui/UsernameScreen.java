package com.revolut.feature.username.ui;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.username.R$id;
import com.revolut.feature.username.R$layout;
import com.revolut.feature.username.ui.UsernameScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ec8.c;
import ekd.i0;
import enb.f;
import epg.i;
import epg.j;
import epg.k;
import epg.n;
import epg.p;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ow9.d;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/username/ui/UsernameScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lepg/p;", "Lcom/revolut/feature/username/ui/UsernameScreenContract$InputData;", "Lepg/n;", "Lno/m;", "feature_username_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UsernameScreen extends BaseRecyclerViewScreen<p, UsernameScreenContract$InputData, n> implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f94688e0 = {o0.f186429a.j(new h0(UsernameScreen.class, "binding", "getBinding()Lcom/revolut/feature/username/databinding/ScreenUsernameBinding;", 0))};
    public final h U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f94689a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f94690b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final AnalyticsProduct f94691d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameScreen(UsernameScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, epg.h.f);
        Lazy lazyY0 = w.y0(new i0(4));
        this.V = lazyY0;
        Lazy lazyY02 = w.y0(new i0(5));
        this.W = lazyY02;
        this.X = w.y0(new i0(6));
        this.Y = R$layout.screen_username;
        this.Z = R$id.username_recyclerView;
        final int i = 0;
        this.f94689a0 = w.y0(new Function0(this) { // from class: epg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UsernameScreen f128181b;

            {
                this.f128181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UsernameScreen usernameScreen = this.f128181b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UsernameScreen.f94688e0;
                        qji.b bVarQ2 = usernameScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.username.di.UsernameScreenInjector");
                        return (ow9.d) ((bpg.a) ((bpg.b) bVarQ2).j().S(usernameScreen)).mo3800build();
                    default:
                        KProperty[] kPropertyArr2 = UsernameScreen.f94688e0;
                        ow9.d dVar = (ow9.d) usernameScreen.f94689a0.getValue();
                        switch (dVar.f230336a) {
                            case 0:
                                return (o) dVar.i.get();
                            default:
                                return (o) dVar.i.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.f94690b0 = w.y0(new Function0(this) { // from class: epg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UsernameScreen f128181b;

            {
                this.f128181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UsernameScreen usernameScreen = this.f128181b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UsernameScreen.f94688e0;
                        qji.b bVarQ2 = usernameScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.username.di.UsernameScreenInjector");
                        return (ow9.d) ((bpg.a) ((bpg.b) bVarQ2).j().S(usernameScreen)).mo3800build();
                    default:
                        KProperty[] kPropertyArr2 = UsernameScreen.f94688e0;
                        ow9.d dVar = (ow9.d) usernameScreen.f94689a0.getValue();
                        switch (dVar.f230336a) {
                            case 0:
                                return (o) dVar.i.get();
                            default:
                                return (o) dVar.i.get();
                        }
                }
            }
        });
        this.c0 = v.k((InputTextDelegate) lazyY0.getValue(), (SuggestionsBarDelegate) lazyY02.getValue(), new TextDelegate());
        this.f94691d0 = inputData.e;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        p uiState = (p) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f8188b.setEnabled(uiState.f128187b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF94691d0() {
        return this.f94691d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d) this.f94689a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (epg.o) this.f94690b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, e.b(g3().f8189c.f59410q), null, new f(view, this, continuation, 12), 3);
        a.g2(this, e.b(g3().f8188b.o), null, new c(this, continuation, 22), 3);
        vkm.d dVarB = e.b(((InputTextDelegate) this.V.getValue()).e.f121375b);
        ?? r110 = this.f94690b0;
        a.g2(this, dVarB, null, new i(2, 4, epg.o.class, (epg.o) r110.getValue(), "onInputTextChange", "onInputTextChange(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$TextData;)V"), 3);
        a.g2(this, e.b(((SuggestionsBarDelegate) this.W.getValue()).p().d), null, new j(2, 4, epg.o.class, (epg.o) r110.getValue(), "onSuggestionClick", "onSuggestionClick(Lcom/revolut/core/ui_kit/delegates/SuggestionsBarDelegate$Suggestion;)V"), 3);
        a.g2(this, e.b(((LargeActionButtonDelegate) this.X.getValue()).d.f121375b), null, new k(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f8189c;
        UsernameScreenContract$InputData usernameScreenContract$InputData = (UsernameScreenContract$InputData) this.G;
        navBarWithToolbar.setToolbarTitle(usernameScreenContract$InputData.f94692a);
        navBarWithToolbar.setTitle(usernameScreenContract$InputData.f94692a, null);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(usernameScreenContract$InputData.f94693b);
        navBarWithToolbar.setNavigationButtonImage(usernameScreenContract$InputData.d);
        g3().f8188b.setText(usernameScreenContract$InputData.f94694c);
        d dVar = (d) this.f94689a0.getValue();
        switch (dVar.f230336a) {
            case 0:
                aVar = (j60.a) dVar.d.get();
                break;
            default:
                aVar = (j60.a) dVar.d.get();
                break;
        }
        aVar.d(v.k((LargeActionButtonDelegate) this.X.getValue(), new TextDelegate()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        p uiState = (p) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f8188b.setEnabled(uiState.f128187b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.Z;
    }

    public final apg.a g3() {
        ViewBinding value = this.U.getValue(this, f94688e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (apg.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Y;
    }
}
