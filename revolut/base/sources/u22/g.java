package u22;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.IdentityType;
import com.revolut.retail.common.ui.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        int i;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f276540a;
        ApmContact apmContact = domainState.f276541b;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            boolean z = false;
            if (!it8.hasNext()) {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, apmContact != null, null, null, 988), null, null, 55), arrayList, new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_new_contact_recipient_account_select_account, null, null, 14), null, null, null, false, 30));
            }
            ApmContact apmContact2 = (ApmContact) it8.next();
            if (apmContact != null && Intrinsics.f(apmContact2.getF62134a(), apmContact.getF62134a()) && apmContact2.getF62130g() == apmContact.getF62130g()) {
                z = true;
            }
            IdentityType f62130g = apmContact2.getF62130g();
            String str = "ROW_ITEM_" + apmContact2.getF62134a() + "_" + apmContact2.getF62130g().getType();
            String str2 = "INNER_ITEM_" + apmContact2.getF62134a();
            int i2 = f.f276543a[f62130g.ordinal()];
            if (i2 == 1) {
                i = com.revolut.feature.apm.core.api.R$string.apm_new_contact_recipient_account_identity_type_business;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.apm.core.api.R$string.apm_new_contact_recipient_account_identity_type_personal;
            }
            arrayList.add(new SelectableDelegate.Model(str, new RowDelegate.Model(str2, null, new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), z ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, apmContact2, null, false, 32488));
        }
    }
}
