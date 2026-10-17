package hx7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmountWithFiat;
import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.EligibilityCriteria;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteStepInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeTip;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeTipAction;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxRewardInfo;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProductCarrierPriceBreakdown;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProductOption;
import htj.c0;
import htj.x;
import java.io.File;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import krk.t;
import le.u1;
import m2l.k0;
import m2l.u;
import m2l.y;
import mel.d0;
import mel.e0;
import mel.j0;
import nel.z;
import okhttp3.RequestBody;
import u1m.b0;
import ulm.a1;
import ulm.b1;
import ulm.c1;
import ulm.p1;
import yhm.m;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static TimeInterpolator f156400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b0 f156401b;

    public static final ml3.i A(DeviceContact deviceContact, String registeredAs, String str, String str2, String country, boolean z, boolean z3, String appMode, String str3, String str4, Long l2, String str5) {
        ll3.a aVar;
        Intrinsics.checkNotNullParameter(deviceContact, "<this>");
        Intrinsics.checkNotNullParameter(registeredAs, "registeredAs");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        long j2 = deviceContact.f65990a;
        String str6 = deviceContact.f65992c;
        String str7 = deviceContact.d;
        String str8 = deviceContact.e;
        String str9 = deviceContact.f;
        int i = rl3.a.f254914a[deviceContact.f65991b.ordinal()];
        if (i == 1) {
            aVar = ll3.a.EMAIL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = ll3.a.PHONE;
        }
        return new ml3.i(j2, str6, str7, str8, str9, registeredAs, str, str2, z, z3, l2, str5, 0, 0L, null, aVar, country, appMode, str3, str4);
    }

    public static final FiatCryptoMoney B(dj0.d dVar, List exchangeRates, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        dj0.d dVarD = d(dVar, exchangeRates, baseCurrency);
        if (dVarD == null) {
            dVarD = new dj0.d(0L, dVar.f115083b);
        }
        return new FiatCryptoMoney(dVarD, dVar);
    }

    public static final FiatCryptoMoney C(dj0.d dVar, ArrayList swappedExchangeRates, xi0.b cryptoCurrency) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(swappedExchangeRates, "swappedExchangeRates");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        dj0.d dVarD = d(dVar, swappedExchangeRates, cryptoCurrency);
        if (dVarD == null) {
            dVarD = new dj0.d(0L, dVar.f115083b);
        }
        return new FiatCryptoMoney(dVar, dVarD);
    }

    public static final String D(kel.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int i = wcl.a.f296423b[lVar.ordinal()];
        if (i == 1) {
            return "CREATED";
        }
        if (i == 2) {
            return "ACTIVE";
        }
        if (i == 3) {
            return "TRADED";
        }
        if (i == 4) {
            return "TERMINATED";
        }
        if (i == 5) {
            return "DECLINED";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final cel.k E(krk.i iVar) {
        int i = grk.a.f146053c[iVar.ordinal()];
        if (i == 1) {
            return cel.k.Q1;
        }
        if (i == 2) {
            return cel.k.Q2;
        }
        if (i == 3) {
            return cel.k.Q3;
        }
        if (i == 4) {
            return cel.k.Q4;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final cel.l F(krk.j jVar) {
        int i = grk.a.f[jVar.ordinal()];
        if (i == 1) {
            return cel.l.ACTUAL;
        }
        if (i == 2) {
            return cel.l.ESTIMATE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final DeFiAssetAmountWithFiat G(com.revolut.feature.defi.common.models.dto.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        c36.c cVar = dVar.f71713a;
        String str = cVar.f20897a;
        String str2 = cVar.f20898b;
        TokenAmountDto tokenAmountDto = dVar.f71714b;
        return new DeFiAssetAmountWithFiat(new DeFiAssetAmount(str, str2, tokenAmountDto.f71706a, tokenAmountDto.f71707b), i26.l.u(dVar.f71715c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static final ActiveOrPastInviteeDetails H(swa.a aVar) {
        pwa.b bVar;
        Instant instant;
        pwa.o oVar;
        ?? arrayList;
        String str;
        String str2;
        ArrayList arrayList2;
        AdditionalInfo additionalInfo;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strY = aVar.getTitle();
        String strD = aVar.getEmail();
        String strG = aVar.getFirstName();
        String strO = aVar.getRevtag();
        String strH = aVar.getId();
        String strK = aVar.getLastName();
        String strM = aVar.getPhone();
        String strF = aVar.getFaqKey();
        swa.c cVarN = aVar.getPotentialReward();
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoJ = cVarN != null ? J(cVarN) : null;
        swa.c cVarQ = aVar.getRewardEarned();
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoJ2 = cVarQ != null ? J(cVarQ) : null;
        List<swa.f> listV = aVar.getSteps();
        ArrayList arrayList3 = new ArrayList(w.t(listV, 10));
        for (swa.f fVar : listV) {
            pwa.e eVar = (pwa.e) u1.u(fVar.getStatus(), mwa.a.f209421b);
            String strG2 = fVar.getTitle();
            String strC = fVar.getDescription();
            List listD = fVar.getEligibilityCriteria();
            if (listD != null) {
                List list = listD;
                str = strY;
                str2 = strD;
                ArrayList arrayList4 = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    swa.e eVar2 = (swa.e) it8.next();
                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                    arrayList4.add(new EligibilityCriteria(eVar2.getIcon(), eVar2.getTitle(), eVar2.getDescription()));
                    it8 = it8;
                    strG = strG;
                }
                arrayList2 = arrayList4;
            } else {
                str = strY;
                str2 = strD;
                arrayList2 = null;
            }
            String str3 = strG;
            String strB = fVar.getBadge();
            swa.d dVarA = fVar.getAdditionalInfo();
            if (dVarA != null) {
                Intrinsics.checkNotNullParameter(dVarA, "<this>");
                additionalInfo = new AdditionalInfo(dVarA.getTitle(), dVarA.getSubtitle());
            } else {
                additionalInfo = null;
            }
            jo3.a aVarE = fVar.getReward();
            arrayList3.add(new InviteStepInfo(eVar, strG2, strC, arrayList2, strB, additionalInfo, aVarE != null ? mo3.a.o(aVarE) : null));
            strY = str;
            strD = str2;
            strG = str3;
        }
        String str4 = strY;
        String str5 = strD;
        String str6 = strG;
        pwa.b bVar2 = (pwa.b) u1.u(aVar.getStatus(), mwa.a.f209420a);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(aVar.getDeadlineMs());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        Long lP = aVar.getRewardDeadlineMs();
        Instant instantOfEpochMilli2 = lP != null ? Instant.ofEpochMilli(lP.longValue()) : null;
        String strR = aVar.getRewardGifUrl();
        String strS = aVar.getRewardType();
        if (strS != null) {
            pwa.o[] oVarArrValues = pwa.o.values();
            int length = oVarArrValues.length;
            int i = 0;
            while (i < length) {
                oVar = oVarArrValues[i];
                bVar = bVar2;
                instant = instantOfEpochMilli2;
                if (a0.z(oVar.name(), strS, true)) {
                    break;
                }
                i++;
                bVar2 = bVar;
                instantOfEpochMilli2 = instant;
            }
            bVar = bVar2;
            instant = instantOfEpochMilli2;
            oVar = null;
        } else {
            bVar = bVar2;
            instant = instantOfEpochMilli2;
            oVar = null;
        }
        Instant instantOfEpochMilli3 = Instant.ofEpochMilli(aVar.getCreatedDateMs());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli3, "ofEpochMilli(...)");
        String strE = aVar.getExpireReason();
        List listX = aVar.getTips();
        if (listX != null) {
            List<swa.h> list2 = listX;
            arrayList = new ArrayList(w.t(list2, 10));
            for (swa.h hVar : list2) {
                String strC2 = hVar.getIcon();
                String strE2 = hVar.getTitle();
                String strD2 = hVar.getSubtitle();
                String strB2 = hVar.getDescription();
                swa.g gVarA = hVar.getAction();
                arrayList.add(new InviteeTip(strC2, strE2, strD2, strB2, gVarA != null ? new InviteeTipAction(gVarA.getTitle(), gVarA.getDeeplink()) : null));
            }
        } else {
            arrayList = f0.f322471a;
        }
        swa.c cVarL = aVar.getMissedReward();
        return new ActiveOrPastInviteeDetails(str4, str5, str6, strO, strH, strK, strM, strF, activeOrPastInvitesRewardInfoJ, activeOrPastInvitesRewardInfoJ2, oVar, arrayList3, bVar, instantOfEpochMilli, instant, strR, instantOfEpochMilli3, strE, arrayList, cVarL != null ? J(cVarL) : null, aVar.getIneligibilityReason(), aVar.getInviteeCode(), aVar.getStatusSummary(), aVar.getTermsUrl(), aVar.getConfettiSeen());
    }

    public static final ActiveOrPastInvitesInfo I(swa.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List listB = bVar.getInvites();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        Iterator it8 = listB.iterator();
        while (it8.hasNext()) {
            arrayList.add(H((swa.a) it8.next()));
        }
        int iA = bVar.getCount();
        swa.c cVarD = bVar.getTotalRewardEarned();
        MaxRewardInfo maxRewardInfo = null;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoJ = cVarD != null ? J(cVarD) : null;
        swa.j jVarC = bVar.getMaxRewardInfo();
        if (jVarC != null) {
            Intrinsics.checkNotNullParameter(jVarC, "<this>");
            maxRewardInfo = new MaxRewardInfo(jVarC.getMaxReferrerRewards(), jVarC.getIsMaxRewardEarned());
        }
        return new ActiveOrPastInvitesInfo(arrayList, iA, activeOrPastInvitesRewardInfoJ, maxRewardInfo);
    }

    public static final ActiveOrPastInvitesRewardInfo J(swa.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        long jA = cVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String strB = cVar.getCurrency();
        aVar.getClass();
        dj0.d dVar = new dj0.d(jA, xi0.a.a(strB));
        String strD = cVar.getTargetCurrency();
        return new ActiveOrPastInvitesRewardInfo(dVar, cVar.getTitle(), cVar.getSubtitle(), strD != null ? xi0.a.a(strD) : null);
    }

    public static final TravelFlightsExtraProduct K(v7g.f fVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        o7g.a aVar = o7g.b.Companion;
        String str = fVar.f286638a;
        aVar.getClass();
        o7g.b bVarA = o7g.a.a(str);
        o7g.c cVar = o7g.d.Companion;
        String str2 = fVar.f286639b;
        cVar.getClass();
        o7g.d dVarA = o7g.c.a(str2);
        String str3 = fVar.f286640c;
        String str4 = fVar.d;
        List list = fVar.e;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            v7g.i iVar = (v7g.i) it8.next();
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            String str5 = iVar.f286642a;
            boolean z = iVar.f286643b;
            String str6 = iVar.f286644c;
            jo3.a aVar2 = iVar.d;
            dj0.d dVarO = aVar2 != null ? mo3.a.o(aVar2) : null;
            List list2 = iVar.e;
            if (list2 != null) {
                List<v7g.c> list3 = list2;
                ArrayList arrayList3 = new ArrayList(w.t(list3, i));
                for (v7g.c cVar2 : list3) {
                    Intrinsics.checkNotNullParameter(cVar2, "<this>");
                    String str7 = cVar2.f286634a;
                    Iterator it9 = it8;
                    String str8 = cVar2.f286635b;
                    jo3.a aVar3 = cVar2.f286636c;
                    arrayList3.add(new TravelFlightsExtraProductCarrierPriceBreakdown(aVar3 != null ? mo3.a.o(aVar3) : null, str7, str8));
                    it8 = it9;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            Iterator it10 = it8;
            arrayList2.add(new TravelFlightsExtraProductOption(str5, z, str6, dVarO, arrayList));
            it8 = it10;
            i = 10;
        }
        return new TravelFlightsExtraProduct(bVarA, dVarA, str3, str4, arrayList2);
    }

    public static final Map L(Map map) {
        cel.a aVar;
        Object jVar;
        cel.m mVar;
        cel.m mVar2;
        cel.m mVar3;
        cel.m mVar4;
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            krk.b bVar = (krk.b) entry.getKey();
            krk.l lVar = (krk.l) entry.getValue();
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            switch (grk.a.f146052b[bVar.ordinal()]) {
                case 1:
                    aVar = cel.a.EPS_ANN_GROWTH;
                    break;
                case 2:
                    aVar = cel.a.EPS_GROWTH_CONTRIBUTION_ANN;
                    break;
                case 3:
                    aVar = cel.a.PE_RATIO_ANN;
                    break;
                case 4:
                    aVar = cel.a.DIV_YLD_ANN;
                    break;
                case 5:
                    aVar = cel.a.SALES_ANN;
                    break;
                case 6:
                    aVar = cel.a.NET_INCOME_ANN;
                    break;
                case 7:
                    aVar = cel.a.PE_RATIO_CONTRIBUTION_ANN;
                    break;
                case 8:
                    aVar = cel.a.DIV_YLD_CONTRIBUTION_ANN;
                    break;
                case 9:
                    aVar = cel.a.PROFIT_MARGIN_ANN;
                    break;
                case 10:
                    aVar = cel.a.SALES_ANN_GROWTH;
                    break;
                case 11:
                    aVar = cel.a.SALES_QTR;
                    break;
                case 12:
                    aVar = cel.a.NET_INCOME_QTR;
                    break;
                case 13:
                    aVar = cel.a.PROFIT_MARGIN_QTR;
                    break;
                case 14:
                    aVar = cel.a.SALES_QTR_GROWTH;
                    break;
                case 15:
                    aVar = cel.a.EPS_SURPRISE_BASIS_ANN;
                    break;
                case 16:
                    aVar = cel.a.EPS_ANN;
                    break;
                case 17:
                    aVar = cel.a.EPS_SURPRISE_BASIS_QTR;
                    break;
                case 18:
                    aVar = cel.a.EPS_QTR;
                    break;
                case 19:
                    aVar = cel.a.EPS_QTR_GROWTH;
                    break;
                case 20:
                    aVar = cel.a.EPS_ANN_CALENDARISED;
                    break;
                case 21:
                    aVar = cel.a.EPS_ANN_GROWTH_CALENDARISED;
                    break;
                case 22:
                    aVar = cel.a.DPS_ANN_CALENDARISED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            if (lVar instanceof krk.o) {
                List<krk.k> list = ((krk.o) lVar).f188896a;
                ArrayList arrayList2 = new ArrayList();
                for (krk.k kVar : list) {
                    if (((jo3.a) kVar.d) != null) {
                        cel.l lVarF = F(kVar.f188889a);
                        dj0.d dVarO = mo3.a.o((jo3.a) kVar.d);
                        int i = kVar.f188890b;
                        krk.i iVar = kVar.f188891c;
                        mVar4 = new cel.m(lVarF, i, iVar != null ? E(iVar) : null, dVarO);
                    } else {
                        mVar4 = null;
                    }
                    if (mVar4 != null) {
                        arrayList2.add(mVar4);
                    }
                }
                jVar = new cel.d(arrayList2);
            } else if (lVar instanceof krk.p) {
                List<krk.k> list2 = ((krk.p) lVar).f188899a;
                ArrayList arrayList3 = new ArrayList();
                for (krk.k kVar2 : list2) {
                    if (((BigDecimal) kVar2.d) != null) {
                        cel.l lVarF2 = F(kVar2.f188889a);
                        BigDecimal bigDecimal = (BigDecimal) kVar2.d;
                        int i2 = kVar2.f188890b;
                        krk.i iVar2 = kVar2.f188891c;
                        mVar3 = new cel.m(lVarF2, i2, iVar2 != null ? E(iVar2) : null, bigDecimal);
                    } else {
                        mVar3 = null;
                    }
                    if (mVar3 != null) {
                        arrayList3.add(mVar3);
                    }
                }
                jVar = new cel.f(arrayList3);
            } else if (lVar instanceof krk.q) {
                List<krk.k> list3 = ((krk.q) lVar).f188902a;
                ArrayList arrayList4 = new ArrayList();
                for (krk.k kVar3 : list3) {
                    if (((BigDecimal) kVar3.d) != null) {
                        cel.l lVarF3 = F(kVar3.f188889a);
                        BigDecimal bigDecimal2 = (BigDecimal) kVar3.d;
                        int i3 = kVar3.f188890b;
                        krk.i iVar3 = kVar3.f188891c;
                        mVar2 = new cel.m(lVarF3, i3, iVar3 != null ? E(iVar3) : null, bigDecimal2);
                    } else {
                        mVar2 = null;
                    }
                    if (mVar2 != null) {
                        arrayList4.add(mVar2);
                    }
                }
                jVar = new cel.h(arrayList4);
            } else {
                if (!(lVar instanceof krk.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<krk.k> list4 = ((krk.m) lVar).f188893a;
                ArrayList arrayList5 = new ArrayList();
                for (krk.k kVar4 : list4) {
                    if (((t) kVar4.d) != null) {
                        cel.l lVarF4 = F(kVar4.f188889a);
                        t tVar = (t) kVar4.d;
                        ej0.b bVarQ = cj9.c.Q(new ko3.a(tVar.f188905a, tVar.f188906b));
                        int i5 = kVar4.f188890b;
                        krk.i iVar4 = kVar4.f188891c;
                        mVar = new cel.m(lVarF4, i5, iVar4 != null ? E(iVar4) : null, bVarQ);
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        arrayList5.add(mVar);
                    }
                }
                jVar = new cel.j(arrayList5);
            }
            arrayList.add(new Pair(aVar, jVar));
        }
        return r0.t(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final k7d.d M(bde.s r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            k7d.d r0 = new k7d.d
            java.lang.String r1 = r4.getType()
            int r2 = r1.hashCode()
            r3 = 2061072(0x1f7310, float:2.888177E-39)
            if (r2 == r3) goto L37
            r3 = 829251574(0x316d5ff6, float:3.4542587E-9)
            if (r2 == r3) goto L2b
            r3 = 2063509483(0x7afea7eb, float:6.611246E35)
            if (r2 == r3) goto L1f
            goto L3f
        L1f:
            java.lang.String r2 = "TRANSFER"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            goto L3f
        L28:
            k7d.c r1 = k7d.c.TRANSFER
            goto L44
        L2b:
            java.lang.String r2 = "PENDING_TRANSACTION"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L34
            goto L3f
        L34:
            k7d.c r1 = k7d.c.PENDING_TRANSACTION
            goto L44
        L37:
            java.lang.String r2 = "CARD"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L42
        L3f:
            k7d.c r1 = k7d.c.UNKNOWN
            goto L44
        L42:
            k7d.c r1 = k7d.c.CARD
        L44:
            java.lang.String r2 = r4.getTitle()
            java.util.List r4 = r4.getIds()
            r0.<init>(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hx7.i.M(bde.s):k7d.d");
    }

    public static final kel.d N(hdl.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new kel.d(bVar.getCreatedDate(), bVar.getRef(), new BigDecimal(bVar.getTotal()), new BigDecimal(bVar.getPending()), new BigDecimal(bVar.getAvailable()), kel.f.valueOf(bVar.getLockup()), bVar.getSoftLockUntil(), bVar.getHardLockUntil());
    }

    public static final kel.d O(jcl.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new kel.d(cVar.getCreatedDate(), cVar.getRef(), new BigDecimal(cVar.getTotal()), new BigDecimal(cVar.getPending()), new BigDecimal(cVar.getAvailable()), kel.f.valueOf(cVar.getLockup()), cVar.getSoftLockUntil(), cVar.getHardLockUntil());
    }

    public static final kel.g P(hdl.e eVar, String portfolioId) {
        kel.l lVar;
        dj0.d dVarP;
        z zVarA;
        kel.e eVar2;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        String strC = eVar.getId();
        long jA = eVar.getCreatedDate();
        hdl.f fVarE = eVar.getState();
        Intrinsics.checkNotNullParameter(fVarE, "<this>");
        int i = wcl.a.f296422a[fVarE.ordinal()];
        if (i == 1) {
            lVar = kel.l.CREATED;
        } else if (i == 2) {
            lVar = kel.l.ACTIVE;
        } else if (i == 3) {
            lVar = kel.l.TRADED;
        } else if (i == 4) {
            lVar = kel.l.TERMINATED;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = kel.l.DECLINED;
        }
        kel.a aVar = new kel.a(strC, portfolioId, Long.valueOf(jA), lVar, eVar.getCurrency(), eVar.getName());
        if (eVar instanceof hdl.d) {
            hdl.d dVar = (hdl.d) eVar;
            return new kel.b(aVar, mo3.a.o(dVar.getTotal()), dVar.getDetails().getPocketId(), mo3.a.o(dVar.getAvailableToInvest()), mo3.a.o(dVar.getAvailableToWithdraw()), mo3.a.o(dVar.getUnsettled()), mo3.a.o(dVar.getCommitted()), mo3.a.o(dVar.getUnsettledBuys()), mo3.a.o(dVar.getTotalOwned()));
        }
        if (!(eVar instanceof hdl.g)) {
            throw new IllegalStateException();
        }
        hdl.g gVar = (hdl.g) eVar;
        BigDecimal bigDecimal = new BigDecimal(gVar.getBalance().getQuantity());
        BigDecimal bigDecimal2 = new BigDecimal(gVar.getAvailable().getQuantity());
        BigDecimal bigDecimal3 = new BigDecimal(gVar.getTotal().getQuantity());
        String strA = gVar.getDetails().getExchange();
        String strM = gVar.getRef();
        String strB = gVar.getDetails().getTicker();
        ko3.a aVarH = gVar.getDecimalAveragePrice();
        if (aVarH != null) {
            ej0.b bVarQ = cj9.c.Q(aVarH);
            xi0.a aVar2 = xi0.b.Companion;
            String strA2 = aVarH.getCurrency();
            aVar2.getClass();
            dVarP = mif.a.P(bVarQ, xi0.a.a(strA2).c(), 2);
        } else {
            dVarP = null;
        }
        ko3.a aVarH2 = gVar.getDecimalAveragePrice();
        ej0.b bVarQ2 = aVarH2 != null ? cj9.c.Q(aVarH2) : null;
        String strK = gVar.getInstrumentType();
        if (strK == null || (zVarA = tbl.a.a(strK)) == null) {
            zVarA = z.UNSPECIFIED;
        }
        z zVar = zVarA;
        ZonedDateTime zonedDateTimeO = gVar.getUpdatedDate();
        hdl.a aVarJ = gVar.getFundHoldingDetails();
        if (aVarJ != null) {
            Intrinsics.checkNotNullParameter(aVarJ, "<this>");
            BigDecimal bigDecimal4 = new BigDecimal(aVarJ.getRedeemable());
            BigDecimal bigDecimal5 = new BigDecimal(aVarJ.getRedeemableWithFee());
            BigDecimal bigDecimal6 = new BigDecimal(aVarJ.getLocked());
            List listE = aVarJ.getSeriesHoldings();
            if (listE != null) {
                List list = listE;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(N((hdl.b) it8.next()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            hdl.b bVarB = aVarJ.getMainHolding();
            eVar2 = new kel.e(bigDecimal4, bigDecimal5, bigDecimal6, arrayList, bVarB != null ? N(bVarB) : null);
        } else {
            eVar2 = null;
        }
        hdl.h hVarL = gVar.getMarginDetails();
        return new kel.n(aVar, bigDecimal, bigDecimal2, bigDecimal3, strM, strB, strA, dVarP, bVarQ2, zVar, hVarL != null ? new kel.m(cj9.c.Q(hVarL.getOpeningPrice()), mo3.a.o(hVarL.getMargin()), mo3.a.o(hVarL.getExposure()), new BigDecimal(hVarL.getLeverage())) : null, eVar2, zonedDateTimeO);
    }

    public static final kel.g Q(jcl.e eVar) {
        z zVarA;
        kel.e eVar2;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        jcl.a aVar = eVar.f172890g;
        String str = eVar.d;
        jcl.g gVar = eVar.f172891h;
        if (aVar != null) {
            return new kel.b(new kel.a(eVar.f172887a, eVar.f172888b, eVar.f172889c, u(str), eVar.f, eVar.e), a.v(aVar.getTotal()), aVar.getPocketId(), a.v(aVar.getAvailableToInvest()), a.v(aVar.getAvailableToWithdraw()), a.v(aVar.getUnsettled()), a.v(aVar.getCommitted()), a.v(aVar.getUnsettledBuys()), a.v(aVar.getTotalOwned()));
        }
        if (gVar == null) {
            throw new IllegalStateException("Could not find appropriate type for HoldingEntity");
        }
        kel.a aVar2 = new kel.a(eVar.f172887a, eVar.f172888b, eVar.f172889c, u(str), eVar.f, eVar.e);
        BigDecimal bigDecimal = new BigDecimal(gVar.getQuantity());
        BigDecimal bigDecimal2 = new BigDecimal(gVar.getAvailable());
        BigDecimal bigDecimal3 = new BigDecimal(gVar.getTotal());
        String exchange = gVar.getExchange();
        String ref2 = gVar.getRef();
        String symbol = gVar.getSymbol();
        jo3.b averagePrice = gVar.getAveragePrice();
        dj0.d dVarV = averagePrice != null ? a.v(averagePrice) : null;
        ko3.b decimalAveragePrice = gVar.getDecimalAveragePrice();
        ej0.b bVarI = decimalAveragePrice != null ? cp5.c.I(decimalAveragePrice) : null;
        String instrumentType = gVar.getInstrumentType();
        if (instrumentType == null || (zVarA = tbl.a.a(instrumentType)) == null) {
            zVarA = z.UNSPECIFIED;
        }
        z zVar = zVarA;
        ZonedDateTime updatedDate = gVar.getUpdatedDate();
        jcl.b fundHoldingDetails = gVar.getFundHoldingDetails();
        if (fundHoldingDetails != null) {
            Intrinsics.checkNotNullParameter(fundHoldingDetails, "<this>");
            BigDecimal bigDecimal4 = new BigDecimal(fundHoldingDetails.getRedeemable());
            BigDecimal bigDecimal5 = new BigDecimal(fundHoldingDetails.getRedeemableWithFee());
            BigDecimal bigDecimal6 = new BigDecimal(fundHoldingDetails.getLocked());
            List listE = fundHoldingDetails.getSeriesHoldings();
            if (listE != null) {
                List list = listE;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(O((jcl.c) it8.next()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            jcl.c cVarB = fundHoldingDetails.getMainHolding();
            eVar2 = new kel.e(bigDecimal4, bigDecimal5, bigDecimal6, arrayList, cVarB != null ? O(cVarB) : null);
        } else {
            eVar2 = null;
        }
        jcl.f marginDetails = gVar.getMarginDetails();
        return new kel.n(aVar2, bigDecimal, bigDecimal2, bigDecimal3, ref2, symbol, exchange, dVarV, bVarI, zVar, marginDetails != null ? new kel.m(cp5.c.I(marginDetails.getOpeningPrice()), a.v(marginDetails.getMargin()), a.v(marginDetails.getExposure()), new BigDecimal(marginDetails.getLeverage())) : null, eVar2, updatedDate);
    }

    public static final krf.c R(htj.a0 a0Var) {
        mrf.a aVar;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        c0 c0Var = a0Var.f155394a;
        String str = a0Var.f155396c;
        int i = itj.a.f168413a[c0Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new krf.d(str);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str2 = a0Var.f155395b;
        if (str2 == null) {
            throw new IllegalArgumentException("Code must exist for predefined reasons");
        }
        x xVar = a0Var.d;
        if (xVar != null) {
            Intrinsics.checkNotNullParameter(xVar, "<this>");
            aVar = new mrf.a(xVar.f155445a, xVar.f155446b, xVar.f155447c, xVar.d);
        } else {
            aVar = null;
        }
        return new krf.e(str2, str, aVar);
    }

    public static final mel.o S(m2l.o oVar) {
        d0 xVar;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String str = oVar.f202219a;
        List<m2l.z> list = oVar.f202220b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (m2l.z zVar : list) {
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            if (zVar instanceof m2l.x) {
                m2l.x xVar2 = (m2l.x) zVar;
                xVar = new mel.z(mo3.a.o(xVar2.f202235a), xVar2.f202237c, mel.c0.valueOf(xVar2.f202236b));
            } else if (zVar instanceof y) {
                y yVar = (y) zVar;
                xVar = new mel.b0(yVar.f202239a, yVar.f202241c, mel.c0.valueOf(yVar.f202240b));
            } else {
                if (!(zVar instanceof m2l.w)) {
                    throw new NoWhenBranchMatchedException();
                }
                m2l.w wVar = (m2l.w) zVar;
                xVar = new mel.x(wVar.f202231a, wVar.f202233c, mel.c0.valueOf(wVar.f202232b));
            }
            arrayList.add(xVar);
        }
        return new mel.o(str, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final mel.p T(m2l.r rVar) {
        dj0.d dVarO;
        j0 j0VarValueOf;
        mel.g gVar;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        k0 k0Var = rVar.f202222a;
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        j0 j0VarValueOf2 = j0.valueOf(k0Var.name());
        k0 k0Var2 = rVar.f202223b;
        if (k0Var2 != null) {
            Intrinsics.checkNotNullParameter(k0Var2, "<this>");
            j0VarValueOf = j0.valueOf(k0Var2.name());
            dVarO = null;
        } else {
            dVarO = null;
            j0VarValueOf = null;
        }
        String str = rVar.f202224c;
        m2l.l lVar = rVar.d;
        if (lVar != null) {
            u uVar = lVar.f202212a;
            mel.u uVar2 = new mel.u(uVar.f202228a, uVar.f202229b);
            u uVar3 = lVar.f202213b;
            gVar = new mel.g(uVar2, new mel.u(uVar3.f202228a, uVar3.f202229b), lVar.f202214c, lVar.d, lVar.e, lVar.f, lVar.f202215g, S(lVar.f202216h));
        } else {
            gVar = dVarO;
        }
        m2l.c0 c0Var = rVar.e;
        if (c0Var != null) {
            u uVar4 = c0Var.f202190a;
            mel.u uVar5 = new mel.u(uVar4.f202228a, uVar4.f202229b);
            u uVar6 = c0Var.f202191b;
            e0Var = new e0(uVar5, new mel.u(uVar6.f202228a, uVar6.f202229b));
        } else {
            e0Var = dVarO;
        }
        jo3.a aVar = rVar.f;
        dj0.d dVarO2 = aVar != null ? mo3.a.o(aVar) : dVarO;
        jo3.a aVar2 = rVar.f202225g;
        if (aVar2 != null) {
            dVarO = mo3.a.o(aVar2);
        }
        return new mel.p(j0VarValueOf2, j0VarValueOf, str, gVar, e0Var, dVarO2, dVarO, rVar.f202226h);
    }

    public static final xc8.c U(ad8.a aVar) {
        return new xc8.c(aVar.getId(), v6d.a.valueOf(aVar.getCode()), (xc8.b) u1.u(aVar.getType(), r0.k(new Pair("GUARDIAN_CONSENT", xc8.b.GUARDIAN_CONSENT), new Pair("YOUTH_CONSENT", xc8.b.YOUTH_CONSENT))), (xc8.a) u1.u(aVar.getState(), r0.k(new Pair("GIVEN", xc8.a.GIVEN), new Pair("NOT_GIVEN", xc8.a.NOT_GIVEN))), oi0.d.Y(aVar.getCreatedDate()));
    }

    public static final xc8.g V(ad8.d dVar) throws Throwable {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        Object objA6;
        String strD = dVar.getJuniorId();
        v6d.a aVar = v6d.a.FIRST_PARTY_MARKETING;
        try {
            m.Companion aVar2 = yhm.m.INSTANCE;
            ad8.a aVarB = dVar.getFirstPartyMarketing();
            objA = aVarB != null ? U(aVarB) : null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion aVar3 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        Pair pair = new Pair(aVar, objA);
        v6d.a aVar4 = v6d.a.THIRD_PARTY_MARKETING;
        try {
            ad8.a aVarG = dVar.getThirdPartyMarketing();
            objA2 = aVarG != null ? U(aVarG) : null;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th11) {
            m.Companion aVar5 = yhm.m.INSTANCE;
            objA2 = yhm.o.a(th11);
        }
        Throwable thA2 = yhm.m.a(objA2);
        if (thA2 != null) {
            e.n(thA2);
        }
        if (objA2 instanceof yhm.n) {
            objA2 = null;
        }
        Pair pair2 = new Pair(aVar4, objA2);
        v6d.a aVar6 = v6d.a.PERSONAL_DATA_PROCESSING;
        try {
            ad8.a aVarF = dVar.getPersonalDataProcessing();
            objA3 = aVarF != null ? U(aVarF) : null;
        } catch (CancellationException e4) {
            throw e4;
        } catch (Throwable th12) {
            m.Companion aVar7 = yhm.m.INSTANCE;
            objA3 = yhm.o.a(th12);
        }
        Throwable thA3 = yhm.m.a(objA3);
        if (thA3 != null) {
            e.n(thA3);
        }
        if (objA3 instanceof yhm.n) {
            objA3 = null;
        }
        Pair pair3 = new Pair(aVar6, objA3);
        v6d.a aVar8 = v6d.a.PAYMENT_LINKS;
        try {
            ad8.a aVarE = dVar.getPaymentLinks();
            objA4 = aVarE != null ? U(aVarE) : null;
        } catch (CancellationException e5) {
            throw e5;
        } catch (Throwable th13) {
            m.Companion aVar9 = yhm.m.INSTANCE;
            objA4 = yhm.o.a(th13);
        }
        Throwable thA4 = yhm.m.a(objA4);
        if (thA4 != null) {
            e.n(thA4);
        }
        if (objA4 instanceof yhm.n) {
            objA4 = null;
        }
        Pair pair4 = new Pair(aVar8, objA4);
        v6d.a aVar10 = v6d.a.BLANK_CARD_DELIVERY;
        try {
            ad8.a aVarA = dVar.getBlankCardDelivery();
            objA5 = aVarA != null ? U(aVarA) : null;
        } catch (CancellationException e6) {
            throw e6;
        } catch (Throwable th14) {
            m.Companion aVar11 = yhm.m.INSTANCE;
            objA5 = yhm.o.a(th14);
        }
        Throwable thA5 = yhm.m.a(objA5);
        if (thA5 != null) {
            e.n(thA5);
        }
        if (objA5 instanceof yhm.n) {
            objA5 = null;
        }
        Pair pair5 = new Pair(aVar10, objA5);
        v6d.a aVar12 = v6d.a.FIRST_PARTY_NFC_PAYMENTS;
        try {
            ad8.a aVarC = dVar.getFirstPartyNfcPayments();
            objA6 = aVarC != null ? U(aVarC) : null;
        } catch (CancellationException e22) {
            throw e22;
        } catch (Throwable th15) {
            m.Companion aVar13 = yhm.m.INSTANCE;
            objA6 = yhm.o.a(th15);
        }
        Throwable thA6 = yhm.m.a(objA6);
        if (thA6 != null) {
            e.n(thA6);
        }
        return new xc8.g(strD, foh.i.q(pair, pair2, pair3, pair4, pair5, new Pair(aVar12, objA6 instanceof yhm.n ? null : objA6)));
    }

    public static final krk.b W(cel.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (grk.a.f146051a[aVar.ordinal()]) {
            case 1:
                return krk.b.EPS_ANN_GROWTH;
            case 2:
                return krk.b.EPS_GROWTH_CONTRIBUTION_ANN;
            case 3:
                return krk.b.PE_RATIO_ANN;
            case 4:
                return krk.b.DIV_YLD_ANN;
            case 5:
                return krk.b.SALES_ANN;
            case 6:
                return krk.b.NET_INCOME_ANN;
            case 7:
                return krk.b.PE_RATIO_CONTRIBUTION_ANN;
            case 8:
                return krk.b.DIV_YLD_CONTRIBUTION_ANN;
            case 9:
                return krk.b.PROFIT_MARGIN_ANN;
            case 10:
                return krk.b.SALES_ANN_GROWTH;
            case 11:
                return krk.b.SALES_QTR;
            case 12:
                return krk.b.NET_INCOME_QTR;
            case 13:
                return krk.b.PROFIT_MARGIN_QTR;
            case 14:
                return krk.b.SALES_QTR_GROWTH;
            case 15:
                return krk.b.EPS_SURPRISE_BASIS_ANN;
            case 16:
                return krk.b.EPS_ANN;
            case 17:
                return krk.b.EPS_SURPRISE_BASIS_QTR;
            case 18:
                return krk.b.EPS_QTR;
            case 19:
                return krk.b.EPS_QTR_GROWTH;
            case 20:
                return krk.b.EPS_ANN_CALENDARISED;
            case 21:
                return krk.b.EPS_ANN_GROWTH_CALENDARISED;
            case 22:
                return krk.b.DPS_ANN_CALENDARISED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final krk.i X(cel.k kVar) {
        int i = grk.a.d[kVar.ordinal()];
        if (i == 1) {
            return krk.i.Q1;
        }
        if (i == 2) {
            return krk.i.Q2;
        }
        if (i == 3) {
            return krk.i.Q3;
        }
        if (i == 4) {
            return krk.i.Q4;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final krk.j Y(cel.l lVar) {
        int i = grk.a.e[lVar.ordinal()];
        if (i == 1) {
            return krk.j.ACTUAL;
        }
        if (i == 2) {
            return krk.j.ESTIMATE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final m2l.o Z(mel.o oVar) {
        Object wVar;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String str = oVar.f204767a;
        ArrayList<d0> arrayList = oVar.f204768b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (d0 d0Var : arrayList) {
            Intrinsics.checkNotNullParameter(d0Var, "<this>");
            if (d0Var instanceof mel.z) {
                mel.z zVar = (mel.z) d0Var;
                wVar = new m2l.x(zVar.f204786c.name(), zVar.f204785b, mo3.a.p(zVar.f204784a));
            } else if (d0Var instanceof mel.b0) {
                mel.b0 b0Var = (mel.b0) d0Var;
                wVar = new y(b0Var.f204733c.name(), b0Var.f204732b, b0Var.f204731a);
            } else {
                if (!(d0Var instanceof mel.x)) {
                    throw new NoWhenBranchMatchedException();
                }
                mel.x xVar = (mel.x) d0Var;
                wVar = new m2l.w(xVar.f204783c.name(), xVar.f204782b, xVar.f204781a);
            }
            arrayList2.add(wVar);
        }
        return new m2l.o(str, arrayList2);
    }

    public static final void a(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbW = a0.d.w(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbW.append(str.charAt(i));
        sbW.append(CoreConstants.SINGLE_QUOTE_CHAR);
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    public static final jcl.c a0(kel.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ZonedDateTime zonedDateTime = dVar.f183158a;
        String str = dVar.f183159b;
        String string = dVar.f183160c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = dVar.d.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = dVar.e.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new jcl.c(zonedDateTime, str, string, string2, string3, dVar.f.name(), dVar.f183161g, dVar.f183162h);
    }

    public static final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setRotation(BitmapDescriptorFactory.HUE_RED);
        view.setRotationY(BitmapDescriptorFactory.HUE_RED);
        view.setRotationX(BitmapDescriptorFactory.HUE_RED);
        view.setPivotY(view.getMeasuredHeight() / 2);
        view.setPivotX(view.getMeasuredWidth() / 2);
        view.animate().setInterpolator(p()).setStartDelay(0L);
    }

    public static final okhttp3.c b0(File file) {
        b1 b1VarB;
        String strD = o80.c.d(file);
        if (strD != null) {
            b1.Companion.getClass();
            b1VarB = a1.b(strD);
        } else {
            b1VarB = null;
        }
        c1 c1Var = new c1(0);
        c1Var.f(okhttp3.c.f226117n);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String name2 = file.getName();
        RequestBody.Companion.getClass();
        c1Var.b(name, name2, p1.a(file, b1VarB));
        return c1Var.e();
    }

    public static byte[] c(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final ufm.n c0(File file, amh.j serviceCall) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serviceCall, "serviceCall");
        ufm.i iVar = new ufm.i(new ufm.c(new com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.c(file, 1), 2), new p8k.b(17, serviceCall), 0);
        pc0.a aVar = pc0.a.f;
        ufm.i iVar2 = new ufm.i(iVar, new o0.a(18), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return te0.w.i0(iVar2);
    }

    public static final dj0.d d(dj0.d dVar, List exchangeRates, xi0.b to6) {
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(to6, "to");
        Iterator it8 = exchangeRates.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar = (n9l.a) next;
            if (Intrinsics.f(aVar.f213661a, dVar.f115083b) && Intrinsics.f(aVar.f213662b, to6)) {
                break;
            }
        }
        n9l.a aVar2 = (n9l.a) next;
        if (aVar2 != null) {
            return pyd.c.K(dVar, aVar2.f213663c, to6);
        }
        return null;
    }

    public static final void d0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean e(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        ArrayList<List> arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((e93.f) it8.next()).f());
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (List list3 : arrayList) {
            if (!q.m(list3) && !q.R(list3)) {
                return false;
            }
        }
        return true;
    }

    public static final byte[] e0(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i] ^ bArr2[i5 + i2]);
        }
        return bArr3;
    }

    public static final ArrayList f(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            List listK = ((e93.f) obj2).k();
            c93.h.Companion.getClass();
            if (listK.contains(c93.h.f22282q)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final byte[] f0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return e0(0, bArr, 0, bArr2, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final ArrayList g(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            List listK = ((e93.f) obj2).k();
            c93.h.Companion.getClass();
            if (listK.contains(c93.h.f22284s)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final dj0.d g0(dj0.d dVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return dVar == null ? new dj0.d(0L, currency) : dVar;
    }

    public static final ArrayList h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            List listK = ((e93.f) obj2).k();
            c93.h.Companion.getClass();
            if (listK.contains(c93.h.f22281p)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final ArrayList i(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            List listK = ((e93.f) obj2).k();
            c93.h.Companion.getClass();
            if (listK.contains(c93.h.f22283r)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final void j(long j2, byte[] dst, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i5 = 7 - i2;
        int i6 = 8 - i3;
        if (i6 > i5) {
            return;
        }
        while (true) {
            int i21 = kotlin.text.e.f187902a[(int) ((j2 >> (i5 << 3)) & 255)];
            int i22 = i + 1;
            dst[i] = (byte) (i21 >> 8);
            i += 2;
            dst[i22] = (byte) i21;
            if (i5 == i6) {
                return;
            } else {
                i5--;
            }
        }
    }

    public static final od3.q k(od3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        od3.f0 f0Var = lVar.e;
        if (!(f0Var instanceof od3.q)) {
            f0Var = null;
        }
        od3.q qVar = (od3.q) f0Var;
        if (qVar != null) {
            return qVar;
        }
        throw new NullPointerException("For " + lVar.f224276a + " ProductData should be instance of " + od3.q.class.getSimpleName() + " but it was " + lVar.e.getClass().getSimpleName());
    }

    public static final od3.x m(od3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        od3.f0 f0Var = lVar.e;
        if (!(f0Var instanceof od3.x)) {
            f0Var = null;
        }
        od3.x xVar = (od3.x) f0Var;
        if (xVar != null) {
            return xVar;
        }
        throw new NullPointerException("For " + lVar.f224276a + " ProductData should be instance of " + od3.x.class.getSimpleName() + " but it was " + lVar.e.getClass().getSimpleName());
    }

    public static final od3.y n(od3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        od3.f0 f0Var = lVar.e;
        if (!(f0Var instanceof od3.y)) {
            f0Var = null;
        }
        od3.y yVar = (od3.y) f0Var;
        if (yVar != null) {
            return yVar;
        }
        throw new NullPointerException("For " + lVar.f224276a + " ProductData should be instance of " + od3.y.class.getSimpleName() + " but it was " + lVar.e.getClass().getSimpleName());
    }

    public static final od3.z o(od3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        od3.f0 f0Var = lVar.e;
        if (!(f0Var instanceof od3.z)) {
            f0Var = null;
        }
        od3.z zVar = (od3.z) f0Var;
        if (zVar != null) {
            return zVar;
        }
        throw new NullPointerException("For " + lVar.f224276a + " ProductData should be instance of " + od3.z.class.getSimpleName() + " but it was " + lVar.e.getClass().getSimpleName());
    }

    public static final TimeInterpolator p() {
        TimeInterpolator interpolator = f156400a;
        if (interpolator == null) {
            interpolator = new ValueAnimator().getInterpolator();
            if (interpolator == null) {
                interpolator = new AccelerateDecelerateInterpolator();
            }
            f156400a = interpolator;
        }
        return interpolator;
    }

    public static final od3.d0 r(od3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        od3.f0 f0Var = lVar.e;
        if (!(f0Var instanceof od3.d0)) {
            f0Var = null;
        }
        od3.d0 d0Var = (od3.d0) f0Var;
        if (d0Var != null) {
            return d0Var;
        }
        throw new NullPointerException("For " + lVar.f224276a + " ProductData should be instance of " + od3.d0.class.getSimpleName() + " but it was " + lVar.e.getClass().getSimpleName());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(wsg.n r11, dj0.d r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof zl7.f
            if (r0 == 0) goto L13
            r0 = r13
            zl7.f r0 = (zl7.f) r0
            int r1 = r0.f323196w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f323196w = r1
            goto L18
        L13:
            zl7.f r0 = new zl7.f
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f323196w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            dj0.d r12 = r0.u
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L2a
            goto L54
        L2a:
            r0 = move-exception
            r11 = r0
            goto L6b
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            yhm.o.b(r13)
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            if (r12 != 0) goto L3d
            goto L6a
        L3d:
            xi0.b r6 = r12.f115083b     // Catch: java.lang.Throwable -> L2a
            r9 = 0
            r10 = 62
            r7 = 0
            r8 = 0
            r5 = r11
            efm.d0 r11 = osg.b.r(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2a
            r0.u = r12     // Catch: java.lang.Throwable -> L2a
            r0.f323196w = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r13 = nim.a.b(r11, r0)     // Catch: java.lang.Throwable -> L2a
            if (r13 != r1) goto L54
            return r1
        L54:
            io3.d r13 = (io3.d) r13     // Catch: java.lang.Throwable -> L2a
            kotlin.jvm.internal.Intrinsics.h(r13)     // Catch: java.lang.Throwable -> L2a
            dj0.d r11 = io3.h.e(r13)     // Catch: java.lang.Throwable -> L2a
            dj0.d r11 = pyd.c.H(r12, r11)     // Catch: java.lang.Throwable -> L2a
            dj0.d r12 = dj0.d.e     // Catch: java.lang.Throwable -> L2a
            boolean r12 = r11.f(r12)     // Catch: java.lang.Throwable -> L2a
            if (r12 == 0) goto L6a
            return r11
        L6a:
            return r4
        L6b:
            yhm.m$a r12 = yhm.m.INSTANCE
            yhm.o.a(r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hx7.i.s(wsg.n, dj0.d, gim.c):java.lang.Object");
    }

    public static final od3.e0 t(od3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        od3.f0 f0Var = lVar.e;
        if (!(f0Var instanceof od3.e0)) {
            f0Var = null;
        }
        od3.e0 e0Var = (od3.e0) f0Var;
        if (e0Var != null) {
            return e0Var;
        }
        throw new NullPointerException("For " + lVar.f224276a + " ProductData should be instance of " + od3.e0.class.getSimpleName() + " but it was " + lVar.e.getClass().getSimpleName());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final kel.l u(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1812385920:
                if (str.equals("TRADED")) {
                    return kel.l.TRADED;
                }
                break;
            case -823723485:
                if (str.equals("TERMINATED")) {
                    return kel.l.TERMINATED;
                }
                break;
            case 1350822958:
                if (str.equals("DECLINED")) {
                    return kel.l.DECLINED;
                }
                break;
            case 1746537160:
                if (str.equals("CREATED")) {
                    return kel.l.CREATED;
                }
                break;
            case 1925346054:
                if (str.equals("ACTIVE")) {
                    return kel.l.ACTIVE;
                }
                break;
        }
        throw new IllegalStateException();
    }

    public static final boolean v(yoj.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar == yoj.d.ENABLED;
    }

    public static final FiatCryptoMoney w(FiatCryptoMoney fiatCryptoMoney, FiatCryptoMoney other) {
        Intrinsics.checkNotNullParameter(fiatCryptoMoney, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new FiatCryptoMoney(pyd.c.H(fiatCryptoMoney.f71112a, other.f71112a), pyd.c.H(fiatCryptoMoney.f71113b, other.f71113b));
    }

    public static final String x(int i, Context context) {
        Object objA;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            objA = context.getResources().getResourceEntryName(i);
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        String str = (String) objA;
        return str == null ? String.valueOf(i) : str;
    }

    public static final boolean y(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        ArrayList<List> arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((e93.f) it8.next()).f());
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (List list3 : arrayList) {
            Intrinsics.checkNotNullParameter(list3, "<this>");
            List<e93.y> list4 = list3;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                for (e93.y yVar : list4) {
                    if (yVar.f123899a != e93.a0.TOTAL || !yVar.f123900b) {
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                if (!q.R((List) it9.next())) {
                    if (arrayList.isEmpty()) {
                        return true;
                    }
                    Iterator it10 = arrayList.iterator();
                    while (it10.hasNext()) {
                        if (!q.m((List) it10.next())) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    public static final void z(NavBarWithToolbar navBarWithToolbar, hx4.d model) {
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof hx4.c) {
            hx4.c cVar = (hx4.c) model;
            Clause clause = cVar.f156387b;
            TextLocalisedClause textLocalisedClause = cVar.f156386a;
            navBarWithToolbar.setTitleAutoSize(false);
            navBarWithToolbar.setHeaderTitleMode(cVar.d);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setDescriptionText(clause);
            navBarWithToolbar.setDescriptionVisible(clause != null);
            navBarWithToolbar.setNavigationButtonImage(cVar.f156388c);
            return;
        }
        if (!(model instanceof hx4.a)) {
            if (!(model instanceof hx4.b)) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause2 = ((hx4.b) model).f156385a;
            navBarWithToolbar.setTitle(textLocalisedClause2, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause2);
            navBarWithToolbar.setSecondDescriptionVisible(false);
            return;
        }
        hx4.a aVar = (hx4.a) model;
        Clause clause2 = aVar.f156383b;
        TextLocalisedClause textLocalisedClause3 = aVar.f156382a;
        navBarWithToolbar.setTitle(textLocalisedClause3, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause3);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setEndImage(aVar.f156384c);
        navBarWithToolbar.setFilters(aVar.d);
    }

    public abstract xr6.p l();

    public abstract xr6.o q();
}
