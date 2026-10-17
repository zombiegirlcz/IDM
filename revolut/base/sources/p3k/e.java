package p3k;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f232763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo9.a f232764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w80.b f232765c;
    public final ldd.b d;
    public final kdh.b e;

    public e(yof.d transferAmountMapper, vo9.a pocketMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate, kdh.b amountHintMapper) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountHintMapper, "amountHintMapper");
        this.f232763a = transferAmountMapper;
        this.f232764b = pocketMapper;
        this.f232765c = amountFormatter;
        this.d = focusRequesterDelegate;
        this.e = amountHintMapper;
    }
}
