package com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.scanning;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.R$id;
import com.revolut.feature.acquiring.card_reader.ui.impl.R$layout;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.scanning.ScanningCardReadersScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import sc1.e;
import sc1.g;
import sc1.h;
import sc1.j;
import sc1.l;
import sji.b;
import te0.w;
import vb1.c;
import vc.s;
import xb1.p;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/scanning/ScanningCardReadersScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Lsc1/h;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lsc1/e;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScanningCardReadersScreen extends BaseRxRecyclerViewScreen<h, IOData$EmptyInput, e> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60658e0 = {o0.f186429a.j(new h0(ScanningCardReadersScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/card_reader/ui/impl/databinding/ScreenScanningCardReadersBinding;", 0))};
    public final int X;
    public final int Y;
    public final ao.h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f60659a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f60660b0;
    public final RowDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f60661d0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/card_reader/ui/impl/databinding/ScreenScanningCardReadersBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.scanningCardReadersScreen_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.scanningCardReadersScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new c((ControllerContainerConstraintLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ScanningCardReadersScreen() {
        super(IOData$EmptyInput.f98299a);
        this.X = R$layout.screen_scanning_card_readers;
        this.Y = R$id.scanningCardReadersScreen_recyclerView;
        this.Z = s.t(this, a.f);
        final int i = 0;
        this.f60659a0 = w.y0(new Function0(this) { // from class: sc1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScanningCardReadersScreen f261602b;

            {
                this.f261602b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScanningCardReadersScreen scanningCardReadersScreen = this.f261602b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScanningCardReadersScreen.f60658e0;
                        qji.b bVarQ2 = scanningCardReadersScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.scanning.di.ScanningCardReadersScreenInjector");
                        p pVar = ((xb1.h) bVarQ2).f303929b;
                        xb1.s sVar = new xb1.s();
                        sVar.f303965a = e4m.b.b(new xb1.m(pVar, sVar, 1, 3));
                        sVar.f303966b = e4m.b.b(new xb1.m(pVar, sVar, 0, 3));
                        return sVar;
                    default:
                        KProperty[] kPropertyArr2 = ScanningCardReadersScreen.f60658e0;
                        return (g) ((xb1.s) scanningCardReadersScreen.f60659a0.getValue()).f303966b.get();
                }
            }
        });
        final int i2 = 1;
        this.f60660b0 = w.y0(new Function0(this) { // from class: sc1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScanningCardReadersScreen f261602b;

            {
                this.f261602b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScanningCardReadersScreen scanningCardReadersScreen = this.f261602b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScanningCardReadersScreen.f60658e0;
                        qji.b bVarQ2 = scanningCardReadersScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.scanning.di.ScanningCardReadersScreenInjector");
                        p pVar = ((xb1.h) bVarQ2).f303929b;
                        xb1.s sVar = new xb1.s();
                        sVar.f303965a = e4m.b.b(new xb1.m(pVar, sVar, 1, 3));
                        sVar.f303966b = e4m.b.b(new xb1.m(pVar, sVar, 0, 3));
                        return sVar;
                    default:
                        KProperty[] kPropertyArr2 = ScanningCardReadersScreen.f60658e0;
                        return (g) ((xb1.s) scanningCardReadersScreen.f60659a0.getValue()).f303966b.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.c0 = rowDelegate;
        this.f60661d0 = v.k(rowDelegate, new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        h uiState = (h) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.Z.getValue(this, f60658e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((c) value).f287356b.setMenuItems(uiState.f261611c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (xb1.s) this.f60659a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f60660b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        if (i == 55) {
            ?? r3 = this.f60660b0;
            if (i2 == -1) {
                l lVar = (l) ((g) r3.getValue());
                lVar.getClass();
                lVar.D2(true);
            } else {
                l lVar2 = (l) ((g) r3.getValue());
                lVar2.getClass();
                lVar2.C2(new j(lVar2, 5));
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.Z.getValue(this, f60658e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((c) value).f287356b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.merchant_card_reader_flow_scanning_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.merchant_card_reader_flow_scanning_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        final int i = 1;
        BaseRxRecyclerViewScreen.g3(this, navBarWithToolbar.o.f57403b, new Function1(this) { // from class: sc1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScanningCardReadersScreen f261604b;

            {
                this.f261604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                ScanningCardReadersScreen scanningCardReadersScreen = this.f261604b;
                switch (i2) {
                    case 0:
                        RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g gVar = (g) scanningCardReadersScreen.f60660b0.getValue();
                        Object obj3 = it8.u;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice");
                        CardReaderDevice cardReaderDevice = (CardReaderDevice) obj3;
                        l lVar = (l) gVar;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(cardReaderDevice, "cardReaderDevice");
                        ea1.b.a("Selected card reader=name=" + cardReaderDevice.getName() + ", address=" + cardReaderDevice.getAddress(), fa1.k.INFO);
                        cji.d dVar = lVar.C;
                        Boolean bool = Boolean.FALSE;
                        dVar.d(bool);
                        lVar.D.d(bool);
                        lVar.v2(new f(cardReaderDevice));
                        return Unit.f186387a;
                    case 1:
                        KProperty[] kPropertyArr2 = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter((String) obj2, "it");
                        l controllerModel = (l) ((g) scanningCardReadersScreen.f60660b0.getValue());
                        controllerModel.z.getClass();
                        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                        throw new IllegalStateException("Feedback is not supported in Retail app");
                    default:
                        KProperty[] kPropertyArr3 = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        scanningCardReadersScreen.m2().onBackPressed();
                        return Unit.f186387a;
                }
            }
        });
        final int i2 = 2;
        BaseRxRecyclerViewScreen.g3(this, navBarWithToolbar.f59410q, new Function1(this) { // from class: sc1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScanningCardReadersScreen f261604b;

            {
                this.f261604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                ScanningCardReadersScreen scanningCardReadersScreen = this.f261604b;
                switch (i22) {
                    case 0:
                        RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g gVar = (g) scanningCardReadersScreen.f60660b0.getValue();
                        Object obj3 = it8.u;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice");
                        CardReaderDevice cardReaderDevice = (CardReaderDevice) obj3;
                        l lVar = (l) gVar;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(cardReaderDevice, "cardReaderDevice");
                        ea1.b.a("Selected card reader=name=" + cardReaderDevice.getName() + ", address=" + cardReaderDevice.getAddress(), fa1.k.INFO);
                        cji.d dVar = lVar.C;
                        Boolean bool = Boolean.FALSE;
                        dVar.d(bool);
                        lVar.D.d(bool);
                        lVar.v2(new f(cardReaderDevice));
                        return Unit.f186387a;
                    case 1:
                        KProperty[] kPropertyArr2 = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter((String) obj2, "it");
                        l controllerModel = (l) ((g) scanningCardReadersScreen.f60660b0.getValue());
                        controllerModel.z.getClass();
                        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                        throw new IllegalStateException("Feedback is not supported in Retail app");
                    default:
                        KProperty[] kPropertyArr3 = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        scanningCardReadersScreen.m2().onBackPressed();
                        return Unit.f186387a;
                }
            }
        });
        final int i3 = 0;
        BaseRxRecyclerViewScreen.g3(this, this.c0.f53218h, new Function1(this) { // from class: sc1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScanningCardReadersScreen f261604b;

            {
                this.f261604b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                ScanningCardReadersScreen scanningCardReadersScreen = this.f261604b;
                switch (i22) {
                    case 0:
                        RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g gVar = (g) scanningCardReadersScreen.f60660b0.getValue();
                        Object obj3 = it8.u;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice");
                        CardReaderDevice cardReaderDevice = (CardReaderDevice) obj3;
                        l lVar = (l) gVar;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(cardReaderDevice, "cardReaderDevice");
                        ea1.b.a("Selected card reader=name=" + cardReaderDevice.getName() + ", address=" + cardReaderDevice.getAddress(), fa1.k.INFO);
                        cji.d dVar = lVar.C;
                        Boolean bool = Boolean.FALSE;
                        dVar.d(bool);
                        lVar.D.d(bool);
                        lVar.v2(new f(cardReaderDevice));
                        return Unit.f186387a;
                    case 1:
                        KProperty[] kPropertyArr2 = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter((String) obj2, "it");
                        l controllerModel = (l) ((g) scanningCardReadersScreen.f60660b0.getValue());
                        controllerModel.z.getClass();
                        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                        throw new IllegalStateException("Feedback is not supported in Retail app");
                    default:
                        KProperty[] kPropertyArr3 = ScanningCardReadersScreen.f60658e0;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        scanningCardReadersScreen.m2().onBackPressed();
                        return Unit.f186387a;
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        h uiState = (h) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.Z.getValue(this, f60658e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((c) value).f287356b.setMenuItems(uiState.f261611c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78908e0() {
        return this.f60661d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.X;
    }
}
