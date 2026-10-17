package lfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Llfj/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getFeedbackType", "feedbackType", "b", "getFeedback", "feedback", "c", "getFeedbackDescription", "feedbackDescription", "d", "getSubscriptionId", "subscriptionId", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedbackType")
    @NotNull
    private final String feedbackType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedback")
    @NotNull
    private final String feedback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedbackDescription")
    private final String feedbackDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subscriptionId")
    private final String subscriptionId;

    public d(String feedback, String str, String str2) {
        Intrinsics.checkNotNullParameter("REFUND_REASON", "feedbackType");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.feedbackType = "REFUND_REASON";
        this.feedback = feedback;
        this.feedbackDescription = str;
        this.subscriptionId = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.feedbackType, dVar.feedbackType) && Intrinsics.f(this.feedback, dVar.feedback) && Intrinsics.f(this.feedbackDescription, dVar.feedbackDescription) && Intrinsics.f(this.subscriptionId, dVar.subscriptionId);
    }

    public final int hashCode() {
        int iC = p.a.c(this.feedbackType.hashCode() * 31, 31, this.feedback);
        String str = this.feedbackDescription;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscriptionId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
