package hi6;

import aw0.o9;
import c55.n0;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.external_accounts.api.model.consent.ConsentExpiration;
import com.revolut.feature.external_accounts.impl.R$plurals;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.vd0;
import ip0.y10;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yp0.e0;
import zhm.a0;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f152525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f152526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f152527c;
    public final g d;
    public final Clock e;

    public p(k personalSectionsFactory, d jointSectionsFactory, i merchantSectionsFactory, g juniorSectionsFactory, Clock clock) {
        Intrinsics.checkNotNullParameter(personalSectionsFactory, "personalSectionsFactory");
        Intrinsics.checkNotNullParameter(jointSectionsFactory, "jointSectionsFactory");
        Intrinsics.checkNotNullParameter(merchantSectionsFactory, "merchantSectionsFactory");
        Intrinsics.checkNotNullParameter(juniorSectionsFactory, "juniorSectionsFactory");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f152525a = personalSectionsFactory;
        this.f152526b = jointSectionsFactory;
        this.f152527c = merchantSectionsFactory;
        this.d = juniorSectionsFactory;
        this.e = clock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.ArrayList] */
    public final n a(ei6.d dVar, List pockets, List list, m mVar, Set enabledPockets, List creditCards, Set enabledCredits, List list2, Set set, List list3, Set set2, uib.a aVar, List list4, List list5, List list6, Set enabledVaults, Map map, final Set enabledJuniorPockets, List list7, ConsentExpiration consentExpiration, final Map map2, boolean z) {
        String str;
        Collection collectionG;
        ArrayList arrayList;
        ArrayList arrayList2;
        fi6.i iVar;
        String str2;
        Collection collection;
        Iterable iterableG;
        Iterable iterableG2;
        Iterable iterable;
        Iterable iterable2;
        ?? arrayList3;
        Iterable iterableG3;
        List list8;
        List listE0;
        List listE02;
        Collection collectionU;
        Iterable iterableG4;
        Iterable iterableG5;
        Iterable iterableG6;
        Iterable iterableG7;
        Iterable iterableG8;
        List list9;
        List list10;
        Clause textLocalisedQuantityClause;
        TextLocalisedClause textLocalisedClause;
        Map toBaseCurrencyRatesMap = map2;
        Intrinsics.checkNotNullParameter(enabledPockets, "enabledPockets");
        Intrinsics.checkNotNullParameter(creditCards, "creditCards");
        Intrinsics.checkNotNullParameter(enabledCredits, "enabledCredits");
        String str3 = "enabledVaults";
        Intrinsics.checkNotNullParameter(enabledVaults, "enabledVaults");
        Intrinsics.checkNotNullParameter(enabledJuniorPockets, "enabledJuniorPockets");
        Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
        if (pockets == null) {
            collectionU = f0.f322471a;
        } else if (pockets.isEmpty()) {
            RowDelegate.Model model = new RowDelegate.Model("title_list_id_empty", null, new TextLocalisedClause(R.string.error_generic, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            collectionU = u.c(model);
        } else {
            LinkedHashSet enabledCredits2 = a1.l(a1.l(a1.l(enabledPockets, enabledCredits), set2 != null ? set2 : h0.f322473a), enabledVaults);
            fi6.i iVarA = fi6.j.a(list5 == null ? f0.f322471a : list5);
            b bVar = this.f152525a.f152519a;
            ArrayList<Subaccount> arrayList4 = iVarA.f135315a;
            Intrinsics.checkNotNullParameter(pockets, "pockets");
            Intrinsics.checkNotNullParameter(creditCards, "creditCards");
            String str4 = "enabledAccounts";
            Intrinsics.checkNotNullParameter(enabledCredits2, "enabledAccounts");
            Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
            if (pockets.isEmpty()) {
                collectionG = f0.f322471a;
                str = "enabledJuniorPockets";
            } else {
                List<io3.d> list11 = pockets;
                str = "enabledJuniorPockets";
                ArrayList arrayList5 = new ArrayList(w.t(list11, 10));
                for (io3.d dVar2 : list11) {
                    xi0.a aVar2 = xi0.b.Companion;
                    String str5 = dVar2.f163147c;
                    aVar2.getClass();
                    arrayList5.add(bVar.b(dVar2, enabledCredits2, (n9l.a) toBaseCurrencyRatesMap.get(xi0.a.a(str5))));
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_accounts, null, null, 14);
                e0 e0Var = e0.INSIDE_BOX;
                collectionG = yp0.b.g(arrayList5, b.e(textLocalisedClause2, "list_header_personal_accounts_list_id", e0Var), e0Var, 0, 0, 124);
            }
            if (arrayList4.isEmpty() && ((list10 = list6) == null || list10.isEmpty())) {
                iterableG = f0.f322471a;
                iVar = iVarA;
                str2 = "enabledAccounts";
                collection = collectionG;
            } else {
                ArrayList arrayList6 = new ArrayList(w.t(arrayList4, 10));
                for (Subaccount subaccount : arrayList4) {
                    arrayList6.add(b.d(subaccount, enabledCredits2, (n9l.a) toBaseCurrencyRatesMap.get(subaccount.getCurrency())));
                }
                if (list6 != null) {
                    List list12 = list6;
                    arrayList = arrayList6;
                    arrayList2 = new ArrayList(w.t(list12, 10));
                    Iterator it8 = list12.iterator();
                    while (it8.hasNext()) {
                        io3.d dVar3 = ((uc3.a) it8.next()).f278974b;
                        String str6 = dVar3.f163145a;
                        Iterator it9 = it8;
                        String name = dVar3.d;
                        fi6.i iVar2 = iVarA;
                        long j2 = dVar3.i;
                        String currency = dVar3.f163147c;
                        xi0.b.Companion.getClass();
                        Collection collection2 = collectionG;
                        n9l.a aVar3 = (n9l.a) toBaseCurrencyRatesMap.get(xi0.a.a(currency));
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(enabledCredits2, str3);
                        arrayList2.add(new SelectableDelegate.Model("vault_list_item_".concat(currency), new RowDelegate.Model("vault_list_item_".concat(currency), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cashback, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), null, null, new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, new RowDelegate.Model.c.b(b.g(j2, currency), b.h(b.a(b.g(j2, currency).f57821a, aVar3)), null, false, 124), false, false, null, null, null, null, null, str6, null, 0, 0, 0, 0, 1056958444), b.i(str6, enabledCredits2), null, vd0.CHECKBOX, false, null, str6, null, false, 32488));
                        it8 = it9;
                        iVarA = iVar2;
                        str4 = str4;
                        collectionG = collection2;
                        str3 = str3;
                    }
                } else {
                    arrayList = arrayList6;
                    arrayList2 = null;
                }
                iVar = iVarA;
                str2 = str4;
                collection = collectionG;
                Iterable iterable3 = arrayList2;
                if (arrayList2 == null) {
                    iterable3 = f0.f322471a;
                }
                ArrayList arrayListE0 = d0.E0(iterable3, arrayList);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_pockets, null, null, 14);
                e0 e0Var2 = e0.INSIDE_BOX;
                iterableG = yp0.b.g(arrayListE0, b.e(textLocalisedClause3, "list_header_personal_vaults_list_id", e0Var2), e0Var2, 0, 0, 124);
            }
            List list13 = list3;
            if (list13 == null || list13.isEmpty() || aVar == null) {
                iterableG2 = f0.f322471a;
            } else {
                List<SavingsAccountDetails> list14 = list3;
                ArrayList arrayList7 = new ArrayList(w.t(list14, 10));
                for (SavingsAccountDetails savingsAccountDetails : list14) {
                    xi0.a aVar4 = xi0.b.Companion;
                    String currency2 = savingsAccountDetails.f86460a.getCurrency();
                    aVar4.getClass();
                    arrayList7.add(b.c(savingsAccountDetails, enabledCredits2, (n9l.a) toBaseCurrencyRatesMap.get(xi0.a.a(currency2))));
                }
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(oc.c.r(aVar.f280366a), null, null, 14);
                e0 e0Var3 = e0.INSIDE_BOX;
                iterableG2 = yp0.b.g(arrayList7, b.e(textLocalisedClause4, "list_header_personal_savings_list_id", e0Var3), e0Var3, 0, 0, 124);
            }
            if (creditCards.isEmpty() && ((list9 = list2) == null || list9.isEmpty())) {
                iterableG3 = f0.f322471a;
                iterable = iterableG;
                iterable2 = iterableG2;
            } else {
                List<CreditCard> list15 = creditCards;
                ArrayList arrayList8 = new ArrayList(w.t(list15, 10));
                for (CreditCard creditCard : list15) {
                    Intrinsics.checkNotNullParameter(creditCard, "creditCard");
                    Intrinsics.checkNotNullParameter(enabledCredits2, "enabledCredits");
                    dj0.d dVar4 = creditCard.d;
                    MoneyClause moneyClauseG = b.g(dVar4.f115082a, dVar4.f115083b.f306286a);
                    xi0.b bVar2 = creditCard.f69798l;
                    arrayList8.add(new SelectableDelegate.Model(j6.a.q("credit_list_item_", bVar2.f306286a), new RowDelegate.Model(j6.a.q("credit_list_item_", bVar2.f306286a), creditCard.f69797j, null, null, new TextLocalisedClause(R$string.auth_account_select_account_credit_item, null, null, 14), null, null, null, 0, new RowDelegate.Model.c.b(moneyClauseG, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_switcher_cell_accessory_subtitle_available_balance, null, null, 14), null, false, 124), false, false, null, null, null, null, null, creditCard.f69793b, null, 0, 0, 0, 0, 1056958444), b.i(creditCard.f69793b, enabledCredits2), null, vd0.CHECKBOX, false, null, creditCard.f69793b, null, false, 32488));
                    iterableG = iterableG;
                    iterableG2 = iterableG2;
                }
                iterable = iterableG;
                iterable2 = iterableG2;
                if (list2 != null) {
                    arrayList3 = new ArrayList();
                    Iterator it10 = list2.iterator();
                    while (it10.hasNext()) {
                        Loan loan = (Loan) it10.next();
                        Set enabledLoans = set == null ? h0.f322473a : set;
                        n9l.a aVar5 = (n9l.a) toBaseCurrencyRatesMap.get(loan.f70123x);
                        Intrinsics.checkNotNullParameter(loan, "loan");
                        Intrinsics.checkNotNullParameter(enabledLoans, "enabledLoans");
                        n0 n0Var = (n0) bVar.f152509b;
                        MoneyClause moneyClauseB = n0Var.b(loan, true);
                        dj0.d dVarA = b.a(moneyClauseB.f57821a, aVar5);
                        xi0.b bVar3 = loan.f70123x;
                        Iterator it11 = it10;
                        String strQ = j6.a.q("loan_list_item_", bVar3.f306286a);
                        String strQ2 = j6.a.q("loan_list_item_", bVar3.f306286a);
                        LayeredImage layeredImageH = n0Var.h(loan.o);
                        Clause clauseC = n0Var.c(loan);
                        TextLocalisedClause textLocalisedClauseI = n0Var.i(loan);
                        Clause clauseG = n0Var.g(loan);
                        if (clauseG == null) {
                            clauseG = b.h(dVarA);
                        }
                        arrayList3.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, layeredImageH, null, null, clauseC, textLocalisedClauseI, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, clauseG, null, false, 124), false, false, null, null, null, null, null, loan.f70108a, null, 0, 0, 0, 0, 1056958316), b.i(loan.f70108a, enabledLoans), null, vd0.CHECKBOX, false, null, loan.f70108a, null, false, 32488));
                        it10 = it11;
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = f0.f322471a;
                }
                ArrayList arrayListE02 = d0.E0((Iterable) arrayList3, arrayList8);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_credit, null, null, 14);
                e0 e0Var4 = e0.INSIDE_BOX;
                iterableG3 = yp0.b.g(arrayListE02, b.e(textLocalisedClause5, "list_header_personal_credit_list_id", e0Var4), e0Var4, 0, 0, 124);
            }
            ArrayList arrayListE03 = d0.E0(iterableG3, d0.E0(iterable2, d0.E0(iterable, collection)));
            List listE03 = arrayListE03.isEmpty() ? f0.f322471a : d0.E0(arrayListE03, u.c(b.f(bVar, new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_personal, null, null, 14), "list_header_personal_list_id")));
            b bVar4 = this.f152526b.f152511a;
            fi6.i iVar3 = iVar;
            ArrayList<Subaccount> jointVaults = iVar3.f135317c;
            Intrinsics.checkNotNullParameter(jointVaults, "jointVaults");
            String str7 = str2;
            Intrinsics.checkNotNullParameter(enabledCredits2, str7);
            Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
            List list16 = mVar != null ? mVar.f152521a : null;
            List list17 = list16;
            if ((list17 == null || list17.isEmpty()) && jointVaults.isEmpty() && ((list8 = list4) == null || list8.isEmpty())) {
                listE0 = f0.f322471a;
            } else {
                ListSubheaderDelegate.Model modelF = b.f(bVar4, new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_joint, null, null, 14), "list_header_joint_list_id");
                if (d0.T(d.f152510b, mVar != null ? mVar.f152522b : null)) {
                    List listC = u.c(modelF);
                    List listC2 = u.c(new sa("joint_data_sharing_list_id", (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_joint_data_sharing_banner_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_joint_data_sharing_banner_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040));
                    yp0.b.k(listC2, 0, 0, 0, 0, 31);
                    listE0 = d0.E0(listC2, listC);
                } else {
                    if (list17 == null || list17.isEmpty()) {
                        iterableG6 = f0.f322471a;
                    } else {
                        List<io3.d> list18 = list16;
                        ArrayList arrayList9 = new ArrayList(w.t(list18, 10));
                        for (io3.d dVar5 : list18) {
                            xi0.a aVar6 = xi0.b.Companion;
                            String str8 = dVar5.f163147c;
                            aVar6.getClass();
                            arrayList9.add(bVar4.b(dVar5, enabledCredits2, (n9l.a) toBaseCurrencyRatesMap.get(xi0.a.a(str8))));
                        }
                        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_accounts, null, null, 14);
                        e0 e0Var5 = e0.INSIDE_BOX;
                        iterableG6 = yp0.b.g(arrayList9, b.e(textLocalisedClause6, "list_header_joint_accounts_list_id", e0Var5), e0Var5, 0, 0, 124);
                    }
                    if (jointVaults.isEmpty()) {
                        iterableG7 = f0.f322471a;
                    } else {
                        ArrayList arrayList10 = new ArrayList(w.t(jointVaults, 10));
                        for (Subaccount subaccount2 : jointVaults) {
                            arrayList10.add(b.d(subaccount2, enabledCredits2, (n9l.a) toBaseCurrencyRatesMap.get(subaccount2.getCurrency())));
                        }
                        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_pockets, null, null, 14);
                        e0 e0Var6 = e0.INSIDE_BOX;
                        iterableG7 = yp0.b.g(arrayList10, b.e(textLocalisedClause7, "list_header_joint_vaults_list_id", e0Var6), e0Var6, 0, 0, 124);
                    }
                    List list19 = list4;
                    if (list19 == null || list19.isEmpty()) {
                        iterableG8 = f0.f322471a;
                    } else {
                        List<SavingsAccountDetails> list20 = list4;
                        ArrayList arrayList11 = new ArrayList(w.t(list20, 10));
                        for (SavingsAccountDetails savingsAccountDetails2 : list20) {
                            xi0.a aVar7 = xi0.b.Companion;
                            String currency3 = savingsAccountDetails2.f86460a.getCurrency();
                            aVar7.getClass();
                            arrayList11.add(b.c(savingsAccountDetails2, enabledCredits2, (n9l.a) toBaseCurrencyRatesMap.get(xi0.a.a(currency3))));
                        }
                        TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_savings, null, null, 14);
                        e0 e0Var7 = e0.INSIDE_BOX;
                        iterableG8 = yp0.b.g(arrayList11, b.e(textLocalisedClause8, "list_header_joint_savings_list_id", e0Var7), e0Var7, 0, 0, 124);
                    }
                    listE0 = d0.E0(iterableG8, d0.E0(iterableG7, d0.E0(iterableG6, u.c(modelF))));
                }
            }
            b bVar5 = this.f152527c.f152518a;
            ArrayList<Subaccount> proVaults = iVar3.f135316b;
            Intrinsics.checkNotNullParameter(proVaults, "proVaults");
            Intrinsics.checkNotNullParameter(enabledCredits2, str7);
            Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
            List list21 = list;
            if ((list21 == null || list21.isEmpty()) && proVaults.isEmpty()) {
                listE02 = f0.f322471a;
            } else {
                List listC3 = u.c(b.f(bVar5, new TextLocalisedClause(R$string.auth_account_select_account_merchant_pocket_header, null, null, 14), "list_header_merchant_list_id"));
                if (list21 == null || list21.isEmpty()) {
                    iterableG4 = f0.f322471a;
                } else {
                    List<io3.d> list22 = list;
                    ArrayList arrayList12 = new ArrayList(w.t(list22, 10));
                    for (io3.d dVar6 : list22) {
                        xi0.a aVar8 = xi0.b.Companion;
                        String str9 = dVar6.f163147c;
                        aVar8.getClass();
                        arrayList12.add(bVar5.b(dVar6, enabledCredits2, (n9l.a) toBaseCurrencyRatesMap.get(xi0.a.a(str9))));
                    }
                    TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_accounts, null, null, 14);
                    e0 e0Var8 = e0.INSIDE_BOX;
                    iterableG4 = yp0.b.g(arrayList12, b.e(textLocalisedClause9, "list_header_merchant_accounts_list_id", e0Var8), e0Var8, 0, 0, 124);
                }
                if (proVaults.isEmpty()) {
                    iterableG5 = f0.f322471a;
                } else {
                    ArrayList arrayList13 = new ArrayList(w.t(proVaults, 10));
                    for (Subaccount subaccount3 : proVaults) {
                        arrayList13.add(b.d(subaccount3, enabledCredits2, (n9l.a) toBaseCurrencyRatesMap.get(subaccount3.getCurrency())));
                    }
                    TextLocalisedClause textLocalisedClause10 = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_pockets, null, null, 14);
                    e0 e0Var9 = e0.INSIDE_BOX;
                    iterableG5 = yp0.b.g(arrayList13, b.e(textLocalisedClause10, "list_header_merchant_vaults_list_id", e0Var9), e0Var9, 0, 0, 124);
                }
                listE02 = d0.E0(iterableG5, d0.E0(iterableG4, listC3));
            }
            List youthSavings = list7 == null ? f0.f322471a : list7;
            Intrinsics.checkNotNullParameter(youthSavings, "youthSavings");
            Set set3 = enabledJuniorPockets;
            Intrinsics.checkNotNullParameter(set3, str);
            Intrinsics.checkNotNullParameter(enabledCredits2, "enabledSavings");
            Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
            Set<Map.Entry> setEntrySet = (map == null ? r0.g() : map).entrySet();
            ArrayList arrayList14 = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                final bs8.b bVar6 = (bs8.b) entry.getKey();
                List list23 = (List) entry.getValue();
                final g gVar = this.d;
                b bVar7 = gVar.f152515a;
                int i = R$string.open_banking_consent_flow_accounts_information_header_junior_accounts;
                List list24 = listE03;
                String str10 = bVar6.f18080b;
                String str11 = bVar6.f18079a;
                List list25 = listE0;
                List list26 = listE02;
                List list27 = youthSavings;
                ListSubheaderDelegate.Model modelF2 = b.f(bVar7, new TextLocalisedClause(i, u.c(str10), null, 12), "list_header_junior_list_id" + str11);
                List list28 = list23;
                ArrayList arrayList15 = new ArrayList();
                for (Object obj2 : list28) {
                    if (((bs8.a) obj2).f18077b instanceof bs8.c) {
                        arrayList15.add(obj2);
                    }
                }
                final int i2 = 0;
                final Set set4 = set3;
                final Map map3 = toBaseCurrencyRatesMap;
                List listJ = b.j(arrayList15, R$string.open_banking_consent_flow_accounts_information_header_accounts, j6.a.q("list_header_junior_accounts_list_id", str11), new Function1() { // from class: hi6.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        bs8.a pocket = (bs8.a) obj3;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(pocket, "pocket");
                                return gVar.a(pocket, set4, (n9l.a) map3.get(pocket.f18078c.f115083b), bVar6);
                            default:
                                Intrinsics.checkNotNullParameter(pocket, "pocket");
                                return gVar.a(pocket, set4, (n9l.a) map3.get(pocket.f18078c.f115083b), bVar6);
                        }
                    }
                });
                ArrayList arrayList16 = new ArrayList();
                for (Object obj3 : list28) {
                    if (((bs8.a) obj3).f18077b instanceof bs8.d) {
                        arrayList16.add(obj3);
                    }
                }
                final int i3 = 1;
                toBaseCurrencyRatesMap = map2;
                List listJ2 = b.j(arrayList16, R$string.open_banking_consent_flow_accounts_information_header_pockets, j6.a.q("list_header_junior_vaults_list_id", str11), new Function1() { // from class: hi6.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj32) {
                        bs8.a pocket = (bs8.a) obj32;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(pocket, "pocket");
                                return gVar.a(pocket, enabledJuniorPockets, (n9l.a) map2.get(pocket.f18078c.f115083b), bVar6);
                            default:
                                Intrinsics.checkNotNullParameter(pocket, "pocket");
                                return gVar.a(pocket, enabledJuniorPockets, (n9l.a) map2.get(pocket.f18078c.f115083b), bVar6);
                        }
                    }
                });
                ArrayList arrayList17 = new ArrayList();
                for (Object obj4 : list27) {
                    if (Intrinsics.f(((SavingsAccountDetails) obj4).f86460a.f, str11)) {
                        arrayList17.add(obj4);
                    }
                }
                ArrayList arrayListE04 = d0.E0(b.j(arrayList17, R$string.open_banking_consent_flow_accounts_information_header_savings, j6.a.q("list_header_junior_savings_list_id", str11), new h8b.b(gVar, enabledCredits2, toBaseCurrencyRatesMap)), d0.E0(listJ2, listJ));
                a0.x(arrayListE04.isEmpty() ? f0.f322471a : d0.E0(arrayListE04, u.c(modelF2)), arrayList14);
                listE03 = list24;
                listE0 = list25;
                listE02 = list26;
                set3 = enabledJuniorPockets;
                youthSavings = list27;
            }
            List[] elements = {listE03, listE0, listE02, arrayList14};
            Intrinsics.checkNotNullParameter(elements, "elements");
            collectionU = w.u(kotlin.collections.d.L(elements));
        }
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("link_list_id", new TextLocalisedClause(R$string.auth_account_access_details_title, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        ArrayList arrayListF0 = d0.F0(model2, collectionU);
        if (dVar != null) {
            String str12 = dVar.f126446a;
            if (z || consentExpiration == null) {
                if (!z) {
                    textLocalisedClause = new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_renew_screen_subtitle, u.c(str12), null, 12);
                } else if (consentExpiration == null) {
                    textLocalisedClause = new TextLocalisedClause(R$string.open_banking_accounts_information_secondary_description, u.c(str12), null, 12);
                } else {
                    int i5 = R$string.open_banking_accounts_information_secondary_description_expires_at;
                    long j3 = consentExpiration.f72238a;
                    TimeClause.Format.INSTANCE.getClass();
                    textLocalisedClause = new TextLocalisedClause(i5, v.k(str12, new TimeClause(j3, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                }
                textLocalisedQuantityClause = textLocalisedClause;
            } else {
                long jMax = Math.max(0L, TimeUnit.MILLISECONDS.toDays(consentExpiration.f72238a - this.e.millis()));
                int i6 = R$plurals.open_banking_consent_flow_accounts_information_amend_screen_subtitle_with_expiration;
                Long lValueOf = Long.valueOf(jMax);
                long j5 = consentExpiration.f72238a;
                TimeClause.Format.INSTANCE.getClass();
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(i6, lValueOf, v.k(str12, new TimeClause(j5, TimeClause.Format.f57959a, null, null, 12), Long.valueOf(jMax)), (Style) null, 24);
            }
        } else {
            textLocalisedQuantityClause = null;
        }
        return new n(textLocalisedQuantityClause, arrayListF0);
    }
}
