package yei;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0006\u0010 ¨\u0006\""}, d2 = {"Lyei/p;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "rank", "", "b", "J", "()J", "dateTimeMillis", "", "Lyei/q;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "scores", "Ljava/lang/String;", "displayName", "Lyei/r;", "Lyei/r;", "f", "()Lyei/r;", "source", "Lyei/o;", "Lyei/o;", "()Lyei/o;", "content", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rank")
    private final int rank;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dateTimeMillis")
    private final long dateTimeMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("scores")
    @NotNull
    private final List<q> scores;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("displayName")
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final r source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("content")
    private final o content;

    public p(int i, long j2, ArrayList scores, String displayName, r source, o oVar) {
        Intrinsics.checkNotNullParameter(scores, "scores");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(source, "source");
        this.rank = i;
        this.dateTimeMillis = j2;
        this.scores = scores;
        this.displayName = displayName;
        this.source = source;
        this.content = oVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDateTimeMillis() {
        return this.dateTimeMillis;
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
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.rank == pVar.rank && this.dateTimeMillis == pVar.dateTimeMillis && Intrinsics.f(this.scores, pVar.scores) && Intrinsics.f(this.displayName, pVar.displayName) && Intrinsics.f(this.source, pVar.source) && Intrinsics.f(this.content, pVar.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final r getSource() {
        return this.source;
    }

    public final int hashCode() {
        int iHashCode = (this.source.hashCode() + p.a.c(p.a.d(a0.d.c(Integer.hashCode(this.rank) * 31, 31, this.dateTimeMillis), 31, this.scores), 31, this.displayName)) * 31;
        o oVar = this.content;
        return iHashCode + (oVar == null ? 0 : oVar.hashCode());
    }
}
