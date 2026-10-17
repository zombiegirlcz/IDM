package m3j;

import aw0.o9;
import aw0.u;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public final AppTipUIModel a(Data data) {
        f5j.k kVar;
        Intrinsics.checkNotNullParameter(data, "data");
        od0.i iVar = (od0.i) data.getContent();
        if (iVar == null || (kVar = (f5j.k) iVar.g()) == null) {
            return null;
        }
        f5j.i iVar2 = kVar.f132353a;
        return new AppTipUIModel("BENEFICIARY_SUGGESTION_ID", new u(R$drawable.uikit_icn_24_lightbulb, new TextLocalisedClause(R$string.remittance_intercept_banner_suggestion, null, null, 14)), new TextClause(iVar2.f132351b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(iVar2.f132352c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new aw0.n(new TextClause(iVar2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, kVar, 576);
    }
}
