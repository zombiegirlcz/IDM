package ll6;

import android.os.Parcelable;
import aw0.o9;
import c55.n0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.AmendmentType;
import com.revolut.domain.models.openbanking.ConsentPermission;
import com.revolut.domain.models.openbanking.ConsentType;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.domain.models.openbanking.PermissionType;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreenContract$InputData;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.tab.accounts.models.ProductId;
import ip0.ej;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m35.r;
import mx0.c7;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl6.c f196591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentDetailsScreenContract$InputData f196592b;

    public l(nl6.c consentDetailsMapper, ConsentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(consentDetailsMapper, "consentDetailsMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f196591a = consentDetailsMapper;
        this.f196592b = inputData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData;
        OpenBankingConsent openBankingConsent;
        OutboundOpenBankingClient outboundOpenBankingClient;
        String str;
        Collection collectionA;
        Map mapG;
        ?? arrayList;
        List list;
        ArrayList arrayList2;
        ?? arrayList3;
        List list2;
        List list3;
        Iterable iterable;
        Iterable iterable2;
        Map mapG2;
        Iterable iterable3;
        ConsentPermission consentPermissionValueOf;
        dj0.d dVar;
        boolean z;
        dj0.d dVar2;
        Image currencyImage;
        Clause currencyClause;
        Data data;
        Data data2;
        MoneyClause moneyClause;
        String str2;
        dj0.d dVarK;
        Data data3;
        Data data4;
        Data data5;
        Data data6;
        ejb.b bVar;
        List list4;
        Data data7;
        Data data8;
        List list5;
        yy0.j jVar2;
        yy0.j jVar3;
        int i;
        Image imageI;
        Collection collectionG;
        int i2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        nl6.c cVar = this.f196591a;
        gte.a aVar = cVar.f217043b;
        aim.e eVarB = u.b();
        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData2 = this.f196592b;
        OpenBankingConsent openBankingConsent2 = consentDetailsScreenContract$InputData2.f72772b;
        OutboundOpenBankingClient outboundOpenBankingClient2 = consentDetailsScreenContract$InputData2.f72771a;
        boolean z3 = false;
        String str3 = "consent";
        if (openBankingConsent2 instanceof OpenBankingConsent.Default) {
            OpenBankingConsent.Default consent = (OpenBankingConsent.Default) openBankingConsent2;
            List list6 = consent.d;
            List list7 = consent.f;
            DateTime dateTime = consent.f60384c;
            int i3 = k.f196590a[consent.f60383b.ordinal()];
            if (i3 == 1) {
                Intrinsics.checkNotNullParameter(consent, "consent");
                aim.e eVarB2 = u.b();
                qv0.i[] elements = {nl6.c.c(dateTime), nl6.c.b(list7)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                eVarB2.addAll(listL);
                eVarB2.addAll(yp0.b.g(gl6.g.b(list6), new ListSubheaderDelegate.Model("PERMISSIONS_LIST_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.consent_details_permissions, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), null, 0, 0, 126));
                collectionA = u.a(eVarB2);
            } else if (i3 == 2) {
                Intrinsics.checkNotNullParameter(consent, "consent");
                aim.e eVarB3 = u.b();
                qv0.i[] elements2 = {nl6.c.c(dateTime), nl6.c.b(list7)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL2 = kotlin.collections.d.L(elements2);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
                eVarB3.addAll(listL2);
                collectionA = u.a(eVarB3);
            } else if (i3 != 3) {
                IllegalStateException illegalStateException = new IllegalStateException("Consent of type AU_READ_ONLY should be Australia instead of Default");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                collectionA = f0.f322471a;
            } else {
                Intrinsics.checkNotNullParameter(consent, "consent");
                aim.e eVarB4 = u.b();
                qv0.i[] elements3 = {new CellDetailsDelegate.Model("EXPIRY_ITEM_LIST_ID", new TextLocalisedClause(R$string.consent_details_expires, null, null, 14), dateTime != null ? new TimeClause(dateTime.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12) : new TextLocalisedClause(R$string.consent_expiry_never, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760), nl6.c.b(list7)};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                List listL3 = kotlin.collections.d.L(elements3);
                yp0.b.k(listL3, 0, 0, 0, 0, 31);
                eVarB4.addAll(listL3);
                eVarB4.addAll(yp0.b.g(gl6.g.b(list6), new ListSubheaderDelegate.Model("PERMISSIONS_LIST_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.consent_details_permissions, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), null, 0, 0, 126));
                collectionA = u.a(eVarB4);
            }
            consentDetailsScreenContract$InputData = consentDetailsScreenContract$InputData2;
            openBankingConsent = openBankingConsent2;
            outboundOpenBankingClient = outboundOpenBankingClient2;
            str = "consent";
        } else {
            boolean z4 = true;
            if (!(openBankingConsent2 instanceof OpenBankingConsent.Australia)) {
                throw new NoWhenBranchMatchedException();
            }
            OpenBankingConsent.Australia consent2 = (OpenBankingConsent.Australia) openBankingConsent2;
            ConsentType consentType = consent2.f60376b;
            if (k.f196590a[consentType.ordinal()] == 4) {
                e eVar = domainState.f196585a;
                Intrinsics.checkNotNullParameter(consent2, "consent");
                aim.e eVarB5 = u.b();
                fi6.d dVar3 = eVar != null ? eVar.f196583a : null;
                if (eVar == null || (mapG = eVar.f196584b) == null) {
                    mapG = r0.g();
                }
                Map map = mapG;
                if (dVar3 == null || (data8 = dVar3.f135297a) == null || (list5 = (List) data8.getContent()) == null) {
                    arrayList = f0.f322471a;
                } else {
                    arrayList = new ArrayList();
                    Iterator it8 = list5.iterator();
                    while (it8.hasNext()) {
                        Object next = it8.next();
                        io3.d dVar4 = (io3.d) next;
                        Iterator it9 = it8;
                        if (dVar4.f163148g == io3.j.PERSONAL && dVar4.e != io3.l.MERCHANT) {
                            arrayList.add(next);
                        }
                        it8 = it9;
                    }
                }
                ?? r172 = arrayList;
                if (dVar3 == null || (data7 = dVar3.f135301h) == null || (list = (List) data7.getContent()) == null) {
                    list = f0.f322471a;
                }
                fi6.i iVarA = fi6.j.a(list);
                ArrayList arrayList4 = iVarA.f135315a;
                if (dVar3 == null || (data6 = dVar3.f) == null || (bVar = (ejb.b) data6.getContent()) == null || (list4 = bVar.f126837b) == null) {
                    arrayList2 = arrayList4;
                    arrayList3 = f0.f322471a;
                } else {
                    List list8 = list4;
                    arrayList2 = arrayList4;
                    arrayList3 = new ArrayList(w.t(list8, 10));
                    Iterator it10 = list8.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(((SavingsAccountDetails) it10.next()).f86460a);
                    }
                }
                ?? r192 = arrayList3;
                if (dVar3 == null || (data5 = dVar3.f135298b) == null || (list2 = (List) data5.getContent()) == null) {
                    list2 = f0.f322471a;
                }
                if (dVar3 == null || (data4 = dVar3.f135299c) == null || (list3 = (List) data4.getContent()) == null) {
                    list3 = f0.f322471a;
                }
                if (dVar3 == null || (iterable = dVar3.d) == null) {
                    iterable = f0.f322471a;
                }
                if (dVar3 == null || (data3 = dVar3.e) == null || (iterable2 = (List) data3.getContent()) == null) {
                    iterable2 = f0.f322471a;
                }
                List list9 = list2;
                eVarB5.addAll(nl6.c.a(r172, arrayList2, r192, "PERSONAL_POCKETS_HEADER_LIST_ID", R$string.open_banking_consent_flow_accounts_information_header_personal, map));
                ArrayList arrayList5 = iVarA.f135317c;
                f0 f0Var = f0.f322471a;
                eVarB5.addAll(nl6.c.a(list3, arrayList5, f0Var, "JOINT_POCKETS_HEADER_LIST_ID", R$string.open_banking_consent_flow_accounts_information_header_joint, map));
                eVarB5.addAll(nl6.c.a(list9, iVarA.f135316b, f0Var, "MERCHANT_POCKETS_HEADER_LIST_ID", R$string.auth_account_select_account_merchant_pocket_header, map));
                Iterable iterable4 = iterable;
                ArrayList arrayList6 = new ArrayList(w.t(iterable4, 10));
                Iterator it11 = iterable4.iterator();
                while (it11.hasNext()) {
                    CreditCard creditCard = (CreditCard) it11.next();
                    arrayList6.add(new RowDelegate.Model(j6.a.q("CREDIT_CARD_ITEM_LIST_ID_", creditCard.f69793b), new RowDelegate.Model.MainImage.Image40(creditCard.f69797j, null, null, false, null, false, 62), new TextLocalisedClause(R$string.auth_account_select_account_credit_item, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(creditCard.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_switcher_cell_accessory_subtitle_available_balance, null, null, 14), null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
                    it11 = it11;
                    outboundOpenBankingClient2 = outboundOpenBankingClient2;
                    iterable2 = iterable2;
                }
                outboundOpenBankingClient = outboundOpenBankingClient2;
                Iterable iterable5 = iterable2;
                ArrayList arrayList7 = new ArrayList(w.t(iterable5, 10));
                Iterator it12 = iterable5.iterator();
                while (it12.hasNext()) {
                    Loan loan = (Loan) it12.next();
                    r rVar = cVar.f217042a;
                    Iterator it13 = it12;
                    MoneyClause moneyClauseB = ((n0) rVar).b(loan, z4);
                    n9l.a aVar2 = (n9l.a) map.get(loan.f70123x);
                    if (aVar2 != null) {
                        moneyClause = moneyClauseB;
                        str2 = str3;
                        dVarK = pyd.c.K(moneyClauseB.f57821a, aVar2.f213663c, aVar2.f213662b);
                    } else {
                        moneyClause = moneyClauseB;
                        str2 = str3;
                        dVarK = null;
                    }
                    String strQ = j6.a.q("LOAN_ITEM_LIST_ID_", loan.f70108a);
                    n0 n0Var = (n0) rVar;
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(n0Var.h(loan.o), null, null, false, null, false, 62);
                    Clause clauseC = n0Var.c(loan);
                    TextLocalisedClause textLocalisedClauseI = n0Var.i(loan);
                    TextLocalisedClause textLocalisedClauseG = n0Var.g(loan);
                    arrayList7.add(new RowDelegate.Model(strQ, image40, clauseC, null, 0, textLocalisedClauseI, null, null, 0, new RowDelegate.Model.c.b(moneyClause, textLocalisedClauseG == null ? dVarK != null ? new MoneyClause(dVarK, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null : textLocalisedClauseG, null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
                    it12 = it13;
                    str3 = str2;
                    z4 = true;
                }
                str = str3;
                ArrayList arrayListE0 = d0.E0(arrayList7, arrayList6);
                eVarB5.addAll(arrayListE0.isEmpty() ? f0.f322471a : yp0.b.g(arrayListE0, new ListSubheaderDelegate.Model("CREDIT_CARDS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_credit, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), e0.INSIDE_BOX, 0, 0, 124));
                if (dVar3 == null || (data2 = dVar3.f135302j) == null || (mapG2 = (Map) data2.getContent()) == null) {
                    mapG2 = r0.g();
                }
                if (dVar3 == null || (data = dVar3.k) == null || (iterable3 = (List) data.getContent()) == null) {
                    iterable3 = f0.f322471a;
                }
                Iterator it14 = mapG2.entrySet().iterator();
                while (it14.hasNext()) {
                    Map.Entry entry = (Map.Entry) it14.next();
                    bs8.b bVar2 = (bs8.b) entry.getKey();
                    List list10 = (List) entry.getValue();
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj2 : iterable3) {
                        Iterator it15 = it14;
                        if (Intrinsics.f(((SavingsAccountDetails) obj2).f86460a.f, bVar2.f18079a)) {
                            arrayList8.add(obj2);
                        }
                        it14 = it15;
                    }
                    Iterator it16 = it14;
                    List list11 = list10;
                    ArrayList arrayList9 = new ArrayList(w.t(list11, 10));
                    Iterator it17 = list11.iterator();
                    while (it17.hasNext()) {
                        bs8.a aVar3 = (bs8.a) it17.next();
                        dj0.d dVar5 = aVar3.f18078c;
                        dj0.d dVar6 = aVar3.f18078c;
                        Iterable iterable6 = iterable3;
                        bs8.e eVar2 = aVar3.f18077b;
                        xi0.b bVar3 = dVar5.f115083b;
                        Iterator it18 = it17;
                        n9l.a aVar4 = (n9l.a) map.get(bVar3);
                        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData3 = consentDetailsScreenContract$InputData2;
                        OpenBankingConsent openBankingConsent3 = openBankingConsent2;
                        dj0.d dVarK2 = aVar4 != null ? pyd.c.K(dVar6, aVar4.f213663c, aVar4.f213662b) : null;
                        String strQ2 = j6.a.q("JUNIOR_POCKET_ITEM_LIST_ID_", aVar3.f18076a);
                        boolean z6 = eVar2 instanceof bs8.d;
                        bs8.c cVar2 = bs8.c.f18082a;
                        if (z6) {
                            dVar = dVarK2;
                            z = z6;
                            dVar2 = dVar6;
                            currencyImage = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_vaults_personal, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue);
                        } else {
                            dVar = dVarK2;
                            z = z6;
                            dVar2 = dVar6;
                            if (!eVar2.equals(cVar2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            currencyImage = ((jte.d) aVar).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? new CurrencyImage(bVar3.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14) : new ContactImage(bVar2.f18079a, (String) null, (String) null, (String) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.o(bVar2.f18080b, " ", bVar2.f18081c), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550);
                        }
                        RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(currencyImage, null, null, false, null, false, 62);
                        if (z) {
                            String str4 = ((bs8.d) eVar2).f18083a;
                            currencyClause = !kotlin.text.d0.W(str4) ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CurrencyClause(bVar3, null, null, 6);
                        } else {
                            if (!eVar2.equals(cVar2)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            currencyClause = ((jte.d) aVar).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? new CurrencyClause(bVar3, null, null, 6) : ((d91.b) cVar.f217044c).a(ProductId.CURRENCY);
                        }
                        arrayList9.add(new RowDelegate.Model(strQ2, image402, currencyClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
                        iterable3 = iterable6;
                        it17 = it18;
                        consentDetailsScreenContract$InputData2 = consentDetailsScreenContract$InputData3;
                        openBankingConsent2 = openBankingConsent3;
                    }
                    Iterable iterable7 = iterable3;
                    ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData4 = consentDetailsScreenContract$InputData2;
                    OpenBankingConsent openBankingConsent4 = openBankingConsent2;
                    ArrayList arrayList10 = new ArrayList(w.t(arrayList8, 10));
                    Iterator it19 = arrayList8.iterator();
                    while (it19.hasNext()) {
                        arrayList10.add(nl6.c.d(((SavingsAccountDetails) it19.next()).f86460a, map));
                    }
                    ArrayList arrayListE02 = d0.E0(arrayList10, arrayList9);
                    eVarB5.addAll(arrayListE02.isEmpty() ? f0.f322471a : yp0.b.g(arrayListE02, new ListSubheaderDelegate.Model(j6.a.q("JUNIOR_POCKETS_HEADER_LIST_ID_", bVar2.f18079a), (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_header_junior_accounts, u.c(bVar2.f18080b), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), e0.INSIDE_BOX, 0, 0, 124));
                    it14 = it16;
                    iterable3 = iterable7;
                    consentDetailsScreenContract$InputData2 = consentDetailsScreenContract$InputData4;
                    openBankingConsent2 = openBankingConsent4;
                }
                consentDetailsScreenContract$InputData = consentDetailsScreenContract$InputData2;
                openBankingConsent = openBankingConsent2;
                ArrayList<PermissionType> arrayList11 = consent2.d;
                ArrayList arrayListS = t61.a.s("permissions", arrayList11);
                for (PermissionType permissionType : arrayList11) {
                    try {
                        consentPermissionValueOf = ConsentPermission.valueOf(permissionType.name());
                    } catch (IllegalArgumentException e) {
                        IllegalStateException illegalStateException2 = new IllegalStateException(e + ". No permission found among Australia consents permissions " + permissionType);
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        consentPermissionValueOf = null;
                    }
                    if (consentPermissionValueOf != null) {
                        arrayListS.add(consentPermissionValueOf);
                    }
                }
                ArrayList arrayListA = gl6.g.a(arrayListS);
                ArrayList arrayList12 = !arrayListA.isEmpty() ? arrayListA : null;
                if (arrayList12 != null) {
                    arrayListA = yp0.b.g(arrayList12, new ListSubheaderDelegate.Model("PERMISSIONS_LIST_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_permissions_info_screen_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                }
                eVarB5.addAll(arrayListA);
                collectionA = u.a(eVarB5);
            } else {
                consentDetailsScreenContract$InputData = consentDetailsScreenContract$InputData2;
                openBankingConsent = openBankingConsent2;
                outboundOpenBankingClient = outboundOpenBankingClient2;
                str = "consent";
                IllegalStateException illegalStateException3 = new IllegalStateException("Consent of type " + consentType + " should not be in Australia");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                collectionA = f0.f322471a;
            }
        }
        eVarB.addAll(collectionA);
        OpenBankingConsent openBankingConsent5 = openBankingConsent;
        boolean z11 = openBankingConsent5 instanceof OpenBankingConsent.Australia;
        if (z11) {
            OpenBankingConsent.Australia australia = (OpenBankingConsent.Australia) openBankingConsent5;
            Intrinsics.checkNotNullParameter(australia, str);
            DateTime dateTime2 = australia.k;
            List list12 = australia.f60381l;
            if (dateTime2 == null || list12.isEmpty()) {
                collectionG = f0.f322471a;
            } else {
                List<AmendmentType> list13 = list12;
                ArrayList arrayList13 = new ArrayList(w.t(list13, 10));
                for (AmendmentType amendmentType : list13) {
                    String strQ3 = j6.a.q("AMENDED_CONSENT_ITEM_LIST_ID_", amendmentType.name());
                    boolean z12 = z3;
                    RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z12, z12, 6);
                    int i5 = nl6.b.f217040a[amendmentType.ordinal()];
                    if (i5 == 1) {
                        i2 = R$string.open_banking_consents_amended_consent_sharing_duration;
                    } else if (i5 == 2) {
                        i2 = R$string.open_banking_consents_amended_consent_accounts_selected;
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R$string.open_banking_consents_amended_consent_information_shared;
                    }
                    arrayList13.add(new RowDelegate.Model(strQ3, image24, new TextLocalisedClause(i2, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                    z3 = false;
                }
                collectionG = yp0.b.g(arrayList13, new ListSubheaderDelegate.Model("AMENDED_CONSENT_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_consents_amended_consent_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), null, 0, 0, 126);
            }
            eVarB.addAll(collectionG);
        }
        ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData5 = consentDetailsScreenContract$InputData;
        if (!z11 || consentDetailsScreenContract$InputData5.f72773c) {
            RowDelegate.Model model = new RowDelegate.Model("REVOKE_ITEM_LIST_ID", null, new TextLocalisedClause(R$string.consent_action_revoke, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        if (z11) {
            jVar2 = null;
            ej ejVar = new ej("CDR_POLICY_FOOTER_LIST_ID", new c7(new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_permissions_info_au_screen_footer, v.k(new TextClause(outboundOpenBankingClient.getF60399b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.open_banking_consent_flow_accounts_information_au_policy, null, new Click(30, (Integer) null, (Object) null, "CDR_POLICY_CLICK_ID", false), 10)), null, 12), false, null, 6));
            int i6 = R$attr.uikit_dp16;
            ejVar.f = i6;
            ejVar.f164110g = i6;
            eVarB.add(ejVar);
        } else {
            jVar2 = null;
        }
        aim.e eVarA = u.a(eVarB);
        OpenBankingConsent openBankingConsent6 = consentDetailsScreenContract$InputData5.f72772b;
        if (openBankingConsent6 instanceof OpenBankingConsent.Default) {
            ConsentType type = ((OpenBankingConsent.Default) openBankingConsent6).f60383b;
            String f60400c = outboundOpenBankingClient.getF60400c();
            Intrinsics.checkNotNullParameter(type, "type");
            if (f60400c == null || f60400c.length() == 0) {
                int i21 = nl6.b.f217041b[type.ordinal()];
                if (i21 == 1 || i21 == 2) {
                    i = R$drawable.uikit_icn_24_wallet;
                } else if (i21 == 3) {
                    i = R$drawable.uikit_icn_24_arrow_right_left;
                } else {
                    if (i21 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_coins;
                }
                imageI = LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
            } else {
                imageI = new UrlImage(f60400c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            }
            jVar3 = new yy0.j(imageI);
        } else {
            if (!(openBankingConsent6 instanceof OpenBankingConsent.Australia)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar3 = jVar2;
        }
        return new h(eVarA, jVar3);
    }
}
