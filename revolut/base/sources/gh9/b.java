package gh9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f143890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo9.a f143891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w80.b f143892c;
    public final ldd.b d;

    public b(yof.d transferAmountMapper, vo9.a pocketMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f143890a = transferAmountMapper;
        this.f143891b = pocketMapper;
        this.f143892c = amountFormatter;
        this.d = focusRequesterDelegate;
    }
}
