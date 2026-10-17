package com.revolut.feature.vaults.impl.ui.details.spare_change.kompot;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreen;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import iqg.c;
import iqg.d;
import iqg.f;
import iqg.i;
import iqg.k;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wpg.j;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/details/spare_change/kompot/SpareChangeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Liqg/k;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpareChangeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SpareChangeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final SpareChangeScreenContract$InputData K;
    public final int L;
    public final h M;
    public final ActionsDelegate N;
    public final TwinHorizontalButtonDelegate O;
    public final LargeActionButtonDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public SpareChangeScreen(SpareChangeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, iqg.b.f);
        this.N = new ActionsDelegate();
        this.O = new TwinHorizontalButtonDelegate();
        this.P = new LargeActionButtonDelegate();
        this.Q = new FullScreenStateDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: iqg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpareChangeScreen f167837b;

            {
                this.f167837b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SpareChangeScreen spareChangeScreen = this.f167837b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SpareChangeScreen.U;
                        SpareChangeScreen spareChangeScreen2 = this.f167837b;
                        return dli.f.a(spareChangeScreen2, spareChangeScreen2.R2(), v.k(spareChangeScreen2.N, spareChangeScreen2.P, spareChangeScreen2.O, spareChangeScreen2.Q, new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SpareChangeScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(spareChangeScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        SpareChangeScreenContract$InputData spareChangeScreenContract$InputData = spareChangeScreen.K;
                        spareChangeScreenContract$InputData.getClass();
                        return new wpg.j(lVar, spareChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SpareChangeScreen.U;
                        return (i) ((wpg.j) spareChangeScreen.S.getValue()).f299273c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: iqg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpareChangeScreen f167837b;

            {
                this.f167837b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SpareChangeScreen spareChangeScreen = this.f167837b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SpareChangeScreen.U;
                        SpareChangeScreen spareChangeScreen2 = this.f167837b;
                        return dli.f.a(spareChangeScreen2, spareChangeScreen2.R2(), v.k(spareChangeScreen2.N, spareChangeScreen2.P, spareChangeScreen2.O, spareChangeScreen2.Q, new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SpareChangeScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(spareChangeScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        SpareChangeScreenContract$InputData spareChangeScreenContract$InputData = spareChangeScreen.K;
                        spareChangeScreenContract$InputData.getClass();
                        return new wpg.j(lVar, spareChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SpareChangeScreen.U;
                        return (i) ((wpg.j) spareChangeScreen.S.getValue()).f299273c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: iqg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpareChangeScreen f167837b;

            {
                this.f167837b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SpareChangeScreen spareChangeScreen = this.f167837b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SpareChangeScreen.U;
                        SpareChangeScreen spareChangeScreen2 = this.f167837b;
                        return dli.f.a(spareChangeScreen2, spareChangeScreen2.R2(), v.k(spareChangeScreen2.N, spareChangeScreen2.P, spareChangeScreen2.O, spareChangeScreen2.Q, new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SpareChangeScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(spareChangeScreen.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                        }
                        wpg.l lVar = ((wpg.l) aVar2.b()).F;
                        SpareChangeScreenContract$InputData spareChangeScreenContract$InputData = spareChangeScreen.K;
                        spareChangeScreenContract$InputData.getClass();
                        return new wpg.j(lVar, spareChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SpareChangeScreen.U;
                        return (i) ((wpg.j) spareChangeScreen.S.getValue()).f299273c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f167844a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51611c.f121375b), null, new c(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new iqg.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
