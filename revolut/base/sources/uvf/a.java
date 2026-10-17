package uvf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.api.navigation.TransportFlowDestination;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.h;
import qf1.j;
import qf1.k;
import qf1.t;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_transport, new TextLocalisedClause(R$string.transport_add_new_product_cell_title, null, null, 14), new TextLocalisedClause(R$string.transport_add_new_product_cell_subtitle, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(d dVar) {
        return super.b((t) dVar);
    }

    @Override // pf1.a
    public final j c(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new h(new TransportFlowDestination(0));
    }
}
