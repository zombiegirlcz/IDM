package com.revolut.feature.apm.bills.billers.impl.ui.chooser;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.billers.api.navigation.BillersChooserNavigation$InputData;
import com.revolut.feature.apm.bills.billers.impl.ui.chooser.BillersChooserScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dm1.h;
import jii.m;
import kae.d;
import kl7.w0;
import km1.b;
import km1.c;
import km1.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/billers/impl/ui/chooser/BillersChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldm1/h;", "Ldli/a;", "Lkm1/f;", "Lno/d1;", "feature_apm_bills_billers_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillersChooserScreen extends ViewController<h> implements a, d1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BillersChooserScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final BillersChooserNavigation$InputData K;
    public final boolean L;
    public final int M;
    public final Object N;
    public final ao.h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public BillersChooserScreen(BillersChooserNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: km1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillersChooserScreen f185668b;

            {
                this.f185668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BillersChooserScreen billersChooserScreen = this.f185668b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BillersChooserScreen.S;
                        return (e) ((hm1.f) billersChooserScreen.R.getValue()).f153506g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BillersChooserScreen.S;
                        BillersChooserScreen billersChooserScreen2 = this.f185668b;
                        return dli.f.a(billersChooserScreen2, (e) billersChooserScreen2.N.getValue(), v.k(new FullScreenStateDelegate(), (RowDelegate) billersChooserScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BillersChooserScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(billersChooserScreen.m2()).a().get(hm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm1.d.class, " is not found"));
                        }
                        hm1.d dVar = ((hm1.d) aVar2.b()).f153500c;
                        BillersChooserNavigation$InputData billersChooserNavigation$InputData = billersChooserScreen.K;
                        billersChooserNavigation$InputData.getClass();
                        return new hm1.f(dVar, billersChooserScreen, billersChooserNavigation$InputData);
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new w0(6));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: km1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillersChooserScreen f185668b;

            {
                this.f185668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BillersChooserScreen billersChooserScreen = this.f185668b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BillersChooserScreen.S;
                        return (e) ((hm1.f) billersChooserScreen.R.getValue()).f153506g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BillersChooserScreen.S;
                        BillersChooserScreen billersChooserScreen2 = this.f185668b;
                        return dli.f.a(billersChooserScreen2, (e) billersChooserScreen2.N.getValue(), v.k(new FullScreenStateDelegate(), (RowDelegate) billersChooserScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BillersChooserScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(billersChooserScreen.m2()).a().get(hm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm1.d.class, " is not found"));
                        }
                        hm1.d dVar = ((hm1.d) aVar2.b()).f153500c;
                        BillersChooserNavigation$InputData billersChooserNavigation$InputData = billersChooserScreen.K;
                        billersChooserNavigation$InputData.getClass();
                        return new hm1.f(dVar, billersChooserScreen, billersChooserNavigation$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: km1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillersChooserScreen f185668b;

            {
                this.f185668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BillersChooserScreen billersChooserScreen = this.f185668b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BillersChooserScreen.S;
                        return (e) ((hm1.f) billersChooserScreen.R.getValue()).f153506g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BillersChooserScreen.S;
                        BillersChooserScreen billersChooserScreen2 = this.f185668b;
                        return dli.f.a(billersChooserScreen2, (e) billersChooserScreen2.N.getValue(), v.k(new FullScreenStateDelegate(), (RowDelegate) billersChooserScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BillersChooserScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(billersChooserScreen.m2()).a().get(hm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hm1.d.class, " is not found"));
                        }
                        hm1.d dVar = ((hm1.d) aVar2.b()).f153500c;
                        BillersChooserNavigation$InputData billersChooserNavigation$InputData = billersChooserScreen.K;
                        billersChooserNavigation$InputData.getClass();
                        return new hm1.f(dVar, billersChooserScreen, billersChooserNavigation$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitleVisible(true);
        TextLocalisedClause textLocalisedClause = uiState.f185673b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHint(uiState.f185674c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hm1.f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (km1.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTag("BILLERS_RECYCLER_TAG");
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), null, new d(this, continuation, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new k22.c(this, continuation, 27), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
