package yg6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements pf1.a {
    @Override // pf1.a
    public final qf1.k a(qf1.d dVar) {
        qf1.t item = (qf1.t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new qf1.k(R$drawable.uikit_icn_24_link, new TextLocalisedClause(R$string.add_new_product_linked_account_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_linked_account_subtitle, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(qf1.d dVar) {
        return super.b((qf1.t) dVar);
    }

    @Override // pf1.a
    public final qf1.j c(qf1.d dVar) {
        qf1.t item = (qf1.t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new qf1.i(qh6.a.f246483a);
    }
}
