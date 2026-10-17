package q7i;

import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static String a(OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        if (orderMode instanceof OrderMode.Market) {
            return ((OrderMode.Market) orderMode).f97228a;
        }
        if (orderMode instanceof OrderMode.Scheduling) {
            return ((OrderMode.Scheduling) orderMode).f97230b;
        }
        if ((orderMode instanceof OrderMode.Threshold) || (orderMode instanceof OrderMode.Automation)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean b(OrderMode orderMode, j8l.a sourceType, j8l.a targetType) {
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        if (pw5.a.p(sourceType) || pw5.a.p(targetType)) {
            return false;
        }
        if ((orderMode instanceof OrderMode.Market) || (orderMode instanceof OrderMode.Scheduling)) {
            return true;
        }
        if ((orderMode instanceof OrderMode.Automation) || (orderMode instanceof OrderMode.Threshold)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static OrderMode c(OrderMode orderMode, String str) {
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        if (orderMode instanceof OrderMode.Market) {
            return new OrderMode.Market(str);
        }
        if (orderMode instanceof OrderMode.Scheduling) {
            TransferScheduleData scheduleData = ((OrderMode.Scheduling) orderMode).f97229a;
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            return new OrderMode.Scheduling(scheduleData, str);
        }
        if ((orderMode instanceof OrderMode.Threshold) || (orderMode instanceof OrderMode.Automation)) {
            return orderMode;
        }
        throw new NoWhenBranchMatchedException();
    }
}
