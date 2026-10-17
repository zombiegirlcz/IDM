package p1j;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f231969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BalanceSelector$ExtraConfiguration.AdditionalCurrenciesButton f231970b;

    public o(f01.c uiKitResources, BalanceSelector$InputData inputData) {
        Object next;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f231969a = uiKitResources;
        Iterator it8 = inputData.i.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (next instanceof BalanceSelector$ExtraConfiguration.AdditionalCurrenciesButton) {
                    break;
                }
            }
        }
        this.f231970b = (BalanceSelector$ExtraConfiguration.AdditionalCurrenciesButton) next;
    }

    public final List a(k1j.c type, List existingBalances, CountryProfile countryProfile) {
        BalanceSelector$ExtraConfiguration.AdditionalCurrenciesButton additionalCurrenciesButton;
        List listE0;
        k1j.a aVar;
        AccountId d;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(existingBalances, "existingBalances");
        if ((countryProfile == null || countryProfile.f92233c) && (additionalCurrenciesButton = this.f231970b) != null) {
            int i = n.f231968a[type.ordinal()];
            AccountId.Personal personal = AccountId.Personal.f51414a;
            if (i == 1) {
                List list = existingBalances;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((BalanceWrapper) it8.next()).getF99406c().f306286a);
                }
                Set<String> setK = a1.k(a1.l(a1.l(additionalCurrenciesButton.f99369a, additionalCurrenciesButton.f99370b), additionalCurrenciesButton.e), arrayList);
                ArrayList arrayList2 = new ArrayList(w.t(setK, 10));
                for (String str : setK) {
                    xi0.b.Companion.getClass();
                    xi0.b bVarA = xi0.a.a(str);
                    if (cp5.d.A(bVarA)) {
                        aVar = k1j.a.NON_EXISTING_CURRENCY;
                    } else if (cp5.d.z(bVarA)) {
                        aVar = k1j.a.CRYPTO_NON_EXISTING_CURRENCY;
                    } else {
                        if (!cp5.d.y(bVarA)) {
                            throw new IllegalStateException(j6.a.q("Unsupported currency ", bVarA.f306286a));
                        }
                        aVar = k1j.a.COMMODITIES_NON_EXISTING_CURRENCY;
                    }
                    arrayList2.add(b(bVarA, aVar, personal));
                }
                listE0 = d0.E0(arrayList2, existingBalances);
            } else if (i == 2) {
                List list2 = existingBalances;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(((BalanceWrapper) it9.next()).getF99406c().f306286a);
                }
                Set<String> setK2 = a1.k(additionalCurrenciesButton.d, arrayList3);
                ArrayList arrayList4 = new ArrayList(w.t(setK2, 10));
                for (String str2 : setK2) {
                    xi0.b.Companion.getClass();
                    arrayList4.add(b(xi0.a.a(str2), k1j.a.PRO_NON_EXISTING_CURRENCY, personal));
                }
                listE0 = d0.E0(arrayList4, existingBalances);
            } else if (i != 3) {
                listE0 = existingBalances;
            } else {
                List list3 = existingBalances;
                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(((BalanceWrapper) it10.next()).getF99406c().f306286a);
                }
                Set<String> setK3 = a1.k(additionalCurrenciesButton.f99371c, arrayList5);
                ArrayList arrayList6 = new ArrayList(w.t(setK3, 10));
                for (String str3 : setK3) {
                    xi0.b.Companion.getClass();
                    xi0.b bVarA2 = xi0.a.a(str3);
                    k1j.a aVar2 = k1j.a.JOINT_NON_EXISTING_CURRENCY;
                    BalanceWrapper balanceWrapper = (BalanceWrapper) d0.d0(existingBalances);
                    if (balanceWrapper == null || (d = balanceWrapper.getD()) == null) {
                        d = personal;
                    }
                    arrayList6.add(b(bVarA2, aVar2, d));
                }
                listE0 = d0.E0(arrayList6, existingBalances);
            }
            if (listE0 != null) {
                return listE0;
            }
        }
        return existingBalances;
    }

    public final BalanceWrapper.NonExistingCurrencyBalanceWrapper b(xi0.b bVar, k1j.a aVar, AccountId accountId) {
        return new BalanceWrapper.NonExistingCurrencyBalanceWrapper(bVar, accountId, aVar, this.f231969a.b(new CurrencyClause(bVar, CurrencyClause.Format.DisplayName.f57755a, null, 4)).toString(), null);
    }
}
