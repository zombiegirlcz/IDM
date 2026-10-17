package nfk;

import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import hfk.n;
import hha.h0;
import hha.w0;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lfk.a;
import lfk.b;
import lfk.g;
import lfk.l;
import lha.g;
import lha.h;
import lha.i;
import lha.j;
import lha.k;
import lha.o;
import lha.p;
import lha.q;
import zek.v;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c {
    public static final ArrayList a(mfk.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List invitations = aVar.getInvitations();
        ArrayList arrayList = new ArrayList(w.t(invitations, 10));
        Iterator it8 = invitations.iterator();
        while (it8.hasNext()) {
            arrayList.add(d((lfk.f) it8.next()));
        }
        return arrayList;
    }

    public static final lha.d b(lfk.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        b.a addMember = bVar.getAddMember();
        lha.b bVar2 = null;
        aVar = null;
        lha.a aVar = null;
        if (addMember != null) {
            int attemptsLeft = addMember.getAttemptsLeft();
            int attemptLimit = addMember.getAttemptLimit();
            Period period = Period.parse(addMember.getLimitPeriod());
            Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
            String nextAttemptAt = addMember.getNextAttemptAt();
            Instant instant = nextAttemptAt != null ? Instant.parse(nextAttemptAt) : null;
            String resetStrategy = addMember.getResetStrategy();
            if (resetStrategy != null) {
                lha.a[] aVarArrValues = lha.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    lha.a aVar2 = aVarArrValues[i];
                    if (a0.z(aVar2.name(), resetStrategy, true)) {
                        aVar = aVar2;
                        break;
                    }
                    i++;
                }
            }
            bVar2 = new lha.b(attemptsLeft, attemptLimit, period, instant, aVar, addMember.getLimitDisclosureRequired());
        }
        return new lha.d(bVar2);
    }

    public static final g c(lfk.a aVar, o currentUserRole) {
        lha.f fVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(currentUserRole, "currentUserRole");
        String id10 = aVar.getId();
        String familyPlanId = aVar.getFamilyPlanId();
        String individualPlanId = aVar.getIndividualPlanId();
        List members = aVar.getMembers();
        ArrayList arrayList = new ArrayList(w.t(members, 10));
        Iterator it8 = members.iterator();
        while (it8.hasNext()) {
            arrayList.add(f((lfk.c) it8.next()));
        }
        List invitations = aVar.getInvitations();
        ArrayList arrayList2 = new ArrayList(w.t(invitations, 10));
        Iterator it9 = invitations.iterator();
        while (it9.hasNext()) {
            arrayList2.add(d((lfk.f) it9.next()));
        }
        a.C1103a plan = aVar.getPlan();
        if (plan != null) {
            Intrinsics.checkNotNullParameter(plan, "<this>");
            fVar = new lha.f(plan.getId());
        } else {
            fVar = null;
        }
        lha.f fVar2 = fVar;
        Boolean legacyFamilyPlan = aVar.getLegacyFamilyPlan();
        return new g(id10, individualPlanId, familyPlanId, fVar2, currentUserRole, arrayList, arrayList2, legacyFamilyPlan != null ? legacyFamilyPlan.booleanValue() : false);
    }

    public static final h d(lfk.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String id10 = fVar.getId();
        String familyId = fVar.getFamilyId();
        k kVarF = f(fVar.getMember());
        k kVarF2 = f(fVar.getInviter());
        Instant instant = Instant.parse(fVar.getExpirationDate()).atZone(ZoneId.systemDefault()).toInstant();
        Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
        Boolean reinvite = fVar.getReinvite();
        return new h(id10, familyId, kVarF, kVarF2, instant, reinvite != null ? reinvite.booleanValue() : false);
    }

    public static final j e(lfk.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        g gVarC = c(gVar.getFamily(), o.MEMBER);
        gfk.c refundAmountCharge = gVar.getRefundAmountCharge();
        i iVar = null;
        w0Var = null;
        w0 w0Var = null;
        hha.o oVarE = refundAmountCharge != null ? e.e(refundAmountCharge) : null;
        g.a offboarding = gVar.getOffboarding();
        if (offboarding != null) {
            Intrinsics.checkNotNullParameter(offboarding, "<this>");
            String gracePeriod = offboarding.getGracePeriod();
            Period period = gracePeriod != null ? Period.parse(gracePeriod) : null;
            gfk.c newPlanCharge = offboarding.getNewPlanCharge();
            hha.o oVarE2 = newPlanCharge != null ? e.e(newPlanCharge) : null;
            String newPlanBillingPeriod = offboarding.getNewPlanBillingPeriod();
            hha.i iVarQ = newPlanBillingPeriod != null ? cp5.d.Q(hha.i.Companion, newPlanBillingPeriod) : null;
            String newPlanTier = offboarding.getNewPlanTier();
            if (newPlanTier != null) {
                w0[] w0VarArrValues = w0.values();
                int length = w0VarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    w0 w0Var2 = w0VarArrValues[i];
                    if (a0.z(w0Var2.name(), newPlanTier, true)) {
                        w0Var = w0Var2;
                        break;
                    }
                    i++;
                }
            }
            iVar = new i(period, oVarE2, iVarQ, w0Var);
        }
        return new j(gVarC, oVarE, iVar);
    }

    public static final k f(lfk.c cVar) {
        o oVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String id10 = cVar.getId();
        String userId = cVar.getUserId();
        String code = cVar.getCode();
        if (code == null) {
            code = "";
        }
        String str = code;
        String role = cVar.getRole();
        o[] oVarArrValues = o.values();
        int length = oVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                oVar = null;
                break;
            }
            oVar = oVarArrValues[i];
            if (a0.z(oVar.name(), role, true)) {
                break;
            }
            i++;
        }
        o oVar2 = oVar;
        if (oVar2 != null) {
            return new k(id10, userId, str, oVar2, cVar.getLegalName());
        }
        throw new IllegalArgumentException(p.a.p("role ", cVar.getRole(), " not handled"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    public static final p g(afk.c cVar) {
        ?? arrayList;
        q qVar;
        PricingPlanCancelScreenConfig.Footer footer;
        qha.e eVar;
        h0 h0Var;
        h0 h0Var2;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String planId = cVar.getPlanId();
        List fees = cVar.getFees();
        if (fees != null) {
            List<zek.w> list = fees;
            arrayList = new ArrayList(w.t(list, 10));
            for (zek.w wVar : list) {
                Intrinsics.checkNotNullParameter(wVar, "<this>");
                qha.d dVar = new qha.d(wVar.getFeeCode());
                dj0.d dVarV = hx7.a.v(wVar.getAmount());
                jo3.b originalAmount = wVar.getOriginalAmount();
                dj0.d dVarV2 = originalAmount != null ? hx7.a.v(originalAmount) : null;
                v discountInfo = wVar.getDiscountInfo();
                if (discountInfo != null) {
                    Intrinsics.checkNotNullParameter(discountInfo, "<this>");
                    String type = discountInfo.getType();
                    if (type != null) {
                        h0[] h0VarArrValues = h0.values();
                        int length = h0VarArrValues.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                h0Var2 = null;
                                break;
                            }
                            h0Var2 = h0VarArrValues[i];
                            if (a0.z(h0Var2.name(), type, true)) {
                                break;
                            }
                            i++;
                        }
                        h0Var = h0Var2;
                    } else {
                        h0Var = null;
                    }
                    eVar = new qha.e(h0Var, discountInfo.getEndDate());
                } else {
                    eVar = null;
                }
                arrayList.add(new qha.b(dVar, dVarV, dVarV2, eVar));
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r3 = arrayList;
        jo3.b totalDueAmount = cVar.getTotalDueAmount();
        dj0.d dVarV3 = totalDueAmount != null ? hx7.a.v(totalDueAmount) : null;
        zek.f refundAmountCharge = cVar.getRefundAmountCharge();
        hha.o oVarD = refundAmountCharge != null ? bfk.b.d(refundAmountCharge) : null;
        afk.a nextPayment = cVar.getNextPayment();
        if (nextPayment != null) {
            Intrinsics.checkNotNullParameter(nextPayment, "<this>");
            qVar = new q(nextPayment.getDate(), bfk.b.d(nextPayment.getCharge()));
        } else {
            qVar = null;
        }
        afk.d termsAndConditions = cVar.getTermsAndConditions();
        if (termsAndConditions != null) {
            List<afk.e> descriptors = termsAndConditions.getDescriptors();
            ArrayList arrayList2 = new ArrayList(w.t(descriptors, 10));
            for (afk.e eVar2 : descriptors) {
                String text = eVar2.getText();
                String url2 = eVar2.getUrl();
                arrayList2.add(new PricingPlanTextDescriptor(text, url2 != null ? new PricingPlanTextDescriptor.Action.UrlNavigation(url2) : null));
            }
            footer = new PricingPlanCancelScreenConfig.Footer(arrayList2);
        } else {
            footer = null;
        }
        return new p(planId, r3, dVarV3, oVarD, qVar, footer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public static final p h(l lVar, ifk.c screenConfigMapper) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(screenConfigMapper, "screenConfigMapper");
        String planId = lVar.getPlanId();
        List fees = lVar.getFees();
        if (fees != null) {
            List list = fees;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(pw5.a.E((n) it8.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r4 = arrayList;
        jo3.a totalDueAmount = lVar.getTotalDueAmount();
        q qVar = null;
        dj0.d dVarO = totalDueAmount != null ? mo3.a.o(totalDueAmount) : null;
        gfk.c refundAmountCharge = lVar.getRefundAmountCharge();
        hha.o oVarE = refundAmountCharge != null ? e.e(refundAmountCharge) : null;
        lfk.d nextPayment = lVar.getNextPayment();
        if (nextPayment != null) {
            Intrinsics.checkNotNullParameter(nextPayment, "<this>");
            qVar = new q(nextPayment.getDate(), e.e(nextPayment.getCharge()));
        }
        return new p(planId, r4, dVarO, oVarE, qVar, screenConfigMapper.a(lVar.getTermsAndConditions()));
    }

    public static final lfk.a i(lha.g gVar) {
        a.C1103a c1103a;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.f195203a;
        String str2 = gVar.f195205c;
        String str3 = gVar.f195204b;
        ArrayList arrayList = gVar.f;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(j((k) it8.next()));
        }
        ArrayList arrayList3 = gVar.f195206g;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList4.add(k((h) it9.next()));
        }
        lha.f fVar = gVar.d;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            c1103a = new a.C1103a(fVar.f195202a);
        } else {
            c1103a = null;
        }
        return new lfk.a(str, arrayList2, arrayList4, str2, str3, c1103a, Boolean.valueOf(gVar.f195207h));
    }

    public static final lfk.c j(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new lfk.c(kVar.f195217a, kVar.d.name(), kVar.f195218b, m70.a.l(kVar.f195219c), kVar.e);
    }

    public static final lfk.f k(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String str = hVar.f195208a;
        String str2 = hVar.f195209b;
        lfk.c cVarJ = j(hVar.f195210c);
        lfk.c cVarJ2 = j(hVar.d);
        String string = hVar.e.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new lfk.f(str, str2, string, cVarJ, cVarJ2, Boolean.valueOf(hVar.f));
    }

    public static final afk.c l(p pVar) {
        afk.d dVar;
        afk.a aVar;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        String str = pVar.f195223a;
        List list = pVar.f195224b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            dVar = null;
            v vVar = null;
            if (!it8.hasNext()) {
                break;
            }
            qha.b bVar = (qha.b) it8.next();
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            String str2 = bVar.f246574a.f246582a;
            jo3.b bVarA = hx7.a.A(bVar.f246575b);
            dj0.d dVar2 = bVar.f246576c;
            jo3.b bVarA2 = dVar2 != null ? hx7.a.A(dVar2) : null;
            qha.e eVar = bVar.d;
            if (eVar != null) {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                h0 h0Var = eVar.f246583a;
                vVar = new v(h0Var != null ? h0Var.name() : null, eVar.f246584b);
            }
            arrayList.add(new zek.w(str2, bVarA, bVarA2, vVar));
        }
        dj0.d dVar3 = pVar.f195225c;
        jo3.b bVarA3 = dVar3 != null ? hx7.a.A(dVar3) : null;
        hha.o oVar = pVar.d;
        zek.f fVarL = oVar != null ? bfk.b.l(oVar) : null;
        q qVar = pVar.e;
        if (qVar != null) {
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            aVar = new afk.a(qVar.f195226a, bfk.b.l(qVar.f195227b));
        } else {
            aVar = null;
        }
        PricingPlanCancelScreenConfig.Footer footer = pVar.f;
        if (footer != null) {
            List<PricingPlanTextDescriptor> list2 = footer.f81172a;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (PricingPlanTextDescriptor pricingPlanTextDescriptor : list2) {
                String str3 = pricingPlanTextDescriptor.f81148a;
                PricingPlanTextDescriptor.Action action = pricingPlanTextDescriptor.f81149b;
                PricingPlanTextDescriptor.Action.UrlNavigation urlNavigation = action instanceof PricingPlanTextDescriptor.Action.UrlNavigation ? (PricingPlanTextDescriptor.Action.UrlNavigation) action : null;
                arrayList2.add(new afk.e(str3, urlNavigation != null ? urlNavigation.f81150a : null));
            }
            dVar = new afk.d(arrayList2);
        }
        return new afk.c(str, arrayList, bVarA3, fVarL, aVar, dVar);
    }
}
