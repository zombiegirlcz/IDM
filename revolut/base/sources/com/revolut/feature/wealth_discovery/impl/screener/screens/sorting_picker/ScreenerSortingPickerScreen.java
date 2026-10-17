package com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreenContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import dli.c;
import joh.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p73.d;
import pqc.k;
import pqh.b;
import pqh.g;
import pqh.i;
import pqh.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/sorting_picker/ScreenerSortingPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpqh/g;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerSortingPickerScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ScreenerSortingPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final ScreenerSortingPickerScreenContract$Input K;
    public final h L;
    public final SingleChoiceDelegate M;
    public final LargeActionButtonDelegate N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;

    public ScreenerSortingPickerScreen(ScreenerSortingPickerScreenContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new SingleChoiceDelegate();
        this.N = new LargeActionButtonDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: pqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerSortingPickerScreen f238776b;

            {
                this.f238776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerSortingPickerScreen screenerSortingPickerScreen = this.f238776b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerSortingPickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(screenerSortingPickerScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerSortingPickerScreenContract$Input screenerSortingPickerScreenContract$Input = screenerSortingPickerScreen.K;
                        screenerSortingPickerScreenContract$Input.getClass();
                        return new u(wVar, screenerSortingPickerScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerSortingPickerScreen.S;
                        return (n) ((u) screenerSortingPickerScreen.O.getValue()).f177063c.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerSortingPickerScreen.S;
                        ScreenerSortingPickerScreen screenerSortingPickerScreen2 = this.f238776b;
                        return dli.f.a(screenerSortingPickerScreen2, (n) screenerSortingPickerScreen2.P.getValue(), v.k(screenerSortingPickerScreen2.M, screenerSortingPickerScreen2.N), R$id.bottomSheetControllerBase_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: pqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerSortingPickerScreen f238776b;

            {
                this.f238776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerSortingPickerScreen screenerSortingPickerScreen = this.f238776b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerSortingPickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(screenerSortingPickerScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerSortingPickerScreenContract$Input screenerSortingPickerScreenContract$Input = screenerSortingPickerScreen.K;
                        screenerSortingPickerScreenContract$Input.getClass();
                        return new u(wVar, screenerSortingPickerScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerSortingPickerScreen.S;
                        return (n) ((u) screenerSortingPickerScreen.O.getValue()).f177063c.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerSortingPickerScreen.S;
                        ScreenerSortingPickerScreen screenerSortingPickerScreen2 = this.f238776b;
                        return dli.f.a(screenerSortingPickerScreen2, (n) screenerSortingPickerScreen2.P.getValue(), v.k(screenerSortingPickerScreen2.M, screenerSortingPickerScreen2.N), R$id.bottomSheetControllerBase_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.Q = R$layout.screen_bottom_sheet_base;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: pqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerSortingPickerScreen f238776b;

            {
                this.f238776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerSortingPickerScreen screenerSortingPickerScreen = this.f238776b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerSortingPickerScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(screenerSortingPickerScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerSortingPickerScreenContract$Input screenerSortingPickerScreenContract$Input = screenerSortingPickerScreen.K;
                        screenerSortingPickerScreenContract$Input.getClass();
                        return new u(wVar, screenerSortingPickerScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerSortingPickerScreen.S;
                        return (n) ((u) screenerSortingPickerScreen.O.getValue()).f177063c.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerSortingPickerScreen.S;
                        ScreenerSortingPickerScreen screenerSortingPickerScreen2 = this.f238776b;
                        return dli.f.a(screenerSortingPickerScreen2, (n) screenerSortingPickerScreen2.P.getValue(), v.k(screenerSortingPickerScreen2.M, screenerSortingPickerScreen2.N), R$id.bottomSheetControllerBase_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.screener_results_sorting_title, null, null, 14);
        KProperty[] kPropertyArr = S;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.L;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.e) value).f174514c.setHeaderModel(new lw0.a(textLocalisedClause, null, null, null, false, 30));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = ((jii.e) value2).d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new d(rd0.e.b(this.M.p()), 22), new k(this, null, 2), 3);
        ViewController.P2(this, new d(rd0.e.b(this.N.d.f121375b), 23), new pnb.b(this, null, 5), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
