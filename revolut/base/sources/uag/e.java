package uag;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f278639c;

    public e(Data revPointsAccountStatus, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f278637a = pagerItems;
        this.f278638b = selectedPagerItemId;
        this.f278639c = revPointsAccountStatus;
    }

    public static e a(e eVar, String selectedPagerItemId, Data revPointsAccountStatus, int i) {
        List pagerItems = eVar.f278637a;
        if ((i & 2) != 0) {
            selectedPagerItemId = eVar.f278638b;
        }
        if ((i & 4) != 0) {
            revPointsAccountStatus = eVar.f278639c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        return new e(revPointsAccountStatus, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f278637a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f278637a, eVar.f278637a) && Intrinsics.f(this.f278638b, eVar.f278638b) && Intrinsics.f(this.f278639c, eVar.f278639c);
    }

    public final int hashCode() {
        return this.f278639c.hashCode() + p.a.c(this.f278637a.hashCode() * 31, 31, this.f278638b);
    }

    @Override // oki.a
    public final String z() {
        return this.f278638b;
    }
}
