package j8k;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.a0;
import com.revolut.core.ui_kit.models.f0;
import com.revolut.core.ui_kit.models.s;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.payment_links.impl.R$string;
import fpa.f;
import fpa.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(new ProfileCardModel.Loaded(null, new f0(R$drawable.uikit_icn_24_users_search), new s(57, new TextLocalisedClause(R$string.money_request_qr_discoverability_title, null, null, 14), null, new TextLocalisedClause(R$string.money_request_qr_discoverability_description, null, null, 14)), new a0(new TextLocalisedClause(R$string.money_request_qr_discoverability_action_title, null, null, 14), null, null, 14), null, 113), null, new f(new TextLocalisedClause(R$string.payments_payment_link_request_title, null, null, 14)), 2);
    }
}
