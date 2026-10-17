package m1i;

import aw0.o9;
import com.revolut.core.strings_provider.R$string;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f201566b;

    public /* synthetic */ p(s sVar, int i) {
        this.f201565a = i;
        this.f201566b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r1i.h hVar;
        switch (this.f201565a) {
            case 0:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                int i = r.f201572a[draft.f96881c.ordinal()];
                if (i == 1) {
                    hVar = r1i.h.TOP;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar = r1i.h.BOTTOM;
                }
                return this.f201566b.f201576c.c0(new StatusViewConfiguration.Error("STATUS_BUY_RUB_NOT_SUPPORTED_ERROR", new TextLocalisedClause(R$string.error_api_1507, zhm.u.c(r1i.d.g(draft, hVar).f96897a.f306286a), null, 12), null, null, null, null, null, 8188));
            case 1:
                this.f201566b.e(true);
                return Unit.f186387a;
            case 2:
                this.f201566b.e(false);
                return Unit.f186387a;
            case 3:
                this.f201566b.e(false);
                return Unit.f186387a;
            default:
                r1i.a details = (r1i.a) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                int i2 = com.revolut.feature_exchange.impl.R$string.fx_orders_status_description_exchange_not_available;
                s sVar = this.f201566b;
                String strA = sVar.e.a(details.f251008a);
                if (strA == null) {
                    strA = details.f251008a.f306286a;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, zhm.v.k(strA, sVar.f.d(details.f251010c)), null, 12);
                TextClause textClause = new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                return sVar.f201576c.c0(new StatusViewConfiguration.Error("STATUS_CURRENCY_NOT_AVAILABLE", new TextLocalisedClause(com.revolut.feature_exchange.impl.R$string.fx_orders_status_title_exchange_was_declined, null, null, 14), yoj.b.w(yoj.b.w(textLocalisedClause, textClause), new TextLocalisedClause(com.revolut.feature_exchange.impl.R$string.fx_orders_status_view_upgrade_options, null, new Click(28, (Integer) null, (Object) details.f251009b, "LINK_UPGRADE_OPTIONS", false), 10)), new TextLocalisedClause(com.revolut.feature_exchange.impl.R$string.fx_orders_status_action_close, null, null, 14), null, null, null, 8176));
        }
    }
}
