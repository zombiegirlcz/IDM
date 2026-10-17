package k1g;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f180246c;

    public e(Data revPointsAccountStatus, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f180244a = pagerItems;
        this.f180245b = selectedPagerItemId;
        this.f180246c = revPointsAccountStatus;
    }

    public static e a(e eVar, String selectedPagerItemId, Data revPointsAccountStatus, int i) {
        List pagerItems = eVar.f180244a;
        if ((i & 2) != 0) {
            selectedPagerItemId = eVar.f180245b;
        }
        if ((i & 4) != 0) {
            revPointsAccountStatus = eVar.f180246c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        return new e(revPointsAccountStatus, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f180244a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f180244a, eVar.f180244a) && Intrinsics.f(this.f180245b, eVar.f180245b) && Intrinsics.f(this.f180246c, eVar.f180246c);
    }

    public final int hashCode() {
        return this.f180246c.hashCode() + p.a.c(this.f180244a.hashCode() * 31, 31, this.f180245b);
    }

    @Override // oki.a
    public final String z() {
        return this.f180245b;
    }
}
