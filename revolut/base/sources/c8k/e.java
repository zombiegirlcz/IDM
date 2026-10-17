package c8k;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import yhm.j;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f22243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo9.a f22244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w80.b f22245c;
    public final ldd.b d;
    public final r10.d e;
    public final Lazy f;

    public e(yof.d transferAmountMapper, vo9.a pocketMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate, r10.d amountHintMapper) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountHintMapper, "amountHintMapper");
        this.f22243a = transferAmountMapper;
        this.f22244b = pocketMapper;
        this.f22245c = amountFormatter;
        this.d = focusRequesterDelegate;
        this.e = amountHintMapper;
        this.f = j.b(new c0d.e(24));
    }
}
