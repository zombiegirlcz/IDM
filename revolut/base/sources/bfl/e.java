package bfl;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f15026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f15027c;
    public final DateTime d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f15028g;

    public e(String code, DateTime tradingHoursOpen, DateTime tradingHoursClose, DateTime extendedTradingHoursOpen, DateTime extendedTradingHoursClose, DateTime defaultRecurringOpen, DateTime defaultRecurringClose) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(tradingHoursOpen, "tradingHoursOpen");
        Intrinsics.checkNotNullParameter(tradingHoursClose, "tradingHoursClose");
        Intrinsics.checkNotNullParameter(extendedTradingHoursOpen, "extendedTradingHoursOpen");
        Intrinsics.checkNotNullParameter(extendedTradingHoursClose, "extendedTradingHoursClose");
        Intrinsics.checkNotNullParameter(defaultRecurringOpen, "defaultRecurringOpen");
        Intrinsics.checkNotNullParameter(defaultRecurringClose, "defaultRecurringClose");
        this.f15025a = code;
        this.f15026b = tradingHoursOpen;
        this.f15027c = tradingHoursClose;
        this.d = extendedTradingHoursOpen;
        this.e = extendedTradingHoursClose;
        this.f = defaultRecurringOpen;
        this.f15028g = defaultRecurringClose;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f15025a, eVar.f15025a) && Intrinsics.f(this.f15026b, eVar.f15026b) && Intrinsics.f(this.f15027c, eVar.f15027c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f15028g, eVar.f15028g);
    }

    public final int hashCode() {
        return this.f15028g.hashCode() + m72.b.f(this.f, m72.b.f(this.e, m72.b.f(this.d, m72.b.f(this.f15027c, m72.b.f(this.f15026b, this.f15025a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
}
