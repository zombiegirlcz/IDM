package lt1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;
import yof.d;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f199780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo9.a f199781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w80.b f199782c;
    public final ldd.b d;

    public c(d transferAmountMapper, vo9.a pocketMapper, o moneyPrefixFormatter, w80.b amountFormatter, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f199780a = transferAmountMapper;
        this.f199781b = pocketMapper;
        this.f199782c = amountFormatter;
        this.d = focusRequesterDelegate;
    }
}
