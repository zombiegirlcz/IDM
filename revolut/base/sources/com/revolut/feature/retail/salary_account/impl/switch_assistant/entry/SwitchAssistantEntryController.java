package com.revolut.feature.retail.salary_account.impl.switch_assistant.entry;

import android.os.Parcelable;
import android.view.View;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.entry.SwitchAssistantEntryController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import shb.d;
import shb.e;
import shb.g;
import shb.h;
import shb.i;
import shb.j;
import te0.w;
import wfb.p;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/entry/SwitchAssistantEntryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lshb/d;", "Ldli/a;", "Lshb/e;", "Lno/m;", "<init>", "()V", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwitchAssistantEntryController extends ViewController<d> implements a, m {
    public final PromptMarketingContentDelegate K = new PromptMarketingContentDelegate();
    public final int L = R$layout.screen_prompt;
    public final AnalyticsProduct.Retail M;
    public final Object N;
    public final Object O;
    public final Object P;

    public SwitchAssistantEntryController() {
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: shb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchAssistantEntryController f263454b;

            {
                this.f263454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarU2 = this.f263454b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.entry.di.SwitchAssistantEntryControllerComponent.Injector");
                        p pVar = new p();
                        pVar.f297069a = e4m.b.b(new vk6.a(14));
                        return pVar;
                    case 1:
                        return (j) ((p) this.f263454b.N.getValue()).f297069a.get();
                    default:
                        SwitchAssistantEntryController switchAssistantEntryController = this.f263454b;
                        return dli.f.a(switchAssistantEntryController, (j) switchAssistantEntryController.O.getValue(), u.c(switchAssistantEntryController.K), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: shb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchAssistantEntryController f263454b;

            {
                this.f263454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = this.f263454b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.entry.di.SwitchAssistantEntryControllerComponent.Injector");
                        p pVar = new p();
                        pVar.f297069a = e4m.b.b(new vk6.a(14));
                        return pVar;
                    case 1:
                        return (j) ((p) this.f263454b.N.getValue()).f297069a.get();
                    default:
                        SwitchAssistantEntryController switchAssistantEntryController = this.f263454b;
                        return dli.f.a(switchAssistantEntryController, (j) switchAssistantEntryController.O.getValue(), u.c(switchAssistantEntryController.K), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: shb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchAssistantEntryController f263454b;

            {
                this.f263454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarU2 = this.f263454b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.switch_assistant.entry.di.SwitchAssistantEntryControllerComponent.Injector");
                        p pVar = new p();
                        pVar.f297069a = e4m.b.b(new vk6.a(14));
                        return pVar;
                    case 1:
                        return (j) ((p) this.f263454b.N.getValue()).f297069a.get();
                    default:
                        SwitchAssistantEntryController switchAssistantEntryController = this.f263454b;
                        return dli.f.a(switchAssistantEntryController, (j) switchAssistantEntryController.O.getValue(), u.c(switchAssistantEntryController.K), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.K;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new h(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new i(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
