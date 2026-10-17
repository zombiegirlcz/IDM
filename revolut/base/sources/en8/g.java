package en8;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f127768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127769c;
    public final Image d;
    public final dj0.d e;

    public g(String id10, SavingsProductData savingsProductData, String name, Image background, dj0.d balance) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f127767a = id10;
        this.f127768b = savingsProductData;
        this.f127769c = name;
        this.d = background;
        this.e = balance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f127767a, gVar.f127767a) && Intrinsics.f(this.f127768b, gVar.f127768b) && Intrinsics.f(this.f127769c, gVar.f127769c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f127767a.hashCode() * 31;
        SavingsProductData savingsProductData = this.f127768b;
        return this.e.hashCode() + a10.b.c(this.d, p.a.c((iHashCode + (savingsProductData == null ? 0 : savingsProductData.hashCode())) * 31, 31, this.f127769c), 31);
    }
}
