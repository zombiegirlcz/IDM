package b0g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0018"}, d2 = {"Lb0g/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "count", "", "D", "()D", "averageScore", "", "Lb0g/a;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "reviews", "Ljava/lang/String;", "nextPageToken", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("count")
    private final int count;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("averageScore")
    private final double averageScore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reviews")
    @NotNull
    private final List<a> reviews;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nextPageToken")
    private final String nextPageToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAverageScore() {
        return this.averageScore;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getReviews() {
        return this.reviews;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.count == dVar.count && Double.compare(this.averageScore, dVar.averageScore) == 0 && Intrinsics.f(this.reviews, dVar.reviews) && Intrinsics.f(this.nextPageToken, dVar.nextPageToken);
    }

    public final int hashCode() {
        int iD = p.a.d(m72.b.c(Integer.hashCode(this.count) * 31, this.averageScore, 31), 31, this.reviews);
        String str = this.nextPageToken;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
