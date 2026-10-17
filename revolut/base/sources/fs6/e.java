package fs6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f137603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f137604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f137605c;

    public e(Set assessmentPeriods, b defaultAssessmentPeriod, Set additionalOptions) {
        Intrinsics.checkNotNullParameter(assessmentPeriods, "assessmentPeriods");
        Intrinsics.checkNotNullParameter(defaultAssessmentPeriod, "defaultAssessmentPeriod");
        Intrinsics.checkNotNullParameter(additionalOptions, "additionalOptions");
        this.f137603a = assessmentPeriods;
        this.f137604b = defaultAssessmentPeriod;
        this.f137605c = additionalOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f137603a, eVar.f137603a) && this.f137604b == eVar.f137604b && Intrinsics.f(this.f137605c, eVar.f137605c);
    }

    public final int hashCode() {
        return this.f137605c.hashCode() + ((this.f137604b.hashCode() + (this.f137603a.hashCode() * 31)) * 31);
    }
}
