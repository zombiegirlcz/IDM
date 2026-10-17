package mue;

import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.topup_screen.api.model.b;
import io3.n;
import io3.o;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jve.a;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final StoredMethod a(jve.a entity) {
        o oVar;
        o oVar2;
        ArrayList arrayList;
        StoredMethod.LinkedAccount linkedAccount;
        Intrinsics.checkNotNullParameter(entity, "entity");
        a.b institution = entity.getInstitution();
        String id10 = institution.getId();
        String name = institution.getName();
        a.b.C1019a logo = institution.getLogo();
        StoredMethod.Mandate mandate = null;
        bVarValueOf = null;
        b bVarValueOf = null;
        io3.b bVar = logo != null ? new io3.b(io3.a.valueOf(logo.getType()), logo.getValue()) : null;
        te6.a topUpSettings = institution.getTopUpSettings();
        if (topUpSettings != null) {
            try {
                oVar = new o(n.valueOf(topUpSettings.getSystem()), topUpSettings.getRecurrenceSupported());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, e, h0Var);
                oVar = null;
            }
            oVar2 = oVar;
        } else {
            oVar2 = null;
        }
        StoredMethod.Institution institution2 = new StoredMethod.Institution(id10, name, bVar, oVar2, true);
        a.C1016a accountDetails = entity.getAccountDetails();
        String id11 = accountDetails.getId();
        String accountLabel = accountDetails.getAccountLabel();
        xi0.a aVar = xi0.b.Companion;
        String currencyCode = accountDetails.getCurrencyCode();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currencyCode);
        String accountName = accountDetails.getAccountName();
        List accountNumbers = accountDetails.getAccountNumbers();
        if (accountNumbers != null) {
            List list = accountNumbers;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                List<a.C1016a.C1017a.C1018a> fields = ((a.C1016a.C1017a) it8.next()).getFields();
                ArrayList arrayList3 = new ArrayList(w.t(fields, 10));
                for (a.C1016a.C1017a.C1018a c1018a : fields) {
                    arrayList3.add(new StoredMethod.AccountDetails.AccountNumber.Field(c1018a.getLabel(), c1018a.getValue()));
                }
                arrayList2.add(new StoredMethod.AccountDetails.AccountNumber(arrayList3));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        StoredMethod.AccountDetails accountDetails2 = new StoredMethod.AccountDetails(id11, accountLabel, accountName, bVarA, arrayList);
        Boolean deletionAllowed = entity.getDeletionAllowed();
        a.c linkedAccount2 = entity.getLinkedAccount();
        if (linkedAccount2 != null) {
            String id12 = linkedAccount2.getId();
            com.revolut.feature.topup_screen.api.model.a aVarValueOf = com.revolut.feature.topup_screen.api.model.a.valueOf(linkedAccount2.getState());
            jo3.b balance = linkedAccount2.getBalance();
            dj0.d dVarV = balance != null ? hx7.a.v(balance) : null;
            Long validUntil = linkedAccount2.getValidUntil();
            linkedAccount = new StoredMethod.LinkedAccount(id12, aVarValueOf, dVarV, validUntil != null ? Instant.ofEpochMilli(validUntil.longValue()) : null);
        } else {
            linkedAccount = null;
        }
        Boolean eligibleForMandateCreation = entity.getEligibleForMandateCreation();
        a.d mandate2 = entity.getMandate();
        if (mandate2 != null) {
            jo3.b monthlyPeriodicLimit = mandate2.getMonthlyPeriodicLimit();
            jo3.b monthlyAmountRemaining = mandate2.getMonthlyAmountRemaining();
            StoredMethod.Mandate openBanking = (monthlyPeriodicLimit == null || monthlyAmountRemaining == null) ? null : new StoredMethod.Mandate.OpenBanking(mandate2.getId(), mandate2.getHasEditableLimits(), hx7.a.v(mandate2.getMaximumIndividualLimit()), hx7.a.v(monthlyPeriodicLimit), hx7.a.v(monthlyAmountRemaining));
            if (openBanking == null) {
                String id13 = mandate2.getId();
                try {
                    String state = mandate2.getState();
                    if (state != null) {
                        bVarValueOf = b.valueOf(state);
                    }
                } catch (Exception e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                    d.a(c.ERROR, null, null, e2, h0Var2);
                }
                openBanking = new StoredMethod.Mandate.PayTo(id13, mandate2.getHasEditableLimits(), hx7.a.v(mandate2.getMaximumIndividualLimit()), bVarValueOf);
            }
            mandate = openBanking;
        }
        return new StoredMethod(institution2, accountDetails2, deletionAllowed, linkedAccount, eligibleForMandateCreation, mandate);
    }
}
