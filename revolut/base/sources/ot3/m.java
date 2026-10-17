package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lot3/m;", "Lot3/n;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "planId", "d", "source", "Lot3/l;", "c", "Lot3/l;", "()Lot3/l;", "postUpgradeAction", "Lot3/p;", "Lot3/p;", "()Lot3/p;", "beforeAction", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("postUpgradeAction")
    @NotNull
    private final l postUpgradeAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("beforeAction")
    private final p beforeAction;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getBeforeAction() {
        return this.beforeAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getPostUpgradeAction() {
        return this.postUpgradeAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.planId, mVar.planId) && Intrinsics.f(this.source, mVar.source) && Intrinsics.f(this.postUpgradeAction, mVar.postUpgradeAction) && Intrinsics.f(this.beforeAction, mVar.beforeAction);
    }

    public final int hashCode() {
        int iHashCode = (this.postUpgradeAction.hashCode() + p.a.c(this.planId.hashCode() * 31, 31, this.source)) * 31;
        p pVar = this.beforeAction;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
