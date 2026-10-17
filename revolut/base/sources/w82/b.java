package w82;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import yof.d;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f295574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo9.a f295575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w80.b f295576c;
    public final ldd.b d;

    public b(d transferAmountMapper, vo9.a pocketMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f295574a = transferAmountMapper;
        this.f295575b = pocketMapper;
        this.f295576c = amountFormatter;
        this.d = focusRequesterDelegate;
    }
}
