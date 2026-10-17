package yxg;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f317684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsType f317685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f317686c;

    public e(a3 sector, WidgetisedAnalyticsType analyticsType, Data data) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        this.f317684a = sector;
        this.f317685b = analyticsType;
        this.f317686c = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f317684a == eVar.f317684a && Intrinsics.f(this.f317685b, eVar.f317685b) && Intrinsics.f(this.f317686c, eVar.f317686c);
    }

    public final int hashCode() {
        int iHashCode = (this.f317685b.hashCode() + (this.f317684a.hashCode() * 31)) * 31;
        Data data = this.f317686c;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
