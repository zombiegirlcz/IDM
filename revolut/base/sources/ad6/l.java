package ad6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.entity.provider.models.R$string;
import ip0.ej;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.c7;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements h {
    @Override // ad6.h
    public final List a(ld6.g gVar, cd6.b configuration) {
        if (gVar != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        List listK = v.k(new TextLocalisedClause(R$string.legal_product_account_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_account_fcy_offered_by, u.c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE.c()), null, 12));
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        return u.c(new ej("LEGAL_ENTITY_DISCLAIMER_ITEM_ID", new c7(new CompositeClause(v.k(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new TextLocalisedClause(R$string.legal_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEGAL_ENTITY_DISCLAIMER_CLICK_ID", false), 10)), new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, 6)));
    }

    @Override // ad6.h
    public final ld6.b b(ld6.g gVar, cd6.b configuration) {
        if (gVar != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        throw null;
    }
}
