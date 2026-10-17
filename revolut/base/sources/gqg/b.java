package gqg;

import a8a.d;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.vaults.R$string;
import com.revolut.feature.vaults.api.VaultsCurrencySelectionResult;
import efm.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import qv0.i;
import y7a.w;
import zi0.c;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends d {
    @Override // a8a.d
    public final boolean b(String query, i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        return d0.J(model.getF53929a(), query, true);
    }

    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new VaultsCurrencySelectionResult((String) zhm.d0.a0(ids));
    }

    @Override // a8a.d
    public final r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.Collection<kotlin.String>");
        Collection<String> collection = (Collection) obj2;
        ArrayList arrayList = new ArrayList(zhm.w.t(collection, 10));
        for (String str : collection) {
            arrayList.add(new RowDelegate.Model(str, new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, new TextLocalisedClause(R$string.vaults_saving_accounts_savings_vault, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, false, null, null, null, null, null, new a(str, zhm.d0.i1(collection)), null, 0, 0, 0, 0, 1056956268));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
        r rVarJust = r.just(c.P(arrayList, false, null, 3));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
