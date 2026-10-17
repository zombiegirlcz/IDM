package g57;

import java.time.Month;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fs6.b f140671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Month f140672c;

    public g(boolean z, fs6.b selectedAssessmentPeriod, Month month) {
        Intrinsics.checkNotNullParameter(selectedAssessmentPeriod, "selectedAssessmentPeriod");
        this.f140670a = z;
        this.f140671b = selectedAssessmentPeriod;
        this.f140672c = month;
    }

    public static g a(g gVar, boolean z, fs6.b selectedAssessmentPeriod, Month month, int i) {
        if ((i & 1) != 0) {
            z = gVar.f140670a;
        }
        if ((i & 2) != 0) {
            selectedAssessmentPeriod = gVar.f140671b;
        }
        if ((i & 4) != 0) {
            month = gVar.f140672c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(selectedAssessmentPeriod, "selectedAssessmentPeriod");
        return new g(z, selectedAssessmentPeriod, month);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f140670a == gVar.f140670a && this.f140671b == gVar.f140671b && this.f140672c == gVar.f140672c;
    }

    public final int hashCode() {
        int iHashCode = (this.f140671b.hashCode() + (Boolean.hashCode(this.f140670a) * 31)) * 31;
        Month month = this.f140672c;
        return iHashCode + (month == null ? 0 : month.hashCode());
    }
}
