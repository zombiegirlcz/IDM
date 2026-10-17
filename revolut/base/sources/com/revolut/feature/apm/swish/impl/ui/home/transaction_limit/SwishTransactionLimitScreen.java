package com.revolut.feature.apm.swish.impl.ui.home.transaction_limit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.swish.api.R$string;
import com.revolut.feature.apm.swish.impl.R$id;
import com.revolut.feature.apm.swish.impl.R$layout;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qd0.b;
import r0e.c;
import re2.e;
import re2.f;
import re2.i;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/ui/home/transaction_limit/SwishTransactionLimitScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lre2/e;", "Ldli/a;", "Lre2/f;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwishTransactionLimitScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SwishTransactionLimitScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/swish/impl/databinding/ScreenTransactionLimitScreenBinding;", 0))};
    public b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public SwishTransactionLimitScreen(SwishTransactionLimitScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_transaction_limit_screen;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: re2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishTransactionLimitScreen f253487b;

            {
                this.f253487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SwishTransactionLimitScreen swishTransactionLimitScreen = this.f253487b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SwishTransactionLimitScreen.S;
                        qd0.b bVar = swishTransactionLimitScreen.K;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = SwishTransactionLimitScreen.S;
                        return new CenteredAmountDelegate(new r6f.i(swishTransactionLimitScreen, 15));
                    case 2:
                        KProperty[] kPropertyArr3 = SwishTransactionLimitScreen.S;
                        SwishTransactionLimitScreen swishTransactionLimitScreen2 = this.f253487b;
                        return dli.f.a(swishTransactionLimitScreen2, (i) swishTransactionLimitScreen2.R.getValue(), u.c((CenteredAmountDelegate) swishTransactionLimitScreen2.N.getValue()), R$id.screenTransactionLimit_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = SwishTransactionLimitScreen.S;
                        return (i) ((he2.h) swishTransactionLimitScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: re2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishTransactionLimitScreen f253487b;

            {
                this.f253487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SwishTransactionLimitScreen swishTransactionLimitScreen = this.f253487b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SwishTransactionLimitScreen.S;
                        qd0.b bVar = swishTransactionLimitScreen.K;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = SwishTransactionLimitScreen.S;
                        return new CenteredAmountDelegate(new r6f.i(swishTransactionLimitScreen, 15));
                    case 2:
                        KProperty[] kPropertyArr3 = SwishTransactionLimitScreen.S;
                        SwishTransactionLimitScreen swishTransactionLimitScreen2 = this.f253487b;
                        return dli.f.a(swishTransactionLimitScreen2, (i) swishTransactionLimitScreen2.R.getValue(), u.c((CenteredAmountDelegate) swishTransactionLimitScreen2.N.getValue()), R$id.screenTransactionLimit_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = SwishTransactionLimitScreen.S;
                        return (i) ((he2.h) swishTransactionLimitScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: re2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishTransactionLimitScreen f253487b;

            {
                this.f253487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SwishTransactionLimitScreen swishTransactionLimitScreen = this.f253487b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SwishTransactionLimitScreen.S;
                        qd0.b bVar = swishTransactionLimitScreen.K;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = SwishTransactionLimitScreen.S;
                        return new CenteredAmountDelegate(new r6f.i(swishTransactionLimitScreen, 15));
                    case 2:
                        KProperty[] kPropertyArr3 = SwishTransactionLimitScreen.S;
                        SwishTransactionLimitScreen swishTransactionLimitScreen2 = this.f253487b;
                        return dli.f.a(swishTransactionLimitScreen2, (i) swishTransactionLimitScreen2.R.getValue(), u.c((CenteredAmountDelegate) swishTransactionLimitScreen2.N.getValue()), R$id.screenTransactionLimit_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = SwishTransactionLimitScreen.S;
                        return (i) ((he2.h) swishTransactionLimitScreen.Q.getValue()).f.get();
                }
            }
        });
        this.P = s.t(this, re2.b.f);
        this.Q = w.y0(new qvf.a(this, inputData, 28));
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: re2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwishTransactionLimitScreen f253487b;

            {
                this.f253487b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SwishTransactionLimitScreen swishTransactionLimitScreen = this.f253487b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SwishTransactionLimitScreen.S;
                        qd0.b bVar = swishTransactionLimitScreen.K;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = SwishTransactionLimitScreen.S;
                        return new CenteredAmountDelegate(new r6f.i(swishTransactionLimitScreen, 15));
                    case 2:
                        KProperty[] kPropertyArr3 = SwishTransactionLimitScreen.S;
                        SwishTransactionLimitScreen swishTransactionLimitScreen2 = this.f253487b;
                        return dli.f.a(swishTransactionLimitScreen2, (i) swishTransactionLimitScreen2.R.getValue(), u.c((CenteredAmountDelegate) swishTransactionLimitScreen2.N.getValue()), R$id.screenTransactionLimit_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = SwishTransactionLimitScreen.S;
                        return (i) ((he2.h) swishTransactionLimitScreen.Q.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f134433c.setTextClause(uiState.f253494b);
        d3().f134432b.setEnabled(uiState.f253495c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (he2.h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        b bVarN = ((he2.h) this.Q.getValue()).f151546b.d.n();
        s.j(bVarN);
        this.K = bVarN;
        d3().d.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.swish_update_limits_title, null, null, 14), null, null, null, false, 30));
        d3().f134432b.setText(new TextLocalisedClause(R$string.swish_update_limits_action, null, null, 14));
        d3().f134432b.setLoadingButtonTag("CONTINUE_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f134432b.o), null, new c(this, null, 21), 3);
        ?? r62 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).f51967l.f121375b), null, new re2.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).d.f121375b), null, new re2.c(this, null, 1), 3);
    }

    public final fe2.a d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (fe2.a) value;
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
