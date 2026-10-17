package fdi;

import aw0.o9;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_rev_points_pocket_api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.i;
import qf1.j;
import qf1.k;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        ddi.c item = (ddi.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_rev_points_mono, new TextLocalisedClause(R$string.rev_points_pocket_add_new_title, null, null, 14), new TextLocalisedClause(R$string.rev_points_pocket_add_new_subtitle, u.c(nub.a.i(item.f113226b, null, new nub.c(new NumberClause.Format.Compact(false)), o9.NON_SENSITIVE, 1)), null, 12), new TextLocalisedClause(R$string.rev_points_pocket_add_new_grouped_title, null, null, 14), null, null, 48);
    }

    @Override // pf1.a
    public final /* bridge */ List b(d dVar) {
        return super.b((ddi.c) dVar);
    }

    @Override // pf1.a
    public final j c(d dVar) {
        ddi.c item = (ddi.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new i(edi.b.f125025a);
    }
}
