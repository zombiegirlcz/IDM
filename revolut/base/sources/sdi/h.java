package sdi;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends pfe.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kdi.b f261904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tdi.h f261905n;
    public final q06.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final edi.a f261906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ua7.f f261907q;

    public h(kdi.b thresholdsBreakdownControllerExtension, tdi.h pointsPocketTransferDialogMapper, q06.l deeplinkRouter, edi.a revPointsPocketDestinationProvider, ua7.f hiddenAccountsActionsExtension) {
        Intrinsics.checkNotNullParameter(thresholdsBreakdownControllerExtension, "thresholdsBreakdownControllerExtension");
        Intrinsics.checkNotNullParameter(pointsPocketTransferDialogMapper, "pointsPocketTransferDialogMapper");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(revPointsPocketDestinationProvider, "revPointsPocketDestinationProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        this.f261904m = thresholdsBreakdownControllerExtension;
        this.f261905n = pointsPocketTransferDialogMapper;
        this.o = deeplinkRouter;
        this.f261906p = revPointsPocketDestinationProvider;
        this.f261907q = hiddenAccountsActionsExtension;
    }

    @Override // pfe.a
    public final Set Z2() {
        return y0.b(this.f261907q);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    @Override // pfe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.s r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sdi.h.b3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c3(ddi.g gVar, dj0.d dVar) {
        Pair pair;
        int i = e.f261902a[gVar.ordinal()];
        if (i == 1) {
            pair = new Pair(com.revolut.shared.feature.move_money.api.navigation.b.TARGET, Long.valueOf(dVar != null ? dVar.f115082a : 0L));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(com.revolut.shared.feature.move_money.api.navigation.b.SOURCE, 0L);
        }
        A2(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.RevPointsPocket.f104862a, (com.revolut.shared.feature.move_money.api.navigation.b) pair.f186385a, k8l.a.MOVE, ((Number) pair.f186386b).longValue(), null, SyslogConstants.LOG_LOCAL6), (Set) null, 6), null));
    }
}
