package evh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Levh/g0;", "Levh/j0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "stepId", "", "b", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "requestUserFeedback", "disableDefaultSuccessDialog", "Levh/e;", "Levh/e;", "()Levh/e;", "configuration", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("stepId")
    @NotNull
    private final String stepId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestUserFeedback")
    private final Boolean requestUserFeedback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("disableDefaultSuccessDialog")
    private final Boolean disableDefaultSuccessDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("configuration")
    private final e configuration;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getDisableDefaultSuccessDialog() {
        return this.disableDefaultSuccessDialog;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getRequestUserFeedback() {
        return this.requestUserFeedback;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.stepId, g0Var.stepId) && Intrinsics.f(this.requestUserFeedback, g0Var.requestUserFeedback) && Intrinsics.f(this.disableDefaultSuccessDialog, g0Var.disableDefaultSuccessDialog) && Intrinsics.f(this.configuration, g0Var.configuration);
    }

    public final int hashCode() {
        int iHashCode = this.stepId.hashCode() * 31;
        Boolean bool = this.requestUserFeedback;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disableDefaultSuccessDialog;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        e eVar = this.configuration;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }
}
