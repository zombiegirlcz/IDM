package vli;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.domain.models.moneyrequest.MoneyRequestState;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ById;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import efm.d0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import uyh.w;
import wp5.y;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vv9.c f290469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vv9.a f290470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cl3.a f290471c;
    public final sri.m d;
    public final hj8.a e;

    public k(vv9.c moneyRequestInteractor, vv9.a moneyRequestActionsInteractor, cl3.a contactsInteractor, sri.m navigator, hj8.a juniorInteractor) {
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestActionsInteractor, "moneyRequestActionsInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorInteractor, "juniorInteractor");
        this.f290469a = moneyRequestInteractor;
        this.f290470b = moneyRequestActionsInteractor;
        this.f290471c = contactsInteractor;
        this.d = navigator;
        this.e = juniorInteractor;
    }

    public static FeatureCommand b(String str) {
        return new FeatureCommand(new MoneyRequestFeatureConfig$Details$ById(str, null, null));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "money-requests");
    }

    public final ufm.f c(String str, String str2) {
        ufm.f fVar = new ufm.f(d(str).l(((wl3.h) this.f290471c).g(str)), new vif.c(new g(this, str2, 1), 20), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        return fVar;
    }

    public final rfm.m d(String str) {
        rfm.m mVar = new rfm.m(new rfm.f(((wl3.h) this.f290471c).b(str), new vif.c(new vjk.b(11), 9), 2), new vif.c(new vjk.b(12), 10), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:42:0x00d4, B:44:0x00dc, B:46:0x0103, B:48:0x0110, B:50:0x0116, B:52:0x0130, B:55:0x0139, B:57:0x0142, B:60:0x0149, B:66:0x0195, B:31:0x009c, B:33:0x00a7, B:38:0x00b5, B:37:0x00b1, B:28:0x0079), top: B:71:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:42:0x00d4, B:44:0x00dc, B:46:0x0103, B:48:0x0110, B:50:0x0116, B:52:0x0130, B:55:0x0139, B:57:0x0142, B:60:0x0149, B:66:0x0195, B:31:0x009c, B:33:0x00a7, B:38:0x00b5, B:37:0x00b1, B:28:0x0079), top: B:71:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [jf0.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [jf0.c] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [jf0.c] */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vli.k.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(3);
        if (strE.length() == 0) {
            strE = deeplink.e(2);
        }
        d0 d0VarFirstOrError = m70.a.g(((u6k.h) this.f290469a).c(strE), null, null, 3).firstOrError();
        vif.c cVar = new vif.c(new w(deeplink, 19, this, strE), 14);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, cVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.D(iVar, new g(this, strE, 0));
    }

    public final z g(MoneyRequest moneyRequest, Function2 function2) {
        MoneyRequestCounterParty moneyRequestCounterPartyA = com.revolut.domain.models.moneyrequest.b.a(moneyRequest);
        String str = moneyRequest.f60314a;
        String e = moneyRequestCounterPartyA != null ? moneyRequestCounterPartyA.getE() : null;
        z zVarD = ue0.e.v(e != null ? new pfm.a(c(e, str), new vif.c(new vgk.f(function2, moneyRequest, 11), 17), 4) : new pfm.h(i(str), 4)).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }

    public final void h(zm3.l lVar, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, jz9.b bVar) {
        this.d.c(new FeatureCommand(new SocialPaymentsFeatureConfig.PaymentsProfileChat((zm3.a) lVar, (TransferMoneyPocket) null, new StartAction.ShowBottomDialog(textLocalisedClause, textLocalisedClause2, bVar), false, 26)));
    }

    public final ufm.c i(String str) {
        ufm.c cVar = new ufm.c(new to7.f(this, str, 18), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final void j(MoneyRequest moneyRequest, zm3.l lVar) {
        TextLocalisedClause textLocalisedClause;
        String strC;
        MoneyRequestState moneyRequestState = moneyRequest.f60315b;
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.f60320l;
        int i = i.f290465a[moneyRequestState.ordinal()];
        if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.send_request_invalid_state_accepted_message, null, null, 14);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.send_request_invalid_state_rejected_message, null, null, 14);
        } else {
            if (i != 5) {
                if (moneyRequestCounterParty == null || (strC = com.revolut.domain.models.moneyrequest.a.c(moneyRequestCounterParty)) == null || kotlin.text.d0.W(strC)) {
                    strC = null;
                }
                h(lVar, new TextLocalisedClause(R$string.send_request_quick_action_failed_operation_title, null, null, 14), strC != null ? new TextLocalisedClause(R$string.send_request_quick_action_failed_send_subtitle, u.c(strC), null, 12) : new TextLocalisedClause(R$string.send_request_quick_action_failed_send_subtitle_noname, null, null, 14), jz9.b.ERROR);
                return;
            }
            textLocalisedClause = new TextLocalisedClause(R$string.send_request_invalid_state_cancelled_message, u.c(com.revolut.domain.models.moneyrequest.a.c(moneyRequestCounterParty)), null, 12);
        }
        h(lVar, new TextLocalisedClause(R$string.send_request_invalid_state_title, null, null, 14), textLocalisedClause, jz9.b.ERROR);
    }
}
