package y6h;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Ly6h/q;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "mainPage", "b", "searchPage", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mainPage")
    private final List<String> mainPage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("searchPage")
    private final List<String> searchPage;

    public q(List list, List list2) {
        this.mainPage = list;
        this.searchPage = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getMainPage() {
        return this.mainPage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSearchPage() {
        return this.searchPage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.mainPage, qVar.mainPage) && Intrinsics.f(this.searchPage, qVar.searchPage);
    }

    public final int hashCode() {
        List<String> list = this.mainPage;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.searchPage;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
