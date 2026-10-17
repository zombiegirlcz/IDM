package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnx4/u0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "buttonsPosition", "Lnx4/t0;", "b", "Lnx4/t0;", "d", "()Lnx4/t0;", "primaryAction", "c", "description", "e", "secondaryAction", "Lnx4/v0;", "Lnx4/v0;", "()Lnx4/v0;", "iconDescription", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("buttonsPosition")
    private final String buttonsPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryAction")
    @NotNull
    private final t0 primaryAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("secondaryAction")
    private final t0 secondaryAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("iconDescription")
    private final v0 iconDescription;

    public u0(String str, t0 primaryAction, String str2, t0 t0Var, v0 v0Var) {
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        this.buttonsPosition = str;
        this.primaryAction = primaryAction;
        this.description = str2;
        this.secondaryAction = t0Var;
        this.iconDescription = v0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonsPosition() {
        return this.buttonsPosition;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v0 getIconDescription() {
        return this.iconDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t0 getPrimaryAction() {
        return this.primaryAction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final t0 getSecondaryAction() {
        return this.secondaryAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.buttonsPosition, u0Var.buttonsPosition) && Intrinsics.f(this.primaryAction, u0Var.primaryAction) && Intrinsics.f(this.description, u0Var.description) && Intrinsics.f(this.secondaryAction, u0Var.secondaryAction) && Intrinsics.f(this.iconDescription, u0Var.iconDescription);
    }

    public final int hashCode() {
        String str = this.buttonsPosition;
        int iHashCode = (this.primaryAction.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        t0 t0Var = this.secondaryAction;
        int iHashCode3 = (iHashCode2 + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        v0 v0Var = this.iconDescription;
        return iHashCode3 + (v0Var != null ? v0Var.hashCode() : 0);
    }
}
