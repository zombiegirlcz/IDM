package u21;

import com.revolut.data.model.Data;
import com.revolut.data.network.models.checkout.PaymentMethodResponseDto;
import com.revolut.data.network.models.checkout.mapper.PaymentMethodResponseDtoMapperKt;
import com.revolut.data.network.models.externalcards.ExternalCardDto;
import com.revolut.data.network.models.externalcards.IssuerInfoDto;
import com.revolut.data.network.models.externalcards.VerificationMethodDto;
import com.revolut.data.network.models.externalcards.VerificationMethodsDto;
import com.revolut.data.network.models.externalcards.mapper.ExternalCardDtoMapperKt;
import com.revolut.data.network.models.externalcards.mapper.IssuerInfoDtoMapperKt;
import com.revolut.data.network.models.topup.CardTopupFeeDto;
import com.revolut.data.network.models.topup.CardTopupFeeDtoMapperKt;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import do3.n;
import ds6.q;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jq9.a0;
import jq9.b0;
import jq9.x;
import jq9.y;
import jq9.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import u37.l;
import u37.m;
import yhm.r;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276524a;

    public /* synthetic */ b(int i) {
        this.f276524a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        u3a.e eVar;
        List list;
        switch (this.f276524a) {
            case 0:
                Throwable throwable = (Throwable) it8;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return zi0.c.O(throwable);
            case 1:
                PaymentMethodResponseDto it9 = (PaymentMethodResponseDto) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                return PaymentMethodResponseDtoMapperKt.toDomain(it9, null);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.P(it8, false, null, 3);
            case 3:
                IssuerInfoDto issuerInfoDto = (IssuerInfoDto) it8;
                Intrinsics.checkNotNullParameter(issuerInfoDto, "issuerInfoDto");
                return zi0.c.P(IssuerInfoDtoMapperKt.toDomain(issuerInfoDto), false, null, 3);
            case 4:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return Boolean.TRUE;
            case 5:
                CardTopupFeeDto it10 = (CardTopupFeeDto) it8;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new Data(CardTopupFeeDtoMapperKt.toDomain(it10), null, false, 6, null);
            case 6:
                ExternalCardDto it11 = (ExternalCardDto) it8;
                Intrinsics.checkNotNullParameter(it11, "it");
                return ExternalCardDtoMapperKt.toDomain(it11);
            case 7:
                CardTopupFeeDto it12 = (CardTopupFeeDto) it8;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new Data(CardTopupFeeDtoMapperKt.toDomain(it12), null, false, 6, null);
            case 8:
                PaymentMethodResponseDto it13 = (PaymentMethodResponseDto) it8;
                Intrinsics.checkNotNullParameter(it13, "it");
                return zi0.c.P(PaymentMethodResponseDtoMapperKt.toDomain(it13, null), false, null, 3);
            case 9:
                List externalCards = (List) it8;
                Intrinsics.checkNotNullParameter(externalCards, "externalCards");
                List list2 = externalCards;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it14 = list2.iterator();
                while (it14.hasNext()) {
                    arrayList.add(ExternalCardDtoMapperKt.toDomain((ExternalCardDto) it14.next()));
                }
                return arrayList;
            case 10:
                VerificationMethodsDto dto = (VerificationMethodsDto) it8;
                Intrinsics.checkNotNullParameter(dto, "dto");
                List<VerificationMethodDto> verifications = dto.getVerifications();
                ArrayList arrayList2 = new ArrayList(w.t(verifications, 10));
                Iterator<T> it15 = verifications.iterator();
                while (it15.hasNext()) {
                    arrayList2.add(ExternalCardDtoMapperKt.toDomain((VerificationMethodDto) it15.next()));
                }
                return arrayList2;
            case 11:
                r rVar = (r) it8;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return Boolean.valueOf(((Boolean) rVar.f314201a).booleanValue() || ((Boolean) rVar.f314202b).booleanValue() || ((Boolean) rVar.f314203c).booleanValue());
            case 12:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                aim.e eVarB = u.b();
                for (int i = 0; i < 26; i++) {
                    eVarB.add(new lp0.c(a0.d.n("loading_", i)));
                }
                return new u2a.e(u.a(eVarB), 13);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                aim.e eVarB2 = u.b();
                for (int i2 = 0; i2 < 3; i2++) {
                    eVarB2.add(nb0.b(pb0.Companion, a0.d.n("STORE_BRAND_DETAIL_MSI_LOADING_", i2), true, 0, false, 28));
                }
                return new u2e.h(u.a(eVarB2));
            case 14:
                od0.i it16 = (od0.i) it8;
                Intrinsics.checkNotNullParameter(it16, "it");
                return v.l(it16.g());
            case 15:
                od0.i it17 = (od0.i) it8;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zi0.c.P(it17, false, null, 3);
            case 16:
                r rVar2 = (r) it8;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                od0.i iVar = (od0.i) rVar2.f314201a;
                List list3 = (List) rVar2.f314202b;
                od0.i iVar2 = (od0.i) rVar2.f314203c;
                List listL = v.l(iVar.g());
                if (listL.isEmpty() && list3.isEmpty()) {
                    return new u2i.j(f0.f322471a, null);
                }
                Object objG = iVar2.g();
                r0i.a aVar = r0i.a.REVOLUT_X;
                return objG != aVar ? !list3.isEmpty() ? new u2i.j(list3, aVar) : u2i.h.N(listL) : iVar2.g() != r0i.a.RETAIL_UPGRADE ? !listL.isEmpty() ? u2i.h.N(listL) : new u2i.j(list3, aVar) : new u2i.j(f0.f322471a, null);
            case 17:
                u36.b update = (u36.b) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return u36.b.a(update, null, "", 1);
            case 18:
                ArrayList arrayListP = kii.e.p((Function0) it8, "it", 10);
                for (int i3 = 0; i3 < 10; i3++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("CeFiToDeFiAssetPicker_Loading_", i3), false, 0, false, 30));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 19:
                q taxHubAuthority = (q) it8;
                Intrinsics.checkNotNullParameter(taxHubAuthority, "taxHubAuthority");
                return taxHubAuthority.f117249a;
            case 20:
                r rVar3 = (r) it8;
                Intrinsics.checkNotNullParameter(rVar3, "<destruct>");
                return new l((ds6.i) rVar3.f314201a, do3.q.y((n) rVar3.f314202b), (FreelancerTaxProfile) ((od0.i) rVar3.f314203c).f224257a);
            case 21:
                Function0 getDefaultLoadingItems = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new m(u37.v.a(), (List) getDefaultLoadingItems.invoke());
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) it8, "it");
                return f0.f322471a;
            case 23:
                List it18 = (List) it8;
                Intrinsics.checkNotNullParameter(it18, "it");
                return n61.j.h(it18);
            case 24:
                Map it19 = (Map) it8;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.values();
            case 25:
                Collection juniorProfiles = (Collection) it8;
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                ArrayList<JuniorBankingProfile> arrayList3 = new ArrayList();
                Iterator it20 = juniorProfiles.iterator();
                while (true) {
                    if (!it20.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        for (JuniorBankingProfile juniorBankingProfile : arrayList3) {
                            String str = juniorBankingProfile.f77102h;
                            zm3.j jVar = str == null ? null : new zm3.j(ta6.a.t(juniorBankingProfile), juniorBankingProfile.f77099b, juniorBankingProfile.f77100c, null, zm3.k.JUNIOR, juniorBankingProfile.f77101g, str, juniorBankingProfile.k.getCountry(), do3.b.FULL, null, null);
                            if (jVar != null) {
                                String str2 = juniorBankingProfile.f;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                eVar = new u3a.e(jVar, str2);
                            } else {
                                eVar = null;
                            }
                            if (eVar != null) {
                                arrayList4.add(eVar);
                            }
                        }
                        return arrayList4;
                    }
                    Object next = it20.next();
                    JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) next;
                    if (!d0.W("")) {
                        String string = d0.F0("").toString();
                        if (!d0.J(ta6.a.t(juniorBankingProfile2), string, true)) {
                            String str3 = juniorBankingProfile2.f77102h;
                            if (pd.b.j(str3 != null ? Boolean.valueOf(d0.J(str3, string, true)) : null)) {
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(juniorBankingProfile2, "<this>");
                    if (juniorBankingProfile2.f77104l != ij8.h.CREATED) {
                        arrayList3.add(next);
                    }
                }
                break;
            case 26:
                vf0.a aVar2 = (vf0.a) it8;
                Intrinsics.checkNotNullParameter(aVar2, "<destruct>");
                u3a.j jVar2 = (u3a.j) aVar2.f288388a;
                u3a.a aVar3 = (u3a.a) aVar2.f288389b;
                List list4 = (List) aVar2.f288390c;
                List list5 = (List) aVar2.d;
                List list6 = (List) aVar2.e;
                List list7 = (List) aVar2.f;
                List list8 = (List) aVar2.f288391g;
                List list9 = (List) aVar2.f288392h;
                Pair pair = (Pair) aVar2.i;
                Pair pair2 = (Pair) aVar2.f288393j;
                u3a.h hVar = (u3a.h) pair.f186385a;
                List list10 = (List) pair.f186386b;
                List list11 = (List) pair2.f186385a;
                List list12 = (List) pair2.f186386b;
                List list13 = jVar2.f276852a;
                List list14 = jVar2.f276853b;
                List list15 = jVar2.f276854c;
                ArrayList<zm3.a> arrayListE0 = zhm.d0.E0(jVar2.d, zhm.d0.E0(list14, list13));
                Object objD0 = zhm.d0.d0(list5);
                zm3.l lVar = objD0 instanceof zm3.l ? (zm3.l) objD0 : null;
                if (lVar == null || arrayListE0.isEmpty()) {
                    list = list12;
                } else {
                    for (zm3.a aVar4 : arrayListE0) {
                        list = list12;
                        zm3.l lVar2 = aVar4 instanceof zm3.l ? (zm3.l) aVar4 : null;
                        if (Intrinsics.f(lVar2 != null ? lVar2.getCode() : null, lVar.getCode())) {
                            list5 = null;
                        } else {
                            list12 = list;
                        }
                    }
                    list = list12;
                }
                if (list5 == null) {
                    list5 = f0.f322471a;
                }
                d3a.a aVar5 = d3a.a.REVOLUT;
                ArrayList arrayList5 = new ArrayList(w.t(arrayListE0, 10));
                Iterator it21 = arrayListE0.iterator();
                while (it21.hasNext()) {
                    arrayList5.add(new y((zm3.a) it21.next()));
                }
                Pair pair3 = new Pair(aVar5, arrayList5);
                d3a.a aVar6 = d3a.a.DEVICE;
                List list16 = list15;
                ArrayList arrayList6 = new ArrayList(w.t(list16, 10));
                Iterator it22 = list16.iterator();
                while (it22.hasNext()) {
                    arrayList6.add(new y((zm3.a) it22.next()));
                }
                Pair pair4 = new Pair(aVar6, arrayList6);
                d3a.a aVar7 = d3a.a.REVTAG;
                List list17 = list5;
                ArrayList arrayList7 = new ArrayList(w.t(list17, 10));
                Iterator it23 = list17.iterator();
                while (it23.hasNext()) {
                    arrayList7.add(new y((zm3.a) it23.next()));
                }
                Pair pair5 = new Pair(aVar7, arrayList7);
                d3a.a aVar8 = d3a.a.VIRTUAL_CONTACTS;
                List list18 = list6;
                ArrayList arrayList8 = new ArrayList(w.t(list18, 10));
                Iterator it24 = list18.iterator();
                while (it24.hasNext()) {
                    arrayList8.add(new y((zm3.a) it24.next()));
                }
                Pair pair6 = new Pair(aVar8, arrayList8);
                d3a.a aVar9 = d3a.a.APM_AANI;
                List list19 = hVar.f276844a;
                ArrayList arrayList9 = new ArrayList(w.t(list19, 10));
                Iterator it25 = list19.iterator();
                while (it25.hasNext()) {
                    arrayList9.add(new jq9.u((ApmRecipient) it25.next()));
                }
                Pair pair7 = new Pair(aVar9, arrayList9);
                d3a.a aVar10 = d3a.a.APM_BIZUM;
                List list20 = hVar.f276845b;
                ArrayList arrayList10 = new ArrayList(w.t(list20, 10));
                Iterator it26 = list20.iterator();
                while (it26.hasNext()) {
                    arrayList10.add(new jq9.u((ApmRecipient) it26.next()));
                }
                Pair pair8 = new Pair(aVar10, arrayList10);
                d3a.a aVar11 = d3a.a.APM_BLIK;
                List list21 = hVar.f276846c;
                ArrayList arrayList11 = new ArrayList(w.t(list21, 10));
                Iterator it27 = list21.iterator();
                while (it27.hasNext()) {
                    arrayList11.add(new jq9.u((ApmRecipient) it27.next()));
                }
                Pair pair9 = new Pair(aVar11, arrayList11);
                d3a.a aVar12 = d3a.a.APM_BREB;
                List list22 = hVar.d;
                ArrayList arrayList12 = new ArrayList(w.t(list22, 10));
                Iterator it28 = list22.iterator();
                while (it28.hasNext()) {
                    arrayList12.add(new jq9.u((ApmRecipient) it28.next()));
                }
                Pair pair10 = new Pair(aVar12, arrayList12);
                d3a.a aVar13 = d3a.a.APM_IRIS;
                List list23 = hVar.e;
                ArrayList arrayList13 = new ArrayList(w.t(list23, 10));
                Iterator it29 = list23.iterator();
                while (it29.hasNext()) {
                    arrayList13.add(new jq9.u((ApmRecipient) it29.next()));
                }
                Pair pair11 = new Pair(aVar13, arrayList13);
                d3a.a aVar14 = d3a.a.APM_MULTIBANCO;
                List list24 = hVar.f;
                ArrayList arrayList14 = new ArrayList(w.t(list24, 10));
                Iterator it30 = list24.iterator();
                while (it30.hasNext()) {
                    arrayList14.add(new jq9.u((ApmRecipient) it30.next()));
                }
                Pair pair12 = new Pair(aVar14, arrayList14);
                d3a.a aVar15 = d3a.a.APM_PAYID;
                List list25 = list10;
                ArrayList arrayList15 = new ArrayList(w.t(list25, 10));
                Iterator it31 = list25.iterator();
                while (it31.hasNext()) {
                    arrayList15.add(new jq9.u((ApmRecipient) it31.next()));
                }
                Pair pair13 = new Pair(aVar15, arrayList15);
                d3a.a aVar16 = d3a.a.APM_PIX;
                List list26 = aVar3.f276833b;
                ArrayList arrayList16 = new ArrayList(w.t(list26, 10));
                Iterator it32 = list26.iterator();
                while (it32.hasNext()) {
                    arrayList16.add(new jq9.v((f5j.a) it32.next()));
                }
                Pair pair14 = new Pair(aVar16, arrayList16);
                d3a.a aVar17 = d3a.a.APM_QVIK;
                List list27 = hVar.f276847g;
                ArrayList arrayList17 = new ArrayList(w.t(list27, 10));
                Iterator it33 = list27.iterator();
                while (it33.hasNext()) {
                    arrayList17.add(new jq9.u((ApmRecipient) it33.next()));
                }
                Pair pair15 = new Pair(aVar17, arrayList17);
                d3a.a aVar18 = d3a.a.APM_SPIN;
                List list28 = hVar.f276848h;
                ArrayList arrayList18 = new ArrayList(w.t(list28, 10));
                Iterator it34 = list28.iterator();
                while (it34.hasNext()) {
                    arrayList18.add(new jq9.u((ApmRecipient) it34.next()));
                }
                Pair pair16 = new Pair(aVar18, arrayList18);
                d3a.a aVar19 = d3a.a.APM_UPI;
                List list29 = list;
                ArrayList arrayList19 = new ArrayList(w.t(list29, 10));
                Iterator it35 = list29.iterator();
                while (it35.hasNext()) {
                    arrayList19.add(new z((PaymentCounterpartyInfo) it35.next()));
                }
                Pair pair17 = new Pair(aVar19, arrayList19);
                d3a.a aVar20 = d3a.a.APM_WERO;
                List list30 = hVar.i;
                ArrayList arrayList20 = new ArrayList(w.t(list30, 10));
                Iterator it36 = list30.iterator();
                while (it36.hasNext()) {
                    arrayList20.add(new jq9.u((ApmRecipient) it36.next()));
                }
                Pair pair18 = new Pair(aVar20, arrayList20);
                d3a.a aVar21 = d3a.a.ACCOUNTS;
                List list31 = aVar3.f276832a;
                ArrayList arrayList21 = new ArrayList(w.t(list31, 10));
                Iterator it37 = list31.iterator();
                while (it37.hasNext()) {
                    arrayList21.add(new jq9.v((f5j.a) it37.next()));
                }
                Pair pair19 = new Pair(aVar21, arrayList21);
                d3a.a aVar22 = d3a.a.MOBILE_WALLET;
                List list32 = aVar3.f276834c;
                ArrayList arrayList22 = new ArrayList(w.t(list32, 10));
                Iterator it38 = list32.iterator();
                while (it38.hasNext()) {
                    arrayList22.add(new jq9.v((f5j.a) it38.next()));
                }
                Pair pair20 = new Pair(aVar22, arrayList22);
                d3a.a aVar23 = d3a.a.GROUPS;
                List list33 = list7;
                ArrayList arrayList23 = new ArrayList(w.t(list33, 10));
                Iterator it39 = list33.iterator();
                while (it39.hasNext()) {
                    arrayList23.add(new b0((PaymentGroup) it39.next()));
                }
                Pair pair21 = new Pair(aVar23, arrayList23);
                d3a.a aVar24 = d3a.a.BILLERS;
                List list34 = list11;
                ArrayList arrayList24 = new ArrayList(w.t(list34, 10));
                Iterator it40 = list34.iterator();
                while (it40.hasNext()) {
                    arrayList24.add(new z((PaymentCounterpartyInfo) it40.next()));
                }
                Pair pair22 = new Pair(aVar24, arrayList24);
                d3a.a aVar25 = d3a.a.CARDS;
                List list35 = list4;
                ArrayList arrayList25 = new ArrayList(w.t(list35, 10));
                Iterator it41 = list35.iterator();
                while (it41.hasNext()) {
                    arrayList25.add(new jq9.w((CardOwnerWithStats) it41.next()));
                }
                Pair pair23 = new Pair(aVar25, arrayList25);
                d3a.a aVar26 = d3a.a.CRYPTO_WALLET;
                List list36 = list8;
                ArrayList arrayList26 = new ArrayList(w.t(list36, 10));
                Iterator it42 = list36.iterator();
                while (it42.hasNext()) {
                    arrayList26.add(new a0((CryptoAddress) it42.next()));
                }
                Pair pair24 = new Pair(aVar26, arrayList26);
                d3a.a aVar27 = d3a.a.CHARITIES;
                List list37 = list9;
                ArrayList arrayList27 = new ArrayList(w.t(list37, 10));
                Iterator it43 = list37.iterator();
                while (it43.hasNext()) {
                    arrayList27.add(new x((ba6.l) it43.next()));
                }
                return r0.k(pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, new Pair(aVar27, arrayList27), new Pair(d3a.a.CHECKS, f0.f322471a));
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) it8, "it");
                return f0.f322471a;
            case 28:
                List it44 = (List) it8;
                Intrinsics.checkNotNullParameter(it44, "it");
                return zi0.c.P(it44, false, null, 3);
            default:
                Intrinsics.checkNotNullParameter((Throwable) it8, "it");
                return new u3a.j(0);
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f276524a = i;
    }
}
