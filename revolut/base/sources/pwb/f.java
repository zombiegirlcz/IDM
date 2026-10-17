package pwb;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f240378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f240380c;
    public final Data d;

    public f(Data revPointsAccount, Data lastPricingPlanToUpdate, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        Intrinsics.checkNotNullParameter(lastPricingPlanToUpdate, "lastPricingPlanToUpdate");
        this.f240378a = pagerItems;
        this.f240379b = selectedPagerItemId;
        this.f240380c = revPointsAccount;
        this.d = lastPricingPlanToUpdate;
    }

    public static f a(f fVar, String selectedPagerItemId, Data revPointsAccount, Data lastPricingPlanToUpdate, int i) {
        List pagerItems = fVar.f240378a;
        if ((i & 2) != 0) {
            selectedPagerItemId = fVar.f240379b;
        }
        if ((i & 4) != 0) {
            revPointsAccount = fVar.f240380c;
        }
        if ((i & 8) != 0) {
            lastPricingPlanToUpdate = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        Intrinsics.checkNotNullParameter(lastPricingPlanToUpdate, "lastPricingPlanToUpdate");
        return new f(revPointsAccount, lastPricingPlanToUpdate, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f240378a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f240378a, fVar.f240378a) && Intrinsics.f(this.f240379b, fVar.f240379b) && Intrinsics.f(this.f240380c, fVar.f240380c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f240380c, p.a.c(this.f240378a.hashCode() * 31, 31, this.f240379b), 31);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f240379b;
    }
}
