package com.revolut.feature.shops.impl.ui.notification_opt_in;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.shops.impl.R$id;
import com.revolut.feature.shops.impl.R$layout;
import com.revolut.feature.shops.impl.ui.notification_opt_in.ShopsNotificationOptInScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import did.n;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nhl.s;
import njd.c;
import njd.d;
import njd.f;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/notification_opt_in/ShopsNotificationOptInScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnjd/c;", "Ldli/a;", "Lnjd/d;", "<init>", "()V", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsNotificationOptInScreen extends ViewController<c> implements a {
    public static final /* synthetic */ int P = 0;
    public final int K = R$layout.screen_shops_notification_opt_in;
    public final Object L = w.y0(new s(21));
    public final Object M;
    public final Object N;
    public final Object O;

    public ShopsNotificationOptInScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: njd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsNotificationOptInScreen f216450b;

            {
                this.f216450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                ShopsNotificationOptInScreen shopsNotificationOptInScreen = this.f216450b;
                switch (i2) {
                    case 0:
                        ShopsNotificationOptInScreen shopsNotificationOptInScreen2 = this.f216450b;
                        return dli.f.a(shopsNotificationOptInScreen2, (f) shopsNotificationOptInScreen2.O.getValue(), v.k((LargeActionButtonDelegate) shopsNotificationOptInScreen2.L.getValue(), new SimpleMediaDelegate(), new TextDelegate()), R$id.shopsNotificationOptInScreen_recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(shopsNotificationOptInScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        n nVar = new n();
                        int i6 = 12;
                        nVar.f115043a = e4m.b.b(new db1.f(dVar, nVar, i5, i6));
                        nVar.f115044b = e4m.b.b(new db1.f(dVar, nVar, i3, i6));
                        return nVar;
                    default:
                        return (f) ((n) shopsNotificationOptInScreen.N.getValue()).f115044b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: njd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsNotificationOptInScreen f216450b;

            {
                this.f216450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                ShopsNotificationOptInScreen shopsNotificationOptInScreen = this.f216450b;
                switch (i22) {
                    case 0:
                        ShopsNotificationOptInScreen shopsNotificationOptInScreen2 = this.f216450b;
                        return dli.f.a(shopsNotificationOptInScreen2, (f) shopsNotificationOptInScreen2.O.getValue(), v.k((LargeActionButtonDelegate) shopsNotificationOptInScreen2.L.getValue(), new SimpleMediaDelegate(), new TextDelegate()), R$id.shopsNotificationOptInScreen_recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(shopsNotificationOptInScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        n nVar = new n();
                        int i6 = 12;
                        nVar.f115043a = e4m.b.b(new db1.f(dVar, nVar, i5, i6));
                        nVar.f115044b = e4m.b.b(new db1.f(dVar, nVar, i3, i6));
                        return nVar;
                    default:
                        return (f) ((n) shopsNotificationOptInScreen.N.getValue()).f115044b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: njd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsNotificationOptInScreen f216450b;

            {
                this.f216450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                ShopsNotificationOptInScreen shopsNotificationOptInScreen = this.f216450b;
                switch (i22) {
                    case 0:
                        ShopsNotificationOptInScreen shopsNotificationOptInScreen2 = this.f216450b;
                        return dli.f.a(shopsNotificationOptInScreen2, (f) shopsNotificationOptInScreen2.O.getValue(), v.k((LargeActionButtonDelegate) shopsNotificationOptInScreen2.L.getValue(), new SimpleMediaDelegate(), new TextDelegate()), R$id.shopsNotificationOptInScreen_recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(shopsNotificationOptInScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        n nVar = new n();
                        int i6 = 12;
                        nVar.f115043a = e4m.b.b(new db1.f(dVar, nVar, i5, i6));
                        nVar.f115044b = e4m.b.b(new db1.f(dVar, nVar, i32, i6));
                        return nVar;
                    default:
                        return (f) ((n) shopsNotificationOptInScreen.N.getValue()).f115044b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.L.getValue()).d.f121375b), null, new njd.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
