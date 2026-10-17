package ngg;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f215150c;

    public d(Data revPointsAccountStatus, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f215148a = pagerItems;
        this.f215149b = selectedPagerItemId;
        this.f215150c = revPointsAccountStatus;
    }

    public static d a(d dVar, String selectedPagerItemId, Data revPointsAccountStatus, int i) {
        List pagerItems = dVar.f215148a;
        if ((i & 2) != 0) {
            selectedPagerItemId = dVar.f215149b;
        }
        if ((i & 4) != 0) {
            revPointsAccountStatus = dVar.f215150c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        return new d(revPointsAccountStatus, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f215148a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f215148a, dVar.f215148a) && Intrinsics.f(this.f215149b, dVar.f215149b) && Intrinsics.f(this.f215150c, dVar.f215150c);
    }

    public final int hashCode() {
        return this.f215150c.hashCode() + p.a.c(this.f215148a.hashCode() * 31, 31, this.f215149b);
    }

    @Override // oki.a
    public final String z() {
        return this.f215149b;
    }
}
