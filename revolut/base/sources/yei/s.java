package yei;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0013"}, d2 = {"Lyei/s;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "count", "", "Lyei/q;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "scores", "Lyei/p;", "reviews", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    private final int count;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("scores")
    @NotNull
    private final List<q> scores;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reviews")
    private final List<p> reviews;

    public s(int i, ArrayList scores, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(scores, "scores");
        this.count = i;
        this.scores = scores;
        this.reviews = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getReviews() {
        return this.reviews;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getScores() {
        return this.scores;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.count == sVar.count && Intrinsics.f(this.scores, sVar.scores) && Intrinsics.f(this.reviews, sVar.reviews);
    }

    public final int hashCode() {
        int iD = p.a.d(Integer.hashCode(this.count) * 31, 31, this.scores);
        List<p> list = this.reviews;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
