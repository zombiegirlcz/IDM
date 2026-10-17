package csa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.t;
import u80.o;
import yof.d;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f108460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo9.a f108461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w80.b f108462c;
    public final ldd.b d;
    public final t e;

    public b(d transferAmountMapper, vo9.a pocketMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate, t hintModelProvider) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(hintModelProvider, "hintModelProvider");
        this.f108460a = transferAmountMapper;
        this.f108461b = pocketMapper;
        this.f108462c = amountFormatter;
        this.d = focusRequesterDelegate;
        this.e = hintModelProvider;
    }
}
