package com.revolut.feature.apm.multibanco.impl.ui.home.area;

import a32.g;
import a82.e;
import a82.i;
import a82.m;
import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.feature.apm.core.ui.api.R$layout;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaScreen;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import h12.d;
import h12.f;
import h12.j;
import h12.k;
import i72.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tw0.t0;
import vc.s;
import y02.c;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/home/area/MultibancoHomeAreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "La82/e;", "Ly02/c;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultibancoHomeAreaScreen extends ViewController<q> implements dli.a, c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(MultibancoHomeAreaScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenApmAreaBinding;", 0))};
    public final MultibancoHomeAreaContract$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final Object O;
    public final ApmMultibanco P;
    public final TextLocalisedClause Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public MultibancoHomeAreaScreen(MultibancoHomeAreaContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$style.UiKitTheme_Transparent;
        this.M = R$layout.screen_apm_area;
        this.N = s.t(this, i.f);
        this.O = w.y0(new g(9));
        this.P = ApmMultibanco.f61815c;
        this.Q = new TextLocalisedClause(R$string.multibanco_area_title, null, null, 14);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: a82.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoHomeAreaScreen f2007b;

            {
                this.f2007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = MultibancoHomeAreaScreen.U;
                        MultibancoHomeAreaScreen multibancoHomeAreaScreen = this.f2007b;
                        return dli.f.a(multibancoHomeAreaScreen, multibancoHomeAreaScreen.d(), d0.E0(zhm.u.c((ListSubheaderDelegate) multibancoHomeAreaScreen.O.getValue()), ((r12.g) ((y02.a) ((i72.r) multibancoHomeAreaScreen.S.getValue()).f.get())).f250889l), R$id.apmArea_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MultibancoHomeAreaScreen.U;
                        MultibancoHomeAreaScreen multibancoHomeAreaScreen2 = this.f2007b;
                        qji.b bVarU2 = multibancoHomeAreaScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.home.area.di.MultibancoHomeAreaScreenInjector");
                        i72.s sVar = (i72.s) bVarU2;
                        i72.m mVar = sVar.f159162b;
                        i72.s sVar2 = sVar.f159163c;
                        MultibancoHomeAreaContract$InputData multibancoHomeAreaContract$InputData = multibancoHomeAreaScreen2.K;
                        multibancoHomeAreaContract$InputData.getClass();
                        return new i72.r(mVar, sVar2, new ari.b(), multibancoHomeAreaScreen2, multibancoHomeAreaContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MultibancoHomeAreaScreen.U;
                        return (f) ((i72.r) this.f2007b.S.getValue()).o.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: a82.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoHomeAreaScreen f2007b;

            {
                this.f2007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MultibancoHomeAreaScreen.U;
                        MultibancoHomeAreaScreen multibancoHomeAreaScreen = this.f2007b;
                        return dli.f.a(multibancoHomeAreaScreen, multibancoHomeAreaScreen.d(), d0.E0(zhm.u.c((ListSubheaderDelegate) multibancoHomeAreaScreen.O.getValue()), ((r12.g) ((y02.a) ((i72.r) multibancoHomeAreaScreen.S.getValue()).f.get())).f250889l), R$id.apmArea_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MultibancoHomeAreaScreen.U;
                        MultibancoHomeAreaScreen multibancoHomeAreaScreen2 = this.f2007b;
                        qji.b bVarU2 = multibancoHomeAreaScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.home.area.di.MultibancoHomeAreaScreenInjector");
                        i72.s sVar = (i72.s) bVarU2;
                        i72.m mVar = sVar.f159162b;
                        i72.s sVar2 = sVar.f159163c;
                        MultibancoHomeAreaContract$InputData multibancoHomeAreaContract$InputData = multibancoHomeAreaScreen2.K;
                        multibancoHomeAreaContract$InputData.getClass();
                        return new i72.r(mVar, sVar2, new ari.b(), multibancoHomeAreaScreen2, multibancoHomeAreaContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MultibancoHomeAreaScreen.U;
                        return (f) ((i72.r) this.f2007b.S.getValue()).o.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: a82.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoHomeAreaScreen f2007b;

            {
                this.f2007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = MultibancoHomeAreaScreen.U;
                        MultibancoHomeAreaScreen multibancoHomeAreaScreen = this.f2007b;
                        return dli.f.a(multibancoHomeAreaScreen, multibancoHomeAreaScreen.d(), d0.E0(zhm.u.c((ListSubheaderDelegate) multibancoHomeAreaScreen.O.getValue()), ((r12.g) ((y02.a) ((i72.r) multibancoHomeAreaScreen.S.getValue()).f.get())).f250889l), R$id.apmArea_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MultibancoHomeAreaScreen.U;
                        MultibancoHomeAreaScreen multibancoHomeAreaScreen2 = this.f2007b;
                        qji.b bVarU2 = multibancoHomeAreaScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.home.area.di.MultibancoHomeAreaScreenInjector");
                        i72.s sVar = (i72.s) bVarU2;
                        i72.m mVar = sVar.f159162b;
                        i72.s sVar2 = sVar.f159163c;
                        MultibancoHomeAreaContract$InputData multibancoHomeAreaContract$InputData = multibancoHomeAreaScreen2.K;
                        multibancoHomeAreaContract$InputData.getClass();
                        return new i72.r(mVar, sVar2, new ari.b(), multibancoHomeAreaScreen2, multibancoHomeAreaContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MultibancoHomeAreaScreen.U;
                        return (f) ((i72.r) this.f2007b.S.getValue()).o.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.L);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ((r12.g) ((y02.a) ((r) this.S.getValue()).f.get())).Q(uiState);
    }

    @Override // y02.c
    public final void D0(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = (b) d();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        h12.g gVarC = ((u12.a) bVar.f62606t).c(event);
        if (gVarC instanceof d) {
            bVar.C1(((d) gVarC).f148447a);
            return;
        }
        if (gVarC instanceof h12.c) {
            bVar.L2(((h12.c) gVarC).f148446a);
            return;
        }
        if (gVarC instanceof h12.b) {
            bVar.K2(a82.a.AddContact);
            return;
        }
        if (gVarC instanceof h12.e) {
            bVar.C1(new TransferDestination.PaymentsSearch(WhoToTransferFilter.ApmMultibanco.f79990a, 29));
        } else if (gVarC instanceof f) {
            bVar.N2();
        } else {
            if (gVarC != null) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.M2(event.a());
        }
    }

    @Override // y02.c
    public final void D1() {
        b bVar = (b) d();
        bVar.H2(bVar.A, new a5g.h(28));
        bVar.B.k(Unit.f186387a);
    }

    @Override // y02.c
    public final void E1() {
        m2().onBackPressed();
    }

    @Override // y02.c
    public final Clause G() {
        return this.Q;
    }

    @Override // y02.c
    public final void H(Object obj2) {
        a82.a aVar = obj2 instanceof a82.a ? (a82.a) obj2 : null;
        if (aVar == null) {
            return;
        }
        ((b) d()).K2(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.S.getValue();
    }

    @Override // y02.c
    public final void T0(t clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        b bVar = (b) d();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        k kVarB = ((u12.a) bVar.f62606t).b(clickData);
        if (Intrinsics.f(kVarB, h12.i.f148450a)) {
            ((pn3.b) bVar.u).c(bVar, new a7b.r(bVar, 7));
        } else if (Intrinsics.f(kVarB, j.f148451a)) {
            bVar.l2(new m(0, bVar, null), new yi5.b(26));
        } else if (kVarB != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // y02.c
    public final void T1(Object obj2) {
        ((b) d()).L2(obj2);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = U;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.N;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView screenContentRecyclerView = ((w02.a) value).d;
        RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        screenContentRecyclerView.addItemDecoration(new t0((koi.h) adapter, false));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((w02.a) value2).f293619c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.O.getValue()).f52707c), null, new a82.j(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final a82.f d() {
        return (a82.f) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // y02.c
    public final ApmProduct l() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
