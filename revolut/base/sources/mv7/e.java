package mv7;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f209158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f209159b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data pricingPlanBanner, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            pricingPlanBanner = eVar.f209158a;
        }
        Set checkedItems = linkedHashSet;
        if ((i & 2) != 0) {
            checkedItems = eVar.f209159b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pricingPlanBanner, "pricingPlanBanner");
        Intrinsics.checkNotNullParameter(checkedItems, "checkedItems");
        return new e(pricingPlanBanner, checkedItems);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f209158a, eVar.f209158a) && Intrinsics.f(this.f209159b, eVar.f209159b);
    }

    public final int hashCode() {
        return this.f209159b.hashCode() + (this.f209158a.hashCode() * 31);
    }

    public e(Data pricingPlanBanner, Set checkedItems) {
        Intrinsics.checkNotNullParameter(pricingPlanBanner, "pricingPlanBanner");
        Intrinsics.checkNotNullParameter(checkedItems, "checkedItems");
        this.f209158a = pricingPlanBanner;
        this.f209159b = checkedItems;
    }

    public e(int i) {
        this(new Data(null, null, true, 3, null), h0.f322473a);
    }
}
