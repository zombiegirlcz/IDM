package com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.NationalityPromptScreen;
import com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.NationalityPromptScreenContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e18.i;
import eai.c;
import eai.d;
import eai.h;
import eai.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import oai.i0;
import oai.t;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/citizenship_prompt/NationalityPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leai/h;", "Ldli/a;", "Leai/i;", "Lno/m;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NationalityPromptScreen extends ViewController<h> implements a, m {
    public final NationalityPromptScreenContract$InputData K;
    public final Object L;
    public final AnalyticsProduct M;
    public final boolean N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public NationalityPromptScreen(NationalityPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new i(26));
        this.M = inputData.d;
        this.N = true;
        this.O = R$layout.screen_recycler_view;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: eai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalityPromptScreen f124258b;

            {
                this.f124258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        NationalityPromptScreen nationalityPromptScreen = this.f124258b;
                        qji.b bVarU2 = nationalityPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.di.NationalityPromptScreenInjector");
                        oai.d dVar = (oai.d) bVarU2;
                        i0 i0Var = dVar.f223671b;
                        oai.d dVar2 = dVar.f223672c;
                        NationalityPromptScreenContract$InputData nationalityPromptScreenContract$InputData = nationalityPromptScreen.K;
                        nationalityPromptScreenContract$InputData.getClass();
                        return new t(i0Var, dVar2, nationalityPromptScreenContract$InputData);
                    case 1:
                        return (k) ((t) this.f124258b.P.getValue()).f223773c.get();
                    default:
                        NationalityPromptScreen nationalityPromptScreen2 = this.f124258b;
                        return dli.f.a(nationalityPromptScreen2, (k) nationalityPromptScreen2.Q.getValue(), u.c((PromptMarketingContentDelegate) nationalityPromptScreen2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: eai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalityPromptScreen f124258b;

            {
                this.f124258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        NationalityPromptScreen nationalityPromptScreen = this.f124258b;
                        qji.b bVarU2 = nationalityPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.di.NationalityPromptScreenInjector");
                        oai.d dVar = (oai.d) bVarU2;
                        i0 i0Var = dVar.f223671b;
                        oai.d dVar2 = dVar.f223672c;
                        NationalityPromptScreenContract$InputData nationalityPromptScreenContract$InputData = nationalityPromptScreen.K;
                        nationalityPromptScreenContract$InputData.getClass();
                        return new t(i0Var, dVar2, nationalityPromptScreenContract$InputData);
                    case 1:
                        return (k) ((t) this.f124258b.P.getValue()).f223773c.get();
                    default:
                        NationalityPromptScreen nationalityPromptScreen2 = this.f124258b;
                        return dli.f.a(nationalityPromptScreen2, (k) nationalityPromptScreen2.Q.getValue(), u.c((PromptMarketingContentDelegate) nationalityPromptScreen2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: eai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalityPromptScreen f124258b;

            {
                this.f124258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        NationalityPromptScreen nationalityPromptScreen = this.f124258b;
                        qji.b bVarU2 = nationalityPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.di.NationalityPromptScreenInjector");
                        oai.d dVar = (oai.d) bVarU2;
                        i0 i0Var = dVar.f223671b;
                        oai.d dVar2 = dVar.f223672c;
                        NationalityPromptScreenContract$InputData nationalityPromptScreenContract$InputData = nationalityPromptScreen.K;
                        nationalityPromptScreenContract$InputData.getClass();
                        return new t(i0Var, dVar2, nationalityPromptScreenContract$InputData);
                    case 1:
                        return (k) ((t) this.f124258b.P.getValue()).f223773c.get();
                    default:
                        NationalityPromptScreen nationalityPromptScreen2 = this.f124258b;
                        return dli.f.a(nationalityPromptScreen2, (k) nationalityPromptScreen2.Q.getValue(), u.c((PromptMarketingContentDelegate) nationalityPromptScreen2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((eai.i) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (k) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.L;
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), new eai.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
