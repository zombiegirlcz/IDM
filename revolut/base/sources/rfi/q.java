package rfi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0006\u0010\u001d¨\u0006\u001f"}, d2 = {"Lrfi/q;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "rank", "b", "Ljava/lang/String;", "date", "", "Lrfi/r;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "scores", "displayName", "Lrfi/s;", "Lrfi/s;", "f", "()Lrfi/s;", "source", "Lrfi/p;", "Lrfi/p;", "()Lrfi/p;", "content", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rank")
    private final int rank;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("date")
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("scores")
    @NotNull
    private final List<r> scores;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("displayName")
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final s source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("content")
    private final p content;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getScores() {
        return this.scores;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.rank == qVar.rank && Intrinsics.f(this.date, qVar.date) && Intrinsics.f(this.scores, qVar.scores) && Intrinsics.f(this.displayName, qVar.displayName) && Intrinsics.f(this.source, qVar.source) && Intrinsics.f(this.content, qVar.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final s getSource() {
        return this.source;
    }

    public final int hashCode() {
        int iHashCode = (this.source.hashCode() + p.a.c(p.a.d(p.a.c(Integer.hashCode(this.rank) * 31, 31, this.date), 31, this.scores), 31, this.displayName)) * 31;
        p pVar = this.content;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
