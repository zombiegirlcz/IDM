package n6l;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln6l/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "state", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "c", "activeUntil", "coolDownUntil", "e", "workflowId", "", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "workflowParams", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("activeUntil")
    private final String activeUntil;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("coolDownUntil")
    private final String coolDownUntil;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("workflowId")
    private final String workflowId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("workflowParams")
    private final Map<String, String> workflowParams;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActiveUntil() {
        return this.activeUntil;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCoolDownUntil() {
        return this.coolDownUntil;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.state, sVar.state) && Intrinsics.f(this.amount, sVar.amount) && Intrinsics.f(this.activeUntil, sVar.activeUntil) && Intrinsics.f(this.coolDownUntil, sVar.coolDownUntil) && Intrinsics.f(this.workflowId, sVar.workflowId) && Intrinsics.f(this.workflowParams, sVar.workflowParams);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Map getWorkflowParams() {
        return this.workflowParams;
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        jo3.a aVar = this.amount;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.activeUntil;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coolDownUntil;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.workflowId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.workflowParams;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }
}
