package i4k;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f158524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo9.a f158525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w80.b f158526c;
    public final ldd.b d;
    public final r10.d e;

    public e(yof.d transferAmountMapper, vo9.a pocketMapper, u80.o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate, k creditCardInterestHintMapper, r10.d amountHintMapper) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(creditCardInterestHintMapper, "creditCardInterestHintMapper");
        Intrinsics.checkNotNullParameter(amountHintMapper, "amountHintMapper");
        this.f158524a = transferAmountMapper;
        this.f158525b = pocketMapper;
        this.f158526c = amountFormatter;
        this.d = focusRequesterDelegate;
        this.e = amountHintMapper;
    }
}
