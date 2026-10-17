package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkfj/g3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "state", "b", "c", "cancellationMode", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "cancellationDate", "Lkfj/m3;", "d", "Lkfj/m3;", "()Lkfj/m3;", "action", "Lkfj/f3;", "Lkfj/f3;", "()Lkfj/f3;", "confirmation", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationMode")
    private final String cancellationMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationDate")
    private final Long cancellationDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("action")
    private final m3 action;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("confirmation")
    private final f3 confirmation;

    public g3(String state, String str, Long l2, m3 m3Var, f3 f3Var) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.cancellationMode = str;
        this.cancellationDate = l2;
        this.action = m3Var;
        this.confirmation = f3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m3 getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCancellationDate() {
        return this.cancellationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCancellationMode() {
        return this.cancellationMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f3 getConfirmation() {
        return this.confirmation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return Intrinsics.f(this.state, g3Var.state) && Intrinsics.f(this.cancellationMode, g3Var.cancellationMode) && Intrinsics.f(this.cancellationDate, g3Var.cancellationDate) && Intrinsics.f(this.action, g3Var.action) && Intrinsics.f(this.confirmation, g3Var.confirmation);
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        String str = this.cancellationMode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.cancellationDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        m3 m3Var = this.action;
        int iHashCode4 = (iHashCode3 + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        f3 f3Var = this.confirmation;
        return iHashCode4 + (f3Var != null ? f3Var.hashCode() : 0);
    }
}
