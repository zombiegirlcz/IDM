package mw4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f209335a;

    public i(nw4.d validator, o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f209335a = amountFormatter;
    }
}
