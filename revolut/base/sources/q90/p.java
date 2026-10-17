package q90;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R,\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u0019"}, d2 = {"Lq90/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getItemId", "itemId", "", "", "b", "Ljava/util/Map;", "getQueries", "()Ljava/util/Map;", "queries", "", "c", "J", "getCreatedBefore", "()J", "createdBefore", "d", "getSearchQuery", "searchQuery", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("itemId")
    @NotNull
    private final String itemId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("parameters")
    @NotNull
    private final Map<String, List<String>> queries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdBefore")
    private final long createdBefore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("searchKeyword")
    private final String searchQuery;

    public p(String itemId, Map queries, long j2, String str) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(queries, "queries");
        this.itemId = itemId;
        this.queries = queries;
        this.createdBefore = j2;
        this.searchQuery = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.itemId, pVar.itemId) && Intrinsics.f(this.queries, pVar.queries) && this.createdBefore == pVar.createdBefore && Intrinsics.f(this.searchQuery, pVar.searchQuery);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.e(this.itemId.hashCode() * 31, 31, this.queries), 31, this.createdBefore);
        String str = this.searchQuery;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
