package q6i;

import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f242640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ldd.b f242641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mdd.b f242642c;
    public final MoveMoneyInputData d;
    public final boolean e;

    public x(w80.b amountFormatter, u80.o moneyPrefixFormatter, ldd.b focusRequesterDelegate, mdd.b inputChangeRequestDelegate, o dualAmountHintMapper, MoveMoneyInputData inputData) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(inputChangeRequestDelegate, "inputChangeRequestDelegate");
        Intrinsics.checkNotNullParameter(dualAmountHintMapper, "dualAmountHintMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f242640a = amountFormatter;
        this.f242641b = focusRequesterDelegate;
        this.f242642c = inputChangeRequestDelegate;
        this.d = inputData;
        this.e = inputData.f104835c.contains(MoveMoneyInputData.ExtraConfiguration.LockAmount.f104838a);
    }

    public static long b(b6i.l lVar, b6i.j jVar) {
        int i = w.f242638a[lVar.ordinal()];
        if (i == 1) {
            int i2 = w.f242639b[jVar.ordinal()];
            if (i2 == 1) {
                return -1L;
            }
            if (i2 == 2) {
                return 1L;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = w.f242639b[jVar.ordinal()];
        if (i3 == 1) {
            return 1L;
        }
        if (i3 == 2) {
            return -1L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04fa A[PHI: r9
      0x04fa: PHI (r9v3 bw0.m) = (r9v2 bw0.m), (r9v5 bw0.m) binds: [B:202:0x0484, B:206:0x04f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ip0.i0 a(s6i.e r45, b6i.j r46, b6i.j r47, b6i.l r48, boolean r49, int r50, int r51, java.lang.String r52) {
        /*
            Method dump skipped, instruction units count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6i.x.a(s6i.e, b6i.j, b6i.j, b6i.l, boolean, int, int, java.lang.String):ip0.i0");
    }
}
