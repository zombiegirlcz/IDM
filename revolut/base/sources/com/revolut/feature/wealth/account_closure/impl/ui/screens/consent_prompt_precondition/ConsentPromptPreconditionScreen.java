package com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition;

import android.view.View;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kq5.d;
import kr.h2;
import kug.f;
import kug.k;
import kug.o;
import kug.r;
import te0.w;
import vc.s;
import xki.e;
import ztg.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/consent_prompt_precondition/ConsentPromptPreconditionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkug/o;", "Ltki/c;", "Lkug/s;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentPromptPreconditionScreen extends ViewController<o> implements tki.c {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ConsentPromptPreconditionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenPromptBinding;", 0))};
    public final ConsentPromptPreconditionScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;

    public ConsentPromptPreconditionScreen(ConsentPromptPreconditionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        s.t(this, kug.c.f);
        this.L = w.y0(new h2(22));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: kug.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentPromptPreconditionScreen f189792b;

            {
                this.f189792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConsentPromptPreconditionScreen consentPromptPreconditionScreen = this.f189792b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentPromptPreconditionScreen.Q;
                        ConsentPromptPreconditionScreen consentPromptPreconditionScreen2 = this.f189792b;
                        return tki.g.a(consentPromptPreconditionScreen2, consentPromptPreconditionScreen2.d(), zhm.v.k((PromptMarketingContentDelegate) consentPromptPreconditionScreen2.L.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentPromptPreconditionScreen.Q;
                        qji.b bVarU2 = consentPromptPreconditionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.di.ConsentPromptPreconditionScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        ztg.n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData = consentPromptPreconditionScreen.K;
                        consentPromptPreconditionScreenContract$InputData.getClass();
                        return new ztg.j(nVar, hVar2, consentPromptPreconditionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentPromptPreconditionScreen.Q;
                        return (r) ((ztg.j) consentPromptPreconditionScreen.O.getValue()).d.get();
                }
            }
        });
        this.N = R$layout.screen_prompt;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: kug.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentPromptPreconditionScreen f189792b;

            {
                this.f189792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConsentPromptPreconditionScreen consentPromptPreconditionScreen = this.f189792b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentPromptPreconditionScreen.Q;
                        ConsentPromptPreconditionScreen consentPromptPreconditionScreen2 = this.f189792b;
                        return tki.g.a(consentPromptPreconditionScreen2, consentPromptPreconditionScreen2.d(), zhm.v.k((PromptMarketingContentDelegate) consentPromptPreconditionScreen2.L.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentPromptPreconditionScreen.Q;
                        qji.b bVarU2 = consentPromptPreconditionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.di.ConsentPromptPreconditionScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        ztg.n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData = consentPromptPreconditionScreen.K;
                        consentPromptPreconditionScreenContract$InputData.getClass();
                        return new ztg.j(nVar, hVar2, consentPromptPreconditionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentPromptPreconditionScreen.Q;
                        return (r) ((ztg.j) consentPromptPreconditionScreen.O.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: kug.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentPromptPreconditionScreen f189792b;

            {
                this.f189792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConsentPromptPreconditionScreen consentPromptPreconditionScreen = this.f189792b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentPromptPreconditionScreen.Q;
                        ConsentPromptPreconditionScreen consentPromptPreconditionScreen2 = this.f189792b;
                        return tki.g.a(consentPromptPreconditionScreen2, consentPromptPreconditionScreen2.d(), zhm.v.k((PromptMarketingContentDelegate) consentPromptPreconditionScreen2.L.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentPromptPreconditionScreen.Q;
                        qji.b bVarU2 = consentPromptPreconditionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.di.ConsentPromptPreconditionScreenInjector");
                        ztg.h hVar = (ztg.h) bVarU2;
                        ztg.n nVar = hVar.f325134b;
                        ztg.h hVar2 = hVar.f325135c;
                        ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData = consentPromptPreconditionScreen.K;
                        consentPromptPreconditionScreenContract$InputData.getClass();
                        return new ztg.j(nVar, hVar2, consentPromptPreconditionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ConsentPromptPreconditionScreen.Q;
                        return (r) ((ztg.j) consentPromptPreconditionScreen.O.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        dli.a.z0((kug.s) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) d()).C2(k.f189800a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.L;
        com.revolut.kompot.navigable.a.g2(this, new kge.b(rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), 24), null, new d(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), null, new kug.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.M.getValue();
    }
}
