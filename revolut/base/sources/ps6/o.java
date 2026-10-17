package ps6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f239425c;
    public final LocalDate d;

    public o(String vatReminderId, String assessmentPeriod, k summary, LocalDate nextVatReturnDueDate) {
        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(nextVatReturnDueDate, "nextVatReturnDueDate");
        this.f239423a = vatReminderId;
        this.f239424b = assessmentPeriod;
        this.f239425c = summary;
        this.d = nextVatReturnDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f239423a, oVar.f239423a) && Intrinsics.f(this.f239424b, oVar.f239424b) && Intrinsics.f(this.f239425c, oVar.f239425c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f239425c.hashCode() + p.a.c(this.f239423a.hashCode() * 31, 31, this.f239424b)) * 31);
    }
}
