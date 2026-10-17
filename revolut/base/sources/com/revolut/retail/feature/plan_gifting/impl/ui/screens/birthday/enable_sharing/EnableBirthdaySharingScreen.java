package com.revolut.retail.feature.plan_gifting.impl.ui.screens.birthday.enable_sharing;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.birthday.enable_sharing.EnableBirthdaySharingScreen;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.birthday.enable_sharing.EnableBirthdaySharingScreenContract$InputData;
import dli.a;
import eck.c;
import eck.g;
import eck.h;
import eck.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/screens/birthday/enable_sharing/EnableBirthdaySharingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leck/g;", "Ldli/a;", "Leck/h;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnableBirthdaySharingScreen extends ViewController<g> implements a {
    public final EnableBirthdaySharingScreenContract$InputData K;
    public final int L;
    public final PromptMarketingContentDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public EnableBirthdaySharingScreen(EnableBirthdaySharingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        this.M = new PromptMarketingContentDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: eck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableBirthdaySharingScreen f124758b;

            {
                this.f124758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EnableBirthdaySharingScreen enableBirthdaySharingScreen = this.f124758b;
                        return dli.f.a(enableBirthdaySharingScreen, (j) enableBirthdaySharingScreen.P.getValue(), u.c(enableBirthdaySharingScreen.M), 0, null, null, null, 60);
                    case 1:
                        EnableBirthdaySharingScreen enableBirthdaySharingScreen2 = this.f124758b;
                        qji.b bVarU2 = enableBirthdaySharingScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.birthday.enable_sharing.di.EnableBirthdaySharingScreenInjector");
                        pbk.g gVar = (pbk.g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        pbk.g gVar2 = gVar.f234742c;
                        EnableBirthdaySharingScreenContract$InputData enableBirthdaySharingScreenContract$InputData = enableBirthdaySharingScreen2.K;
                        enableBirthdaySharingScreenContract$InputData.getClass();
                        return new pbk.a(bVar, gVar2, enableBirthdaySharingScreenContract$InputData);
                    default:
                        return (j) ((pbk.a) this.f124758b.O.getValue()).f234714c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: eck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableBirthdaySharingScreen f124758b;

            {
                this.f124758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EnableBirthdaySharingScreen enableBirthdaySharingScreen = this.f124758b;
                        return dli.f.a(enableBirthdaySharingScreen, (j) enableBirthdaySharingScreen.P.getValue(), u.c(enableBirthdaySharingScreen.M), 0, null, null, null, 60);
                    case 1:
                        EnableBirthdaySharingScreen enableBirthdaySharingScreen2 = this.f124758b;
                        qji.b bVarU2 = enableBirthdaySharingScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.birthday.enable_sharing.di.EnableBirthdaySharingScreenInjector");
                        pbk.g gVar = (pbk.g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        pbk.g gVar2 = gVar.f234742c;
                        EnableBirthdaySharingScreenContract$InputData enableBirthdaySharingScreenContract$InputData = enableBirthdaySharingScreen2.K;
                        enableBirthdaySharingScreenContract$InputData.getClass();
                        return new pbk.a(bVar, gVar2, enableBirthdaySharingScreenContract$InputData);
                    default:
                        return (j) ((pbk.a) this.f124758b.O.getValue()).f234714c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: eck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableBirthdaySharingScreen f124758b;

            {
                this.f124758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EnableBirthdaySharingScreen enableBirthdaySharingScreen = this.f124758b;
                        return dli.f.a(enableBirthdaySharingScreen, (j) enableBirthdaySharingScreen.P.getValue(), u.c(enableBirthdaySharingScreen.M), 0, null, null, null, 60);
                    case 1:
                        EnableBirthdaySharingScreen enableBirthdaySharingScreen2 = this.f124758b;
                        qji.b bVarU2 = enableBirthdaySharingScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.birthday.enable_sharing.di.EnableBirthdaySharingScreenInjector");
                        pbk.g gVar = (pbk.g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        pbk.g gVar2 = gVar.f234742c;
                        EnableBirthdaySharingScreenContract$InputData enableBirthdaySharingScreenContract$InputData = enableBirthdaySharingScreen2.K;
                        enableBirthdaySharingScreenContract$InputData.getClass();
                        return new pbk.a(bVar, gVar2, enableBirthdaySharingScreenContract$InputData);
                    default:
                        return (j) ((pbk.a) this.f124758b.O.getValue()).f234714c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pbk.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.M;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new eck.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
