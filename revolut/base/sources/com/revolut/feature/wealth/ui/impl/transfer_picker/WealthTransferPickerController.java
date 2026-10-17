package com.revolut.feature.wealth.ui.impl.transfer_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lw0.m;
import mkh.r;
import mkh.u;
import sdl.y;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lcom/revolut/feature/wealth/ui/impl/transfer_picker/WealthTransferPickerControllerContract$Output;", "Ltki/c;", "Lcii/b;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthTransferPickerController extends BaseBottomSheetController<WealthTransferPickerControllerContract$Output> implements tki.c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(WealthTransferPickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final snh.f N;
    public final h O;
    public final Object P;
    public final tw0.a Q;
    public final Object R;
    public final List S;
    public final Object T;
    public final Object U;

    public WealthTransferPickerController(snh.f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = s.t(this, snh.b.f);
        Lazy lazyY0 = w.y0(new y(26));
        this.P = lazyY0;
        this.Q = new tw0.a();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: snh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthTransferPickerController f264618b;

            {
                this.f264618b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthTransferPickerController wealthTransferPickerController = this.f264618b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WealthTransferPickerController.V;
                        return (d) ((r) wealthTransferPickerController.U.getValue()).f206399c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WealthTransferPickerController.V;
                        WealthTransferPickerController wealthTransferPickerController2 = this.f264618b;
                        return tki.g.a(wealthTransferPickerController2, (d) wealthTransferPickerController2.R.getValue(), wealthTransferPickerController2.S, R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WealthTransferPickerController.V;
                        phm.a aVar = (phm.a) ue0.e.j(wealthTransferPickerController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                        }
                        mkh.s sVar = ((mkh.s) ((u) aVar2.b())).l0;
                        f fVar = wealthTransferPickerController.N;
                        fVar.getClass();
                        return new r(sVar, fVar);
                }
            }
        });
        this.S = zhm.u.c((RowDelegate) lazyY0.getValue());
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: snh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthTransferPickerController f264618b;

            {
                this.f264618b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthTransferPickerController wealthTransferPickerController = this.f264618b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthTransferPickerController.V;
                        return (d) ((r) wealthTransferPickerController.U.getValue()).f206399c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WealthTransferPickerController.V;
                        WealthTransferPickerController wealthTransferPickerController2 = this.f264618b;
                        return tki.g.a(wealthTransferPickerController2, (d) wealthTransferPickerController2.R.getValue(), wealthTransferPickerController2.S, R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WealthTransferPickerController.V;
                        phm.a aVar = (phm.a) ue0.e.j(wealthTransferPickerController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                        }
                        mkh.s sVar = ((mkh.s) ((u) aVar2.b())).l0;
                        f fVar = wealthTransferPickerController.N;
                        fVar.getClass();
                        return new r(sVar, fVar);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: snh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthTransferPickerController f264618b;

            {
                this.f264618b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WealthTransferPickerController wealthTransferPickerController = this.f264618b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthTransferPickerController.V;
                        return (d) ((r) wealthTransferPickerController.U.getValue()).f206399c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WealthTransferPickerController.V;
                        WealthTransferPickerController wealthTransferPickerController2 = this.f264618b;
                        return tki.g.a(wealthTransferPickerController2, (d) wealthTransferPickerController2.R.getValue(), wealthTransferPickerController2.S, R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = WealthTransferPickerController.V;
                        phm.a aVar = (phm.a) ue0.e.j(wealthTransferPickerController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                        }
                        mkh.s sVar = ((mkh.s) ((u) aVar2.b())).l0;
                        f fVar = wealthTransferPickerController.N;
                        fVar.getClass();
                        return new r(sVar, fVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        cii.b uiState = (cii.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        m mVar = uiState.f24554b;
        i iVar = uiState.f24555c;
        this.Q.b(mVar != null, iVar != null);
        j3(new cii.a(uiState.f24554b, iVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (snh.d) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        KProperty[] kPropertyArr = V;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.O;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = ((jii.e) value).d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        this.Q.a(bottomSheetControllerBaseRecyclerView);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView2 = ((jii.e) value2).d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView2, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView2.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), new snh.c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
