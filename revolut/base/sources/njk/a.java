package njk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import ggk.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.h;
import qf1.k;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(qf1.d dVar) {
        j item = (j) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        jo3.a aVar = item.f143733b;
        return new k(R$drawable.uikit_icn_24_premium, new TextLocalisedClause(R$string.premium_add_new_product_partnerships_title, null, null, 14), aVar != null ? new TextLocalisedClause(R$string.premium_add_new_product_partnerships_description_with_price, u.c(dok.b.b(mo3.a.o(aVar), null, null, null, 7)), null, 12) : new TextLocalisedClause(R$string.premium_add_new_product_partnerships_description_without_price, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(qf1.d dVar) {
        return super.b((j) dVar);
    }

    @Override // pf1.a
    public final qf1.j c(qf1.d dVar) {
        j item = (j) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new h(u0.b(skk.a.b()));
    }
}
