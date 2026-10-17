package eq9;

import cq9.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f128410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f128411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ldd.b f128412c;

    public c(w80.b amountFormatter, g inputData, o moneyPrefixFormatter, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f128410a = amountFormatter;
        this.f128411b = inputData;
        this.f128412c = focusRequesterDelegate;
    }
}
