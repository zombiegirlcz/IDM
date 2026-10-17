package t8i;

import bw0.l;
import bw0.m;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.R$string;
import j6i.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n8i.a0;
import n8i.b0;
import n8i.c0;
import n8i.d0;
import n8i.e0;
import n8i.w;
import q6i.q;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e0 {
    @Override // n8i.e0
    public final Clause b(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new TextLocalisedClause(R$string.move_money_amount_screen_action_add, null, null, 14);
    }

    @Override // n8i.e0
    public final Clause d(Data data) {
        AccountWrapper accountWrapper;
        Intrinsics.checkNotNullParameter(data, "data");
        w wVar = (w) data.getContent();
        if (wVar == null || (accountWrapper = wVar.f213478a) == null) {
            return null;
        }
        return new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_common_money_form_balance_format, u.c(new MoneyClause(accountWrapper.getBalance(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }

    @Override // n8i.e0
    public final c0 f(d0 errorModel) {
        Intrinsics.checkNotNullParameter(errorModel, "errorModel");
        yqi.b bVar = errorModel.f213415b.f302981c;
        return !(bVar instanceof r) ? b0.f213405a : new a0(new m(new TextLocalisedClause(R$string.move_money_amount_screen_exceeds_total_balance, null, null, 14), l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, new q(bVar)));
    }
}
