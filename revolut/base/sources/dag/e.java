package dag;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z9g.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010 \u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0006\u0010\u001fR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Ldag/e;", "", "", "toString", "()Ljava/lang/String;", "Ldag/a;", "a", "Ldag/a;", "e", "()Ldag/a;", "searchTarget", "", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "propertyIds", "Ldag/c;", "c", "Ldag/c;", "()Ldag/c;", "dates", "Lz9g/s;", "Lz9g/s;", "()Lz9g/s;", "filters", "Ljava/lang/String;", "f", "sortId", "", "Z", "()Z", "allRequestedFiltersRejected", "g", "suggestions", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("searchTarget")
    private final a searchTarget;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("propertyIds")
    private final List<String> propertyIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dates")
    private final c dates;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("smartFilters")
    private final s filters;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("sort")
    private final String sortId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("allRequestedFiltersRejected")
    private final boolean allRequestedFiltersRejected;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggestions")
    private final List<String> suggestions;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllRequestedFiltersRejected() {
        return this.allRequestedFiltersRejected;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getDates() {
        return this.dates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s getFilters() {
        return this.filters;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getPropertyIds() {
        return this.propertyIds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getSearchTarget() {
        return this.searchTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.searchTarget, eVar.searchTarget) && Intrinsics.f(this.propertyIds, eVar.propertyIds) && Intrinsics.f(this.dates, eVar.dates) && Intrinsics.f(this.filters, eVar.filters) && Intrinsics.f(this.sortId, eVar.sortId) && this.allRequestedFiltersRejected == eVar.allRequestedFiltersRejected && Intrinsics.f(this.suggestions, eVar.suggestions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSortId() {
        return this.sortId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getSuggestions() {
        return this.suggestions;
    }

    public final int hashCode() {
        a aVar = this.searchTarget;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        List<String> list = this.propertyIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.dates;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        s sVar = this.filters;
        int iHashCode4 = (iHashCode3 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.sortId;
        int iC = j6.a.c((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.allRequestedFiltersRejected);
        List<String> list2 = this.suggestions;
        return iC + (list2 != null ? list2.hashCode() : 0);
    }
}
