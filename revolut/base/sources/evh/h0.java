package evh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u001a"}, d2 = {"Levh/h0;", "Levh/j0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "stepId", "", "Levh/i;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "questions", "Levh/h;", "Levh/h;", "()Levh/h;", "navigation", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "requestUserFeedback", "disableDefaultSuccessDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("stepId")
    @NotNull
    private final String stepId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("questions")
    private final List<i> questions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("navigation")
    @NotNull
    private final h navigation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("requestUserFeedback")
    private final Boolean requestUserFeedback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("disableDefaultSuccessDialog")
    private final Boolean disableDefaultSuccessDialog;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getDisableDefaultSuccessDialog() {
        return this.disableDefaultSuccessDialog;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getQuestions() {
        return this.questions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getRequestUserFeedback() {
        return this.requestUserFeedback;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.stepId, h0Var.stepId) && Intrinsics.f(this.questions, h0Var.questions) && Intrinsics.f(this.navigation, h0Var.navigation) && Intrinsics.f(this.requestUserFeedback, h0Var.requestUserFeedback) && Intrinsics.f(this.disableDefaultSuccessDialog, h0Var.disableDefaultSuccessDialog);
    }

    public final int hashCode() {
        int iHashCode = this.stepId.hashCode() * 31;
        List<i> list = this.questions;
        int iHashCode2 = (this.navigation.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Boolean bool = this.requestUserFeedback;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disableDefaultSuccessDialog;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
