package com.revolut.feature.support.impl.transfer_tracker.ui.unique_transaction_reference;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.ui.unique_transaction_reference.UniqueTransactionReferenceInputScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import kx4.f0;
import lee.d;
import lee.k;
import lee.l;
import lee.m;
import org.jetbrains.annotations.NotNull;
import rde.j;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/unique_transaction_reference/UniqueTransactionReferenceInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llee/k;", "Ldli/a;", "Llee/l;", "<init>", "()V", "Companion", "a", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UniqueTransactionReferenceInputScreen extends ViewController<k> implements dli.a {
    public final int K = R$layout.screen_recycler_navbar_footer_nextbutton;
    public final h L = s.t(this, b.f);
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(UniqueTransactionReferenceInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, jii.s.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.s.a(p0);
        }
    }

    public UniqueTransactionReferenceInputScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lee.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UniqueTransactionReferenceInputScreen f194529b;

            {
                this.f194529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen = this.f194529b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UniqueTransactionReferenceInputScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(uniqueTransactionReferenceInputScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        rde.j jVar = new rde.j();
                        jVar.f253450a = e4m.b.b(new r96.a(3));
                        return jVar;
                    case 1:
                        KProperty[] kPropertyArr2 = UniqueTransactionReferenceInputScreen.Q;
                        return new InputTextDelegate(new lcc.c(uniqueTransactionReferenceInputScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = UniqueTransactionReferenceInputScreen.Q;
                        return (m) ((rde.j) uniqueTransactionReferenceInputScreen.M.getValue()).f253450a.get();
                    default:
                        KProperty[] kPropertyArr4 = UniqueTransactionReferenceInputScreen.Q;
                        UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen2 = this.f194529b;
                        return dli.f.a(uniqueTransactionReferenceInputScreen2, uniqueTransactionReferenceInputScreen2.R2(), v.k((InputTextDelegate) uniqueTransactionReferenceInputScreen2.N.getValue(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lee.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UniqueTransactionReferenceInputScreen f194529b;

            {
                this.f194529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen = this.f194529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UniqueTransactionReferenceInputScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(uniqueTransactionReferenceInputScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        rde.j jVar = new rde.j();
                        jVar.f253450a = e4m.b.b(new r96.a(3));
                        return jVar;
                    case 1:
                        KProperty[] kPropertyArr2 = UniqueTransactionReferenceInputScreen.Q;
                        return new InputTextDelegate(new lcc.c(uniqueTransactionReferenceInputScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = UniqueTransactionReferenceInputScreen.Q;
                        return (m) ((rde.j) uniqueTransactionReferenceInputScreen.M.getValue()).f253450a.get();
                    default:
                        KProperty[] kPropertyArr4 = UniqueTransactionReferenceInputScreen.Q;
                        UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen2 = this.f194529b;
                        return dli.f.a(uniqueTransactionReferenceInputScreen2, uniqueTransactionReferenceInputScreen2.R2(), v.k((InputTextDelegate) uniqueTransactionReferenceInputScreen2.N.getValue(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lee.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UniqueTransactionReferenceInputScreen f194529b;

            {
                this.f194529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen = this.f194529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UniqueTransactionReferenceInputScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(uniqueTransactionReferenceInputScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        rde.j jVar = new rde.j();
                        jVar.f253450a = e4m.b.b(new r96.a(3));
                        return jVar;
                    case 1:
                        KProperty[] kPropertyArr2 = UniqueTransactionReferenceInputScreen.Q;
                        return new InputTextDelegate(new lcc.c(uniqueTransactionReferenceInputScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = UniqueTransactionReferenceInputScreen.Q;
                        return (m) ((rde.j) uniqueTransactionReferenceInputScreen.M.getValue()).f253450a.get();
                    default:
                        KProperty[] kPropertyArr4 = UniqueTransactionReferenceInputScreen.Q;
                        UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen2 = this.f194529b;
                        return dli.f.a(uniqueTransactionReferenceInputScreen2, uniqueTransactionReferenceInputScreen2.R2(), v.k((InputTextDelegate) uniqueTransactionReferenceInputScreen2.N.getValue(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: lee.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UniqueTransactionReferenceInputScreen f194529b;

            {
                this.f194529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen = this.f194529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UniqueTransactionReferenceInputScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(uniqueTransactionReferenceInputScreen.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                        }
                        rde.h hVar = ((rde.h) aVar2.b()).k;
                        rde.j jVar = new rde.j();
                        jVar.f253450a = e4m.b.b(new r96.a(3));
                        return jVar;
                    case 1:
                        KProperty[] kPropertyArr2 = UniqueTransactionReferenceInputScreen.Q;
                        return new InputTextDelegate(new lcc.c(uniqueTransactionReferenceInputScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = UniqueTransactionReferenceInputScreen.Q;
                        return (m) ((rde.j) uniqueTransactionReferenceInputScreen.M.getValue()).f253450a.get();
                    default:
                        KProperty[] kPropertyArr4 = UniqueTransactionReferenceInputScreen.Q;
                        UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen2 = this.f194529b;
                        return dli.f.a(uniqueTransactionReferenceInputScreen2, uniqueTransactionReferenceInputScreen2.R2(), v.k((InputTextDelegate) uniqueTransactionReferenceInputScreen2.N.getValue(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174557b.setEnabled(uiState.f194537b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.locate_inbound_transfer_uetr_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.locate_inbound_transfer_uetr_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("SKIP_MENU_ITEM_ID", new TextLocalisedClause(R$string.locate_inbound_transfer_uetr_skip, null, null, 14), null, null, 12)));
        d3().f174557b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jii.s sVarD3 = d3();
        ViewController.P2(this, rd0.e.b(sVarD3.e.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(sVarD3.f174557b.o), new d(this, null, 1), 3);
        ViewController.P2(this, new f0(rd0.e.b(((InputTextDelegate) this.N.getValue()).f52576h.f121375b), 14), new d(this, null, 2), 3);
        ViewController.P2(this, new f0(rd0.e.b(sVarD3.e.o.f57403b), 15), new d(this, null, 3), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
