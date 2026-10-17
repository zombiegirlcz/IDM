package usb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f282883a;

    public p(l80.e dateProvider, yof.d bankTransferMapper, u periodClauseMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(bankTransferMapper, "bankTransferMapper");
        Intrinsics.checkNotNullParameter(periodClauseMapper, "periodClauseMapper");
        this.f282883a = dateProvider;
    }
}
