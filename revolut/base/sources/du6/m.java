package du6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u000f"}, d2 = {"Ldu6/m;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "assessmentPeriods", "Ljava/lang/String;", "c", "defaultAssessmentPeriod", "additionalOptions", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("assessmentPeriods")
    @NotNull
    private final List<String> assessmentPeriods;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultAssessmentPeriod")
    @NotNull
    private final String defaultAssessmentPeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalOptions")
    @NotNull
    private final List<String> additionalOptions;

    public m(ArrayList assessmentPeriods, ArrayList additionalOptions, String defaultAssessmentPeriod) {
        Intrinsics.checkNotNullParameter(assessmentPeriods, "assessmentPeriods");
        Intrinsics.checkNotNullParameter(defaultAssessmentPeriod, "defaultAssessmentPeriod");
        Intrinsics.checkNotNullParameter(additionalOptions, "additionalOptions");
        this.assessmentPeriods = assessmentPeriods;
        this.defaultAssessmentPeriod = defaultAssessmentPeriod;
        this.additionalOptions = additionalOptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalOptions() {
        return this.additionalOptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAssessmentPeriods() {
        return this.assessmentPeriods;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultAssessmentPeriod() {
        return this.defaultAssessmentPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.assessmentPeriods, mVar.assessmentPeriods) && Intrinsics.f(this.defaultAssessmentPeriod, mVar.defaultAssessmentPeriod) && Intrinsics.f(this.additionalOptions, mVar.additionalOptions);
    }

    public final int hashCode() {
        return this.additionalOptions.hashCode() + p.a.c(this.assessmentPeriods.hashCode() * 31, 31, this.defaultAssessmentPeriod);
    }
}
