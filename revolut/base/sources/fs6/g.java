package fs6;

import java.time.Month;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f137609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f137610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Month f137611c;

    public g(boolean z, b assessmentPeriod, Month month) {
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        this.f137609a = z;
        this.f137610b = assessmentPeriod;
        this.f137611c = month;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f137609a == gVar.f137609a && this.f137610b == gVar.f137610b && this.f137611c == gVar.f137611c;
    }

    public final int hashCode() {
        int iHashCode = (this.f137610b.hashCode() + (Boolean.hashCode(this.f137609a) * 31)) * 31;
        Month month = this.f137611c;
        return iHashCode + (month == null ? 0 : month.hashCode());
    }
}
