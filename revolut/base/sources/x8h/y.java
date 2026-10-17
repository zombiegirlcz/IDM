package x8h;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f303401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2f.a f303402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f303403c;
    public final rul.e d;

    public y(q investTransactionsInteractor, y2f.a tradingTransactionsInteractor, gte.a featureToggleInteractor, rul.e investTransactionsPaginationInteractor) {
        Intrinsics.checkNotNullParameter(investTransactionsInteractor, "investTransactionsInteractor");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(investTransactionsPaginationInteractor, "investTransactionsPaginationInteractor");
        this.f303401a = investTransactionsInteractor;
        this.f303402b = tradingTransactionsInteractor;
        this.f303403c = featureToggleInteractor;
        this.d = investTransactionsPaginationInteractor;
    }

    /* JADX WARN: Path cross not found for [B:23:0x007f, B:29:0x0095], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:29:0x0095, B:25:0x0085], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:30:0x0097, B:28:0x0093], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:21:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x8h.y r9, tzg.d r10, e0h.a r11, java.util.List r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8h.y.a(x8h.y, tzg.d, e0h.a, java.util.List, gim.c):java.lang.Object");
    }

    public static s b(e0h.a aVar, List list) {
        Instant instantOfEpochMilli;
        if (aVar != null) {
            instantOfEpochMilli = aVar.d;
        } else {
            dfl.i0 i0Var = (dfl.i0) zhm.d0.o0(list);
            instantOfEpochMilli = i0Var != null ? Instant.ofEpochMilli(ofm.q.o(i0Var)) : null;
        }
        if (instantOfEpochMilli == null) {
            return null;
        }
        Instant instantMinus = instantOfEpochMilli.minus(90L, (TemporalUnit) ChronoUnit.DAYS);
        Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
        return new s(instantOfEpochMilli, instantMinus);
    }
}
