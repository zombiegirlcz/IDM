package ob1;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsDashboardState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f223847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardReaderProductDetailsScreenContract$ProductDetailsDashboardState f223848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f223849c;

    public f(Data productDetails, CardReaderProductDetailsScreenContract$ProductDetailsDashboardState dashboardState, Data monthlyFee) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(dashboardState, "dashboardState");
        Intrinsics.checkNotNullParameter(monthlyFee, "monthlyFee");
        this.f223847a = productDetails;
        this.f223848b = dashboardState;
        this.f223849c = monthlyFee;
    }

    public static f a(f fVar, Data productDetails, CardReaderProductDetailsScreenContract$ProductDetailsDashboardState dashboardState, Data monthlyFee, int i) {
        if ((i & 1) != 0) {
            productDetails = fVar.f223847a;
        }
        if ((i & 2) != 0) {
            dashboardState = fVar.f223848b;
        }
        if ((i & 4) != 0) {
            monthlyFee = fVar.f223849c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(dashboardState, "dashboardState");
        Intrinsics.checkNotNullParameter(monthlyFee, "monthlyFee");
        return new f(productDetails, dashboardState, monthlyFee);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f223847a, fVar.f223847a) && Intrinsics.f(this.f223848b, fVar.f223848b) && Intrinsics.f(this.f223849c, fVar.f223849c);
    }

    public final int hashCode() {
        return this.f223849c.hashCode() + ((this.f223848b.hashCode() + (this.f223847a.hashCode() * 31)) * 31);
    }
}
