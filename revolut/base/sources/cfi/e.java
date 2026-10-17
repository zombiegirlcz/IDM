package cfi;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f23702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f23703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23704c;

    public e(Period period, Period toTimeBefore, String percentageRefundable) {
        Intrinsics.checkNotNullParameter(toTimeBefore, "toTimeBefore");
        Intrinsics.checkNotNullParameter(percentageRefundable, "percentageRefundable");
        this.f23702a = period;
        this.f23703b = toTimeBefore;
        this.f23704c = percentageRefundable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f23702a, eVar.f23702a) && Intrinsics.f(this.f23703b, eVar.f23703b) && Intrinsics.f(this.f23704c, eVar.f23704c);
    }

    public final int hashCode() {
        Period period = this.f23702a;
        return this.f23704c.hashCode() + ((this.f23703b.hashCode() + ((period == null ? 0 : period.hashCode()) * 31)) * 31);
    }
}
