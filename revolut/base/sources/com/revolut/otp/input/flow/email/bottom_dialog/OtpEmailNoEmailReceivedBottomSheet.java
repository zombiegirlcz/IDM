package com.revolut.otp.input.flow.email.bottom_dialog;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheet;
import com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheetContract$InputData;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qni.a;
import qni.c;
import qni.d;
import qni.g;
import qni.i;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/otp/input/flow/email/bottom_dialog/OtpEmailNoEmailReceivedBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lqni/g;", "Lqni/d;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpEmailNoEmailReceivedBottomSheet extends BaseBottomSheetRecyclerController<g, d> {
    public static final /* synthetic */ int V = 0;
    public final OtpEmailNoEmailReceivedBottomSheetContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public OtpEmailNoEmailReceivedBottomSheet(OtpEmailNoEmailReceivedBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        Lazy lazyY0 = w.y0(new a(0));
        this.R = lazyY0;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: qni.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpEmailNoEmailReceivedBottomSheet f247951b;

            {
                this.f247951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OtpEmailNoEmailReceivedBottomSheet otpEmailNoEmailReceivedBottomSheet = this.f247951b;
                switch (i2) {
                    case 0:
                        int i3 = OtpEmailNoEmailReceivedBottomSheet.V;
                        qji.b bVarU2 = otpEmailNoEmailReceivedBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.email.bottom_dialog.di.OtpEmailNoEmailReceivedBottomSheetInjector");
                        ini.a aVar = (ini.a) bVarU2;
                        ini.f fVar = aVar.f162953b;
                        ini.a aVar2 = aVar.f162954c;
                        OtpEmailNoEmailReceivedBottomSheetContract$InputData otpEmailNoEmailReceivedBottomSheetContract$InputData = otpEmailNoEmailReceivedBottomSheet.Q;
                        otpEmailNoEmailReceivedBottomSheetContract$InputData.getClass();
                        return new ini.d(fVar, aVar2, otpEmailNoEmailReceivedBottomSheetContract$InputData);
                    default:
                        int i5 = OtpEmailNoEmailReceivedBottomSheet.V;
                        return (i) ((ini.d) otpEmailNoEmailReceivedBottomSheet.S.getValue()).f162961b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: qni.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpEmailNoEmailReceivedBottomSheet f247951b;

            {
                this.f247951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OtpEmailNoEmailReceivedBottomSheet otpEmailNoEmailReceivedBottomSheet = this.f247951b;
                switch (i22) {
                    case 0:
                        int i3 = OtpEmailNoEmailReceivedBottomSheet.V;
                        qji.b bVarU2 = otpEmailNoEmailReceivedBottomSheet.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.email.bottom_dialog.di.OtpEmailNoEmailReceivedBottomSheetInjector");
                        ini.a aVar = (ini.a) bVarU2;
                        ini.f fVar = aVar.f162953b;
                        ini.a aVar2 = aVar.f162954c;
                        OtpEmailNoEmailReceivedBottomSheetContract$InputData otpEmailNoEmailReceivedBottomSheetContract$InputData = otpEmailNoEmailReceivedBottomSheet.Q;
                        otpEmailNoEmailReceivedBottomSheetContract$InputData.getClass();
                        return new ini.d(fVar, aVar2, otpEmailNoEmailReceivedBottomSheetContract$InputData);
                    default:
                        int i5 = OtpEmailNoEmailReceivedBottomSheet.V;
                        return (i) ((ini.d) otpEmailNoEmailReceivedBottomSheet.S.getValue()).f162961b.get();
                }
            }
        });
        this.U = u.c((LargeActionButtonDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ini.d) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (i) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
