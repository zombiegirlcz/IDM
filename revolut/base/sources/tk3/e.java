package tk3;

import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpa.b f271862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f271863b;

    public e(rpa.b verificationPushInterceptor, c otpVerificator) {
        Intrinsics.checkNotNullParameter(verificationPushInterceptor, "verificationPushInterceptor");
        Intrinsics.checkNotNullParameter(otpVerificator, "otpVerificator");
        this.f271862a = verificationPushInterceptor;
        this.f271863b = otpVerificator;
    }

    @Override // tk3.b
    public final Object a(Continuation continuation) {
        r rVarHide = this.f271862a.f256308a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r rVarTimeout = rVarHide.timeout(5000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarTimeout, "timeout(...)");
        return q.y(new t9l.f(rd0.e.b(rVarTimeout), 8), new t9h.b(this, null, 22), continuation);
    }
}
