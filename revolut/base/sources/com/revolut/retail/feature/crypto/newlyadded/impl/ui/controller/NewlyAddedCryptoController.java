package com.revolut.retail.feature.crypto.newlyadded.impl.ui.controller;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.newlyadded.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto.newlyadded.impl.ui.controller.NewlyAddedCryptoController;
import jaj.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qaj.b;
import qaj.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/crypto/newlyadded/impl/ui/controller/NewlyAddedCryptoController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqaj/f;", "<init>", "()V", "feature_crypto_newly_added_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewlyAddedCryptoController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(NewlyAddedCryptoController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object R;
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object P = w.y0(new q50.w(24));
    public final Object Q = w.y0(new q50.w(25));

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public NewlyAddedCryptoController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qaj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewlyAddedCryptoController f244042b;

            {
                this.f244042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NewlyAddedCryptoController newlyAddedCryptoController = this.f244042b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NewlyAddedCryptoController.S;
                        phm.a aVar = (phm.a) ue0.e.j(newlyAddedCryptoController.m2()).a().get(gaj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gaj.a.class, " is not found"));
                        }
                        jaj.b bVar = ((jaj.b) aVar2.b()).f172489g;
                        jaj.c cVar = new jaj.c();
                        int i6 = 23;
                        cVar.f172493a = e4m.b.b(new iwb.b(bVar, cVar, i3, i6));
                        cVar.f172494b = e4m.b.b(new iwb.b(bVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = NewlyAddedCryptoController.S;
                        return (e) ((jaj.c) newlyAddedCryptoController.N.getValue()).f172494b.get();
                    default:
                        KProperty[] kPropertyArr3 = NewlyAddedCryptoController.S;
                        NewlyAddedCryptoController newlyAddedCryptoController2 = this.f244042b;
                        return dli.f.a(newlyAddedCryptoController2, newlyAddedCryptoController2.R2(), v.k((RowDelegate) newlyAddedCryptoController2.P.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) newlyAddedCryptoController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qaj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewlyAddedCryptoController f244042b;

            {
                this.f244042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NewlyAddedCryptoController newlyAddedCryptoController = this.f244042b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewlyAddedCryptoController.S;
                        phm.a aVar = (phm.a) ue0.e.j(newlyAddedCryptoController.m2()).a().get(gaj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gaj.a.class, " is not found"));
                        }
                        jaj.b bVar = ((jaj.b) aVar2.b()).f172489g;
                        jaj.c cVar = new jaj.c();
                        int i6 = 23;
                        cVar.f172493a = e4m.b.b(new iwb.b(bVar, cVar, i3, i6));
                        cVar.f172494b = e4m.b.b(new iwb.b(bVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = NewlyAddedCryptoController.S;
                        return (e) ((jaj.c) newlyAddedCryptoController.N.getValue()).f172494b.get();
                    default:
                        KProperty[] kPropertyArr3 = NewlyAddedCryptoController.S;
                        NewlyAddedCryptoController newlyAddedCryptoController2 = this.f244042b;
                        return dli.f.a(newlyAddedCryptoController2, newlyAddedCryptoController2.R2(), v.k((RowDelegate) newlyAddedCryptoController2.P.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) newlyAddedCryptoController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: qaj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewlyAddedCryptoController f244042b;

            {
                this.f244042b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NewlyAddedCryptoController newlyAddedCryptoController = this.f244042b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewlyAddedCryptoController.S;
                        phm.a aVar = (phm.a) ue0.e.j(newlyAddedCryptoController.m2()).a().get(gaj.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gaj.a.class, " is not found"));
                        }
                        jaj.b bVar = ((jaj.b) aVar2.b()).f172489g;
                        jaj.c cVar = new jaj.c();
                        int i6 = 23;
                        cVar.f172493a = e4m.b.b(new iwb.b(bVar, cVar, i32, i6));
                        cVar.f172494b = e4m.b.b(new iwb.b(bVar, cVar, i5, i6));
                        return cVar;
                    case 1:
                        KProperty[] kPropertyArr2 = NewlyAddedCryptoController.S;
                        return (e) ((jaj.c) newlyAddedCryptoController.N.getValue()).f172494b.get();
                    default:
                        KProperty[] kPropertyArr3 = NewlyAddedCryptoController.S;
                        NewlyAddedCryptoController newlyAddedCryptoController2 = this.f244042b;
                        return dli.f.a(newlyAddedCryptoController2, newlyAddedCryptoController2.R2(), v.k((RowDelegate) newlyAddedCryptoController2.P.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) newlyAddedCryptoController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_newly_added_screen_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.crypto_newly_added_screen_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new b(this, null), 3);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new q43.m(this, null, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), null, new qaj.c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final qaj.e R2() {
        return (qaj.e) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
