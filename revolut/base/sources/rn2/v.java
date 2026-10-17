package rn2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lrn2/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "actionName", "b", "e", "confirmationTitle", "c", "confirmationDescription", "d", "confirmationPositiveCta", "confirmationNegativeCta", "f", "successMessage", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("actionName")
    @NotNull
    private final String actionName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmationTitle")
    @NotNull
    private final String confirmationTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmationDescription")
    @NotNull
    private final String confirmationDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("confirmationPositiveCta")
    @NotNull
    private final String confirmationPositiveCta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("confirmationNegativeCta")
    @NotNull
    private final String confirmationNegativeCta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("successMessage")
    @NotNull
    private final String successMessage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConfirmationDescription() {
        return this.confirmationDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getConfirmationNegativeCta() {
        return this.confirmationNegativeCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getConfirmationPositiveCta() {
        return this.confirmationPositiveCta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getConfirmationTitle() {
        return this.confirmationTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.actionName, vVar.actionName) && Intrinsics.f(this.confirmationTitle, vVar.confirmationTitle) && Intrinsics.f(this.confirmationDescription, vVar.confirmationDescription) && Intrinsics.f(this.confirmationPositiveCta, vVar.confirmationPositiveCta) && Intrinsics.f(this.confirmationNegativeCta, vVar.confirmationNegativeCta) && Intrinsics.f(this.successMessage, vVar.successMessage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public final int hashCode() {
        return this.successMessage.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.actionName.hashCode() * 31, 31, this.confirmationTitle), 31, this.confirmationDescription), 31, this.confirmationPositiveCta), 31, this.confirmationNegativeCta);
    }
}
