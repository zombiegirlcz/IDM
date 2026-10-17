package phc;

import cgc.m;
import cgc.o;
import com.revolut.feature.rewards.api.model.SortCategory;
import com.revolut.feature.rewards.api.model.rewards.OutletAvailabilityInterval;
import com.revolut.feature.rewards.api.model.rewards.RewardAvailabilityInOutlet;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import ehc.r;
import ggc.a0;
import ggc.b0;
import ggc.d0;
import ggc.e0;
import ggc.f0;
import ggc.g0;
import ggc.h0;
import ggc.l;
import ggc.q;
import ggc.s;
import ggc.t;
import ggc.u;
import ggc.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import rgc.k;
import rgc.n;
import rgc.p;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f236254b;

    public /* synthetic */ c(j jVar, int i) {
        this.f236253a = i;
        this.f236254b = jVar;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        m mVar;
        b0 b0Var;
        m mVar2;
        RewardOutlet rewardOutlet;
        Iterator it8;
        o oVar;
        switch (this.f236253a) {
            case 0:
                r rewardDto = (r) obj2;
                Intrinsics.checkNotNullParameter(rewardDto, "rewardDto");
                return new pfm.h(new d(this.f236254b, rewardDto, 1), 2);
            case 1:
                ohc.a args = (ohc.a) obj2;
                Intrinsics.checkNotNullParameter(args, "args");
                return (l) v1.c.s("CACHE_KEY_REWARDS_", args.f225346a, this.f236254b.f);
            case 2:
                ohc.a args2 = (ohc.a) obj2;
                Intrinsics.checkNotNullParameter(args2, "args");
                rgc.i iVarF = this.f236254b.f236273b.f(args2.f225346a);
                if (iVarF == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(iVarF, "<this>");
                String str = iVarF.f254086a;
                d0 d0Var = (d0) u1.v(iVarF.f254087b, hhc.d.f152384a);
                if (d0Var == null) {
                    d0Var = d0.UNKNOWN;
                }
                String str2 = iVarF.f254088c;
                t tVarZ = edl.a.z(iVarF.d);
                rgc.e eVar = iVarF.e;
                t tVarZ2 = eVar != null ? edl.a.z(eVar) : null;
                rgc.g gVar = iVarF.f;
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                u uVar = new u(gVar.getWebhook(), gVar.getPromoCode());
                y yVarK = l9.l.K(iVarF.f254089g);
                LocalDateTime localDateTime = new LocalDateTime(iVarF.f254090h);
                LocalDateTime localDateTime2 = new LocalDateTime(iVarF.i);
                rgc.l lVar = iVarF.f254091j;
                if (lVar != null) {
                    Intrinsics.checkNotNullParameter(lVar, "<this>");
                    mVar = new m(lVar.f254111a);
                } else {
                    mVar = null;
                }
                List list = iVarF.k;
                List list2 = iVarF.f254092l;
                String str3 = iVarF.o;
                ggc.m mVar3 = str3 != null ? (ggc.m) u1.v(str3, hhc.b.f152382a) : null;
                Integer num = iVarF.f254095p;
                return new l(str, d0Var, str2, tVarZ, tVarZ2, uVar, yVarK, localDateTime, localDateTime2, mVar, list, list2, mVar3, num != null ? num.intValue() : 0, iVarF.f254096q, iVarF.f254097r, iVarF.f254098s, iVarF.f254099t, iVarF.u);
            case 3:
                h args3 = (h) obj2;
                Intrinsics.checkNotNullParameter(args3, "args");
                return (l) this.f236254b.f.get(j.a(args3));
            case 4:
                h args4 = (h) obj2;
                Intrinsics.checkNotNullParameter(args4, "args");
                rgc.m mVar4 = (rgc.m) j6.a.k(rgc.m.class, this.f236254b.e, j.a(args4));
                if (mVar4 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(mVar4, "<this>");
                String id10 = mVar4.getId();
                d0 d0Var2 = (d0) u1.v(mVar4.getType(), hhc.d.f152384a);
                if (d0Var2 == null) {
                    d0Var2 = d0.UNKNOWN;
                }
                String primaryCategoryId = mVar4.getPrimaryCategoryId();
                t tVarA = foh.i.A(mVar4.getDescription());
                rgc.f loyaltyDescription = mVar4.getLoyaltyDescription();
                t tVarA2 = loyaltyDescription != null ? foh.i.A(loyaltyDescription) : null;
                rgc.h details = mVar4.getDetails();
                Intrinsics.checkNotNullParameter(details, "<this>");
                u uVar2 = new u(details.getWebhook(), details.getPromoCode());
                rgc.o merchant = mVar4.getMerchant();
                Intrinsics.checkNotNullParameter(merchant, "<this>");
                String name = merchant.getName();
                String logo = merchant.getLogo();
                String website = merchant.getWebsite();
                String channel = merchant.getChannel();
                q qVar = channel != null ? (q) u1.u(channel, hhc.c.f152383a) : q.ONLINE;
                n nearestOutlet = merchant.getNearestOutlet();
                Integer numValueOf = nearestOutlet != null ? Integer.valueOf(nearestOutlet.getDistance()) : null;
                String source = merchant.getSource();
                if (source == null) {
                    source = "unknown";
                }
                a0 a0Var = new a0(source);
                String sourceType = merchant.getSourceType();
                if (sourceType == null || (b0Var = (b0) u1.v(sourceType, hhc.a.f152381a)) == null) {
                    b0Var = b0.UNKNOWN;
                }
                y yVar = new y(name, logo, website, qVar, numValueOf, a0Var, b0Var);
                LocalDateTime localDateTime3 = new LocalDateTime(mVar4.getStart());
                LocalDateTime localDateTime4 = new LocalDateTime(mVar4.getEnd());
                rgc.c socialProof = mVar4.getSocialProof();
                if (socialProof != null) {
                    Intrinsics.checkNotNullParameter(socialProof, "<this>");
                    mVar2 = new m(socialProof.getLikes());
                } else {
                    mVar2 = null;
                }
                List steps = mVar4.getSteps();
                List loyaltySteps = mVar4.getLoyaltySteps();
                String activationState = mVar4.getActivationState();
                ggc.m mVar5 = activationState != null ? (ggc.m) u1.v(activationState, hhc.b.f152382a) : null;
                Integer totalOutletsNumber = mVar4.getTotalOutletsNumber();
                int iIntValue = totalOutletsNumber != null ? totalOutletsNumber.intValue() : 0;
                Boolean hasCountrySpecificCashback = mVar4.getDetails().getHasCountrySpecificCashback();
                boolean zBooleanValue = hasCountrySpecificCashback != null ? hasCountrySpecificCashback.booleanValue() : false;
                Boolean onlyManualActivation = mVar4.getOnlyManualActivation();
                boolean zBooleanValue2 = onlyManualActivation != null ? onlyManualActivation.booleanValue() : false;
                Boolean requiresExternalRegistration = mVar4.getRequiresExternalRegistration();
                boolean zBooleanValue3 = requiresExternalRegistration != null ? requiresExternalRegistration.booleanValue() : false;
                Boolean canRedeemViaEmail = mVar4.getCanRedeemViaEmail();
                return new l(id10, d0Var2, primaryCategoryId, tVarA, tVarA2, uVar2, yVar, localDateTime3, localDateTime4, mVar2, steps, loyaltySteps, mVar5, iIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, canRedeemViaEmail != null ? canRedeemViaEmail.booleanValue() : false, mVar4.getActivationButtonText());
            case 5:
                fgc.c it9 = (fgc.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (e0) this.f236254b.f.get("CACHE_KEY_REWARDS_SHORT_");
            case 6:
                fgc.a requestArgs = (fgc.a) obj2;
                Intrinsics.checkNotNullParameter(requestArgs, "requestArgs");
                od0.h hVar = od0.i.Companion;
                Object obj3 = this.f236254b.f.get("CLOSEST_OUTLET_CACHE_KEY" + requestArgs.f135028a);
                hVar.getClass();
                return od0.h.a(obj3);
            case 7:
                fgc.a requestArgs2 = (fgc.a) obj2;
                Intrinsics.checkNotNullParameter(requestArgs2, "requestArgs");
                od0.h hVar2 = od0.i.Companion;
                rhc.c cVar = (rhc.c) this.f236254b.e.T2(j6.a.q("CLOSEST_OUTLET_CACHE_KEY", requestArgs2.f135028a), j.f236269s);
                if (cVar != null) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    String id11 = cVar.getId();
                    String address = cVar.getAddress();
                    co3.b location = cVar.getLocation();
                    Intrinsics.checkNotNullParameter(location, "<this>");
                    co3.a aVar = new co3.a(location.getLatitude(), location.getLongitude());
                    List<rhc.b> availability = cVar.getAvailability();
                    int i = 10;
                    ArrayList arrayList = new ArrayList(w.t(availability, 10));
                    for (rhc.b bVar : availability) {
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        List days = bVar.getDays();
                        List<rhc.a> intervals = bVar.getIntervals();
                        ArrayList arrayList2 = new ArrayList(w.t(intervals, i));
                        for (rhc.a aVar2 : intervals) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList2.add(new OutletAvailabilityInterval(new LocalTime(aVar2.getStart()), new LocalTime(aVar2.getEnd())));
                        }
                        arrayList.add(new RewardAvailabilityInOutlet(arrayList2, days));
                        i = 10;
                    }
                    rewardOutlet = new RewardOutlet(id11, address, aVar, cVar.getDistanceMeters(), arrayList);
                } else {
                    rewardOutlet = null;
                }
                hVar2.getClass();
                return od0.h.a(rewardOutlet);
            case 8:
                i args5 = (i) obj2;
                Intrinsics.checkNotNullParameter(args5, "args");
                return (List) this.f236254b.f.get(j.b(args5));
            case 9:
                i args6 = (i) obj2;
                Intrinsics.checkNotNullParameter(args6, "args");
                List list3 = (List) this.f236254b.e.T2(j.b(args6), j.f236270t);
                if (list3 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(list3, "<this>");
                List list4 = list3;
                int i2 = 10;
                ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                Iterator it10 = list4.iterator();
                while (it10.hasNext()) {
                    p pVar = (p) it10.next();
                    d0 d0Var3 = (d0) u1.v(pVar.getType(), hhc.d.f152384a);
                    if (d0Var3 == null) {
                        d0Var3 = d0.UNKNOWN;
                    }
                    Boolean isNew = pVar.getIsNew();
                    boolean zBooleanValue4 = isNew != null ? isNew.booleanValue() : false;
                    y yVarK2 = l9.l.K(pVar.getMerchant());
                    String relevantPlanId = pVar.getRelevantPlanId();
                    List pricingPlans = pVar.getPricingPlans();
                    Intrinsics.checkNotNullParameter(pricingPlans, "<this>");
                    List<rgc.q> list5 = pricingPlans;
                    ArrayList arrayList4 = new ArrayList(w.t(list5, i2));
                    for (rgc.q qVar2 : list5) {
                        String perkId = qVar2.getPerkId();
                        String planId = qVar2.getPlanId();
                        String description = qVar2.getDescription();
                        String briefDescription = qVar2.getBriefDescription();
                        String verboseDescription = qVar2.getVerboseDescription();
                        boolean availableToClaim = qVar2.getAvailableToClaim();
                        Boolean isWarning = qVar2.getIsWarning();
                        boolean zBooleanValue5 = isWarning != null ? isWarning.booleanValue() : false;
                        String picture = qVar2.getPicture();
                        ggc.w wVarV = ebm.a.v(qVar2.getIsPhysical());
                        String subscriberAccountType = qVar2.getSubscriberAccountType();
                        if (subscriberAccountType != null) {
                            o[] oVarArrValues = o.values();
                            int length = oVarArrValues.length;
                            int i3 = 0;
                            while (i3 < length) {
                                oVar = oVarArrValues[i3];
                                it8 = it10;
                                if (kotlin.text.a0.z(oVar.name(), subscriberAccountType, true)) {
                                }
                                i3++;
                                it10 = it8;
                                break;
                            }
                            it8 = it10;
                            oVar = null;
                        } else {
                            it8 = it10;
                            oVar = null;
                        }
                        arrayList4.add(new h0(perkId, planId, description, briefDescription, verboseDescription, availableToClaim, zBooleanValue5, picture, wVarV, oVar));
                        it10 = it8;
                    }
                    arrayList3.add(new g0(d0Var3, zBooleanValue4, yVarK2, relevantPlanId, arrayList4));
                    i2 = 10;
                }
                return arrayList3;
            case 10:
                String rewardId = (String) obj2;
                Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                return (Boolean) v1.c.s("REWARDS_MEMBERSHIP_ACTIVATED_KEY", rewardId, this.f236254b.f);
            case 11:
                String rewardId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(rewardId2, "rewardId");
                return (Boolean) this.f236254b.e.T2(j6.a.q("REWARDS_MEMBERSHIP_ACTIVATED_KEY", rewardId2), Boolean.TYPE);
            case 12:
                o accountType = (o) obj2;
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                return (List) v1.c.s("PERK_LIST_CACHE_KEY", accountType.name(), this.f236254b.f);
            case 13:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (List) this.f236254b.f.get("PERK_CATEGORIES_CACHE_KEY");
            case 14:
                fgc.c it12 = (fgc.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                j jVar = this.f236254b;
                List listG = jVar.f236273b.g();
                List listC = jVar.d.c();
                List listC2 = jVar.f236274c.c();
                ue0.c cVar2 = jVar.e;
                boolean zBooleanValue6 = ((Boolean) cVar2.v0(Boolean.TRUE, "THIRD_PARTY_PROMOTION_KEY", j.f236266p)).booleanValue();
                rgc.b bVar2 = (rgc.b) cVar2.v0(j.f236268r, "COLLECTIONS_INFO_KEY", j.f236267q);
                List<rgc.a> list6 = listC2;
                ArrayList arrayList5 = new ArrayList(w.t(list6, 10));
                for (rgc.a aVar3 : list6) {
                    Intrinsics.checkNotNullParameter(aVar3, "<this>");
                    arrayList5.add(new ggc.r(aVar3.f254066a, aVar3.f254067b, aVar3.f254068c));
                }
                List list7 = listG;
                ArrayList arrayList6 = new ArrayList(w.t(list7, 10));
                Iterator it13 = list7.iterator();
                while (it13.hasNext()) {
                    arrayList6.add(edl.a.A((k) it13.next()));
                }
                Intrinsics.checkNotNullParameter(listC, "<this>");
                ArrayList<rgc.d> arrayList7 = new ArrayList();
                ArrayList<rgc.d> arrayList8 = new ArrayList();
                for (Object obj4 : listC) {
                    if (Intrinsics.f(((rgc.d) obj4).e, "sort")) {
                        arrayList7.add(obj4);
                    } else {
                        arrayList8.add(obj4);
                    }
                }
                ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                for (rgc.d dVar : arrayList8) {
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    arrayList9.add(new cgc.a(dVar.d, dVar.f254072a, dVar.f254073b, dVar.f254074c));
                }
                ArrayList arrayList10 = new ArrayList(w.t(arrayList7, 10));
                for (rgc.d dVar2 : arrayList7) {
                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                    arrayList10.add(new SortCategory(dVar2.d, dVar2.f254072a, dVar2.f254073b, dVar2.f254074c));
                }
                return new e0(zBooleanValue6, new f0(arrayList9, arrayList10), new s(bVar2.getOrder(), bVar2.getName(), arrayList5), arrayList6);
            case 15:
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (List) this.f236254b.f.get("CACHE_KEY_PARTNER_REWARDS");
            default:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                List listE = this.f236254b.f236273b.e();
                ArrayList arrayList11 = new ArrayList(w.t(listE, 10));
                Iterator it16 = listE.iterator();
                while (it16.hasNext()) {
                    arrayList11.add(edl.a.A((k) it16.next()));
                }
                return arrayList11;
        }
    }
}
