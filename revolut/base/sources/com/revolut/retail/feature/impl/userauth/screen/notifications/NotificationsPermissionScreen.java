package com.revolut.retail.feature.impl.userauth.screen.notifications;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.userauth.screen.notifications.NotificationsPermissionScreen;
import dli.a;
import ewj.b;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import p0j.e;
import te0.w;
import wwj.c;
import wwj.d;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/notifications/NotificationsPermissionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lp0j/e;", "Ldli/a;", "Lwwj/e;", "Lno/m;", "<init>", "()V", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationsPermissionScreen extends ViewController<e> implements a, m {
    public final Object L;
    public final Object M;
    public final Object O;
    public final AnalyticsProduct.Retail P;
    public final int K = R$layout.screen_recycler_view;
    public final Object N = w.y0(new wq1.a(27));

    public NotificationsPermissionScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wwj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationsPermissionScreen f300696b;

            {
                this.f300696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        NotificationsPermissionScreen notificationsPermissionScreen = this.f300696b;
                        phm.a aVar = (phm.a) ue0.e.j(notificationsPermissionScreen.m2()).a().get(fxj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (ewj.b) ((ewj.a) ((xwj.a) aVar2.b()).b().mo3808a(notificationsPermissionScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fxj.a.class, " is not found"));
                    case 1:
                        ewj.b bVar = (ewj.b) this.f300696b.L.getValue();
                        switch (bVar.f130300a) {
                            case 0:
                                return (d) bVar.f130302c.get();
                            default:
                                return (d) bVar.f130302c.get();
                        }
                    default:
                        NotificationsPermissionScreen notificationsPermissionScreen2 = this.f300696b;
                        return dli.f.a(notificationsPermissionScreen2, (d) notificationsPermissionScreen2.M.getValue(), u.c((PromptMarketingContentDelegate) notificationsPermissionScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wwj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationsPermissionScreen f300696b;

            {
                this.f300696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        NotificationsPermissionScreen notificationsPermissionScreen = this.f300696b;
                        phm.a aVar = (phm.a) ue0.e.j(notificationsPermissionScreen.m2()).a().get(fxj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (ewj.b) ((ewj.a) ((xwj.a) aVar2.b()).b().mo3808a(notificationsPermissionScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fxj.a.class, " is not found"));
                    case 1:
                        ewj.b bVar = (ewj.b) this.f300696b.L.getValue();
                        switch (bVar.f130300a) {
                            case 0:
                                return (d) bVar.f130302c.get();
                            default:
                                return (d) bVar.f130302c.get();
                        }
                    default:
                        NotificationsPermissionScreen notificationsPermissionScreen2 = this.f300696b;
                        return dli.f.a(notificationsPermissionScreen2, (d) notificationsPermissionScreen2.M.getValue(), u.c((PromptMarketingContentDelegate) notificationsPermissionScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: wwj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationsPermissionScreen f300696b;

            {
                this.f300696b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        NotificationsPermissionScreen notificationsPermissionScreen = this.f300696b;
                        phm.a aVar = (phm.a) ue0.e.j(notificationsPermissionScreen.m2()).a().get(fxj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (ewj.b) ((ewj.a) ((xwj.a) aVar2.b()).b().mo3808a(notificationsPermissionScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fxj.a.class, " is not found"));
                    case 1:
                        ewj.b bVar = (ewj.b) this.f300696b.L.getValue();
                        switch (bVar.f130300a) {
                            case 0:
                                return (d) bVar.f130302c.get();
                            default:
                                return (d) bVar.f130302c.get();
                        }
                    default:
                        NotificationsPermissionScreen notificationsPermissionScreen2 = this.f300696b;
                        return dli.f.a(notificationsPermissionScreen2, (d) notificationsPermissionScreen2.M.getValue(), u.c((PromptMarketingContentDelegate) notificationsPermissionScreen2.N.getValue()), 0, null, null, null, 60);
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.P = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((wwj.e) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.N;
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new wwj.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), new c(this, null), 3);
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
