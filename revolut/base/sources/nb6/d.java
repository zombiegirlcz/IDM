package nb6;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f213991c;

    public d(Data revPointsAccountStatus, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f213989a = pagerItems;
        this.f213990b = selectedPagerItemId;
        this.f213991c = revPointsAccountStatus;
    }

    public static d a(d dVar, String selectedPagerItemId, Data revPointsAccountStatus, int i) {
        List pagerItems = dVar.f213989a;
        if ((i & 2) != 0) {
            selectedPagerItemId = dVar.f213990b;
        }
        if ((i & 4) != 0) {
            revPointsAccountStatus = dVar.f213991c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        return new d(revPointsAccountStatus, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f213989a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f213989a, dVar.f213989a) && Intrinsics.f(this.f213990b, dVar.f213990b) && Intrinsics.f(this.f213991c, dVar.f213991c);
    }

    public final int hashCode() {
        return this.f213991c.hashCode() + p.a.c(this.f213989a.hashCode() * 31, 31, this.f213990b);
    }

    @Override // oki.a
    public final String z() {
        return this.f213990b;
    }
}
