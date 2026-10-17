package vli;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.api.navigation.ManualTransferFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f290458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MoneyRequest f290459c;
    public final /* synthetic */ zm3.l d;

    public /* synthetic */ f(MoneyRequest moneyRequest, k kVar, zm3.l lVar) {
        this.f290457a = 0;
        this.f290459c = moneyRequest;
        this.f290458b = kVar;
        this.d = lVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f290457a) {
            case 0:
                MoneyRequest moneyRequest = this.f290459c;
                int i = i.f290465a[moneyRequest.f60315b.ordinal()];
                k kVar = this.f290458b;
                switch (i) {
                    case 1:
                        kVar.d.c(new FeatureCommand(new ManualTransferFeatureConfig(new TransferRequestApprovalData.MoneyRequestApproval(moneyRequest))));
                        return;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        kVar.j(moneyRequest, this.d);
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 1:
                int i2 = R$string.send_request_quick_action_success_reject_title;
                MoneyRequest moneyRequest2 = this.f290459c;
                String strE = com.revolut.domain.models.moneyrequest.a.e(moneyRequest2.f60320l);
                if (strE == null) {
                    strE = "";
                }
                this.f290458b.h(this.d, new TextLocalisedClause(i2, u.c(strE), null, 12), new TextLocalisedClause(R$string.send_request_quick_action_success_reject_subtitle, v.k(new TextClause(com.revolut.domain.models.moneyrequest.a.c(moneyRequest2.f60320l), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(moneyRequest2.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), jz9.b.SUCCESS);
                return;
            default:
                this.f290458b.j(this.f290459c, this.d);
                return;
        }
    }

    public /* synthetic */ f(k kVar, MoneyRequest moneyRequest, zm3.l lVar, int i) {
        this.f290457a = i;
        this.f290458b = kVar;
        this.f290459c = moneyRequest;
        this.d = lVar;
    }
}
