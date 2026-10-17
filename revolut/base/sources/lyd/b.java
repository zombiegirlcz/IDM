package lyd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_pet.impl.ui.profile.help.PetGetHelpActivity;
import com.revolut.feature.learn.shared.impl.ui.course.overview.transformer.BrokenCourseException;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAdditionalInformation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAgeBand;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAvailabilityDate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAvailabilityDates;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategory;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceDurationFilter;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLogistics;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLogisticsLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePickup;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePickupLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePopularFilter;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePricingFilter;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceTourSnapshotItem;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceVisitors;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.feature.travel.experiences.models.TravelExperienceRatings;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import ip0.um0;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import m1c.y;
import m1c.z;
import myf.b0;
import myf.c0;
import org.joda.time.DateTime;
import pcd.l0;
import qzf.a0;
import qzf.e0;
import qzf.g0;
import qzf.i0;
import qzf.j0;
import qzf.k0;
import qzf.m0;
import qzf.o0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200785a;

    public /* synthetic */ b(int i) {
        this.f200785a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v72, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v76, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v9, types: [zhm.f0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LocalDate localDate;
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        qzf.p pVar;
        ArrayList arrayList5;
        ArrayList arrayList6;
        TravelExperienceVisitors travelExperienceVisitors;
        TravelExperienceLogistics travelExperienceLogistics;
        TravelExperienceLogistics travelExperienceLogistics2;
        ?? r312;
        ?? r332;
        myf.m mVar;
        b0 b0Var;
        myf.u uVar;
        ?? r333;
        myf.p pVar2;
        myf.p pVar3;
        ?? arrayList7;
        qzf.b0 b0Var2;
        ?? arrayList8;
        TravelExperiencePickup travelExperiencePickup;
        ?? arrayList9;
        switch (this.f200785a) {
            case 0:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                String str = pocket.f163147c;
                LocalDate localDate2 = pocket.f163150j;
                io3.k kVar = pocket.f;
                return new a(str, localDate2, kVar == io3.k.ACTIVE ? null : pocket.f163159w, kVar == io3.k.DELISTED);
            case 1:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 2:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                Iterator it8 = items.iterator();
                if (it8.hasNext()) {
                    LocalDate localDate3 = ((wxd.a) d0.b0(((q) it8.next()).f200798c)).f300853a;
                    while (true) {
                        localDate = localDate3;
                        while (it8.hasNext()) {
                            localDate3 = ((wxd.a) d0.b0(((q) it8.next()).f200798c)).f300853a;
                            if (localDate.compareTo((Object) localDate3) > 0) {
                            }
                            break;
                        }
                    }
                } else {
                    localDate = null;
                }
                if (localDate != null) {
                    return new wxd.a(localDate, null);
                }
                throw new IllegalStateException("No currency content is available");
            case 3:
                a entry = (a) obj2;
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(cp5.d.A(new xi0.b(6, entry.f200782a, null)));
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0((List) pair.f186386b, (List) pair.f186385a);
            case 5:
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                return c.b(vaults, y0.b(l0.REGULAR));
            case 6:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return c.a((List) pair2.f186386b, io3.l.CURRENT);
            case 7:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return d0.E0((List) pair3.f186386b, (List) pair3.f186385a);
            case 8:
                List vaults2 = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults2, "vaults");
                return c.b(vaults2, w.f200804c);
            case 9:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return c.a((List) pair4.f186386b, io3.l.CURRENT);
            case 10:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                return d0.E0((List) pair5.f186386b, (List) pair5.f186385a);
            case 11:
                List vaults3 = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults3, "vaults");
                l0.Companion.getClass();
                return c.b(vaults3, l0.proVaults);
            case 12:
                Pair pair6 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair6, "<destruct>");
                return c.a((List) pair6.f186386b, io3.l.MERCHANT);
            case 13:
                Byte b4 = (Byte) obj2;
                b4.byteValue();
                return a0.d.v(new Object[]{b4}, 1, "%02x", "format(...)");
            case 14:
                z status = (z) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                if (status instanceof z.a) {
                    return null;
                }
                if (status instanceof y) {
                    return new LabelNavBarMenuItem("NAV_BAR_ACTION_ID_REV_POINTS", new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), v1.c.g(0, ((y) status).f201475a.f201472c, null, null, 5), null, null, 472);
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                Set codes = (Set) obj2;
                Intrinsics.checkNotNullParameter(codes, "codes");
                Set set = codes;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(set, 10));
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it9.next(), arrayList10);
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj3 : arrayList10) {
                    if (cp5.d.A((xi0.b) obj3)) {
                        arrayList11.add(obj3);
                    }
                }
                return arrayList11;
            case 16:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new m07.h((List) getDefaultLoadingItems2.invoke());
            case 17:
                um0 it10 = (um0) obj2;
                int i = PetGetHelpActivity.f76392x0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return um0.e(it10, "ID_CANCEL_CANCELLATION");
            case 18:
                um0 it11 = (um0) obj2;
                int i2 = PetGetHelpActivity.f76392x0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return um0.e(it11, "ID_CONFIRM_CANCELLATION");
            case 19:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                u09.f fVar = (u09.f) data.component1();
                Throwable error = data.getError();
                boolean loading = data.getLoading();
                if (fVar == null || !fVar.f276114j.isEmpty() || loading) {
                    return data;
                }
                BrokenCourseException brokenCourseException = new BrokenCourseException(error);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, brokenCourseException, h0Var);
                Unit unit = Unit.f186387a;
                return Data.copy$default(data, null, brokenCourseException, false, 5, null);
            case 20:
                rp0.z data2 = (rp0.z) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return Boolean.valueOf(Intrinsics.f(data2.f256227a, "ACCOUNT_LIMITS_LEARN_MORE_ID"));
            case 21:
                qzf.p it12 = (qzf.p) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj4 = zyf.f.f326460a;
                Intrinsics.checkNotNullParameter(it12, "<this>");
                String strE = it12.getId();
                String strL = it12.getName();
                List listF = it12.getImages();
                j0 j0VarM = it12.getRatings();
                TravelExperienceRatings travelExperienceRatingsA = j0VarM != null ? zyf.f.a(j0VarM) : null;
                m0 m0VarQ = it12.getVisitors();
                Intrinsics.checkNotNullParameter(m0VarQ, "<this>");
                int iD = m0VarQ.getMinCount();
                int iC = m0VarQ.getMaxCount();
                List<qzf.d> listB = m0VarQ.getAgeBands();
                ArrayList arrayList12 = new ArrayList(zhm.w.t(listB, 10));
                for (qzf.d dVar : listB) {
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    arrayList12.add(new TravelExperienceAgeBand((myf.b) u1.t(dVar.getType(), myf.b.ADULT, zyf.f.f326460a), dVar.getName(), dVar.getMinAge(), dVar.getMaxAge(), dVar.getMinCount(), dVar.getMaxCount()));
                }
                TravelExperienceVisitors travelExperienceVisitors2 = new TravelExperienceVisitors(arrayList12, iD, iC, m0VarQ.getAdultRequired());
                TravelExperiencesPricing travelExperiencesPricingG = cp5.c.G(it12.getStartingPrice());
                List<qzf.b> listA = it12.getAdditionalInformation();
                ArrayList arrayList13 = new ArrayList(zhm.w.t(listA, 10));
                for (qzf.b bVar : listA) {
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    arrayList13.add(new TravelExperienceAdditionalInformation(bVar.getType(), bVar.getLabel()));
                }
                List listG = it12.getIncludedFeatures();
                if (listG != null) {
                    List list = listG;
                    ArrayList arrayList14 = new ArrayList(zhm.w.t(list, 10));
                    Iterator it13 = list.iterator();
                    while (it13.hasNext()) {
                        arrayList14.add(zyf.b.a((qzf.t) it13.next()));
                    }
                    arrayList = arrayList14;
                } else {
                    arrayList = null;
                }
                List listD = it12.getExcludedFeatures();
                if (listD != null) {
                    List list2 = listD;
                    ArrayList arrayList15 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it14 = list2.iterator();
                    while (it14.hasNext()) {
                        arrayList15.add(zyf.b.a((qzf.t) it14.next()));
                    }
                    arrayList2 = arrayList15;
                } else {
                    arrayList2 = null;
                }
                String strC = it12.getDescription();
                List<qzf.l0> listP = it12.getTourSnapshot();
                ArrayList arrayList16 = new ArrayList(zhm.w.t(listP, 10));
                for (qzf.l0 l0Var : listP) {
                    Object obj5 = zyf.g.f326461a;
                    Intrinsics.checkNotNullParameter(l0Var, "<this>");
                    arrayList16.add(new TravelExperienceTourSnapshotItem((c0) u1.u(l0Var.getCategory(), zyf.g.f326461a), l0Var.getLabel()));
                }
                TravelExperienceCancellationPolicy.Experience experienceB = vyf.b.b(it12.getCancellationPolicy());
                List listI = it12.getLanguages();
                if (listI != null) {
                    List list3 = listI;
                    arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it15 = list3.iterator();
                    while (it15.hasNext()) {
                        arrayList3.add(zyf.d.a((qzf.z) it15.next()));
                    }
                } else {
                    arrayList3 = f0.f322471a;
                }
                List listJ = it12.getLocations();
                if (listJ != null) {
                    List list4 = listJ;
                    arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it16 = list4.iterator();
                    while (it16.hasNext()) {
                        arrayList4.add(ofm.q.U((a0) it16.next()));
                    }
                } else {
                    arrayList4 = f0.f322471a;
                }
                qzf.b0 b0VarK = it12.getLogistics();
                if (b0VarK != null) {
                    Object obj6 = zyf.e.f326459a;
                    Intrinsics.checkNotNullParameter(b0VarK, "<this>");
                    List start = b0VarK.getStart();
                    String str2 = "";
                    if (start != null) {
                        List list5 = start;
                        pVar = it12;
                        arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it17 = list5.iterator();
                        while (it17.hasNext()) {
                            qzf.c0 c0Var = (qzf.c0) it17.next();
                            Intrinsics.checkNotNullParameter(c0Var, "<this>");
                            Iterator it18 = it17;
                            String locationId = c0Var.getLocationId();
                            String description = c0Var.getDescription();
                            if (description == null) {
                                m70.a.c(t0.f186434a);
                                description = "";
                            }
                            arrayList7.add(new TravelExperienceLogisticsLocation(locationId, description));
                            it17 = it18;
                        }
                    } else {
                        pVar = it12;
                        arrayList7 = f0.f322471a;
                    }
                    List end2 = b0VarK.getEnd();
                    if (end2 != null) {
                        List list6 = end2;
                        b0Var2 = b0VarK;
                        arrayList8 = new ArrayList(zhm.w.t(list6, 10));
                        Iterator it19 = list6.iterator();
                        while (it19.hasNext()) {
                            qzf.c0 c0Var2 = (qzf.c0) it19.next();
                            Intrinsics.checkNotNullParameter(c0Var2, "<this>");
                            Iterator it20 = it19;
                            String locationId2 = c0Var2.getLocationId();
                            String description2 = c0Var2.getDescription();
                            if (description2 == null) {
                                m70.a.c(t0.f186434a);
                                description2 = "";
                            }
                            arrayList8.add(new TravelExperienceLogisticsLocation(locationId2, description2));
                            it19 = it20;
                        }
                    } else {
                        b0Var2 = b0VarK;
                        arrayList8 = f0.f322471a;
                    }
                    qzf.d0 pickup = b0Var2.getPickup();
                    if (pickup != null) {
                        Intrinsics.checkNotNullParameter(pickup, "<this>");
                        List locations = pickup.getLocations();
                        arrayList5 = arrayList13;
                        ArrayList arrayList17 = new ArrayList(zhm.w.t(locations, 10));
                        Iterator it21 = locations.iterator();
                        while (it21.hasNext()) {
                            e0 e0Var = (e0) it21.next();
                            Intrinsics.checkNotNullParameter(e0Var, "<this>");
                            arrayList17.add(new TravelExperiencePickupLocation(e0Var.getLocationId(), (myf.w) u1.t(e0Var.getType(), myf.w.OTHER, zyf.e.f326459a)));
                            it21 = it21;
                            arrayList16 = arrayList16;
                            travelExperienceVisitors2 = travelExperienceVisitors2;
                        }
                        arrayList6 = arrayList16;
                        travelExperienceVisitors = travelExperienceVisitors2;
                        boolean allowCustomPickup = pickup.getAllowCustomPickup();
                        String additionalPickupInfo = pickup.getAdditionalPickupInfo();
                        if (additionalPickupInfo == null) {
                            m70.a.c(t0.f186434a);
                        } else {
                            str2 = additionalPickupInfo;
                        }
                        travelExperiencePickup = new TravelExperiencePickup(str2, arrayList17, allowCustomPickup);
                    } else {
                        arrayList5 = arrayList13;
                        arrayList6 = arrayList16;
                        travelExperienceVisitors = travelExperienceVisitors2;
                        travelExperiencePickup = null;
                    }
                    travelExperienceLogistics = new TravelExperienceLogistics(arrayList7, arrayList8, travelExperiencePickup);
                } else {
                    pVar = it12;
                    arrayList5 = arrayList13;
                    arrayList6 = arrayList16;
                    travelExperienceVisitors = travelExperienceVisitors2;
                    travelExperienceLogistics = null;
                }
                qzf.w wVarH = pVar.getItinerary();
                if (wVarH != null) {
                    Intrinsics.checkNotNullParameter(wVarH, "<this>");
                    String type = wVarH.getType();
                    myf.u[] uVarArrValues = myf.u.values();
                    int length = uVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            uVar = uVarArrValues[i3];
                            if (!kotlin.text.a0.z(uVar.name(), type, true)) {
                                i3++;
                            }
                        } else {
                            uVar = null;
                        }
                    }
                    if (uVar == null) {
                        uVar = myf.u.UNKNOWN;
                    }
                    List days = wVarH.getDays();
                    ArrayList arrayList18 = new ArrayList(zhm.w.t(days, 10));
                    Iterator it22 = days.iterator();
                    ?? r62 = arrayList3;
                    ?? r87 = arrayList4;
                    while (it22.hasNext()) {
                        qzf.v vVar = (qzf.v) it22.next();
                        Intrinsics.checkNotNullParameter(vVar, "<this>");
                        List routes = vVar.getRoutes();
                        ArrayList arrayList19 = new ArrayList(zhm.w.t(routes, 10));
                        Iterator it23 = routes.iterator();
                        ?? r64 = r62;
                        ?? r810 = r87;
                        while (it23.hasNext()) {
                            qzf.y yVar = (qzf.y) it23.next();
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            String title = yVar.getTitle();
                            List items2 = yVar.getItems();
                            TravelExperienceLogistics travelExperienceLogistics3 = travelExperienceLogistics;
                            Iterator it24 = it22;
                            ArrayList arrayList20 = new ArrayList(zhm.w.t(items2, 10));
                            Iterator it25 = items2.iterator();
                            ?? r67 = r64;
                            ?? r811 = r810;
                            while (it25.hasNext()) {
                                qzf.x xVar = (qzf.x) it25.next();
                                Intrinsics.checkNotNullParameter(xVar, "<this>");
                                TravelExperienceLocation travelExperienceLocationU = ofm.q.U(xVar.getLocation());
                                Iterator it26 = it25;
                                String description3 = xVar.getDescription();
                                Iterator it27 = it23;
                                myf.s sVarT = n14.k.t(xVar.getMinDuration(), xVar.getMaxDuration());
                                String admissionIncluded = xVar.getAdmissionIncluded();
                                ?? r313 = r67;
                                if (admissionIncluded != null) {
                                    myf.p[] pVarArrValues = myf.p.values();
                                    r333 = r811;
                                    int length2 = pVarArrValues.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < length2) {
                                            pVar3 = pVarArrValues[i5];
                                            int i6 = i5;
                                            int i21 = length2;
                                            if (!kotlin.text.a0.z(pVar3.name(), admissionIncluded, true)) {
                                                i5 = i6 + 1;
                                                length2 = i21;
                                            }
                                        } else {
                                            pVar3 = null;
                                        }
                                    }
                                    pVar2 = pVar3;
                                } else {
                                    r333 = r811;
                                    pVar2 = null;
                                }
                                arrayList20.add(new myf.o(travelExperienceLocationU, description3, sVarT, pVar2));
                                it25 = it26;
                                r67 = r313;
                                it23 = it27;
                                r811 = r333;
                            }
                            arrayList19.add(new myf.t(title, arrayList20));
                            travelExperienceLogistics = travelExperienceLogistics3;
                            it22 = it24;
                            r64 = r67;
                            r810 = r811;
                        }
                        arrayList18.add(new myf.n(arrayList19));
                        travelExperienceLogistics = travelExperienceLogistics;
                        r62 = r64;
                        r87 = r810;
                    }
                    travelExperienceLogistics2 = travelExperienceLogistics;
                    r312 = r62;
                    r332 = r87;
                    mVar = new myf.m(uVar, arrayList18);
                } else {
                    travelExperienceLogistics2 = travelExperienceLogistics;
                    r312 = arrayList3;
                    r332 = arrayList4;
                    mVar = null;
                }
                k0 k0VarO = pVar.getSupplier();
                if (k0VarO != null) {
                    Intrinsics.checkNotNullParameter(k0VarO, "<this>");
                    b0Var = new b0(k0VarO.getName(), k0VarO.getReference());
                } else {
                    b0Var = null;
                }
                return new myf.a(strE, strL, listF, travelExperienceRatingsA, travelExperienceVisitors, travelExperiencesPricingG, arrayList5, arrayList, arrayList2, strC, arrayList6, experienceB, r312, r332, travelExperienceLogistics2, mVar, b0Var);
            case 22:
                List it28 = (List) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                Intrinsics.checkNotNullParameter(it28, "<this>");
                List<g0> list7 = it28;
                ArrayList arrayList21 = new ArrayList(zhm.w.t(list7, 10));
                for (g0 g0Var : list7) {
                    Intrinsics.checkNotNullParameter(g0Var, "<this>");
                    arrayList21.add(new myf.x(ezf.a.a(g0Var.getDestination()), g0Var.getImage()));
                }
                return arrayList21;
            case 23:
                qzf.u it29 = (qzf.u) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                Object obj7 = zyf.c.f326457a;
                Intrinsics.checkNotNullParameter(it29, "<this>");
                List<qzf.m> listA2 = it29.getCategories();
                ArrayList arrayList22 = new ArrayList(zhm.w.t(listA2, 10));
                for (qzf.m mVar2 : listA2) {
                    Intrinsics.checkNotNullParameter(mVar2, "<this>");
                    arrayList22.add(new TravelExperienceCategory(mVar2.getId(), mVar2.getLabel()));
                }
                i0 i0VarD = it29.getPricing();
                Intrinsics.checkNotNullParameter(i0VarD, "<this>");
                TravelExperiencePricingFilter travelExperiencePricingFilter = new TravelExperiencePricingFilter(mo3.a.o(i0VarD.getMinPrice()), mo3.a.o(i0VarD.getMaxPrice()));
                List<qzf.h0> listC = it29.getPopular();
                ArrayList arrayList23 = new ArrayList(zhm.w.t(listC, 10));
                for (qzf.h0 h0Var2 : listC) {
                    Intrinsics.checkNotNullParameter(h0Var2, "<this>");
                    arrayList23.add(new TravelExperiencePopularFilter((myf.y) u1.u(h0Var2.getType(), zyf.c.f326457a), h0Var2.getValue()));
                }
                List listB2 = it29.getDurations();
                if (listB2 != null) {
                    List<qzf.q> list8 = listB2;
                    arrayList9 = new ArrayList(zhm.w.t(list8, 10));
                    for (qzf.q qVar : list8) {
                        Intrinsics.checkNotNullParameter(qVar, "<this>");
                        String from = qVar.getFrom();
                        if (from == null || from.length() == 0) {
                            from = null;
                        }
                        Duration duration = from != null ? Duration.parse(from) : null;
                        String to6 = qVar.getTo();
                        if (to6 == null || to6.length() == 0) {
                            to6 = null;
                        }
                        Duration duration2 = to6 != null ? Duration.parse(to6) : null;
                        arrayList9.add((duration2 == null || duration != null) ? (duration2 != null || duration == null) ? (duration2 == null || duration == null) ? TravelExperienceDurationFilter.None.f92815a : new TravelExperienceDurationFilter.Interval(duration, duration2) : new TravelExperienceDurationFilter.Beyond(duration) : new TravelExperienceDurationFilter.UpTo(duration2));
                    }
                } else {
                    arrayList9 = f0.f322471a;
                }
                return new myf.k(arrayList22, travelExperiencePricingFilter, arrayList23, arrayList9);
            case 24:
                szf.b responseDto = (szf.b) obj2;
                Intrinsics.checkNotNullParameter(responseDto, "responseDto");
                String paginationToken = responseDto.getPaginationToken();
                List experiences = responseDto.getExperiences();
                ArrayList arrayList24 = new ArrayList(zhm.w.t(experiences, 10));
                Iterator it30 = experiences.iterator();
                while (it30.hasNext()) {
                    arrayList24.add(azf.a.a((szf.a) it30.next()));
                }
                return new d0g.a(paginationToken, arrayList24);
            case 25:
                o0 it31 = (o0) obj2;
                Intrinsics.checkNotNullParameter(it31, "it");
                Intrinsics.checkNotNullParameter(it31, "<this>");
                String next = it31.getNext();
                List experiences2 = it31.getExperiences();
                ArrayList arrayList25 = new ArrayList(zhm.w.t(experiences2, 10));
                Iterator it32 = experiences2.iterator();
                while (it32.hasNext()) {
                    arrayList25.add(azf.a.a((szf.a) it32.next()));
                }
                return new x3g.i(next, arrayList25);
            case 26:
                qzf.f it33 = (qzf.f) obj2;
                Intrinsics.checkNotNullParameter(it33, "it");
                Intrinsics.checkNotNullParameter(it33, "<this>");
                List<qzf.e> availableDates = it33.getAvailableDates();
                ArrayList arrayList26 = new ArrayList(zhm.w.t(availableDates, 10));
                for (qzf.e eVar : availableDates) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    DateTime dateTimeWithTimeAtStartOfDay = new DateTime(eVar.getDate()).withTimeAtStartOfDay();
                    Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
                    arrayList26.add(new TravelExperienceAvailabilityDate(dateTimeWithTimeAtStartOfDay));
                }
                return new TravelExperienceAvailabilityDates(arrayList26);
            case 27:
                qzf.o it34 = (qzf.o) obj2;
                Intrinsics.checkNotNullParameter(it34, "it");
                return n14.e.I(it34);
            case 28:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            default:
                rzj.e wealthNews = (rzj.e) obj2;
                Intrinsics.checkNotNullParameter(wealthNews, "wealthNews");
                return wealthNews.f258693a;
        }
    }

    public /* synthetic */ b(lzb.a aVar) {
        this.f200785a = 14;
    }
}
