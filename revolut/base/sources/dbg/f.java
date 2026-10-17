package dbg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f112747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f112748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f112749c;

    public f(g amountOwedAmendmentMapper, h newPriceAmendmentMapper, i refundAmendmentMapper) {
        Intrinsics.checkNotNullParameter(amountOwedAmendmentMapper, "amountOwedAmendmentMapper");
        Intrinsics.checkNotNullParameter(newPriceAmendmentMapper, "newPriceAmendmentMapper");
        Intrinsics.checkNotNullParameter(refundAmendmentMapper, "refundAmendmentMapper");
        this.f112747a = amountOwedAmendmentMapper;
        this.f112748b = newPriceAmendmentMapper;
        this.f112749c = refundAmendmentMapper;
    }
}
