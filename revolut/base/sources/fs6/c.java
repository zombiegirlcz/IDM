package fs6;

import java.time.Month;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f137599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Month f137600b;

    public c(b assessmentPeriod, Month month) {
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        this.f137599a = assessmentPeriod;
        this.f137600b = month;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f137599a == cVar.f137599a && this.f137600b == cVar.f137600b;
    }

    public final int hashCode() {
        int iHashCode = this.f137599a.hashCode() * 31;
        Month month = this.f137600b;
        return iHashCode + (month == null ? 0 : month.hashCode());
    }
}
