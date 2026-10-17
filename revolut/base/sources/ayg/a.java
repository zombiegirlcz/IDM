package ayg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n2l.b;
import n2l.c;
import n2l.d;
import n2l.e;
import n2l.f;
import n2l.g;
import n2l.h;
import n2l.i;
import n2l.j;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final j a(WidgetisedAnalyticsType widgetisedAnalyticsType) {
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsType, "<this>");
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Brokerage) {
            return i.f211591a;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) {
            return e.f211587a;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Isa) {
            return d.f211586a;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Jisa) {
            WidgetisedAnalyticsType.Jisa jisa = (WidgetisedAnalyticsType.Jisa) widgetisedAnalyticsType;
            return jisa.d ? g.f211589a : new c(jisa.f95150b);
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Pea) {
            return f.f211588a;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Commodities) {
            return b.f211584a;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Robo) {
            return h.f211590a;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Cfd) {
            return n2l.a.f211583a;
        }
        if ((widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Crypto)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
