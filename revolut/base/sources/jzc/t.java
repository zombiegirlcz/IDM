package jzc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0013\u0010\u001dR\u001a\u0010 \u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u000e\u0010\u001dR\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0004R\u001a\u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0006\u0010'¨\u0006)"}, d2 = {"Ljzc/t;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "f", "()J", "reviewStartDate", "b", "e", "reviewEndDate", "c", "Ljava/lang/String;", "defaultCurrency", "", "Ljzc/p;", "d", "Ljava/util/List;", "getQuestionTypes", "()Ljava/util/List;", "questionTypes", "h", "totalTopup", "", "Z", "g", "()Z", "submissionExists", "hasEnoughTopUp", "hasEnoughDeclaredTopUp", "i", "getDeclaredTotalTopup", "declaredTotalTopup", "", "j", "I", "()I", "declaredTotalTopUpInPercentage", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("reviewStartDate")
    private final long reviewStartDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reviewEndDate")
    private final long reviewEndDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultCurrency")
    @NotNull
    private final String defaultCurrency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("questionTypes")
    @NotNull
    private final List<p> questionTypes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalTopup")
    @NotNull
    private final String totalTopup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("submissionExists")
    private final boolean submissionExists;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasEnoughTopup")
    private final boolean hasEnoughTopUp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasEnoughDeclaredTopup")
    private final boolean hasEnoughDeclaredTopUp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("declaredTotalTopup")
    @NotNull
    private final String declaredTotalTopup;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("declaredTotalTopupInPercentage")
    private final int declaredTotalTopUpInPercentage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDeclaredTotalTopUpInPercentage() {
        return this.declaredTotalTopUpInPercentage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultCurrency() {
        return this.defaultCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasEnoughDeclaredTopUp() {
        return this.hasEnoughDeclaredTopUp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasEnoughTopUp() {
        return this.hasEnoughTopUp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getReviewEndDate() {
        return this.reviewEndDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.reviewStartDate == tVar.reviewStartDate && this.reviewEndDate == tVar.reviewEndDate && Intrinsics.f(this.defaultCurrency, tVar.defaultCurrency) && Intrinsics.f(this.questionTypes, tVar.questionTypes) && Intrinsics.f(this.totalTopup, tVar.totalTopup) && this.submissionExists == tVar.submissionExists && this.hasEnoughTopUp == tVar.hasEnoughTopUp && this.hasEnoughDeclaredTopUp == tVar.hasEnoughDeclaredTopUp && Intrinsics.f(this.declaredTotalTopup, tVar.declaredTotalTopup) && this.declaredTotalTopUpInPercentage == tVar.declaredTotalTopUpInPercentage;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getReviewStartDate() {
        return this.reviewStartDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSubmissionExists() {
        return this.submissionExists;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTotalTopup() {
        return this.totalTopup;
    }

    public final int hashCode() {
        return Integer.hashCode(this.declaredTotalTopUpInPercentage) + p.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.d(p.a.c(a0.d.c(Long.hashCode(this.reviewStartDate) * 31, 31, this.reviewEndDate), 31, this.defaultCurrency), 31, this.questionTypes), 31, this.totalTopup), 31, this.submissionExists), 31, this.hasEnoughTopUp), 31, this.hasEnoughDeclaredTopUp), 31, this.declaredTotalTopup);
    }
}
