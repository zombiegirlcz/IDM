package hxb;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lhxb/t;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "minimumSelectionCount", "", "Lhxb/s;", "Ljava/util/List;", "()Ljava/util/List;", "brands", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumSelectionCount")
    private final int minimumSelectionCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("brands")
    @NotNull
    private final List<s> brands;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBrands() {
        return this.brands;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMinimumSelectionCount() {
        return this.minimumSelectionCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.minimumSelectionCount == tVar.minimumSelectionCount && Intrinsics.f(this.brands, tVar.brands);
    }

    public final int hashCode() {
        return this.brands.hashCode() + (Integer.hashCode(this.minimumSelectionCount) * 31);
    }
}
