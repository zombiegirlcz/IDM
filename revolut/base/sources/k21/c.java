package k21;

import com.revolut.data.otp.DebugOtpService;
import efm.d0;
import efm.k;
import jyk.g0;
import k1g.n;
import kotlin.jvm.internal.Intrinsics;
import rfm.h;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebugOtpService f180300a;

    public c(DebugOtpService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f180300a = service;
    }

    public final k a(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        od0.a aVar = od0.a.f224253a;
        if (!od0.a.e()) {
            h hVar = h.f253943a;
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        d0<a> otp = this.f180300a.getOtp(phone);
        g0 g0Var = new g0(new n(3), 16);
        otp.getClass();
        k kVarW = new i(otp, g0Var, 1).w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
        return w.h0(kVarW);
    }
}
