package com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.score_card;

import aii.q;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.score_card.RevIQScoreCardController;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ppd.n;
import ppd.p0;
import ppd.q0;
import te0.w;
import xki.e;
import xqd.b;
import xqd.c;
import xqd.f;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/rev_iq/score_card/RevIQScoreCardController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxqd/c;", "Companion", "a", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevIQScoreCardController extends ViewController<q> implements dli.a {

    @NotNull
    private static final a Companion = new a();
    public final b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public static final class a {
        private a() {
        }
    }

    public RevIQScoreCardController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xqd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevIQScoreCardController f308159b;

            {
                this.f308159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevIQScoreCardController revIQScoreCardController = this.f308159b;
                switch (i2) {
                    case 0:
                        return (f) ((q0) revIQScoreCardController.N.getValue()).d.get();
                    case 1:
                        qji.b bVarU2 = revIQScoreCardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.score_card.di.RevIQScoreCardInjector");
                        p0 p0Var = (p0) bVarU2;
                        n nVar = p0Var.f238524b;
                        p0 p0Var2 = p0Var.f238525c;
                        b bVar = revIQScoreCardController.K;
                        bVar.getClass();
                        return new q0(nVar, p0Var2, bVar);
                    default:
                        RevIQScoreCardController revIQScoreCardController2 = this.f308159b;
                        return dli.f.a(revIQScoreCardController2, (f) revIQScoreCardController2.M.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new AirTipDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: xqd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevIQScoreCardController f308159b;

            {
                this.f308159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevIQScoreCardController revIQScoreCardController = this.f308159b;
                switch (i22) {
                    case 0:
                        return (f) ((q0) revIQScoreCardController.N.getValue()).d.get();
                    case 1:
                        qji.b bVarU2 = revIQScoreCardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.score_card.di.RevIQScoreCardInjector");
                        p0 p0Var = (p0) bVarU2;
                        n nVar = p0Var.f238524b;
                        p0 p0Var2 = p0Var.f238525c;
                        b bVar = revIQScoreCardController.K;
                        bVar.getClass();
                        return new q0(nVar, p0Var2, bVar);
                    default:
                        RevIQScoreCardController revIQScoreCardController2 = this.f308159b;
                        return dli.f.a(revIQScoreCardController2, (f) revIQScoreCardController2.M.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new AirTipDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: xqd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevIQScoreCardController f308159b;

            {
                this.f308159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevIQScoreCardController revIQScoreCardController = this.f308159b;
                switch (i22) {
                    case 0:
                        return (f) ((q0) revIQScoreCardController.N.getValue()).d.get();
                    case 1:
                        qji.b bVarU2 = revIQScoreCardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.score_card.di.RevIQScoreCardInjector");
                        p0 p0Var = (p0) bVarU2;
                        n nVar = p0Var.f238524b;
                        p0 p0Var2 = p0Var.f238525c;
                        b bVar = revIQScoreCardController.K;
                        bVar.getClass();
                        return new q0(nVar, p0Var2, bVar);
                    default:
                        RevIQScoreCardController revIQScoreCardController2 = this.f308159b;
                        return dli.f.a(revIQScoreCardController2, (f) revIQScoreCardController2.M.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new AirTipDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Intrinsics.h(context);
        gradientDrawable.setCornerRadius(kli.a.l(context, 36.0f));
        gradientDrawable.setColor(kli.a.s(R$attr.uikit_colorElevatedBackground, context));
        view.setBackground(gradientDrawable);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
