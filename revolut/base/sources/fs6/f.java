package fs6;

import java.time.Month;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f137607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Month f137608c;

    public f(String vatReminderId, b assessmentPeriod, Month month) {
        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        this.f137606a = vatReminderId;
        this.f137607b = assessmentPeriod;
        this.f137608c = month;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137606a, fVar.f137606a) && this.f137607b == fVar.f137607b && this.f137608c == fVar.f137608c;
    }

    public final int hashCode() {
        int iHashCode = (this.f137607b.hashCode() + (this.f137606a.hashCode() * 31)) * 31;
        Month month = this.f137608c;
        return iHashCode + (month == null ? 0 : month.hashCode());
    }
}
