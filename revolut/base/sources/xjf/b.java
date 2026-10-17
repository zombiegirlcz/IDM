package xjf;

import com.revolut.feature.subscriptionscommon.impl.R$string;
import ibd.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ofm.q;
import t70.g;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private b() {
    }

    public static String a(i standingOrder, g localization) {
        Intrinsics.checkNotNullParameter(standingOrder, "standingOrder");
        Intrinsics.checkNotNullParameter(localization, "localization");
        if (q.u(standingOrder)) {
            return localization.getString(R$string.recurring_list_recurring_status);
        }
        if (q.C(standingOrder)) {
            return localization.getString(R$string.recurring_list_oneoff_status);
        }
        Intrinsics.checkNotNullParameter(standingOrder, "<this>");
        if (standingOrder.L() == null) {
            m70.a.c(t0.f186434a);
            return "";
        }
        if (jli.e.e(standingOrder.L())) {
            return localization.getString(R$string.recurring_period_quarterly);
        }
        if (jli.e.d(standingOrder.L())) {
            return localization.getString(R$string.recurring_period_monthly);
        }
        if (jli.e.f(standingOrder.L())) {
            return localization.getString(R$string.recurring_period_weekly);
        }
        if (jli.e.b(standingOrder.L())) {
            return localization.getString(R$string.recurring_period_daily);
        }
        m70.a.c(t0.f186434a);
        return "";
    }
}
