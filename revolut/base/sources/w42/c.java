package w42;

import a12.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import yof.d;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f294486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f294487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vo9.a f294488c;
    public final w80.b d;
    public final ldd.b e;

    public c(d transferAmountMapper, s apmFooterMapper, vo9.a pocketMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(apmFooterMapper, "apmFooterMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f294486a = transferAmountMapper;
        this.f294487b = apmFooterMapper;
        this.f294488c = pocketMapper;
        this.d = amountFormatter;
        this.e = focusRequesterDelegate;
    }
}
