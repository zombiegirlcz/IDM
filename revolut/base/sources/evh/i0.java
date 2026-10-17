package evh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001d\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\f\u0010\"¨\u0006%"}, d2 = {"Levh/i0;", "Levh/j0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "stepId", "b", "f", "reason", "c", "d", "name", "", "Levh/f;", "Ljava/util/List;", "()Ljava/util/List;", "dataPoints", "Levh/e;", "e", "Levh/e;", "()Levh/e;", "configuration", "Levh/h;", "Levh/h;", "()Levh/h;", "navigation", "g", "h", "state", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "requestUserFeedback", "disableDefaultSuccessDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("stepId")
    @NotNull
    private final String stepId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dataPoints")
    private final List<f> dataPoints;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("configuration")
    private final e configuration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("navigation")
    @NotNull
    private final h navigation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestUserFeedback")
    private final Boolean requestUserFeedback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("disableDefaultSuccessDialog")
    private final Boolean disableDefaultSuccessDialog;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDataPoints() {
        return this.dataPoints;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getDisableDefaultSuccessDialog() {
        return this.disableDefaultSuccessDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getNavigation() {
        return this.navigation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.stepId, i0Var.stepId) && Intrinsics.f(this.reason, i0Var.reason) && Intrinsics.f(this.name, i0Var.name) && Intrinsics.f(this.dataPoints, i0Var.dataPoints) && Intrinsics.f(this.configuration, i0Var.configuration) && Intrinsics.f(this.navigation, i0Var.navigation) && Intrinsics.f(this.state, i0Var.state) && Intrinsics.f(this.requestUserFeedback, i0Var.requestUserFeedback) && Intrinsics.f(this.disableDefaultSuccessDialog, i0Var.disableDefaultSuccessDialog);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getRequestUserFeedback() {
        return this.requestUserFeedback;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iHashCode = this.stepId.hashCode() * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<f> list = this.dataPoints;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        e eVar = this.configuration;
        int iC = p.a.c((this.navigation.hashCode() + ((iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31, 31, this.state);
        Boolean bool = this.requestUserFeedback;
        int iHashCode5 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disableDefaultSuccessDialog;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }
}
