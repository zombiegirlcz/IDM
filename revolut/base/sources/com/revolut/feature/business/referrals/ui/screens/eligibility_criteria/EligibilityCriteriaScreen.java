package com.revolut.feature.business.referrals.ui.screens.eligibility_criteria;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.business.referrals.ui.screens.eligibility_criteria.EligibilityCriteriaScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import us2.c;
import xki.e;
import xs2.d;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/eligibility_criteria/EligibilityCriteriaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxs2/d;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EligibilityCriteriaScreen extends ViewController<q> implements a {
    public final int K;
    public final LargeActionButtonDelegate L;
    public final Object M;
    public final Object N;
    public final Object O;

    public EligibilityCriteriaScreen(EligibilityCriteriaScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_prompt;
        this.L = new LargeActionButtonDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xs2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EligibilityCriteriaScreen f308385b;

            {
                this.f308385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EligibilityCriteriaScreen eligibilityCriteriaScreen = this.f308385b;
                        return dli.f.a(eligibilityCriteriaScreen, (e) eligibilityCriteriaScreen.O.getValue(), v.k(new TextDelegate(), new RowDelegate(null, null, 7), eligibilityCriteriaScreen.L), 0, null, null, null, 60);
                    default:
                        return (e) ((us2.c) this.f308385b.N.getValue()).e.get();
                }
            }
        });
        this.N = w.y0(new xfj.a(this, inputData, 15));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xs2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EligibilityCriteriaScreen f308385b;

            {
                this.f308385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EligibilityCriteriaScreen eligibilityCriteriaScreen = this.f308385b;
                        return dli.f.a(eligibilityCriteriaScreen, (e) eligibilityCriteriaScreen.O.getValue(), v.k(new TextDelegate(), new RowDelegate(null, null, 7), eligibilityCriteriaScreen.L), 0, null, null, null, 60);
                    default:
                        return (e) ((us2.c) this.f308385b.N.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (xs2.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d.f121375b), null, new xs2.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
