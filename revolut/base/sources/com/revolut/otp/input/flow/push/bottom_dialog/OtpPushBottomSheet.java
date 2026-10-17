package com.revolut.otp.input.flow.push.bottom_dialog;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.flow.push.bottom_dialog.OtpPushBottomSheet;
import com.revolut.otp.input.flow.push.bottom_dialog.OtpPushBottomSheetContract$InputData;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.d0;
import ljl.q0;
import te0.w;
import ve7.i;
import vfg.m;
import vge.z1;
import vni.b;
import vni.e;
import vni.f;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/otp/input/flow/push/bottom_dialog/OtpPushBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lvni/e;", "Lvni/b;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpPushBottomSheet extends BaseBottomSheetRecyclerController<e, b> {
    public static final /* synthetic */ int V = 0;
    public final OtpPushBottomSheetContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public OtpPushBottomSheet(OtpPushBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        Lazy lazyY0 = w.y0(new i(28));
        this.R = lazyY0;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: vni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpPushBottomSheet f290811b;

            {
                this.f290811b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OtpPushBottomSheet otpPushBottomSheet = this.f290811b;
                switch (i2) {
                    case 0:
                        int i3 = OtpPushBottomSheet.V;
                        qji.b bVarU2 = otpPushBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.push.bottom_dialog.di.OtpPushBottomSheetInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        OtpPushBottomSheetContract$InputData otpPushBottomSheetContract$InputData = otpPushBottomSheet.Q;
                        otpPushBottomSheetContract$InputData.getClass();
                        return new d0(q0Var, cVar2, otpPushBottomSheetContract$InputData);
                    default:
                        int i5 = OtpPushBottomSheet.V;
                        return (f) ((d0) otpPushBottomSheet.S.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: vni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpPushBottomSheet f290811b;

            {
                this.f290811b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OtpPushBottomSheet otpPushBottomSheet = this.f290811b;
                switch (i22) {
                    case 0:
                        int i3 = OtpPushBottomSheet.V;
                        qji.b bVarU2 = otpPushBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.push.bottom_dialog.di.OtpPushBottomSheetInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        OtpPushBottomSheetContract$InputData otpPushBottomSheetContract$InputData = otpPushBottomSheet.Q;
                        otpPushBottomSheetContract$InputData.getClass();
                        return new d0(q0Var, cVar2, otpPushBottomSheetContract$InputData);
                    default:
                        int i5 = OtpPushBottomSheet.V;
                        return (f) ((d0) otpPushBottomSheet.S.getValue()).e.get();
                }
            }
        });
        this.U = u.c((CodeEditorDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) this.R.getValue()).d.f121375b), new m(this, null, 19), 3);
        ViewController.P2(this, e3(), new z1(this, null, 9), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
