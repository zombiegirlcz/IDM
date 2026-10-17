package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayService f181957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b80.c f181958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final adc.c f181959c;
    public final ycc.b d;
    public final jpf.a e;

    public g0(RevolutPayService revolutPayService, d7c.d paymentInitiationRequestMapper, b80.c networkStateRepository, adc.c paymentResultMapper, ycc.b environmentProvider) {
        Intrinsics.checkNotNullParameter(revolutPayService, "revolutPayService");
        Intrinsics.checkNotNullParameter(paymentInitiationRequestMapper, "paymentInitiationRequestMapper");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(paymentResultMapper, "paymentResultMapper");
        Intrinsics.checkNotNullParameter(environmentProvider, "environmentProvider");
        this.f181957a = revolutPayService;
        this.f181958b = networkStateRepository;
        this.f181959c = paymentResultMapper;
        this.d = environmentProvider;
        this.e = new jpf.a(new k5e.k(this, 9), null, null, null, null, 62);
    }

    public final vkm.d a(String paymentToken) {
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        return rd0.e.b(te0.w.l0(m70.a.g(jpf.a.u(this.e, paymentToken, 2L), null, null, 3), this.f181958b));
    }
}
