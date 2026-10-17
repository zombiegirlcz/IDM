package com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.NegativeBalancePromptScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.NegativeBalancePromptScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import uug.b;
import uug.c;
import uug.d;
import uug.g;
import uug.h;
import uug.i;
import vc.s;
import xki.e;
import zhm.v;
import ztg.k;
import ztg.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/negative_balance/NegativeBalancePromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luug/g;", "Ldli/a;", "Luug/i;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NegativeBalancePromptScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(NegativeBalancePromptScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenPromptBinding;", 0))};
    public final NegativeBalancePromptScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;

    public NegativeBalancePromptScreen(NegativeBalancePromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        s.t(this, b.f);
        this.L = w.y0(new us4.b(10));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: uug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NegativeBalancePromptScreen f283231b;

            {
                this.f283231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NegativeBalancePromptScreen negativeBalancePromptScreen = this.f283231b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NegativeBalancePromptScreen.Q;
                        NegativeBalancePromptScreen negativeBalancePromptScreen2 = this.f283231b;
                        return dli.f.a(negativeBalancePromptScreen2, (h) negativeBalancePromptScreen2.P.getValue(), v.k((PromptMarketingContentDelegate) negativeBalancePromptScreen2.L.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = NegativeBalancePromptScreen.Q;
                        qji.b bVarU2 = negativeBalancePromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.di.NegativeBalancePromptScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        NegativeBalancePromptScreenContract$InputData negativeBalancePromptScreenContract$InputData = negativeBalancePromptScreen.K;
                        negativeBalancePromptScreenContract$InputData.getClass();
                        return new ztg.k(nVar, hVar2, negativeBalancePromptScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = NegativeBalancePromptScreen.Q;
                        return (h) ((ztg.k) negativeBalancePromptScreen.O.getValue()).f325144c.get();
                }
            }
        });
        this.N = R$layout.screen_prompt;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: uug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NegativeBalancePromptScreen f283231b;

            {
                this.f283231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NegativeBalancePromptScreen negativeBalancePromptScreen = this.f283231b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NegativeBalancePromptScreen.Q;
                        NegativeBalancePromptScreen negativeBalancePromptScreen2 = this.f283231b;
                        return dli.f.a(negativeBalancePromptScreen2, (h) negativeBalancePromptScreen2.P.getValue(), v.k((PromptMarketingContentDelegate) negativeBalancePromptScreen2.L.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = NegativeBalancePromptScreen.Q;
                        qji.b bVarU2 = negativeBalancePromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.di.NegativeBalancePromptScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        NegativeBalancePromptScreenContract$InputData negativeBalancePromptScreenContract$InputData = negativeBalancePromptScreen.K;
                        negativeBalancePromptScreenContract$InputData.getClass();
                        return new ztg.k(nVar, hVar2, negativeBalancePromptScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = NegativeBalancePromptScreen.Q;
                        return (h) ((ztg.k) negativeBalancePromptScreen.O.getValue()).f325144c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: uug.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NegativeBalancePromptScreen f283231b;

            {
                this.f283231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NegativeBalancePromptScreen negativeBalancePromptScreen = this.f283231b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NegativeBalancePromptScreen.Q;
                        NegativeBalancePromptScreen negativeBalancePromptScreen2 = this.f283231b;
                        return dli.f.a(negativeBalancePromptScreen2, (h) negativeBalancePromptScreen2.P.getValue(), v.k((PromptMarketingContentDelegate) negativeBalancePromptScreen2.L.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = NegativeBalancePromptScreen.Q;
                        qji.b bVarU2 = negativeBalancePromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.di.NegativeBalancePromptScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        NegativeBalancePromptScreenContract$InputData negativeBalancePromptScreenContract$InputData = negativeBalancePromptScreen.K;
                        negativeBalancePromptScreenContract$InputData.getClass();
                        return new ztg.k(nVar, hVar2, negativeBalancePromptScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = NegativeBalancePromptScreen.Q;
                        return (h) ((ztg.k) negativeBalancePromptScreen.O.getValue()).f325144c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.L;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), null, new uug.e(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
