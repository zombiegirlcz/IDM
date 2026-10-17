package ko1;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.format.DateTimeFormatter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f186203a = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static ro1.a a(TransferScheduleData scheduledData) {
        Intrinsics.checkNotNullParameter(scheduledData, "scheduledData");
        if (scheduledData.f104285a == 0) {
            return null;
        }
        switch (a.f186202a[scheduledData.f104286b.ordinal()]) {
            case 1:
                return null;
            case 2:
                return ro1.a.DAILY;
            case 3:
                return ro1.a.WEEKLY;
            case 4:
                return ro1.a.BIWEEKLY;
            case 5:
                return ro1.a.MONTHLY;
            case 6:
                return ro1.a.YEARLY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
