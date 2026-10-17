package com.revolut.otp.input.flow.common.bottom_dialog;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheet;
import com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheetContract$InputData;
import ini.h;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nni.c;
import nni.d;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/otp/input/flow/common/bottom_dialog/OtpResendMethodsBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lnni/d;", "Lnni/c;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpResendMethodsBottomSheet extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final OtpResendMethodsBottomSheetContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public OtpResendMethodsBottomSheet(OtpResendMethodsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        Lazy lazyY0 = w.y0(new nme.c(17));
        this.R = lazyY0;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: nni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpResendMethodsBottomSheet f217683b;

            {
                this.f217683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OtpResendMethodsBottomSheet otpResendMethodsBottomSheet = this.f217683b;
                switch (i2) {
                    case 0:
                        int i3 = OtpResendMethodsBottomSheet.V;
                        qji.b bVarU2 = otpResendMethodsBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.common.bottom_dialog.di.OtpResendMethodsBottomSheetInjector");
                        ini.g gVar = (ini.g) ((oni.a) bVarU2).b().mo3808a(otpResendMethodsBottomSheet);
                        OtpResendMethodsBottomSheetContract$InputData otpResendMethodsBottomSheetContract$InputData = otpResendMethodsBottomSheet.Q;
                        switch (gVar.f162968a) {
                            case 0:
                                otpResendMethodsBottomSheetContract$InputData.getClass();
                                gVar.d = otpResendMethodsBottomSheetContract$InputData;
                                break;
                            default:
                                otpResendMethodsBottomSheetContract$InputData.getClass();
                                gVar.d = otpResendMethodsBottomSheetContract$InputData;
                                break;
                        }
                        return (h) gVar.mo3783build();
                    default:
                        int i5 = OtpResendMethodsBottomSheet.V;
                        h hVar = (h) otpResendMethodsBottomSheet.S.getValue();
                        switch (hVar.f162971a) {
                            case 0:
                                return (e) hVar.f162973c.get();
                            default:
                                return (e) hVar.f162973c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: nni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpResendMethodsBottomSheet f217683b;

            {
                this.f217683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OtpResendMethodsBottomSheet otpResendMethodsBottomSheet = this.f217683b;
                switch (i22) {
                    case 0:
                        int i3 = OtpResendMethodsBottomSheet.V;
                        qji.b bVarU2 = otpResendMethodsBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.common.bottom_dialog.di.OtpResendMethodsBottomSheetInjector");
                        ini.g gVar = (ini.g) ((oni.a) bVarU2).b().mo3808a(otpResendMethodsBottomSheet);
                        OtpResendMethodsBottomSheetContract$InputData otpResendMethodsBottomSheetContract$InputData = otpResendMethodsBottomSheet.Q;
                        switch (gVar.f162968a) {
                            case 0:
                                otpResendMethodsBottomSheetContract$InputData.getClass();
                                gVar.d = otpResendMethodsBottomSheetContract$InputData;
                                break;
                            default:
                                otpResendMethodsBottomSheetContract$InputData.getClass();
                                gVar.d = otpResendMethodsBottomSheetContract$InputData;
                                break;
                        }
                        return (h) gVar.mo3783build();
                    default:
                        int i5 = OtpResendMethodsBottomSheet.V;
                        h hVar = (h) otpResendMethodsBottomSheet.S.getValue();
                        switch (hVar.f162971a) {
                            case 0:
                                return (e) hVar.f162973c.get();
                            default:
                                return (e) hVar.f162973c.get();
                        }
                }
            }
        });
        this.U = u.c((RowDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (nni.e) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), new nni.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (nni.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
