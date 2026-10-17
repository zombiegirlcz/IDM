package com.revolut.feature.address.common.impl.flow.validation_flow.bad_address;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetContract$InputData;
import com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qh0.d;
import qi1.a;
import te0.w;
import xki.e;
import yh1.g;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/validation_flow/bad_address/BadAddressSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lqi1/a;", "Lcli/k;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BadAddressSheetController extends BaseBottomSheetRecyclerController<a, k> {
    public static final /* synthetic */ int V = 0;
    public final BadAddressSheetContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public BadAddressSheetController(BadAddressSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        Lazy lazyY0 = w.y0(new d(13));
        this.R = lazyY0;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: qi1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BadAddressSheetController f246624b;

            {
                this.f246624b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BadAddressSheetController badAddressSheetController = this.f246624b;
                switch (i2) {
                    case 0:
                        int i3 = BadAddressSheetController.V;
                        return (b) ((yh1.g) badAddressSheetController.T.getValue()).f313717c.get();
                    default:
                        int i5 = BadAddressSheetController.V;
                        qji.b bVarU2 = badAddressSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.di.BadAddressSheetControllerInjector");
                        yh1.d dVar = (yh1.d) ((ri1.a) bVarU2);
                        yh1.e eVar = dVar.f313704c;
                        yh1.d dVar2 = dVar.d;
                        BadAddressSheetContract$InputData badAddressSheetContract$InputData = badAddressSheetController.Q;
                        badAddressSheetContract$InputData.getClass();
                        return new yh1.g(eVar, dVar2, badAddressSheetContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: qi1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BadAddressSheetController f246624b;

            {
                this.f246624b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BadAddressSheetController badAddressSheetController = this.f246624b;
                switch (i22) {
                    case 0:
                        int i3 = BadAddressSheetController.V;
                        return (b) ((yh1.g) badAddressSheetController.T.getValue()).f313717c.get();
                    default:
                        int i5 = BadAddressSheetController.V;
                        qji.b bVarU2 = badAddressSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.di.BadAddressSheetControllerInjector");
                        yh1.d dVar = (yh1.d) ((ri1.a) bVarU2);
                        yh1.e eVar = dVar.f313704c;
                        yh1.d dVar2 = dVar.d;
                        BadAddressSheetContract$InputData badAddressSheetContract$InputData = badAddressSheetController.Q;
                        badAddressSheetContract$InputData.getClass();
                        return new yh1.g(eVar, dVar2, badAddressSheetContract$InputData);
                }
            }
        });
        this.U = u.c((RowDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (qi1.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new qi1.d(this, null, 0), 3);
        ViewController.P2(this, f3(), new qi1.d(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (qi1.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.U;
    }
}
