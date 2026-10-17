package com.revolut.feature.apm.upi.impl.screens.transfer_input_id_or_mobile;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.e0;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.upi.api.R$string;
import com.revolut.feature.apm.upi.impl.screens.transfer_input_id_or_mobile.UpiTransferInputIdOrMobileScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import if2.o;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import pki.b;
import te0.w;
import vc.s;
import wg2.c;
import wg2.d;
import wg2.f;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/screens/transfer_input_id_or_mobile/UpiTransferInputIdOrMobileScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwg2/f;", "Lno/d1;", "<init>", "()V", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiTransferInputIdOrMobileScreen extends ViewController<q> implements dli.a, d1 {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(UpiTransferInputIdOrMobileScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object S;
    public final boolean K = true;
    public final h L = s.t(this, a.f);
    public final int M = R$layout.screen_recycler_navbar_nextbutton;
    public final Object P = w.y0(new wf5.a(3));
    public final Object Q = w.y0(new wf5.a(4));
    public final RowDelegate R = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public UpiTransferInputIdOrMobileScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferInputIdOrMobileScreen f297219b;

            {
                this.f297219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen = this.f297219b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpiTransferInputIdOrMobileScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(upiTransferInputIdOrMobileScreen.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new o(((if2.f) aVar2.b()).f160865w, upiTransferInputIdOrMobileScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = UpiTransferInputIdOrMobileScreen.T;
                        return (h) ((o) upiTransferInputIdOrMobileScreen.N.getValue()).f160897h.get();
                    default:
                        KProperty[] kPropertyArr3 = UpiTransferInputIdOrMobileScreen.T;
                        UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen2 = this.f297219b;
                        return dli.f.a(upiTransferInputIdOrMobileScreen2, (h) upiTransferInputIdOrMobileScreen2.O.getValue(), v.k((TextDelegate) upiTransferInputIdOrMobileScreen2.P.getValue(), (InputTextDelegate) upiTransferInputIdOrMobileScreen2.Q.getValue(), new IconDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferInputIdOrMobileScreen f297219b;

            {
                this.f297219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen = this.f297219b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiTransferInputIdOrMobileScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(upiTransferInputIdOrMobileScreen.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new o(((if2.f) aVar2.b()).f160865w, upiTransferInputIdOrMobileScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = UpiTransferInputIdOrMobileScreen.T;
                        return (h) ((o) upiTransferInputIdOrMobileScreen.N.getValue()).f160897h.get();
                    default:
                        KProperty[] kPropertyArr3 = UpiTransferInputIdOrMobileScreen.T;
                        UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen2 = this.f297219b;
                        return dli.f.a(upiTransferInputIdOrMobileScreen2, (h) upiTransferInputIdOrMobileScreen2.O.getValue(), v.k((TextDelegate) upiTransferInputIdOrMobileScreen2.P.getValue(), (InputTextDelegate) upiTransferInputIdOrMobileScreen2.Q.getValue(), new IconDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: wg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferInputIdOrMobileScreen f297219b;

            {
                this.f297219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen = this.f297219b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiTransferInputIdOrMobileScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(upiTransferInputIdOrMobileScreen.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new o(((if2.f) aVar2.b()).f160865w, upiTransferInputIdOrMobileScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = UpiTransferInputIdOrMobileScreen.T;
                        return (h) ((o) upiTransferInputIdOrMobileScreen.N.getValue()).f160897h.get();
                    default:
                        KProperty[] kPropertyArr3 = UpiTransferInputIdOrMobileScreen.T;
                        UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen2 = this.f297219b;
                        return dli.f.a(upiTransferInputIdOrMobileScreen2, (h) upiTransferInputIdOrMobileScreen2.O.getValue(), v.k((TextDelegate) upiTransferInputIdOrMobileScreen2.P.getValue(), (InputTextDelegate) upiTransferInputIdOrMobileScreen2.Q.getValue(), new IconDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f297223b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (wg2.h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.upi_id_mobile_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.upi_id_mobile_header_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionTextStyle(e0.CAPTION);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        largeActionButton.setLoadingButtonTag("FETCH_BENEFICIARY_BUTTON_TAG");
        ((j60.a) ((o) this.N.getValue()).d.get()).d(zhm.u.c(this.R));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new wg2.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new wg2.b(this, null, 1), 3);
        ?? r56 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).i.f121375b), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
