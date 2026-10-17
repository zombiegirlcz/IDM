package vni;

import cli.y;
import com.revolut.otp.input.flow.push.bottom_dialog.OtpPushBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vfg.m;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends h implements dli.b {
    public final OtpPushBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xni.f f290817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f290818q;

    public f(OtpPushBottomSheetContract$InputData inputData, xni.f otpPushDisplayControllerModelExtension, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(otpPushDisplayControllerModelExtension, "otpPushDisplayControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f290817p = otpPushDisplayControllerModelExtension;
        this.f290818q = mra.d.b(this, new b("", false, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, (j2) ((xni.g) this.f290817p).f307512m.f22677a, null, null, new m(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f290818q;
    }
}
