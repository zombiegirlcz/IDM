package a5i;

import com.revolut.data.model.Data;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f1418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f1419b;

    public h(BigDecimal lotQuantity, Data priceDetails) {
        Intrinsics.checkNotNullParameter(lotQuantity, "lotQuantity");
        Intrinsics.checkNotNullParameter(priceDetails, "priceDetails");
        this.f1418a = lotQuantity;
        this.f1419b = priceDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f1418a, hVar.f1418a) && Intrinsics.f(this.f1419b, hVar.f1419b);
    }

    public final int hashCode() {
        return this.f1419b.hashCode() + (this.f1418a.hashCode() * 31);
    }
}
