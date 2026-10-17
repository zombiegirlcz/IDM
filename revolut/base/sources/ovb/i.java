package ovb;

import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.store.core.api.model.StoreProduct;
import com.revolut.feature.store.core.api.model.StoreProductOption;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import m1c.x;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i {
    public static final RevPoints a(e eVar) {
        x xVar;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b bVar = eVar.f230014b;
        g gVar = bVar instanceof g ? (g) bVar : null;
        if (gVar == null || (xVar = gVar.f230018a) == null) {
            RevPoints.INSTANCE.getClass();
            return RevPoints.Companion.a(0L);
        }
        BigDecimal scale = xVar.f201472c.b().setScale(0, RoundingMode.FLOOR);
        RevPoints.Companion companion = RevPoints.INSTANCE;
        long jLongValueExact = scale.movePointRight(6).longValueExact();
        companion.getClass();
        return RevPoints.Companion.a(jLongValueExact);
    }

    public static final RevPoints b(e eVar) {
        RevPoints revPoints;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        StoreProductOption storeProductOptionC = c(eVar);
        if (storeProductOptionC == null || (revPoints = storeProductOptionC.f88640c) == null) {
            RevPoints.INSTANCE.getClass();
            return RevPoints.Companion.a(0L);
        }
        BigDecimal scale = revPoints.b().setScale(0, RoundingMode.CEILING);
        RevPoints.Companion companion = RevPoints.INSTANCE;
        long jLongValueExact = scale.movePointRight(6).longValueExact();
        companion.getClass();
        return RevPoints.Companion.a(jLongValueExact);
    }

    public static final StoreProductOption c(e eVar) {
        Integer num;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        StoreProduct storeProduct = (StoreProduct) eVar.f230013a.getContent();
        if (storeProduct == null || (num = eVar.f230015c) == null) {
            return null;
        }
        return (StoreProductOption) d0.e0(num.intValue(), storeProduct.k);
    }

    public static final boolean d(e eVar) {
        x xVar;
        RevPoints revPoints;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b bVar = eVar.f230014b;
        Boolean boolValueOf = null;
        g gVar = bVar instanceof g ? (g) bVar : null;
        if (gVar != null && (xVar = gVar.f230018a) != null && (revPoints = xVar.f201472c) != null) {
            StoreProductOption storeProductOptionC = c(eVar);
            if (storeProductOptionC != null) {
                boolValueOf = Boolean.valueOf(storeProductOptionC.f88640c.compareTo(revPoints) <= 0);
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }
}
