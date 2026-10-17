package com.revolut.feature.external_accounts.impl.ui.link.penny_topup.account_information_service;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.account_information_service.AccountInformationServiceScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import il9.p;
import in6.c;
import in6.e;
import in6.i;
import in6.j;
import in6.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xf6.g;
import xf6.h0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/account_information_service/AccountInformationServiceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lin6/i;", "Ldli/a;", "Lin6/j;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountInformationServiceScreen extends ViewController<i> implements a {
    public static final /* synthetic */ int Q = 0;
    public final e K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;

    public AccountInformationServiceScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new p(8));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: in6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationServiceScreen f162666b;

            {
                this.f162666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        xf6.g gVar = (xf6.g) this.f162666b.N.getValue();
                        return new l((mn6.a) gVar.f304856b.d.get(), gVar.f304855a, new nn6.a(), new m());
                    case 1:
                        AccountInformationServiceScreen accountInformationServiceScreen = this.f162666b;
                        qji.b bVarU2 = accountInformationServiceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.penny_topup.account_information_service.di.AccountInformationServiceScreenInjector");
                        }
                        h0 h0Var = ((h0) bVarU2).f304872c;
                        e eVar = accountInformationServiceScreen.K;
                        eVar.getClass();
                        return new xf6.g(h0Var, eVar);
                    default:
                        AccountInformationServiceScreen accountInformationServiceScreen2 = this.f162666b;
                        return dli.f.a(accountInformationServiceScreen2, (l) accountInformationServiceScreen2.M.getValue(), u.c((PromptContentDelegate) accountInformationServiceScreen2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: in6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationServiceScreen f162666b;

            {
                this.f162666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        xf6.g gVar = (xf6.g) this.f162666b.N.getValue();
                        return new l((mn6.a) gVar.f304856b.d.get(), gVar.f304855a, new nn6.a(), new m());
                    case 1:
                        AccountInformationServiceScreen accountInformationServiceScreen = this.f162666b;
                        qji.b bVarU2 = accountInformationServiceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.penny_topup.account_information_service.di.AccountInformationServiceScreenInjector");
                        }
                        h0 h0Var = ((h0) bVarU2).f304872c;
                        e eVar = accountInformationServiceScreen.K;
                        eVar.getClass();
                        return new xf6.g(h0Var, eVar);
                    default:
                        AccountInformationServiceScreen accountInformationServiceScreen2 = this.f162666b;
                        return dli.f.a(accountInformationServiceScreen2, (l) accountInformationServiceScreen2.M.getValue(), u.c((PromptContentDelegate) accountInformationServiceScreen2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.O = R$layout.screen_prompt;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: in6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationServiceScreen f162666b;

            {
                this.f162666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        xf6.g gVar = (xf6.g) this.f162666b.N.getValue();
                        return new l((mn6.a) gVar.f304856b.d.get(), gVar.f304855a, new nn6.a(), new m());
                    case 1:
                        AccountInformationServiceScreen accountInformationServiceScreen = this.f162666b;
                        qji.b bVarU2 = accountInformationServiceScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.penny_topup.account_information_service.di.AccountInformationServiceScreenInjector");
                        }
                        h0 h0Var = ((h0) bVarU2).f304872c;
                        e eVar = accountInformationServiceScreen.K;
                        eVar.getClass();
                        return new xf6.g(h0Var, eVar);
                    default:
                        AccountInformationServiceScreen accountInformationServiceScreen2 = this.f162666b;
                        return dli.f.a(accountInformationServiceScreen2, (l) accountInformationServiceScreen2.M.getValue(), u.c((PromptContentDelegate) accountInformationServiceScreen2.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.L;
        ViewController.P2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).q()), new in6.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).f53054h.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
