package com.revolut.feature.apm.wero.impl.ui.pay.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.feature.apm.wero.impl.ui.pay.list.WeroRequestLinkListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le8.d;
import lh9.b;
import li2.c;
import nh2.o;
import nh2.z;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/list/WeroRequestLinkListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lli2/b;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeroRequestLinkListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(WeroRequestLinkListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new b(5));
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public WeroRequestLinkListScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: li2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroRequestLinkListScreen f195406b;

            {
                this.f195406b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeroRequestLinkListScreen weroRequestLinkListScreen = this.f195406b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WeroRequestLinkListScreen.R;
                        WeroRequestLinkListScreen weroRequestLinkListScreen2 = this.f195406b;
                        return dli.f.a(weroRequestLinkListScreen2, (c) weroRequestLinkListScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) weroRequestLinkListScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroRequestLinkListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(weroRequestLinkListScreen.m2()).a().get(nh2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new z(((o) ((nh2.h) aVar2.b())).f215326t);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = WeroRequestLinkListScreen.R;
                        return (c) ((z) weroRequestLinkListScreen.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: li2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroRequestLinkListScreen f195406b;

            {
                this.f195406b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeroRequestLinkListScreen weroRequestLinkListScreen = this.f195406b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroRequestLinkListScreen.R;
                        WeroRequestLinkListScreen weroRequestLinkListScreen2 = this.f195406b;
                        return dli.f.a(weroRequestLinkListScreen2, (c) weroRequestLinkListScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) weroRequestLinkListScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroRequestLinkListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(weroRequestLinkListScreen.m2()).a().get(nh2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new z(((o) ((nh2.h) aVar2.b())).f215326t);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = WeroRequestLinkListScreen.R;
                        return (c) ((z) weroRequestLinkListScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: li2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroRequestLinkListScreen f195406b;

            {
                this.f195406b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WeroRequestLinkListScreen weroRequestLinkListScreen = this.f195406b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WeroRequestLinkListScreen.R;
                        WeroRequestLinkListScreen weroRequestLinkListScreen2 = this.f195406b;
                        return dli.f.a(weroRequestLinkListScreen2, (c) weroRequestLinkListScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) weroRequestLinkListScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = WeroRequestLinkListScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(weroRequestLinkListScreen.m2()).a().get(nh2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new z(((o) ((nh2.h) aVar2.b())).f215326t);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = WeroRequestLinkListScreen.R;
                        return (c) ((z) weroRequestLinkListScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        li2.b uiState = (li2.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f195404b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.wero_back, null, null, 14), 126));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wero_qr_link_list_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wero_qr_link_list_title, null, null, 14));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.wero_qr_link_list_description, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new li2.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new li2.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.N.getValue()).f53218h, new lfg.z(19))), null, new d(this, continuation, 7), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
