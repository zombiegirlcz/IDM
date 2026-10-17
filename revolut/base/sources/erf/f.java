package erf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6k.e f128655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6k.a f128656b;

    public f(c6k.e paymentTrackingFactory, c6k.a paymentTrackingDateFormatter) {
        Intrinsics.checkNotNullParameter(paymentTrackingFactory, "paymentTrackingFactory");
        Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter, "paymentTrackingDateFormatter");
        this.f128655a = paymentTrackingFactory;
        this.f128656b = paymentTrackingDateFormatter;
    }
}
