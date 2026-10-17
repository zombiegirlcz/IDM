package a9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"La9g/j2;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "adults", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "childrenAge", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("adults")
    private final int adults;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("childrenAge")
    @NotNull
    private final List<Integer> childrenAge;

    public j2(int i, List childrenAge) {
        Intrinsics.checkNotNullParameter(childrenAge, "childrenAge");
        this.adults = i;
        this.childrenAge = childrenAge;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAdults() {
        return this.adults;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getChildrenAge() {
        return this.childrenAge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return this.adults == j2Var.adults && Intrinsics.f(this.childrenAge, j2Var.childrenAge);
    }

    public final int hashCode() {
        return this.childrenAge.hashCode() + (Integer.hashCode(this.adults) * 31);
    }
}
