package z38;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lz38/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "purposes", "b", "Ljava/lang/String;", "relationship", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountPurposes")
    private final List<String> purposes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("relationshipStatus")
    private final String relationship;

    public e(List list, String str) {
        this.purposes = list;
        this.relationship = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getPurposes() {
        return this.purposes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRelationship() {
        return this.relationship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.purposes, eVar.purposes) && Intrinsics.f(this.relationship, eVar.relationship);
    }

    public final int hashCode() {
        List<String> list = this.purposes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.relationship;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
