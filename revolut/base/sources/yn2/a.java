package yn2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nn2.c;
import qf1.d;
import qf1.h;
import qf1.j;
import qf1.k;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        c item = (c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_switch_to_revolut, new TextLocalisedClause(R$string.account_switch_feature_title, null, null, 14), new TextLocalisedClause(R$string.account_switch_add_new_subtitle, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(d dVar) {
        return super.b((c) dVar);
    }

    @Override // pf1.a
    public final j c(d dVar) {
        c item = (c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new h(new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.RequestList(item.f217437b)));
    }
}
