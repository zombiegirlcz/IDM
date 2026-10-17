package kp7;

import com.youTransactor.uCube.rpc.Constants;
import java.time.YearMonth;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ YearMonth f188194b;

    public /* synthetic */ q(YearMonth yearMonth, int i) {
        this.f188193a = i;
        this.f188194b = yearMonth;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f188193a) {
            case 0:
                j updateState = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j.a(updateState, null, null, null, null, this.f188194b, LDSFile.EF_DG15_TAG);
            case 1:
                com.revolut.feature.rev_points.impl.ui.transactions.list.b update = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                q0c.l lVar = update instanceof q0c.l ? (q0c.l) update : null;
                return lVar != null ? q0c.l.a(lVar, null, null, null, null, false, null, null, this.f188194b, false, false, 895) : update;
            case 2:
                com.revolut.feature.rev_points.impl.ui.transactions.list.b update2 = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return update2 instanceof q0c.l ? q0c.l.a((q0c.l) update2, null, null, null, null, false, null, this.f188194b, null, false, false, 959) : update2;
            case 3:
                com.revolut.feature.rev_points.impl.ui.transactions.list.b update3 = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return update3 instanceof q0c.l ? q0c.l.a((q0c.l) update3, null, null, null, null, false, null, this.f188194b, null, true, false, 703) : update3;
            case 4:
                qgf.h update4 = (qgf.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return qgf.h.a(update4, null, this.f188194b, false, null, false, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            default:
                qgf.h update5 = (qgf.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return qgf.h.a(update5, null, this.f188194b, false, null, false, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
    }
}
