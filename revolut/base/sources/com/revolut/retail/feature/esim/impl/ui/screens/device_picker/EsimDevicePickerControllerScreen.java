package com.revolut.retail.feature.esim.impl.ui.screens.device_picker;

import afj.h;
import afj.m;
import android.view.View;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreenContract$InputData;
import java.util.List;
import khj.c;
import khj.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/device_picker/EsimDevicePickerControllerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lkhj/d;", "Lkhj/c;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimDevicePickerControllerScreen extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final EsimDevicePickerControllerScreenContract$InputData Q;
    public final RowDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public EsimDevicePickerControllerScreen(EsimDevicePickerControllerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(rowDelegate, new ListSubheaderDelegate());
        this.T = w.y0(new Function0(this) { // from class: khj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimDevicePickerControllerScreen f184145b;

            {
                this.f184145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                EsimDevicePickerControllerScreen esimDevicePickerControllerScreen = this.f184145b;
                switch (i3) {
                    case 0:
                        int i5 = EsimDevicePickerControllerScreen.V;
                        qji.b bVarU2 = esimDevicePickerControllerScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.device_picker.di.EsimDevicePickerControllerScreenInjector");
                        }
                        m mVar = (m) bVarU2;
                        afj.b bVar = mVar.f4337b;
                        m mVar2 = mVar.f4338c;
                        EsimDevicePickerControllerScreenContract$InputData esimDevicePickerControllerScreenContract$InputData = esimDevicePickerControllerScreen.Q;
                        esimDevicePickerControllerScreenContract$InputData.getClass();
                        return new afj.h(bVar, mVar2, esimDevicePickerControllerScreenContract$InputData);
                    default:
                        int i6 = EsimDevicePickerControllerScreen.V;
                        return (e) ((afj.h) esimDevicePickerControllerScreen.T.getValue()).f4265c.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: khj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimDevicePickerControllerScreen f184145b;

            {
                this.f184145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EsimDevicePickerControllerScreen esimDevicePickerControllerScreen = this.f184145b;
                switch (i3) {
                    case 0:
                        int i5 = EsimDevicePickerControllerScreen.V;
                        qji.b bVarU2 = esimDevicePickerControllerScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.device_picker.di.EsimDevicePickerControllerScreenInjector");
                        }
                        m mVar = (m) bVarU2;
                        afj.b bVar = mVar.f4337b;
                        m mVar2 = mVar.f4338c;
                        EsimDevicePickerControllerScreenContract$InputData esimDevicePickerControllerScreenContract$InputData = esimDevicePickerControllerScreen.Q;
                        esimDevicePickerControllerScreenContract$InputData.getClass();
                        return new afj.h(bVar, mVar2, esimDevicePickerControllerScreenContract$InputData);
                    default:
                        int i6 = EsimDevicePickerControllerScreen.V;
                        return (e) ((afj.h) esimDevicePickerControllerScreen.T.getValue()).f4265c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (khj.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new khj.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (khj.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
