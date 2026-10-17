package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.R$id;
import com.revolut.feature.junior_tasks.impl.R$layout;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep8.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import woc.p;
import xif.k;
import xki.e;
import xo8.a0;
import xp8.b;
import xp8.i;
import xp8.j;
import xp8.l;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/reward/ChallengeEditRewardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxp8/i;", "Ldli/a;", "Lxp8/j;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengeEditRewardScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ChallengeEditRewardScreen.class, "binding", "getBinding()Lcom/revolut/feature/junior_tasks/impl/databinding/ScreenChallengeEditRewardBinding;", 0))};
    public final Object K;
    public final CenteredAmountDelegate L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;

    public ChallengeEditRewardScreen(ChallengeEditRewardScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: xp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditRewardScreen f307900b;

            {
                this.f307900b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChallengeEditRewardScreen challengeEditRewardScreen = this.f307900b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeEditRewardScreen.R;
                        qd0.b bVarN = ((gp8.h) challengeEditRewardScreen.P.getValue()).f145307b.f145327g.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = ChallengeEditRewardScreen.R;
                        int i3 = R$id.challengeEditReward_recyclerView;
                        ChallengeEditRewardScreen challengeEditRewardScreen2 = this.f307900b;
                        return dli.f.a(challengeEditRewardScreen2, (l) challengeEditRewardScreen2.Q.getValue(), u.c(challengeEditRewardScreen2.L), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChallengeEditRewardScreen.R;
                        return (l) ((gp8.h) challengeEditRewardScreen.P.getValue()).f145308c.get();
                }
            }
        });
        this.L = new CenteredAmountDelegate(new k(this, 16));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: xp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditRewardScreen f307900b;

            {
                this.f307900b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChallengeEditRewardScreen challengeEditRewardScreen = this.f307900b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeEditRewardScreen.R;
                        qd0.b bVarN = ((gp8.h) challengeEditRewardScreen.P.getValue()).f145307b.f145327g.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = ChallengeEditRewardScreen.R;
                        int i3 = R$id.challengeEditReward_recyclerView;
                        ChallengeEditRewardScreen challengeEditRewardScreen2 = this.f307900b;
                        return dli.f.a(challengeEditRewardScreen2, (l) challengeEditRewardScreen2.Q.getValue(), u.c(challengeEditRewardScreen2.L), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChallengeEditRewardScreen.R;
                        return (l) ((gp8.h) challengeEditRewardScreen.P.getValue()).f145308c.get();
                }
            }
        });
        this.N = R$layout.screen_challenge_edit_reward;
        this.O = s.t(this, b.f);
        this.P = w.y0(new xfj.a(this, inputData, 8));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xp8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeEditRewardScreen f307900b;

            {
                this.f307900b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChallengeEditRewardScreen challengeEditRewardScreen = this.f307900b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeEditRewardScreen.R;
                        qd0.b bVarN = ((gp8.h) challengeEditRewardScreen.P.getValue()).f145307b.f145327g.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = ChallengeEditRewardScreen.R;
                        int i32 = R$id.challengeEditReward_recyclerView;
                        ChallengeEditRewardScreen challengeEditRewardScreen2 = this.f307900b;
                        return dli.f.a(challengeEditRewardScreen2, (l) challengeEditRewardScreen2.Q.getValue(), u.c(challengeEditRewardScreen2.L), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChallengeEditRewardScreen.R;
                        return (l) ((gp8.h) challengeEditRewardScreen.P.getValue()).f145308c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f128113b.setText(uiState.f307909b);
        d3().f128113b.setEnabled(uiState.f307910c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gp8.h) this.P.getValue();
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
        BasicNavBar basicNavBar = d3().f128114c;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        basicNavBar.setTitle(new TextLocalisedClause(R$string.junior_challenges_edit_header_reward_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f128114c.f59211b), null, new xni.h(this, null, 4), 3);
        a0 a0Var = new a0(rd0.e.b(d3().f128113b.o), 4);
        ?? r142 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, a0Var, null, new p(2, (l) r142.getValue(), l.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/reward/ChallengeEditRewardScreenContract$Event;)V", 4, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, new a0(rd0.e.b(this.L.d.f121375b), 5), null, new p(2, (l) r142.getValue(), l.class, "onEvent", "onEvent(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/reward/ChallengeEditRewardScreenContract$Event;)V", 4, 12), 3);
    }

    public final c d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
