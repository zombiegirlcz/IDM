package wvi;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.i;
import qf1.j;
import qf1.k;
import qf1.t;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_lounges, new TextLocalisedClause(R$string.airport_lounges_add_new_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_add_new_subtitle, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(d dVar) {
        return super.b((t) dVar);
    }

    @Override // pf1.a
    public final j c(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new i(b.f300515a);
    }
}
