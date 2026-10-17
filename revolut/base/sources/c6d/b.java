package c6d;

import a26.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import au0.x5;
import aw0.v1;
import bxa.c;
import bxa.d;
import bxa.l;
import bxa.q;
import bxa.r;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.DashedStrokeRectangleDrawable;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingInstitutions;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingProvider;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseInstitutions;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseProvider;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.EligibilityCriteria;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteStepInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeTip;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeTipAction;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxRewardInfo;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationWindow;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import efm.y;
import i4h.o0;
import ip0.wy;
import ip0.xy;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kg.e0;
import kg.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import mx0.nb;
import mx0.o5;
import mx0.y9;
import pwa.e;
import pwa.o;
import tf1.u;
import yt8.f;
import yt8.g;
import yt8.h;
import yt8.i;
import yt8.j;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final o5 A(View view) {
        Object tag2 = view.getTag(R$id.internal_modal_embedded_state_tag);
        o5 o5Var = tag2 instanceof o5 ? (o5) tag2 : null;
        if (o5Var != null) {
            return o5Var;
        }
        throw new IllegalArgumentException("View must be added via addContent first");
    }

    public static final boolean B(ExternalInstitution externalInstitution) {
        Intrinsics.checkNotNullParameter(externalInstitution, "<this>");
        List list = externalInstitution.f66113l;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f((String) it8.next(), "penny-pis")) {
                return true;
            }
        }
        return false;
    }

    public static final d C(ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo) {
        Intrinsics.checkNotNullParameter(activeOrPastInvitesRewardInfo, "<this>");
        dj0.d dVar = activeOrPastInvitesRewardInfo.f81708a;
        long j2 = dVar.f115082a;
        String str = dVar.f115083b.f306286a;
        xi0.b bVar = activeOrPastInvitesRewardInfo.f81709b;
        return new d(j2, str, bVar != null ? bVar.f306286a : null, activeOrPastInvitesRewardInfo.f81710c, activeOrPastInvitesRewardInfo.d);
    }

    public static final IndiaNetBankingInstitutions D(ff6.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<ff6.b> listB = aVar.getPopular();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (ff6.b bVar : listB) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new IndiaNetBankingProvider(bVar.getId(), bVar.getName(), bVar.getLogo()));
        }
        List<ff6.b> listA = aVar.getOthers();
        ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
        for (ff6.b bVar2 : listA) {
            Intrinsics.checkNotNullParameter(bVar2, "<this>");
            arrayList2.add(new IndiaNetBankingProvider(bVar2.getId(), bVar2.getName(), bVar2.getLogo()));
        }
        return new IndiaNetBankingInstitutions(arrayList, arrayList2);
    }

    public static final PseInstitutions E(rf6.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List listB = aVar.getPopular();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        Iterator it8 = listB.iterator();
        while (true) {
            String str = "";
            if (!it8.hasNext()) {
                break;
            }
            rf6.b bVar = (rf6.b) it8.next();
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            String strB = bVar.getId();
            String strD = bVar.getName();
            String strC = bVar.getLogo();
            String strA = bVar.getCode();
            if (strA != null) {
                str = strA;
            }
            arrayList.add(new PseProvider(strB, strD, strC, str));
        }
        List<rf6.b> listA = aVar.getOthers();
        ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
        for (rf6.b bVar2 : listA) {
            Intrinsics.checkNotNullParameter(bVar2, "<this>");
            String strB2 = bVar2.getId();
            String strD2 = bVar2.getName();
            String strC2 = bVar2.getLogo();
            String strA2 = bVar2.getCode();
            if (strA2 == null) {
                strA2 = "";
            }
            arrayList2.add(new PseProvider(strB2, strD2, strC2, strA2));
        }
        return new PseInstitutions(arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static final ActiveOrPastInviteeDetails F(bxa.b bVar) {
        o oVar;
        Iterator it8;
        InviteeTipAction inviteeTipAction;
        String str;
        ArrayList arrayList;
        AdditionalInfo additionalInfo;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strY = bVar.getTitle();
        String strD = bVar.getEmail();
        String strG = bVar.getFirstName();
        String strO = bVar.getRevtag();
        String strH = bVar.getId();
        String strK = bVar.getLastName();
        String strF = bVar.getFaqKey();
        String strM = bVar.getPhone();
        d dVarN = bVar.getPotentialReward();
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoH = dVarN != null ? H(dVarN) : null;
        List<l> listV = bVar.getSteps();
        ArrayList arrayList2 = new ArrayList(w.t(listV, 10));
        for (l lVar : listV) {
            e eVar = (e) u1.u(lVar.getStatus(), mwa.a.f209421b);
            String strG2 = lVar.getTitle();
            String strC = lVar.getDescription();
            List listD = lVar.getEligibilityCriteria();
            if (listD != null) {
                List list = listD;
                str = strY;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    cxa.a aVar = (cxa.a) it9.next();
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    arrayList3.add(new EligibilityCriteria(aVar.getIcon(), aVar.getTitle(), aVar.getDescription()));
                    it9 = it9;
                    strD = strD;
                }
                arrayList = arrayList3;
            } else {
                str = strY;
                arrayList = null;
            }
            String str2 = strD;
            String strB = lVar.getBadge();
            bxa.e eVarA = lVar.getAdditionalInfo();
            if (eVarA != null) {
                Intrinsics.checkNotNullParameter(eVarA, "<this>");
                additionalInfo = new AdditionalInfo(eVarA.getTitle(), eVarA.getSubtitle());
            } else {
                additionalInfo = null;
            }
            jo3.a aVarE = lVar.getReward();
            arrayList2.add(new InviteStepInfo(eVar, strG2, strC, arrayList, strB, additionalInfo, aVarE != null ? mo3.a.o(aVarE) : null));
            strY = str;
            strD = str2;
        }
        String str3 = strY;
        String str4 = strD;
        d dVarQ = bVar.getRewardEarned();
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoH2 = dVarQ != null ? H(dVarQ) : null;
        String strS = bVar.getRewardType();
        if (strS != null) {
            o[] oVarArrValues = o.values();
            int length = oVarArrValues.length;
            for (int i = 0; i < length; i++) {
                oVar = oVarArrValues[i];
                if (a0.z(oVar.name(), strS, true)) {
                    break;
                }
            }
            oVar = null;
        } else {
            oVar = null;
        }
        pwa.b bVar2 = (pwa.b) u1.u(bVar.getStatus(), mwa.a.f209420a);
        Instant instantC = bVar.getDeadline();
        Instant instantP = bVar.getRewardDeadline();
        String strR = bVar.getRewardGifUrl();
        Instant instantB = bVar.getCreatedDate();
        String strE = bVar.getExpireReason();
        List listX = bVar.getTips();
        ArrayList arrayList4 = new ArrayList(w.t(listX, 10));
        Iterator it10 = listX.iterator();
        while (it10.hasNext()) {
            bxa.o oVar2 = (bxa.o) it10.next();
            String strC2 = oVar2.getIcon();
            String strE2 = oVar2.getTitle();
            String strD2 = oVar2.getSubtitle();
            String strB2 = oVar2.getDescription();
            q qVarA = oVar2.getAction();
            if (qVarA != null) {
                it8 = it10;
                inviteeTipAction = new InviteeTipAction(qVarA.getTitle(), qVarA.getDeeplink());
            } else {
                it8 = it10;
                inviteeTipAction = null;
            }
            arrayList4.add(new InviteeTip(strC2, strE2, strD2, strB2, inviteeTipAction));
            it10 = it8;
        }
        d dVarL = bVar.getMissedReward();
        return new ActiveOrPastInviteeDetails(str3, str4, strG, strO, strH, strK, strM, strF, activeOrPastInvitesRewardInfoH, activeOrPastInvitesRewardInfoH2, oVar, arrayList2, bVar2, instantC, instantP, strR, instantB, strE, arrayList4, dVarL != null ? H(dVarL) : null, bVar.getIneligibilityReason(), bVar.getInviteeCode(), bVar.getStatusSummary(), bVar.getTermsUrl(), bVar.getConfettiSeen());
    }

    public static final ActiveOrPastInvitesInfo G(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List listB = cVar.getInvites();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        Iterator it8 = listB.iterator();
        while (it8.hasNext()) {
            arrayList.add(F((bxa.b) it8.next()));
        }
        int iA = cVar.getCount();
        d dVarD = cVar.getTotalRewardEarned();
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoH = dVarD != null ? H(dVarD) : null;
        r rVarC = cVar.getMaxRewardInfo();
        return new ActiveOrPastInvitesInfo(arrayList, iA, activeOrPastInvitesRewardInfoH, rVarC != null ? new MaxRewardInfo(rVarC.getMaxReferrerRewards(), rVarC.getIsMaxRewardEarned()) : null);
    }

    public static final ActiveOrPastInvitesRewardInfo H(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        long amount = dVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = dVar.getCurrency();
        aVar.getClass();
        dj0.d dVar2 = new dj0.d(amount, xi0.a.a(currency));
        String targetCurrency = dVar.getTargetCurrency();
        return new ActiveOrPastInvitesRewardInfo(dVar2, dVar.getTitle(), dVar.getSubtitle(), targetCurrency != null ? xi0.a.a(targetCurrency) : null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public static final yt8.c I(vt8.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        i iVar = (i) u1.u(eVar.getStatus(), vt8.d.f291926a);
        List<vt8.c> elements = eVar.getElements();
        ArrayList arrayList = new ArrayList(w.t(elements, 10));
        for (vt8.c cVar : elements) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            i iVar2 = (i) u1.u(cVar.getStatus(), vt8.d.f291926a);
            j jVar = (j) u1.u(cVar.getElement(), vt8.d.f291927b);
            String reviewMethod = cVar.getReviewMethod();
            g gVar = null;
            h hVar = reviewMethod != null ? (h) u1.u(reviewMethod, vt8.d.d) : null;
            String failReason = cVar.getFailReason();
            if (failReason != null) {
                gVar = (g) u1.v(failReason, vt8.d.e);
            }
            arrayList.add(new f(iVar2, jVar, hVar, gVar));
        }
        return new yt8.c(iVar, d0.i1(arrayList), f0.f322471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yvh.b J(d6d.b r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6d.b.J(d6d.b):yvh.b");
    }

    public static final d6d.d K(yvh.f fVar) {
        int i = fVar == null ? -1 : a.f21776b[fVar.ordinal()];
        if (i == 1) {
            return d6d.d.SPARE_CHANGE;
        }
        if (i == 2) {
            return d6d.d.DAILY_SAVINGS;
        }
        if (i == 3) {
            return d6d.d.SPENDING_PERCENTAGE;
        }
        if (i != 4) {
            return null;
        }
        return d6d.d.BALANCE_ROUNDING;
    }

    public static final ff6.a L(IndiaNetBankingInstitutions indiaNetBankingInstitutions) {
        Intrinsics.checkNotNullParameter(indiaNetBankingInstitutions, "<this>");
        ArrayList<IndiaNetBankingProvider> arrayList = indiaNetBankingInstitutions.f72367a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (IndiaNetBankingProvider indiaNetBankingProvider : arrayList) {
            Intrinsics.checkNotNullParameter(indiaNetBankingProvider, "<this>");
            arrayList2.add(new ff6.b(indiaNetBankingProvider.f72369a, indiaNetBankingProvider.f72370b, indiaNetBankingProvider.f72371c));
        }
        ArrayList<IndiaNetBankingProvider> arrayList3 = indiaNetBankingInstitutions.f72368b;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        for (IndiaNetBankingProvider indiaNetBankingProvider2 : arrayList3) {
            Intrinsics.checkNotNullParameter(indiaNetBankingProvider2, "<this>");
            arrayList4.add(new ff6.b(indiaNetBankingProvider2.f72369a, indiaNetBankingProvider2.f72370b, indiaNetBankingProvider2.f72371c));
        }
        return new ff6.a(arrayList2, arrayList4);
    }

    public static final rf6.a M(PseInstitutions pseInstitutions) {
        Intrinsics.checkNotNullParameter(pseInstitutions, "<this>");
        ArrayList<PseProvider> arrayList = pseInstitutions.f72416a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (PseProvider pseProvider : arrayList) {
            Intrinsics.checkNotNullParameter(pseProvider, "<this>");
            arrayList2.add(new rf6.b(pseProvider.f72418a, pseProvider.f72419b, pseProvider.f72420c, pseProvider.d));
        }
        ArrayList<PseProvider> arrayList3 = pseInstitutions.f72417b;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        for (PseProvider pseProvider2 : arrayList3) {
            Intrinsics.checkNotNullParameter(pseProvider2, "<this>");
            arrayList4.add(new rf6.b(pseProvider2.f72418a, pseProvider2.f72419b, pseProvider2.f72420c, pseProvider2.d));
        }
        return new rf6.a(arrayList2, arrayList4);
    }

    public static final List N(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public static final bxa.b O(ActiveOrPastInviteeDetails activeOrPastInviteeDetails) {
        Instant instant;
        String str;
        q qVar;
        Iterator it8;
        String str2;
        String str3;
        ArrayList arrayList;
        bxa.e eVar;
        Intrinsics.checkNotNullParameter(activeOrPastInviteeDetails, "<this>");
        String str4 = activeOrPastInviteeDetails.f81688a;
        String str5 = activeOrPastInviteeDetails.f81689b;
        String str6 = activeOrPastInviteeDetails.f81690c;
        String str7 = activeOrPastInviteeDetails.d;
        String str8 = activeOrPastInviteeDetails.e;
        String str9 = activeOrPastInviteeDetails.f;
        String str10 = activeOrPastInviteeDetails.f81691g;
        String str11 = activeOrPastInviteeDetails.f81692h;
        ArrayList arrayList2 = activeOrPastInviteeDetails.f81694l;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            InviteStepInfo inviteStepInfo = (InviteStepInfo) it9.next();
            String strG = u1.g(inviteStepInfo.f81724a, mwa.a.f209421b);
            String str12 = inviteStepInfo.f81725b;
            String str13 = inviteStepInfo.f81726c;
            List list = inviteStepInfo.d;
            if (list != null) {
                List list2 = list;
                it8 = it9;
                str2 = str4;
                str3 = str5;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    EligibilityCriteria eligibilityCriteria = (EligibilityCriteria) it10.next();
                    Intrinsics.checkNotNullParameter(eligibilityCriteria, "<this>");
                    arrayList4.add(new cxa.a(eligibilityCriteria.f81720a, eligibilityCriteria.f81721b, eligibilityCriteria.f81722c));
                    it10 = it10;
                    str6 = str6;
                }
                arrayList = arrayList4;
            } else {
                it8 = it9;
                str2 = str4;
                str3 = str5;
                arrayList = null;
            }
            String str14 = str6;
            String str15 = inviteStepInfo.e;
            AdditionalInfo additionalInfo = inviteStepInfo.f;
            if (additionalInfo != null) {
                Intrinsics.checkNotNullParameter(additionalInfo, "<this>");
                eVar = new bxa.e(additionalInfo.f81711a, additionalInfo.f81712b);
            } else {
                eVar = null;
            }
            dj0.d dVar = inviteStepInfo.f81727g;
            arrayList3.add(new l(eVar, strG, str12, str13, str15, arrayList, dVar != null ? mo3.a.p(dVar) : null));
            it9 = it8;
            str4 = str2;
            str5 = str3;
            str6 = str14;
        }
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = activeOrPastInviteeDetails.i;
        d dVarC = activeOrPastInvitesRewardInfo != null ? C(activeOrPastInvitesRewardInfo) : null;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo2 = activeOrPastInviteeDetails.f81693j;
        d dVarC2 = activeOrPastInvitesRewardInfo2 != null ? C(activeOrPastInvitesRewardInfo2) : null;
        o oVar = activeOrPastInviteeDetails.k;
        String strName = oVar != null ? oVar.name() : null;
        String strG2 = u1.g(activeOrPastInviteeDetails.f81695m, mwa.a.f209420a);
        String str19 = activeOrPastInviteeDetails.f81697p;
        Instant instant2 = activeOrPastInviteeDetails.f81696n;
        Instant instant3 = activeOrPastInviteeDetails.o;
        Instant instant4 = activeOrPastInviteeDetails.f81698q;
        String str20 = activeOrPastInviteeDetails.f81699r;
        List list3 = activeOrPastInviteeDetails.f81700s;
        ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
        Iterator it11 = list3.iterator();
        while (it11.hasNext()) {
            InviteeTip inviteeTip = (InviteeTip) it11.next();
            Iterator it12 = it11;
            String str21 = inviteeTip.f81738a;
            String str22 = inviteeTip.f81739b;
            String str23 = inviteeTip.f81740c;
            String str24 = inviteeTip.d;
            InviteeTipAction inviteeTipAction = inviteeTip.e;
            if (inviteeTipAction != null) {
                str = str24;
                instant = instant4;
                qVar = new q(inviteeTipAction.f81741a, inviteeTipAction.f81742b);
            } else {
                instant = instant4;
                str = str24;
                qVar = null;
            }
            arrayList5.add(new bxa.o(str21, str22, str23, str, qVar));
            it11 = it12;
            instant4 = instant;
        }
        Instant instant5 = instant4;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo3 = activeOrPastInviteeDetails.f81701t;
        return new bxa.b(str16, str17, str18, str7, str8, str9, str10, str11, arrayList3, dVarC, dVarC2, strName, strG2, str19, instant2, instant3, instant5, str20, arrayList5, activeOrPastInvitesRewardInfo3 != null ? C(activeOrPastInvitesRewardInfo3) : null, activeOrPastInviteeDetails.u, activeOrPastInviteeDetails.v, activeOrPastInviteeDetails.f81702w, activeOrPastInviteeDetails.f81703x, activeOrPastInviteeDetails.f81704y);
    }

    public static final c P(ActiveOrPastInvitesInfo activeOrPastInvitesInfo) {
        Intrinsics.checkNotNullParameter(activeOrPastInvitesInfo, "<this>");
        ArrayList arrayList = activeOrPastInvitesInfo.f81705a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(O((ActiveOrPastInviteeDetails) it8.next()));
        }
        int i = activeOrPastInvitesInfo.f81706b;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = activeOrPastInvitesInfo.f81707c;
        d dVarC = activeOrPastInvitesRewardInfo != null ? C(activeOrPastInvitesRewardInfo) : null;
        MaxRewardInfo maxRewardInfo = activeOrPastInvitesInfo.d;
        return new c(arrayList2, i, dVarC, maxRewardInfo != null ? new r(maxRewardInfo.f81743a, maxRewardInfo.f81744b) : null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final vt8.e Q(yt8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String strG = u1.g(cVar.f316662a, vt8.d.f291926a);
        Set<f> set = cVar.f316663b;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (f fVar : set) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            String strG2 = u1.g(fVar.f316667a, vt8.d.f291926a);
            String strG3 = u1.g(fVar.f316668b, vt8.d.f291927b);
            h hVar = fVar.f316669c;
            String strG4 = null;
            String strG5 = hVar != null ? u1.g(hVar, vt8.d.d) : null;
            g gVar = fVar.d;
            if (gVar != null) {
                strG4 = u1.g(gVar, vt8.d.e);
            }
            arrayList.add(new vt8.c(strG3, strG2, strG5, strG4));
        }
        return new vt8.e(strG, d0.d1(arrayList));
    }

    public static final efm.r R(efm.r rVar, ArrayList totalPayLoad) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(totalPayLoad, "totalPayLoad");
        if (totalPayLoad.isEmpty()) {
            efm.r rVarEmpty = efm.r.empty();
            Intrinsics.h(rVarEmpty);
            return rVarEmpty;
        }
        Iterator it8 = totalPayLoad.iterator();
        long length = 0;
        while (it8.hasNext()) {
            length += ((File) it8.next()).length();
        }
        efm.r map = rVar.scan(0L, new nx7.i(new nsl.d(17), 7)).map(new nx7.i(new nxc.a(length, 0), 8));
        Intrinsics.h(map);
        return map;
    }

    public static final LayerDrawable S(Drawable drawable, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable});
        layerDrawable.setLayerInset(0, i, i2, i3, i5);
        return layerDrawable;
    }

    public static final LayerDrawable T(DashedStrokeRectangleDrawable dashedStrokeRectangleDrawable, int i) {
        Intrinsics.checkNotNullParameter(dashedStrokeRectangleDrawable, "<this>");
        return S(dashedStrokeRectangleDrawable, i, i, i, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static final void a(SmallActionButton smallActionButton, wy wyVar) {
        if (wyVar == null) {
            smallActionButton.setVisibility(8);
            return;
        }
        xy xyVar = wyVar.f167069b;
        smallActionButton.setVisibility(0);
        smallActionButton.setText(wyVar.f167068a);
        smallActionButton.setIcon(wyVar.f167070c);
        smallActionButton.i(xyVar.b());
        smallActionButton.setEnabled(xyVar.a());
    }

    public static final int b(y9 y9Var) {
        int childCount = y9Var.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = y9Var.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (A(childAt).f209886a instanceof nb) {
                i++;
            }
        }
        return i;
    }

    public static final Object c(ListenableFuture listenableFuture, gim.i frame) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return ax.c.a(listenableFuture);
            }
            skm.l lVar = new skm.l(1, fim.h.b(frame));
            lVar.u();
            listenableFuture.addListener(new x5(listenableFuture, lVar), ax.b.f10813a);
            lVar.r(new p(listenableFuture, 6));
            Object objT = lVar.t();
            if (objT == fim.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objT;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            Intrinsics.h(cause);
            throw cause;
        }
    }

    public static final TravelExperienceCancellationWindow d(TravelExperienceCancellationPolicy travelExperienceCancellationPolicy) {
        Intrinsics.checkNotNullParameter(travelExperienceCancellationPolicy, "<this>");
        if (travelExperienceCancellationPolicy.b().isEmpty()) {
            return null;
        }
        Iterator it8 = travelExperienceCancellationPolicy.b().iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            double dW = w((TravelExperienceCancellationWindow) next);
            do {
                Object next2 = it8.next();
                double dW2 = w((TravelExperienceCancellationWindow) next2);
                if (Double.compare(dW, dW2) < 0) {
                    next = next2;
                    dW = dW2;
                }
            } while (it8.hasNext());
        }
        return (TravelExperienceCancellationWindow) next;
    }

    public static final void e(u uVar, qf1.c categoryId, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        tf1.c cVar = new tf1.c();
        builderAction.invoke(cVar);
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        tf1.b category = new tf1.b(categoryId, cVar.f270148a);
        uVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        uVar.f270201a.add(category);
    }

    public static void f(Object obj2, Class cls) {
        if (obj2 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static boolean g(boolean z, boolean z3, y yVar, ufm.g gVar, ifm.c cVar, ofm.q qVar) {
        if (qVar.d) {
            gVar.clear();
            cVar.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th10 = qVar.f;
        if (th10 != null) {
            gVar.clear();
            if (cVar != null) {
                cVar.dispose();
            }
            yVar.onError(th10);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (cVar != null) {
            cVar.dispose();
        }
        yVar.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r7.f224945a.addAndGet(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(ufm.g r8, bgm.d r9, ifm.c r10, ofm.q r11) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r11.e
            boolean r3 = r8.isEmpty()
            r5 = r8
            r4 = r9
            r6 = r10
            r7 = r11
            boolean r8 = g(r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L13
            goto L32
        L13:
            boolean r2 = r7.e
            java.lang.Object r8 = r5.poll()
            if (r8 != 0) goto L1d
            r3 = r0
            goto L1f
        L1d:
            r9 = 0
            r3 = r9
        L1f:
            boolean r9 = g(r2, r3, r4, r5, r6, r7)
            r10 = r3
            if (r9 == 0) goto L27
            goto L32
        L27:
            if (r10 == 0) goto L38
            int r8 = -r1
            java.util.concurrent.atomic.AtomicInteger r9 = r7.f224945a
            int r1 = r9.addAndGet(r8)
            if (r1 != 0) goto L33
        L32:
            return
        L33:
            r9 = r4
            r8 = r5
            r10 = r6
            r11 = r7
            goto L2
        L38:
            r7.a(r4, r8)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: c6d.b.h(ufm.g, bgm.d, ifm.c, ofm.q):void");
    }

    public static final Flow i(Flow flow, Function1 block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return vkm.q.q(vkm.q.Q(flow, new o0(2, null, block)));
    }

    public static final int j(PixKey pixKey) {
        Intrinsics.checkNotNullParameter(pixKey, "<this>");
        if (pixKey instanceof PixKey.Document) {
            return R$drawable.uikit_icn_24_national_id;
        }
        if (pixKey instanceof PixKey.Email) {
            return R$drawable.uikit_icn_24_envelope;
        }
        if (pixKey instanceof PixKey.PhoneNumber) {
            return R$drawable.uikit_icn_24_smartphone;
        }
        if (pixKey instanceof PixKey.Random) {
            return R$drawable.uikit_icn_24_avatar_grid;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int k(PixKey pixKey) {
        Intrinsics.checkNotNullParameter(pixKey, "<this>");
        if (pixKey instanceof PixKey.Document) {
            return R$string.pix_key_document;
        }
        if (pixKey instanceof PixKey.Email) {
            return R$string.pix_key_email;
        }
        if (pixKey instanceof PixKey.PhoneNumber) {
            return R$string.pix_key_phone;
        }
        if (pixKey instanceof PixKey.Random) {
            return R$string.pix_key_random;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final LocalDate l(Delivery delivery) {
        Intrinsics.checkNotNullParameter(delivery, "<this>");
        switch (xac.a.f303869a[delivery.f84643g.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return delivery.i;
            case 5:
            case 6:
                return delivery.k;
            case 7:
                return delivery.f84646l;
            case 8:
                return delivery.f84645j;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int m(bv0.a aVar, Context context, v1 colorScheme) {
        int i;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        switch (bv0.f.f18937a[aVar.ordinal()]) {
            case 1:
                return kli.a.s(R$attr.uikit_colorRed, context);
            case 2:
            case 3:
                return 0;
            case 4:
                return kli.a.s(R$attr.uikit_colorForeground, context);
            case 5:
                return kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnLightBackground, context);
            case 6:
                return kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnLightBackgroundDisabled, context);
            case 7:
                return kli.a.s(R$attr.uikit_colorForeground, context);
            case 8:
                colorScheme.getClass();
                int i2 = aw0.u1.f10553a[colorScheme.ordinal()];
                if (i2 == 1) {
                    i = com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnDarkBackgroundDisabled;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnLightBackgroundDisabled;
                }
                return kli.a.s(i, context);
            case 9:
                return kli.a.s(colorScheme.a(), context);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean n(MotionEvent motionEvent, View view) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        return ((float) view.getLeft()) <= motionEvent.getX() && motionEvent.getX() <= ((float) view.getRight()) && ((float) view.getTop()) <= motionEvent.getY() && motionEvent.getY() <= ((float) view.getBottom());
    }

    public static final boolean o(yji.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar.equals(yji.g.f314514a)) {
            return false;
        }
        if (hVar.equals(yji.f.f314513a) || hVar.equals(yji.e.f314512a)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean p(yji.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar.equals(yji.g.f314514a) || hVar.equals(yji.f.f314513a)) {
            return false;
        }
        if (hVar.equals(yji.e.f314512a)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean q(yji.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar.equals(yji.g.f314514a)) {
            return false;
        }
        if (hVar.equals(yji.f.f314513a)) {
            return true;
        }
        if (hVar.equals(yji.e.f314512a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void r(tf1.c cVar, qf1.e categoryItemGroupId, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(categoryItemGroupId, "categoryItemGroupId");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        tf1.d dVar = new tf1.d();
        builderAction.invoke(dVar);
        Intrinsics.checkNotNullParameter(categoryItemGroupId, "categoryItemGroupId");
        ArrayList arrayList = dVar.f270152a;
        tf1.r group = new tf1.r(categoryItemGroupId, arrayList);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            cVar.f270148a.add(new tf1.f((qf1.f) it8.next(), group.f270198a));
        }
    }

    public static final ChargeBreakdown s(ChargeBreakdown chargeBreakdown) {
        Intrinsics.checkNotNullParameter(chargeBreakdown, "<this>");
        Amount total = chargeBreakdown.f104724c;
        if (total == null) {
            total = chargeBreakdown.f104722a;
        }
        List<ChargeEntry> list = chargeBreakdown.f104723b;
        ArrayList breakdown = new ArrayList(w.t(list, 10));
        for (ChargeEntry chargeEntry : list) {
            Amount amount = chargeEntry.f104728g;
            if (amount == null) {
                amount = chargeEntry.e;
            }
            Amount amount2 = amount;
            String title = chargeEntry.f104725a;
            String shortDescription = chargeEntry.f104726b;
            String description = chargeEntry.f104727c;
            ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(amount2, "amount");
            breakdown.add(new ChargeEntry(title, shortDescription, description, chargeEntryDetails, amount2, null, null));
        }
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        return new ChargeBreakdown(total, breakdown, (Amount) null, (Amount) null);
    }

    public static kg.u t(String str) {
        return v(str);
    }

    public static kg.u u(qg.a aVar) {
        e0 e0Var = aVar.f245600b;
        if (e0Var == e0.LEGACY_STRICT) {
            aVar.D(e0.LENIENT);
        }
        try {
            try {
                return m70.a.q(aVar);
            } finally {
                aVar.D(e0Var);
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e);
        }
    }

    public static kg.u v(String str) {
        try {
            try {
                qg.a aVar = new qg.a(new StringReader(str));
                kg.u uVarU = u(aVar);
                try {
                    uVarU.getClass();
                    if (!(uVarU instanceof v) && aVar.A() != qg.b.END_DOCUMENT) {
                        throw new JsonSyntaxException("Did not consume the entire document.");
                    }
                    return uVarU;
                } catch (NumberFormatException e) {
                    e = e;
                    throw new JsonSyntaxException(e);
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } catch (MalformedJsonException | NumberFormatException e4) {
            e = e4;
        }
    }

    public static final double w(TravelExperienceCancellationWindow travelExperienceCancellationWindow) {
        Intrinsics.checkNotNullParameter(travelExperienceCancellationWindow, "<this>");
        String strA = travelExperienceCancellationWindow.getF93190c();
        StringBuilder sb6 = new StringBuilder();
        int length = strA.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strA.charAt(i);
            if (cCharAt != '%') {
                sb6.append(cCharAt);
            }
        }
        return kotlin.ranges.f.e(Double.parseDouble(sb6.toString()), 0.0d, 100.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(long r15, long r17, kotlin.jvm.functions.Function1 r19, ljl.n1 r20, kotlin.jvm.functions.Function1 r21, gim.c r22) throws java.lang.Exception {
        /*
            r0 = r22
            boolean r1 = r0 instanceof ll7.f0
            if (r1 == 0) goto L15
            r1 = r0
            ll7.f0 r1 = (ll7.f0) r1
            int r2 = r1.f196624x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f196624x = r2
            goto L1a
        L15:
            ll7.f0 r1 = new ll7.f0
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f196623w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f196624x
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            kotlin.jvm.internal.Ref$ObjectRef r2 = r1.v
            kotlin.jvm.internal.Ref$ObjectRef r1 = r1.u
            yhm.o.b(r0)
            goto L63
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r9 = p.a.w(r0)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r6 = new kotlin.jvm.internal.Ref$BooleanRef
            r6.<init>()
            r6.f186407a = r4
            ll7.g0 r5 = new ll7.g0
            r14 = 0
            r7 = r17
            r13 = r19
            r12 = r20
            r10 = r21
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14)
            r1.u = r9
            r1.v = r11
            r1.f196624x = r4
            r3 = r15
            java.lang.Object r0 = skm.h2.d(r3, r5, r1)
            if (r0 != r2) goto L61
            return r2
        L61:
            r1 = r9
            r2 = r11
        L63:
            java.lang.Object r0 = r1.f186409a
            if (r0 != 0) goto L76
            java.lang.Object r0 = r2.f186409a
            java.lang.Exception r0 = (java.lang.Exception) r0
            if (r0 != 0) goto L75
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Something went wrong"
            r0.<init>(r1)
            throw r0
        L75:
            throw r0
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6d.b.x(long, long, kotlin.jvm.functions.Function1, ljl.n1, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public static final x3g.b z(TravelExperienceCancellationWindow travelExperienceCancellationWindow) {
        Intrinsics.checkNotNullParameter(travelExperienceCancellationWindow, "<this>");
        double dW = w(travelExperienceCancellationWindow);
        return dW == 100.0d ? x3g.b.FULL_REFUND : dW == 0.0d ? x3g.b.NO_REFUND : x3g.b.PARTIAL_REFUND;
    }
}
