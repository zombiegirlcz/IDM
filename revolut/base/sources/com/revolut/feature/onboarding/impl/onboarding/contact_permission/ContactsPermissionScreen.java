package com.revolut.feature.onboarding.impl.onboarding.contact_permission;

import android.view.View;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.contact_permission.ContactsPermissionScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m3g.c;
import ma9.f;
import ma9.g;
import ma9.h;
import no.m;
import pki.b;
import ta9.o;
import te0.w;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/contact_permission/ContactsPermissionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lma9/f;", "Ldli/a;", "Lma9/h;", "Lno/m;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactsPermissionScreen extends ViewController<f> implements a, m {
    public final Object L;
    public final Object M;
    public final Object O;
    public final Lazy P;
    public final int K = R$layout.screen_recycler_view;
    public final Object N = w.y0(new c(15));

    public ContactsPermissionScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ma9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsPermissionScreen f203963b;

            {
                this.f203963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarU2 = this.f203963b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.contact_permission.di.ContactsPermissionScreenInjector");
                        ta9.m mVar = ((o) bVarU2).f269260b;
                        ta9.e eVar = new ta9.e();
                        eVar.f269197a = e4m.b.b(new ta9.d(mVar, 0));
                        return eVar;
                    case 1:
                        return (g) ((ta9.e) this.f203963b.L.getValue()).f269197a.get();
                    case 2:
                        ContactsPermissionScreen contactsPermissionScreen = this.f203963b;
                        return dli.f.a(contactsPermissionScreen, (g) contactsPermissionScreen.M.getValue(), u.c((PromptMarketingContentDelegate) contactsPermissionScreen.N.getValue()), 0, null, null, null, 60);
                    default:
                        qji.c cVarZ2 = this.f203963b.z2();
                        m mVar2 = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar2 != null) {
                            return mVar2.getO();
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ma9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsPermissionScreen f203963b;

            {
                this.f203963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = this.f203963b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.contact_permission.di.ContactsPermissionScreenInjector");
                        ta9.m mVar = ((o) bVarU2).f269260b;
                        ta9.e eVar = new ta9.e();
                        eVar.f269197a = e4m.b.b(new ta9.d(mVar, 0));
                        return eVar;
                    case 1:
                        return (g) ((ta9.e) this.f203963b.L.getValue()).f269197a.get();
                    case 2:
                        ContactsPermissionScreen contactsPermissionScreen = this.f203963b;
                        return dli.f.a(contactsPermissionScreen, (g) contactsPermissionScreen.M.getValue(), u.c((PromptMarketingContentDelegate) contactsPermissionScreen.N.getValue()), 0, null, null, null, 60);
                    default:
                        qji.c cVarZ2 = this.f203963b.z2();
                        m mVar2 = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar2 != null) {
                            return mVar2.getO();
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ma9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsPermissionScreen f203963b;

            {
                this.f203963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarU2 = this.f203963b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.contact_permission.di.ContactsPermissionScreenInjector");
                        ta9.m mVar = ((o) bVarU2).f269260b;
                        ta9.e eVar = new ta9.e();
                        eVar.f269197a = e4m.b.b(new ta9.d(mVar, 0));
                        return eVar;
                    case 1:
                        return (g) ((ta9.e) this.f203963b.L.getValue()).f269197a.get();
                    case 2:
                        ContactsPermissionScreen contactsPermissionScreen = this.f203963b;
                        return dli.f.a(contactsPermissionScreen, (g) contactsPermissionScreen.M.getValue(), u.c((PromptMarketingContentDelegate) contactsPermissionScreen.N.getValue()), 0, null, null, null, 60);
                    default:
                        qji.c cVarZ2 = this.f203963b.z2();
                        m mVar2 = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar2 != null) {
                            return mVar2.getO();
                        }
                        return null;
                }
            }
        });
        final int i5 = 3;
        this.P = j.b(new Function0(this) { // from class: ma9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsPermissionScreen f203963b;

            {
                this.f203963b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        qji.b bVarU2 = this.f203963b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.contact_permission.di.ContactsPermissionScreenInjector");
                        ta9.m mVar = ((o) bVarU2).f269260b;
                        ta9.e eVar = new ta9.e();
                        eVar.f269197a = e4m.b.b(new ta9.d(mVar, 0));
                        return eVar;
                    case 1:
                        return (g) ((ta9.e) this.f203963b.L.getValue()).f269197a.get();
                    case 2:
                        ContactsPermissionScreen contactsPermissionScreen = this.f203963b;
                        return dli.f.a(contactsPermissionScreen, (g) contactsPermissionScreen.M.getValue(), u.c((PromptMarketingContentDelegate) contactsPermissionScreen.N.getValue()), 0, null, null, null, 60);
                    default:
                        qji.c cVarZ2 = this.f203963b.z2();
                        m mVar2 = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar2 != null) {
                            return mVar2.getO();
                        }
                        return null;
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        a.z0((h) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return (AnalyticsProduct) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ta9.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.N;
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new ma9.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), new ma9.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
