package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.R$id;
import com.revolut.feature.junior_tasks.impl.R$layout;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import gp8.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rlh.c;
import rp8.b;
import rp8.k;
import rp8.l;
import rp8.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/details/ChallengeEditDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrp8/k;", "Ldli/a;", "Lrp8/m;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengeEditDetailsScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ChallengeEditDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/junior_tasks/impl/databinding/ScreenChallengeEditDetailsBinding;", 0))};
    public final int K;
    public final h L;
    public final InputTextDelegate M;
    public final SelectableDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ChallengeEditDetailsScreen(ChallengeEditDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_challenge_edit_details;
        this.L = s.t(this, b.f);
        this.M = new InputTextDelegate(null);
        this.N = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditDetailsScreen f256269b;

            {
                this.f256269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeEditDetailsScreen.R;
                        ChallengeEditDetailsScreen challengeEditDetailsScreen = this.f256269b;
                        return dli.f.a(challengeEditDetailsScreen, (l) challengeEditDetailsScreen.Q.getValue(), v.k(challengeEditDetailsScreen.M, challengeEditDetailsScreen.N, new ListSubheaderDelegate()), R$id.challengeEditDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChallengeEditDetailsScreen.R;
                        return (l) ((gp8.d) this.f256269b.P.getValue()).f145298b.get();
                }
            }
        });
        this.P = w.y0(new rgf.b(this, inputData, 13));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditDetailsScreen f256269b;

            {
                this.f256269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeEditDetailsScreen.R;
                        ChallengeEditDetailsScreen challengeEditDetailsScreen = this.f256269b;
                        return dli.f.a(challengeEditDetailsScreen, (l) challengeEditDetailsScreen.Q.getValue(), v.k(challengeEditDetailsScreen.M, challengeEditDetailsScreen.N, new ListSubheaderDelegate()), R$id.challengeEditDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChallengeEditDetailsScreen.R;
                        return (l) ((gp8.d) this.f256269b.P.getValue()).f145298b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f128108c;
        TextLocalisedClause textLocalisedClause = uiState.f256283b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f128107b.setEnabled(uiState.f256284c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f128108c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(false);
        d3().f128107b.setText(new TextLocalisedClause(R$string.junior_challenges_edit_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView challengeEditDetailsRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(challengeEditDetailsRecyclerView, "challengeEditDetailsRecyclerView");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(kli.a.k(context, 80.0f), challengeEditDetailsRecyclerView);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f128108c.f59410q), null, new c(this, null, 7), 3);
        r7b.e eVar = new r7b.e(rd0.e.b(d3().f128107b.o), 7);
        ?? r142 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, eVar, null, new q9c.v(2, (l) r142.getValue(), l.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/details/ChallengeEditDetailsScreenContract$Event;)V", 4, 18), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(rd0.e.b(this.N.r()), 8), null, new q9c.v(i2, (l) r142.getValue(), l.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/details/ChallengeEditDetailsScreenContract$Event;)V", i, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(rd0.e.b(this.M.e.f121375b), 9), null, new q9c.v(i2, (l) r142.getValue(), l.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/details/ChallengeEditDetailsScreenContract$Event;)V", i, 17), 3);
    }

    public final ep8.a d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ep8.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
