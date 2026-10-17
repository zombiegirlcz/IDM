package c7k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.retail.feature.payments.money_request.impl.R$string;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.l;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements p {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22053c;

    public e(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f22051a = uiKitResources.b(new TextLocalisedClause(R$string.money_request_rejection_suggestion_already_paid, null, null, 14)).toString();
        this.f22052b = uiKitResources.b(new TextLocalisedClause(R$string.money_request_rejection_suggestion_dont_owe, null, null, 14)).toString();
        this.f22053c = uiKitResources.b(new TextLocalisedClause(R$string.money_request_rejection_suggestion_will_pay_in_cash, null, null, 14)).toString();
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(new InputTextDelegate.Model("ID_TRANSFER_NOTE", new TextClause(domainState.f22046b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.money_request_rejection_add_reason, null, null, 14), null, null, null, null, true, 100, false, false, 0, false, 0, false, false, true, null, false, false, 0, false, false, null, -1090568200, 131071));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List list = listC;
        String str = domainState.f22046b;
        l lVar = l.FLEXBOX;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.money_request_rejection_suggestion_already_paid, null, null, 14);
        String str2 = this.f22051a;
        ActionsView.Item item = new ActionsView.Item("ALREADY_PAID_SUGGESTION_ID", Intrinsics.f(str, str2) ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, textLocalisedClause, null, null, null, null, false, null, null, str2, null, 24476);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.money_request_rejection_suggestion_dont_owe, null, null, 14);
        String str3 = this.f22052b;
        ActionsView.Item item2 = new ActionsView.Item("DONT_OWE_SUGGESTION_ID", Intrinsics.f(str, str3) ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, textLocalisedClause2, null, null, null, null, false, null, null, str3, null, 24476);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.money_request_rejection_suggestion_will_pay_in_cash, null, null, 14);
        String str4 = this.f22053c;
        ArrayList arrayListF0 = d0.F0(new z("ID_ACTIONS_LIST_ID", v.k(item, item2, new ActionsView.Item("WILL_PAY_IN_CASH_SUGGESTION_ID", Intrinsics.f(str, str4) ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, null, null, textLocalisedClause3, null, null, null, null, false, null, null, str4, null, 24476)), null, lVar, 0, 0, 116), list);
        int i = R$string.money_request_rejection_title;
        MoneyRequest moneyRequest = domainState.f22045a;
        return new c(arrayListF0, new TextLocalisedClause(i, u.c(new TextClause(com.revolut.domain.models.moneyrequest.a.c(moneyRequest.f60320l), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.money_request_rejection_button_title, null, null, 14), domainState.f22047c, new MoneyClause(moneyRequest.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
    }
}
