package he4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.ConsentAccount;
import com.revolut.domain.models.openbanking.ConsentAccountType;
import com.revolut.domain.models.openbanking.ConsentType;
import com.revolut.domain.models.openbanking.OpenBankingAccountData;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.OpenBankingFundsConfirmation$Scheme;
import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.domain.models.openbanking.PaymentConsentType;
import com.revolut.domain.models.openbanking.PaymentFrequency;
import com.revolut.domain.models.openbanking.PermissionType;
import com.revolut.domain.models.openbanking.Provider;
import com.revolut.domain.models.openbanking.ThirdParty;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import hh6.j;
import ip0.nb0;
import ip0.pb0;
import ip0.sw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import le.u1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151591a;

    public /* synthetic */ r(int i) {
        this.f151591a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        ?? arrayList2;
        PaymentFrequency paymentFrequency;
        Provider provider;
        switch (this.f151591a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new e((co3.a) pair.f186386b, (Address) pair.f186385a);
            case 1:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                sw swVar = new sw("user-address-loading");
                yp0.b.l(swVar, 0, 0, 0, 0, null, false, 63);
                return u.c(swVar);
            case 2:
                hea.o it8 = (hea.o) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f151650h;
            case 3:
                hea.o it9 = (hea.o) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f151649g;
            case 4:
                hea.o it10 = (hea.o) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f151646a;
            case 5:
                Intrinsics.checkNotNullParameter((l71.d) obj2, "it");
                return Unit.f186387a;
            case 6:
                return ((hea.o) obj2).f151646a.f163147c;
            case 7:
                hee.j update = (hee.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return hee.j.a(update, null, null, null, null, !update.e, false, 47);
            case 8:
                hee.j update2 = (hee.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return hee.j.a(update2, null, null, null, null, false, !update2.f, 31);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new hee.p(iii.c.c(5), false);
            case 10:
                hf0.a it11 = (hf0.a) obj2;
                hf0.b bVar = hf0.b.d;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                return new ff4.s(f0.f322471a, hf4.i.a(""), null, null, null, null, null, null, null, false, false, new ff4.k(null), null, 4636);
            case 12:
                List consentsDTOs = (List) obj2;
                Intrinsics.checkNotNullParameter(consentsDTOs, "consentsDTOs");
                List<if6.d> list = consentsDTOs;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                for (if6.d dVar : list) {
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    String id10 = dVar.getId();
                    ConsentType consentType = (ConsentType) u1.u(dVar.getType(), w21.a.f293917c);
                    DateTime dateTime = dVar.getExpiryDate() != null ? new DateTime(Long.parseLong(dVar.getExpiryDate()), DateTimeZone.UTC) : null;
                    List permissions = dVar.getPermissions();
                    if (permissions != null) {
                        arrayList = new ArrayList();
                        Iterator it12 = permissions.iterator();
                        while (it12.hasNext()) {
                            PermissionType permissionType = (PermissionType) u1.v((String) it12.next(), w21.a.e);
                            if (permissionType != null) {
                                arrayList.add(permissionType);
                            }
                        }
                    } else {
                        arrayList = f0.f322471a;
                    }
                    ?? r182 = arrayList;
                    List accounts = dVar.getAccounts();
                    if (accounts != null) {
                        List<if6.c> list2 = accounts;
                        arrayList2 = new ArrayList(w.t(list2, 10));
                        for (if6.c cVar : list2) {
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            arrayList2.add(new ConsentAccount((ConsentAccountType) u1.u(cVar.getType(), w21.a.f293915a), cVar.getBranchCode(), cVar.getAccountNumber()));
                        }
                    } else {
                        arrayList2 = f0.f322471a;
                    }
                    arrayList3.add(new OpenBankingConsent.Default(id10, consentType, dateTime, r182, new ThirdParty(dVar.getThirdParty().getId(), dVar.getThirdParty().getName(), dVar.getThirdParty().getLogoUrl()), arrayList2));
                }
                return arrayList3;
            case 13:
                List consents = (List) obj2;
                Intrinsics.checkNotNullParameter(consents, "consents");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : consents) {
                    String str = ((OpenBankingConsent.Default) obj3).e.f60404a;
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    ((List) objO).add(obj3);
                }
                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list3 = (List) entry.getValue();
                    arrayList4.add(new OutboundOpenBankingClient.Default(str2, ((OpenBankingConsent.Default) d0.b0(list3)).e.f60405b, ((OpenBankingConsent.Default) d0.b0(list3)).e.f60406c, list3));
                }
                return arrayList4;
            case 14:
                if6.j response = (if6.j) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                return response.getRedirectUri();
            case 15:
                if6.l dto = (if6.l) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                Object obj4 = jf6.a.f173652a;
                Intrinsics.checkNotNullParameter(dto, "<this>");
                OpenBankingFundsConfirmation$Scheme openBankingFundsConfirmation$Scheme = (OpenBankingFundsConfirmation$Scheme) u1.u(dto.getScheme(), jf6.a.f173652a);
                String identification = dto.getIdentification();
                Long expiryDate = dto.getExpiryDate();
                return new x61.i(openBankingFundsConfirmation$Scheme, identification, expiryDate != null ? new Instant(expiryDate.longValue()) : null);
            case 16:
                if6.m dto2 = (if6.m) obj2;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                Object obj5 = jf6.b.f173653a;
                Intrinsics.checkNotNullParameter(dto2, "<this>");
                PaymentConsentType paymentConsentType = (PaymentConsentType) u1.u(dto2.getType(), jf6.b.f173653a);
                String consentId = dto2.getConsentId();
                xi0.a aVar = xi0.b.Companion;
                String currency = dto2.getCurrency();
                aVar.getClass();
                xi0.b bVarA = xi0.a.a(currency);
                Long requestedExecutionDateTime = dto2.getRequestedExecutionDateTime();
                Instant instant = requestedExecutionDateTime != null ? new Instant(requestedExecutionDateTime.longValue()) : null;
                String frequency = dto2.getFrequency();
                if (frequency != null) {
                    List listN0 = kotlin.text.d0.n0(frequency, new String[]{":"}, 0, 6);
                    paymentFrequency = listN0.isEmpty() ? null : (PaymentFrequency) u1.u(d0.b0(listN0), jf6.b.f173654b);
                } else {
                    paymentFrequency = null;
                }
                Long firstPaymentDateTime = dto2.getFirstPaymentDateTime();
                Instant instant2 = firstPaymentDateTime != null ? new Instant(firstPaymentDateTime.longValue()) : null;
                Integer numberOfPayees = dto2.getNumberOfPayees();
                String description = dto2.getDescription();
                String reference = dto2.getReference();
                String instrument = dto2.getInstrument();
                String merchant = dto2.getMerchant();
                dj0.d dVar2 = new dj0.d(dto2.getAmount(), new xi0.b(6, dto2.getCurrency(), null));
                OpenBankingAccountData openBankingAccountDataA = jf6.b.a(dto2.getCreditor());
                String pocketId = dto2.getPocketId();
                if6.f debtor = dto2.getDebtor();
                OpenBankingAccountData openBankingAccountDataA2 = debtor != null ? jf6.b.a(debtor) : null;
                if6.n provider2 = dto2.getProvider();
                if (provider2 != null) {
                    Intrinsics.checkNotNullParameter(provider2, "<this>");
                    provider = new Provider(provider2.getProvider(), provider2.getLogoUrl(), provider2.getTitle(), provider2.getDescription(), provider2.getPreselectedPocketId());
                } else {
                    provider = null;
                }
                return new OpenBankingPayment(paymentConsentType, consentId, bVarA, instant, paymentFrequency, instant2, numberOfPayees, description, reference, instrument, merchant, dVar2, openBankingAccountDataA, pocketId, openBankingAccountDataA2, provider);
            case 17:
                if6.j response2 = (if6.j) obj2;
                Intrinsics.checkNotNullParameter(response2, "response");
                return response2.getRedirectUri();
            case 18:
                if6.j response3 = (if6.j) obj2;
                Intrinsics.checkNotNullParameter(response3, "response");
                return response3.getRedirectUri();
            case 19:
                Intrinsics.checkNotNullParameter((hg4.j) obj2, "$this$update");
                return new hg4.j(new Data(null, null, true, 3, null), false);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.personal_details_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.personal_details_subtitle, null, null, 14);
                m70.a.c(t0.f186434a);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList5 = new ArrayList(w.t(intRange, 10));
                vim.f it13 = intRange.iterator();
                while (it13.f289625c) {
                    pb0 pb0Var = new pb0(a0.d.n("ID_LOADING_ITEM_PREFIX_", it13.nextInt() - 1));
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList5.add(pb0Var);
                }
                return new hg4.r(arrayList5, textLocalisedClause, textLocalisedClause2, textClause, false, true);
            case 21:
                return hg9.g.a((hg9.g) obj2, zi0.c.P(f0.f322471a, false, null, 3));
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new hg9.l(iii.c.c(3), false);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                IntRange intRange2 = new IntRange(1, 3, 1);
                ArrayList arrayList6 = new ArrayList(w.t(intRange2, 10));
                vim.f it14 = intRange2.iterator();
                while (it14.f289625c) {
                    arrayList6.add(nb0.b(pb0.Companion, a0.d.n("LOADING_STATE_ID_", it14.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                return new hgb.u(null, null, arrayList6, 6);
            case 24:
                ActionsView.Item it15 = (ActionsView.Item) obj2;
                MandateDetailsScreen.a aVar2 = MandateDetailsScreen.Companion;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f58316a, "ACTION_REVOKE"));
            case 25:
                CellDetailsDelegate.Model it16 = (CellDetailsDelegate.Model) obj2;
                MandateDetailsScreen.a aVar3 = MandateDetailsScreen.Companion;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(Intrinsics.f(it16.f51832a, "ITEM_ID_TO"));
            case 26:
                CellDetailsActionDelegate.Model it17 = (CellDetailsActionDelegate.Model) obj2;
                MandateDetailsScreen.a aVar4 = MandateDetailsScreen.Companion;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(v.k("ITEM_ID_MAX_PER_TRANSFER", "ITEM_ID_MAX_PER_MONTH").contains(it17.f51781a));
            case 27:
                LargeActionButtonDelegate.Model it18 = (LargeActionButtonDelegate.Model) obj2;
                MandateDetailsScreen.a aVar5 = MandateDetailsScreen.Companion;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f52613a;
            case 28:
                hh6.j updateState = (hh6.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                if (updateState instanceof hh6.i) {
                    return hh6.i.a((hh6.i) updateState, null, null, !r1.d, 23);
                }
                if (Intrinsics.f(updateState, j.a.f152262a)) {
                    return updateState;
                }
                throw new NoWhenBranchMatchedException();
            default:
                hhd.h update3 = (hhd.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                m70.a.c(t0.f186434a);
                return hhd.h.a(update3, null, null, null, null, "", 15);
        }
    }

    public /* synthetic */ r(cli.n nVar, int i) {
        this.f151591a = i;
    }
}
