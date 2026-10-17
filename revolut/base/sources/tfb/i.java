package tfb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub;
import com.revolut.feature.retail.salary_account.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.k;
import qf1.t;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements pf1.a {
    @Override // pf1.a
    public final k a(qf1.d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_salary, new TextLocalisedClause(R$string.salary_account_add_new_product_title, null, null, 14), new TextLocalisedClause(R$string.salary_account_add_new_product_subtitle, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(qf1.d dVar) {
        return super.b((t) dVar);
    }

    @Override // pf1.a
    public final qf1.j c(qf1.d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new qf1.h(SalaryAccountDestination$SalaryHub.f82951a);
    }
}
