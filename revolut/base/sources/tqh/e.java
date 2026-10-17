package tqh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0005\u0010!¨\u0006#"}, d2 = {"Ltqh/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "f", "title", "", "Lnel/z;", "c", "Ljava/util/List;", "()Ljava/util/List;", "securityTypes", "Lzel/g;", "d", "Lzel/g;", "e", "()Lzel/g;", "sortingMetric", "Lzel/i;", "Lzel/i;", "()Lzel/i;", "sortOrder", "Ltqh/d;", "filters", "", "g", "I", "()I", "limit", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("securityTypes")
    @NotNull
    private final List<z> securityTypes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("sortingMetric")
    private final zel.g sortingMetric;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("sortOrder")
    @NotNull
    private final zel.i sortOrder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("filters")
    @NotNull
    private final List<d> filters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("limit")
    private final int limit;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSecurityTypes() {
        return this.securityTypes;
    }

    public final ArrayList c() {
        List<d> list = this.filters;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((d) it8.next()).a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final zel.i getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final zel.g getSortingMetric() {
        return this.sortingMetric;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.securityTypes, eVar.securityTypes) && this.sortingMetric == eVar.sortingMetric && this.sortOrder == eVar.sortOrder && Intrinsics.f(this.filters, eVar.filters) && this.limit == eVar.limit;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.type.hashCode() * 31, 31, this.title), 31, this.securityTypes);
        zel.g gVar = this.sortingMetric;
        return Integer.hashCode(this.limit) + p.a.d((this.sortOrder.hashCode() + ((iD + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31, 31, this.filters);
    }
}
