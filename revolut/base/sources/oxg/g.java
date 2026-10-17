package oxg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f230824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f230825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iwg.c f230826c;
    public final WidgetisedAnalyticsType d;

    public g(a3 sector, eel.c timeSpan, iwg.c method, WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        this.f230824a = sector;
        this.f230825b = timeSpan;
        this.f230826c = method;
        this.d = analyticsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f230824a == gVar.f230824a && this.f230825b == gVar.f230825b && this.f230826c == gVar.f230826c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + prk.o.d(this.f230826c, prk.o.c(this.f230825b, this.f230824a.hashCode() * 31, 31), 31);
    }
}
