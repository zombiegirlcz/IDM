package rmb;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f255215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f255216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f255217c;

    public a(Data productsData, SavingsProductData savingsProductData, Data rateUpgradeData) {
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        Intrinsics.checkNotNullParameter(rateUpgradeData, "rateUpgradeData");
        this.f255215a = productsData;
        this.f255216b = savingsProductData;
        this.f255217c = rateUpgradeData;
    }

    public static a a(a aVar, Data productsData, SavingsProductData savingsProductData, Data rateUpgradeData, int i) {
        if ((i & 1) != 0) {
            productsData = aVar.f255215a;
        }
        if ((i & 2) != 0) {
            savingsProductData = aVar.f255216b;
        }
        if ((i & 4) != 0) {
            rateUpgradeData = aVar.f255217c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        Intrinsics.checkNotNullParameter(rateUpgradeData, "rateUpgradeData");
        return new a(productsData, savingsProductData, rateUpgradeData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f255215a, aVar.f255215a) && Intrinsics.f(this.f255216b, aVar.f255216b) && Intrinsics.f(this.f255217c, aVar.f255217c);
    }

    public final int hashCode() {
        int iHashCode = this.f255215a.hashCode() * 31;
        SavingsProductData savingsProductData = this.f255216b;
        return this.f255217c.hashCode() + ((iHashCode + (savingsProductData == null ? 0 : savingsProductData.hashCode())) * 31);
    }
}
