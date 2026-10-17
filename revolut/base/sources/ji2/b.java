package ji2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import yof.d;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f174341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f174342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ldd.b f174343c;

    public b(d transferAmountMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f174341a = transferAmountMapper;
        this.f174342b = amountFormatter;
        this.f174343c = focusRequesterDelegate;
    }
}
