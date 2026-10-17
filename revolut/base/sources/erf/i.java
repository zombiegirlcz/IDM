package erf;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f128657b = TimeUnit.DAYS.toMillis(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f128658c;
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6k.a f128659a;

    static {
        String[] elements = {"FLASH", "EBA_RT1"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f128658c = kotlin.collections.d.y0(elements);
        String[] elements2 = {"JPMORGAN", "JPMORGAN_DE", "JPMORGAN_CH", "BARCLAYS", "BARCLAYS_DE", "CREDIT_SUISSE"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        d = kotlin.collections.d.y0(elements2);
    }

    public i(c6k.a paymentTrackingDateFormatter) {
        Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter, "paymentTrackingDateFormatter");
        this.f128659a = paymentTrackingDateFormatter;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause a(crf.b r14) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: erf.i.a(crf.b):com.revolut.core.ui_kit.models.Clause");
    }
}
