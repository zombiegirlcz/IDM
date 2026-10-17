package msl;

import bfl.g;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import hx7.e;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static AccentCircleBadge a(g side, r0 orderType) throws Throwable {
        dw0.a aVar;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(side, "side");
        r0 r0Var = r0.LIMIT;
        if (orderType == r0Var && side == g.BUY) {
            aVar = dw0.a.OrderDownwards;
        } else if (orderType == r0Var && side == g.SELL) {
            aVar = dw0.a.OrderUpwards;
        } else {
            r0 r0Var2 = r0.STOP;
            if (orderType == r0Var2 && side == g.BUY) {
                aVar = dw0.a.OrderUpwards;
            } else if (orderType == r0Var2 && side == g.SELL) {
                aVar = dw0.a.OrderDownwards;
            } else if (orderType == r0.MARKET) {
                aVar = dw0.a.Pending;
            } else if (orderType == r0.RECURRING) {
                aVar = dw0.a.Recurring;
            } else {
                e.n(new IllegalArgumentException(" badge for " + orderType + " and " + side + " is not supported"));
                aVar = dw0.a.Pending;
            }
        }
        return new AccentCircleBadge(aVar);
    }
}
