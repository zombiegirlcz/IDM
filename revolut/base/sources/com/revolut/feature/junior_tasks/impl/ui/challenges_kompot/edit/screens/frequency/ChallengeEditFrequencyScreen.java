package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.R$id;
import com.revolut.feature.junior_tasks.impl.R$layout;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.ChallengeEditFrequencyScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import gp8.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t9l.f;
import te0.w;
import tk5.c;
import tp8.b;
import tp8.i;
import tp8.j;
import tp8.k;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/frequency/ChallengeEditFrequencyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltp8/i;", "Ldli/a;", "Ltp8/k;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengeEditFrequencyScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ChallengeEditFrequencyScreen.class, "binding", "getBinding()Lcom/revolut/feature/junior_tasks/impl/databinding/ScreenChallengeEditFrequencyBinding;", 0))};
    public final int K;
    public final h L;
    public final InputTextDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public ChallengeEditFrequencyScreen(ChallengeEditFrequencyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_challenge_edit_frequency;
        this.L = s.t(this, b.f);
        this.M = new InputTextDelegate(null);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: tp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditFrequencyScreen f273310b;

            {
                this.f273310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeEditFrequencyScreen.Q;
                        ChallengeEditFrequencyScreen challengeEditFrequencyScreen = this.f273310b;
                        return dli.f.a(challengeEditFrequencyScreen, (j) challengeEditFrequencyScreen.P.getValue(), u.c(challengeEditFrequencyScreen.M), R$id.challengeEditFrequency_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChallengeEditFrequencyScreen.Q;
                        return (j) ((gp8.g) this.f273310b.O.getValue()).f145305b.get();
                }
            }
        });
        this.O = w.y0(new tml.a(this, inputData, 4));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditFrequencyScreen f273310b;

            {
                this.f273310b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeEditFrequencyScreen.Q;
                        ChallengeEditFrequencyScreen challengeEditFrequencyScreen = this.f273310b;
                        return dli.f.a(challengeEditFrequencyScreen, (j) challengeEditFrequencyScreen.P.getValue(), u.c(challengeEditFrequencyScreen.M), R$id.challengeEditFrequency_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = ChallengeEditFrequencyScreen.Q;
                        return (j) ((gp8.g) this.f273310b.O.getValue()).f145305b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f128111c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f128110b.setText(new TextLocalisedClause(R$string.junior_challenges_edit_action_continue, null, null, 14));
        NavBarWithToolbar navBarWithToolbar2 = d3().f128111c;
        navBarWithToolbar2.setTitle(new TextLocalisedClause(R$string.junior_challenges_edit_header_frequency_title, null, null, 14), null);
        navBarWithToolbar2.setToolbarTitle(new TextLocalisedClause(R$string.junior_challenges_edit_header_frequency_title, null, null, 14));
        navBarWithToolbar2.setDescriptionText(new TextLocalisedClause(R$string.junior_challenges_edit_header_frequency_description, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView challengeEditFrequencyRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(challengeEditFrequencyRecyclerView, "challengeEditFrequencyRecyclerView");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(kli.a.k(context, 80.0f), challengeEditFrequencyRecyclerView);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f128111c.f59410q), null, new c(this, null, 5), 3);
        f fVar = new f(rd0.e.b(d3().f128110b.o), 16);
        ?? r142 = this.P;
        com.revolut.kompot.navigable.a.g2(this, fVar, null, new ryj.f(2, (j) r142.getValue(), j.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/frequency/ChallengeEditFrequencyScreenContract$Event;)V", 4, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, new f(rd0.e.b(this.M.f52575g.f121375b), 17), null, new ryj.f(2, (j) r142.getValue(), j.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/frequency/ChallengeEditFrequencyScreenContract$Event;)V", 4, 25), 3);
    }

    public final ep8.b d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ep8.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
