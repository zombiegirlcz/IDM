package hd1;

import cd1.j;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import dj0.d;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zc1.b;
import zc1.e;
import zc1.f;
import zc1.h;
import zc1.k;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    public static k a(String name, String color, d price, String str, j unitPricing, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(unitPricing, "unitPricing");
        return new k(name, new e(unitPricing.name(), str, mo3.a.p(price)), str2, a0.d.x("color", color));
    }

    public static CatalogueCategory b(b dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String categoryId = dto.getCategoryId();
        String name = dto.getName();
        Map metadata = dto.getMetadata();
        return new CatalogueCategory(categoryId, name, metadata != null ? (String) metadata.get("color") : null);
    }

    public static CatalogueProduct c(f dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String productId = dto.getProductId();
        String name = dto.getName();
        String description = dto.getDescription();
        Map metadata = dto.getMetadata();
        String str = metadata != null ? (String) metadata.get("color") : null;
        String categoryId = dto.getCategoryId();
        long amount = dto.getPrice().getAmount().getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = dto.getPrice().getAmount().getCurrency();
        aVar.getClass();
        d dVar = new d(amount, xi0.a.a(currency));
        String unitType = dto.getPrice().getUnitType();
        j jVar = j.ITEM;
        j jVar2 = (j) u1.v(unitType, r0.k(new Pair("ITEM", jVar), new Pair("DAY", j.DAY), new Pair("HOUR", j.HOUR)));
        if (jVar2 != null) {
            jVar = jVar2;
        }
        return new CatalogueProduct(productId, name, description, str, categoryId, dVar, jVar, dto.getPrice().getTaxRateId(), dto.getProductVariationId());
    }

    public static TaxRate d(h dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        String state = dto.getState();
        cd1.h.Companion.getClass();
        return new TaxRate(id10, (cd1.h) u1.t(state, cd1.h.ARCHIVED, cd1.h.MAPPING), dto.getName(), dto.getType(), dto.getPercentage().doubleValue());
    }
}
