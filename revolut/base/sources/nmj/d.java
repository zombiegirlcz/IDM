package nmj;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CellDetailsStandaloneNoteDelegate.Model.Companion companion = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
        List listK = v.k(CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "revPointsInfoItemId1", new TextLocalisedClause(R$string.esim_mobile_plans_checkout_revpoints_info_item1, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "revPointsInfoItemId2", new TextLocalisedClause(R$string.esim_mobile_plans_checkout_revpoints_info_item2, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(companion, "revPointsInfoItemIde", new TextLocalisedClause(R$string.esim_mobile_plans_checkout_revpoints_info_item3, null, null, 14)));
        yp0.b.k(listK, 0, R$attr.uikit_dp16, 0, 0, 29);
        return new b(CellDetailsStandaloneNoteDelegate.Model.Companion.a(listK));
    }
}
