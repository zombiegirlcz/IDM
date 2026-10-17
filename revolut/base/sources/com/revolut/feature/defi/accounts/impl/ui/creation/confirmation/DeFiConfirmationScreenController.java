package com.revolut.feature.defi.accounts.impl.ui.creation.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.defi.accounts.impl.R$string;
import com.revolut.feature.defi.accounts.impl.ui.creation.confirmation.DeFiConfirmationScreenController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import n16.c;
import s16.b;
import s16.d;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/accounts/impl/ui/creation/confirmation/DeFiConfirmationScreenController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls16/a;", "Ldli/a;", "Ls16/b;", "<init>", "()V", "feature_defi_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiConfirmationScreenController extends ViewController<s16.a> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(DeFiConfirmationScreenController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object N;
    public final int M = R$layout.screen_recycler_navbar_nextbutton;
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public DeFiConfirmationScreenController() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: s16.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiConfirmationScreenController f259100b;

            {
                this.f259100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiConfirmationScreenController deFiConfirmationScreenController = this.f259100b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiConfirmationScreenController.P;
                        return (e) ((n16.c) deFiConfirmationScreenController.L.getValue()).f211258a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiConfirmationScreenController.P;
                        phm.a aVar = (phm.a) ue0.e.j(deFiConfirmationScreenController.m2()).a().get(n16.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n16.b.class, " is not found"));
                        }
                        n16.b bVar = ((n16.b) aVar2.b()).f211255n;
                        n16.c cVar = new n16.c();
                        cVar.f211258a = e4m.b.b(new m0m.a(10));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = DeFiConfirmationScreenController.P;
                        DeFiConfirmationScreenController deFiConfirmationScreenController2 = this.f259100b;
                        return dli.f.a(deFiConfirmationScreenController2, (e) deFiConfirmationScreenController2.K.getValue(), m72.b.v(null, null, 7), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: s16.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiConfirmationScreenController f259100b;

            {
                this.f259100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiConfirmationScreenController deFiConfirmationScreenController = this.f259100b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiConfirmationScreenController.P;
                        return (e) ((n16.c) deFiConfirmationScreenController.L.getValue()).f211258a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiConfirmationScreenController.P;
                        phm.a aVar = (phm.a) ue0.e.j(deFiConfirmationScreenController.m2()).a().get(n16.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n16.b.class, " is not found"));
                        }
                        n16.b bVar = ((n16.b) aVar2.b()).f211255n;
                        n16.c cVar = new n16.c();
                        cVar.f211258a = e4m.b.b(new m0m.a(10));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = DeFiConfirmationScreenController.P;
                        DeFiConfirmationScreenController deFiConfirmationScreenController2 = this.f259100b;
                        return dli.f.a(deFiConfirmationScreenController2, (e) deFiConfirmationScreenController2.K.getValue(), m72.b.v(null, null, 7), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: s16.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiConfirmationScreenController f259100b;

            {
                this.f259100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiConfirmationScreenController deFiConfirmationScreenController = this.f259100b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiConfirmationScreenController.P;
                        return (e) ((n16.c) deFiConfirmationScreenController.L.getValue()).f211258a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiConfirmationScreenController.P;
                        phm.a aVar = (phm.a) ue0.e.j(deFiConfirmationScreenController.m2()).a().get(n16.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n16.b.class, " is not found"));
                        }
                        n16.b bVar = ((n16.b) aVar2.b()).f211255n;
                        n16.c cVar = new n16.c();
                        cVar.f211258a = e4m.b.b(new m0m.a(10));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = DeFiConfirmationScreenController.P;
                        DeFiConfirmationScreenController deFiConfirmationScreenController2 = this.f259100b;
                        return dli.f.a(deFiConfirmationScreenController2, (e) deFiConfirmationScreenController2.K.getValue(), m72.b.v(null, null, 7), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (s16.e) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_button_title, null, null, 14));
        largeActionButton.setLoadingButtonTag("DEFI_ACCOUNT_CREATION_CONTINUE_BUTTON_TAG");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.defi_accounts_creation_confirmation_header_title, null, null, 14), null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
