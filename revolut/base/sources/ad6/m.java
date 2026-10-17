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
import md6.t;
import md6.u;
import mx0.c7;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3277a;

    public m(b accountsEntityMapper) {
        Intrinsics.checkNotNullParameter(accountsEntityMapper, "accountsEntityMapper");
        this.f3277a = accountsEntityMapper;
    }

    @Override // ad6.h
    public final List a(ld6.g gVar, cd6.b configuration) {
        u product = (u) gVar;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        t tVar = product.f204500a;
        md6.a aVar = new md6.a(tVar.f204498a, tVar.f204499b, (md6.d) null, (md6.f) null, 60);
        b bVar = this.f3277a;
        ld6.b bVarB = bVar.b(aVar, configuration);
        if (bVarB == null) {
            return f0.f322471a;
        }
        t tVar2 = product.f204501b;
        ld6.b bVarB2 = bVar.b(new md6.a(tVar2.f204498a, tVar2.f204499b, (md6.d) null, (md6.f) null, 60), configuration);
        if (bVarB2 == null) {
            return f0.f322471a;
        }
        return zhm.u.c(new ej("LEGAL_ENTITY_DISCLAIMER_ITEM_ID", new c7(new CompositeClause(v.k(bVarB == bVarB2 ? bVarB.b() : new TextLocalisedClause(R$string.legal_product_disclaimer_currency_exchange, v.k(bVarB.c(), bVarB2.c()), null, 12), new TextLocalisedClause(R$string.legal_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEGAL_ENTITY_DISCLAIMER_CLICK_ID", false), 10)), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, 6)));
    }

    @Override // ad6.h
    public final ld6.b b(ld6.g gVar, cd6.b configuration) {
        u product = (u) gVar;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        throw new IllegalStateException("CurrencyExchangeProduct involves multiple entities ");
    }
}
