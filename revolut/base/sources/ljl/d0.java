package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.otp.input.flow.push.bottom_dialog.OtpPushBottomSheetContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpPushBottomSheetContract$InputData f195916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f195917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f195918c;
    public final e4m.e d;
    public final e4m.e e;

    public d0(q0 q0Var, c cVar, OtpPushBottomSheetContract$InputData otpPushBottomSheetContract$InputData) {
        this.f195917b = cVar;
        this.f195916a = otpPushBottomSheetContract$InputData;
        int i = 1;
        this.f195918c = e4m.b.b(new y(this, 1, i));
        this.d = e4m.b.b(new y(this, 0, i));
        this.e = e4m.b.b(new y(this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f195917b.Q.get(), (yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f195917b.P.get());
    }
}
