package rzf;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lrzf/u;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "count", "", "D", "()D", "averageScore", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("count")
    private final int count;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("averageScore")
    private final double averageScore;

    public u(int i, double d) {
        this.count = i;
        this.averageScore = d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAverageScore() {
        return this.averageScore;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.count == uVar.count && Double.compare(this.averageScore, uVar.averageScore) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.averageScore) + (Integer.hashCode(this.count) * 31);
    }
}
