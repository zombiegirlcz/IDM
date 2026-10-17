package auc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lauc/h;", "", "", "toString", "()Ljava/lang/String;", "", "Lauc/g;", "a", "Ljava/util/List;", "()Ljava/util/List;", "digitizedCards", "Lauc/j;", "b", "c", "pendingEnrollments", "Lauc/i;", "Lauc/i;", "()Lauc/i;", "flags", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("digitizedCards")
    private final List<g> digitizedCards;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pendingEnrolments")
    private final List<j> pendingEnrollments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("flags")
    private final i flags;

    public h(ArrayList arrayList, ArrayList arrayList2, i iVar) {
        this.digitizedCards = arrayList;
        this.pendingEnrollments = arrayList2;
        this.flags = iVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDigitizedCards() {
        return this.digitizedCards;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPendingEnrollments() {
        return this.pendingEnrollments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.digitizedCards, hVar.digitizedCards) && Intrinsics.f(this.pendingEnrollments, hVar.pendingEnrollments) && Intrinsics.f(this.flags, hVar.flags);
    }

    public final int hashCode() {
        List<g> list = this.digitizedCards;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<j> list2 = this.pendingEnrollments;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        i iVar = this.flags;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
