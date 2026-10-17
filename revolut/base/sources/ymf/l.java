package ymf;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.b8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<e> list = domainState.f314976a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (e eVar : list) {
            String name = eVar.f314977a.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            b8 b8Var = new b8(name, new TextLocalisedClause(R$string.transactionUI_transaction_details_receipt, null, null, 14), new TextLocalisedClause(R.string.common_action_remove, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), eVar.f314978b, eVar.f314977a);
            yp0.b.l(b8Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(b8Var);
        }
        return new g(arrayList);
    }
}
