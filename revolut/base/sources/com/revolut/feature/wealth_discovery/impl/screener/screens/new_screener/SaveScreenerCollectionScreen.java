package com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.NewScreenerScreenContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.SaveScreenerCollectionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import dli.c;
import gqh.g;
import gqh.i;
import gqh.l;
import gqh.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/new_screener/SaveScreenerCollectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgqh/g;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SaveScreenerCollectionScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SaveScreenerCollectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final NewScreenerScreenContract$Input K;
    public final h L;
    public final Object M;
    public final Object N;
    public final int O;
    public final InputTextDelegate P;
    public final ReferralContactDelegate Q;
    public final GridBoxDelegate R;
    public final Object S;

    public SaveScreenerCollectionScreen(NewScreenerScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = s.t(this, l.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gqh.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SaveScreenerCollectionScreen f145743b;

            {
                this.f145743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SaveScreenerCollectionScreen saveScreenerCollectionScreen = this.f145743b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SaveScreenerCollectionScreen.T;
                        Object objU2 = saveScreenerCollectionScreen.U2();
                        joh.w wVar = objU2 instanceof joh.w ? (joh.w) objU2 : null;
                        if (wVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(saveScreenerCollectionScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            wVar = (joh.w) aVar2.b();
                        }
                        joh.w wVar2 = wVar.k;
                        NewScreenerScreenContract$Input newScreenerScreenContract$Input = saveScreenerCollectionScreen.K;
                        newScreenerScreenContract$Input.getClass();
                        return new joh.g(wVar2, newScreenerScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = SaveScreenerCollectionScreen.T;
                        return (e) ((joh.g) saveScreenerCollectionScreen.M.getValue()).f177005c.get();
                    default:
                        KProperty[] kPropertyArr3 = SaveScreenerCollectionScreen.T;
                        SaveScreenerCollectionScreen saveScreenerCollectionScreen2 = this.f145743b;
                        return dli.f.a(saveScreenerCollectionScreen2, (e) saveScreenerCollectionScreen2.N.getValue(), v.k(saveScreenerCollectionScreen2.P, saveScreenerCollectionScreen2.R), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gqh.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SaveScreenerCollectionScreen f145743b;

            {
                this.f145743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SaveScreenerCollectionScreen saveScreenerCollectionScreen = this.f145743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SaveScreenerCollectionScreen.T;
                        Object objU2 = saveScreenerCollectionScreen.U2();
                        joh.w wVar = objU2 instanceof joh.w ? (joh.w) objU2 : null;
                        if (wVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(saveScreenerCollectionScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            wVar = (joh.w) aVar2.b();
                        }
                        joh.w wVar2 = wVar.k;
                        NewScreenerScreenContract$Input newScreenerScreenContract$Input = saveScreenerCollectionScreen.K;
                        newScreenerScreenContract$Input.getClass();
                        return new joh.g(wVar2, newScreenerScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = SaveScreenerCollectionScreen.T;
                        return (e) ((joh.g) saveScreenerCollectionScreen.M.getValue()).f177005c.get();
                    default:
                        KProperty[] kPropertyArr3 = SaveScreenerCollectionScreen.T;
                        SaveScreenerCollectionScreen saveScreenerCollectionScreen2 = this.f145743b;
                        return dli.f.a(saveScreenerCollectionScreen2, (e) saveScreenerCollectionScreen2.N.getValue(), v.k(saveScreenerCollectionScreen2.P, saveScreenerCollectionScreen2.R), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.P = new InputTextDelegate(null);
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.Q = referralContactDelegate;
        this.R = new GridBoxDelegate(u.c(referralContactDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: gqh.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SaveScreenerCollectionScreen f145743b;

            {
                this.f145743b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SaveScreenerCollectionScreen saveScreenerCollectionScreen = this.f145743b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SaveScreenerCollectionScreen.T;
                        Object objU2 = saveScreenerCollectionScreen.U2();
                        joh.w wVar = objU2 instanceof joh.w ? (joh.w) objU2 : null;
                        if (wVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(saveScreenerCollectionScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            wVar = (joh.w) aVar2.b();
                        }
                        joh.w wVar2 = wVar.k;
                        NewScreenerScreenContract$Input newScreenerScreenContract$Input = saveScreenerCollectionScreen.K;
                        newScreenerScreenContract$Input.getClass();
                        return new joh.g(wVar2, newScreenerScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = SaveScreenerCollectionScreen.T;
                        return (e) ((joh.g) saveScreenerCollectionScreen.M.getValue()).f177005c.get();
                    default:
                        KProperty[] kPropertyArr3 = SaveScreenerCollectionScreen.T;
                        SaveScreenerCollectionScreen saveScreenerCollectionScreen2 = this.f145743b;
                        return dli.f.a(saveScreenerCollectionScreen2, (e) saveScreenerCollectionScreen2.N.getValue(), v.k(saveScreenerCollectionScreen2.P, saveScreenerCollectionScreen2.R), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f174545b;
        largeActionButton.setText(uiState.f145737a.f145735a);
        largeActionButton.setEnabled(uiState.f145737a.f145736b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (joh.g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (gqh.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.screener_save_header_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.P.e.f121375b), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new gqh.o(this, continuation, 0), 3);
        d3().f174545b.setLoadingButtonTag("CREATE_SCREEN_BUTTON_TAG");
        ViewController.P2(this, new g9j.q(rd0.e.b(this.Q.q()), 18), new gii.b(this, continuation, 20), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
