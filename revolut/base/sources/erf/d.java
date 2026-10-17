package erf;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f128654a;

    static {
        TimeUnit.DAYS.toMillis(2L);
        String[] elements = {"FLASH", "EBA_RT1"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        kotlin.collections.d.y0(elements);
        String[] elements2 = {"JPMORGAN", "JPMORGAN_DE", "JPMORGAN_CH", "BARCLAYS", "BARCLAYS_DE", "CREDIT_SUISSE"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        kotlin.collections.d.y0(elements2);
    }

    public d(i etaCalculator) {
        Intrinsics.checkNotNullParameter(etaCalculator, "etaCalculator");
        this.f128654a = etaCalculator;
    }
}
