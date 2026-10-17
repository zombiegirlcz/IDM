package rw7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_home.api.navigation.InsuranceHomeDestinations$Home;
import com.revolut.feature.insurance_home.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.h;
import qf1.j;
import qf1.k;
import qf1.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_insurance, new TextLocalisedClause(R$string.insurance_home_add_new_product_title, null, null, 14), new TextLocalisedClause(R$string.insurance_home_add_new_product_description, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(d dVar) {
        return super.b((t) dVar);
    }

    @Override // pf1.a
    public final j c(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new h(InsuranceHomeDestinations$Home.f76154a);
    }
}
