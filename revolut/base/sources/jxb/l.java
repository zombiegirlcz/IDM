package jxb;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.feature.rev_points.impl.data.network.RevPointsService;
import com.revolut.feature.rev_points.models.EarnOptionsBottomSheetParams;
import com.revolut.feature.rev_points.models.IssuedPoints;
import com.revolut.feature.rev_points.models.PointsSource;
import com.revolut.feature.rev_points.models.RevPointsEarningBreakdown;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature.rev_points.models.RevPointsRichText;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.rev_points.models.TimeInterval;
import efm.d0;
import efm.r;
import hxb.n;
import hxb.o;
import hxb.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import m1c.b0;
import m1c.c0;
import m1c.e0;
import m1c.l0;
import m1c.m0;
import m1c.m1;
import m1c.p1;
import m1c.q0;
import m1c.y;
import m1c.z;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import rfm.m;
import vxb.a;
import vxb.e;
import vxb.g0;
import vxb.h;
import vxb.x;
import wim.z;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements f {

    @NotNull
    public static final k Companion = new k();
    public static final Type o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Type f179121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Type f179122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Type f179123r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsService f179124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f179125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f179126c;
    public final w39.b d;
    public final w4l.f e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f179127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f179128h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f179129j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f179130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4l.f f179131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f179132n;

    static {
        Type type = new TypeToken<List<? extends x>>() { // from class: com.revolut.feature.rev_points.impl.data.repository.RevPointsRepositoryImpl$Companion$REV_POINTS_PRODUCT_RATES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        o = type;
        Type type2 = new TypeToken<n>() { // from class: com.revolut.feature.rev_points.impl.data.repository.RevPointsRepositoryImpl$Companion$REV_POINTS_EARNING_BREAKDOWN_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f179121p = type2;
        Type type3 = new TypeToken<vxb.k>() { // from class: com.revolut.feature.rev_points.impl.data.repository.RevPointsRepositoryImpl$Companion$REV_POINTS_CHALLENGES_BREAKDOWN_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        f179122q = type3;
        Type type4 = new TypeToken<List<? extends vxb.b>>() { // from class: com.revolut.feature.rev_points.impl.data.repository.RevPointsRepositoryImpl$Companion$ISSUED_POINTS_LIST_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        f179123r = type4;
    }

    public l(RevPointsService revPointsService, ue0.c revPointsStorage, ne0.j memoryCache, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(revPointsService, "revPointsService");
        Intrinsics.checkNotNullParameter(revPointsStorage, "revPointsStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f179124a = revPointsService;
        this.f179125b = revPointsStorage;
        this.f179126c = memoryCache;
        this.d = locationInteractor;
        final int i = 0;
        final int i2 = 13;
        final int i3 = 26;
        this.e = new w4l.f(new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i5 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i5));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i5 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 6), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i5 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i5));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i5 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 15), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i5 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i5));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i5 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 27;
        final int i6 = 28;
        final int i21 = 29;
        this.f = new w4l.f(new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i59 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i59));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i59 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 20), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i59 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i59));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i59 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 21), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i59 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i59));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i59 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 1;
        Function2 function2 = new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i59 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i59));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i59 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        final int i32 = 2;
        h hVar = new h(this, i32);
        Function2 function22 = new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i59 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i59));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i59 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        final int i33 = 3;
        this.f179127g = new w4l.f(function2, hVar, function22, new h(this, i33), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i59 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i59));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i59 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 4;
        Function2 function23 = new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i59 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i59));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i59 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        h hVar2 = new h(this, i43);
        final int i59 = 5;
        Function2 function24 = new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        h hVar3 = new h(this, i59);
        final int i66 = 6;
        this.f179128h = new w4l.f(function23, hVar2, function24, hVar3, new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i74 = 7;
        Function2 function25 = new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        h hVar4 = new h(this, i74);
        final int i92 = 8;
        Function2 function26 = new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        h hVar5 = new h(this, i92);
        final int i96 = 9;
        this.i = new w4l.f(function25, hVar4, function26, hVar5, new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i96) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i99 = 10;
        final int i100 = 11;
        final int i101 = 12;
        this.f179129j = new w4l.f(new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i99) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 9), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i100) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 10), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i101) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i102 = 14;
        final int i103 = 15;
        final int i104 = 16;
        this.k = new w4l.f(new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i102) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 11), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i103) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 12), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i104) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i105 = 17;
        final int i106 = 18;
        final int i107 = 19;
        this.f179130l = new w4l.f(new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i105) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 13), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i106) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 14), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i107) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i108 = 20;
        final int i109 = 21;
        final int i110 = 22;
        this.f179131m = new w4l.f(new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i108) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 16), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i109) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 17), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i110) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i111 = 23;
        final int i112 = 24;
        final int i113 = 25;
        this.f179132n = new w4l.f(new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i111) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 18), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i112) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new h(this, 19), new Function2(this) { // from class: jxb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f179120b;

            {
                this.f179120b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a.e eVar;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                Object aVar;
                switch (i113) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<hxb.f> revPointsAccount = this.f179120b.f179124a.getRevPointsAccount();
                        ju0.f fVar = new ju0.f(18, new g(0));
                        revPointsAccount.getClass();
                        ufm.i iVar = new ufm.i(new ufm.i(revPointsAccount, fVar, 1), new ju0.f(25, new g(10)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<n> revPointsEarningBreakdown = this.f179120b.f179124a.getRevPointsEarningBreakdown();
                        ju0.f fVar2 = new ju0.f(13, new g(1));
                        revPointsEarningBreakdown.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsEarningBreakdown, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        RevPointsEarningBreakdown breakdown = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_BREAKDOWN_MEM_KEY", breakdown);
                        return Unit.f186387a;
                    case 3:
                        RevPointsEarningBreakdown breakdown2 = (RevPointsEarningBreakdown) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown2, "breakdown");
                        ue0.c cVar = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown2, "<this>");
                        boolean z = breakdown2.f83972a;
                        o oVarM = gxb.d.m(breakdown2.f83973b);
                        List list = breakdown2.f83974c;
                        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(gxb.d.m((RevPointsEarningRate) it9.next()));
                        }
                        cVar.G(new n(z, oVarM, arrayList2), "REV_POINTS_EARNING_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(n.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        d0<p> loyaltyEarningRates = this.f179120b.f179124a.getLoyaltyEarningRates();
                        ju0.f fVar3 = new ju0.f(14, new g(2));
                        loyaltyEarningRates.getClass();
                        ufm.i iVar3 = new ufm.i(loyaltyEarningRates, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        List breakdown3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown3, "breakdown");
                        this.f179120b.f179126c.f("REV_POINTS_EARNING_RATES_MEM_KEY", breakdown3);
                        return Unit.f186387a;
                    case 6:
                        List breakdown4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(breakdown4, "breakdown");
                        ue0.c cVar2 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(breakdown4, "<this>");
                        List list2 = breakdown4;
                        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(gxb.d.m((RevPointsEarningRate) it10.next()));
                        }
                        cVar2.G(new p(arrayList3), "REV_POINTS_EARNING_RATES_STORAGE_KEY", wim.z.d(o0.b(p.class)));
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        m1c.p learnType = (m1c.p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(learnType, "learnType");
                        d0<List<hxb.d>> loyaltyLearnItems = this.f179120b.f179124a.getLoyaltyLearnItems(learnType.name());
                        ju0.f fVar4 = new ju0.f(15, new g(3));
                        loyaltyLearnItems.getClass();
                        ufm.i iVar4 = new ufm.i(loyaltyLearnItems, fVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 8:
                        m1c.p learnType2 = (m1c.p) obj2;
                        List learnItem = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType2, "learnType");
                        Intrinsics.checkNotNullParameter(learnItem, "learnItem");
                        ehe.n.z("LOYALTY_ENGAGEMENT_LEARN_MEM_KEY", learnType2.name(), this.f179120b.f179126c, learnItem);
                        return Unit.f186387a;
                    case 9:
                        m1c.p learnType3 = (m1c.p) obj2;
                        List learnItems = (List) obj3;
                        Intrinsics.checkNotNullParameter(learnType3, "learnType");
                        Intrinsics.checkNotNullParameter(learnItems, "learnItems");
                        ue0.c cVar3 = this.f179120b.f179125b;
                        String str = "LOYALTY_ENGAGEMENT_LEARN_STORAGE_KEY" + learnType3.name();
                        Intrinsics.checkNotNullParameter(learnItems, "<this>");
                        List<m1c.o> list3 = learnItems;
                        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                        for (m1c.o oVar : list3) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            arrayList4.add(new vxb.c(oVar.f201421a, oVar.f201422b, oVar.f201423c, qvb.b.c(oVar.d), oVar.e, oVar.f, oVar.f201424g, oVar.f201425h));
                        }
                        cVar3.G(arrayList4, str, kii.e.o(vxb.c.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 10:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        l lVar = this.f179120b;
                        m mVar = new m(((z39.b) lVar.d).f319221b.c(), new ju0.f(21, new g(8)), 1);
                        od0.i.Companion.getClass();
                        f0 f0VarP = mVar.p(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        ufm.i iVar5 = new ufm.i(ue0.e.I(f0VarP, h0.f322473a, new g(9)), new ju0.f(28, new h(lVar, 22)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                        return iVar5;
                    case 11:
                        List featuredRewards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                        this.f179120b.f179126c.f("REV_POINTS_FEATURED_REWARDS_MEM_KEY", featuredRewards);
                        return Unit.f186387a;
                    case 12:
                        List featuredRewards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(featuredRewards2, "featuredRewards");
                        ue0.c cVar4 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(featuredRewards2, "<this>");
                        List<q0> list4 = featuredRewards2;
                        ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                        for (q0 q0Var : list4) {
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            arrayList5.add(new vxb.l(q0Var.f201440a, q0Var.f201441b, q0Var.f201442c, q0Var.d, q0Var.e, q0Var.f, q0Var.f201443g, q0Var.f201444h));
                        }
                        cVar4.G(arrayList5, "REV_POINTS_FEATURED_REWARDS_STORAGE_KEY", kii.e.o(vxb.l.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 13:
                        m1c.z balance = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        this.f179120b.f179126c.f("REV_POINTS_ACCOUNT_MEM_KEY", balance);
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        e0 context = (e0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(context, "context");
                        d0<hxb.i> revPointsBottomSheet = this.f179120b.f179124a.getRevPointsBottomSheet(context.name());
                        ju0.f fVar5 = new ju0.f(19, new g(6));
                        revPointsBottomSheet.getClass();
                        ufm.i iVar6 = new ufm.i(revPointsBottomSheet, fVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 15:
                        e0 context2 = (e0) obj2;
                        m1c.d0 bottomSheet = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        this.f179120b.f179126c.f("REV_POINTS_BOTTOM_SHEET_MEM_KEY" + context2.name(), bottomSheet);
                        return Unit.f186387a;
                    case 16:
                        e0 context3 = (e0) obj2;
                        m1c.d0 bottomSheet2 = (m1c.d0) obj3;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                        ue0.c cVar5 = this.f179120b.f179125b;
                        String str2 = "REV_POINTS_BOTTOM_SHEET_STORAGE_KEY" + context3.name();
                        Intrinsics.checkNotNullParameter(bottomSheet2, "<this>");
                        String str3 = bottomSheet2.f201350a;
                        String str4 = bottomSheet2.f201351b;
                        ArrayList arrayList6 = bottomSheet2.f201352c;
                        ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                        Iterator it12 = arrayList6.iterator();
                        while (true) {
                            h.a aVarC = null;
                            if (!it12.hasNext()) {
                                h.a aVarC2 = gxb.a.c(bottomSheet2.d);
                                b0 b0Var = bottomSheet2.e;
                                h.a aVarC3 = b0Var != null ? gxb.a.c(b0Var) : null;
                                ParameterisedHyperText parameterisedHyperText = bottomSheet2.f;
                                cVar5.G(new vxb.h(str3, str4, arrayList7, aVarC2, aVarC3, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null), str2, wim.z.d(o0.b(vxb.h.class)));
                                return Unit.f186387a;
                            }
                            c0 c0Var = (c0) it12.next();
                            String str5 = c0Var.f201346a;
                            String str6 = c0Var.f201347b;
                            String str7 = c0Var.f201348c;
                            b0 b0Var2 = c0Var.d;
                            if (b0Var2 != null) {
                                aVarC = gxb.a.c(b0Var2);
                            }
                            arrayList7.add(new h.b(str5, str6, str7, aVarC));
                        }
                        break;
                    case 17:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<hxb.m> challengesBreakdown = this.f179120b.f179124a.getChallengesBreakdown();
                        ju0.f fVar6 = new ju0.f(27, new g(13));
                        challengesBreakdown.getClass();
                        ufm.i iVar7 = new ufm.i(challengesBreakdown, fVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                        return iVar7;
                    case 18:
                        m0 challengesBreakdown2 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown2, "challengesBreakdown");
                        this.f179120b.f179126c.f("REV_POINTS_CHALLENGES_BREAKDOWN_MEM_KEY", challengesBreakdown2);
                        return Unit.f186387a;
                    case 19:
                        m0 challengesBreakdown3 = (m0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "challengesBreakdown");
                        ue0.c cVar6 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(challengesBreakdown3, "<this>");
                        ArrayList arrayList8 = challengesBreakdown3.f201408a;
                        ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                        Iterator it14 = arrayList8.iterator();
                        while (it14.hasNext()) {
                            arrayList9.add(gxb.d.n((l0) it14.next()));
                        }
                        ArrayList arrayList10 = challengesBreakdown3.f201409b;
                        ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            arrayList11.add(gxb.d.n((l0) it15.next()));
                        }
                        List list5 = challengesBreakdown3.f201410c;
                        ArrayList arrayList12 = new ArrayList(w.t(list5, 10));
                        Iterator it16 = list5.iterator();
                        while (it16.hasNext()) {
                            arrayList12.add(gxb.d.n((l0) it16.next()));
                        }
                        cVar6.G(new vxb.k(arrayList9, arrayList11, arrayList12), "REV_POINTS_CHALLENGES_BREAKDOWN_STORAGE_KEY", wim.z.d(o0.b(vxb.k.class)));
                        return Unit.f186387a;
                    case 20:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        d0<List<hxb.c>> issuedPoints = this.f179120b.f179124a.getIssuedPoints(zBooleanValue);
                        ju0.f fVar7 = new ju0.f(16, new g(4));
                        issuedPoints.getClass();
                        ufm.i iVar8 = new ufm.i(issuedPoints, fVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 21:
                        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                        List issuedPoints2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints2, "issuedPoints");
                        this.f179120b.f179126c.f("ISSUED_POINTS_MEM_KEY" + zBooleanValue2, issuedPoints2);
                        return Unit.f186387a;
                    case 22:
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        List issuedPoints3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(issuedPoints3, "issuedPoints");
                        ue0.c cVar7 = this.f179120b.f179125b;
                        String strR = com.google.android.gms.internal.mlkit_vision_face.a.r("ISSUED_POINTS_STORAGE_KEY", zBooleanValue3);
                        List<IssuedPoints> list6 = issuedPoints3;
                        ArrayList arrayList13 = new ArrayList(w.t(list6, 10));
                        for (IssuedPoints issuedPoints4 : list6) {
                            Intrinsics.checkNotNullParameter(issuedPoints4, "<this>");
                            String str8 = issuedPoints4.f83947a;
                            jo3.b bVarA = hx7.a.A(issuedPoints4.f83948b);
                            jo3.b bVarA2 = hx7.a.A(issuedPoints4.f83949c);
                            jo3.b bVarA3 = hx7.a.A(issuedPoints4.d);
                            TimeInterval timeInterval = issuedPoints4.f;
                            Intrinsics.checkNotNullParameter(timeInterval, "<this>");
                            String string = timeInterval.f84102a.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = timeInterval.f84103b.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            g0 g0Var = new g0(string, string2);
                            PointsSource pointsSource = issuedPoints4.f83950g;
                            Intrinsics.checkNotNullParameter(pointsSource, "<this>");
                            vxb.d dVar = new vxb.d(pointsSource.f83957a.name(), pointsSource.f83958b.name());
                            String string3 = issuedPoints4.f83951h.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String string4 = issuedPoints4.i.toString();
                            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                            String string5 = issuedPoints4.f83952j.toString();
                            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                            arrayList13.add(new vxb.b(str8, bVarA, bVarA2, bVarA3, g0Var, dVar, string3, string4, string5));
                        }
                        cVar7.G(arrayList13, strR, kii.e.o(vxb.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 23:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        EarnOptionsBottomSheetParams params = (EarnOptionsBottomSheetParams) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        RevPointsService revPointsService2 = this.f179120b.f179124a;
                        Double d = params.f83942a;
                        String str9 = params.f83943b;
                        m1c.i iVar9 = params.f83944c;
                        d0<hxb.b> earnOptionsBottomSheet = revPointsService2.getEarnOptionsBottomSheet(d, str9, iVar9 != null ? iVar9.name() : null);
                        ju0.f fVar8 = new ju0.f(17, new g(5));
                        earnOptionsBottomSheet.getClass();
                        ufm.i iVar10 = new ufm.i(earnOptionsBottomSheet, fVar8, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                        return iVar10;
                    case 24:
                        EarnOptionsBottomSheetParams params2 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet3 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet3, "bottomSheet");
                        this.f179120b.f179126c.f("EARN_OPTIONS_BOTTOM_SHEET_MEM_KEY" + l.b(params2), bottomSheet3);
                        return Unit.f186387a;
                    case 25:
                        EarnOptionsBottomSheetParams params3 = (EarnOptionsBottomSheetParams) obj2;
                        m1c.h bottomSheet4 = (m1c.h) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet4, "bottomSheet");
                        ue0.c cVar8 = this.f179120b.f179125b;
                        String str10 = "EARN_OPTIONS_BOTTOM_SHEET_STORAGE_KEY" + l.b(params3);
                        Intrinsics.checkNotNullParameter(bottomSheet4, "<this>");
                        RevPointsTextWithLinks revPointsTextWithLinks = bottomSheet4.f201369a;
                        p1 p1VarC = revPointsTextWithLinks != null ? qvb.b.c(revPointsTextWithLinks) : null;
                        m1c.f fVar9 = bottomSheet4.f201370b;
                        if (fVar9 != null) {
                            String str11 = fVar9.f201359a;
                            RevPointsRichText revPointsRichText = fVar9.f201360b;
                            Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
                            String str12 = revPointsRichText.f84039a;
                            Map map = revPointsRichText.f84040b;
                            if (map != null) {
                                linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    RevPointsRichText.Placeholder placeholder = (RevPointsRichText.Placeholder) entry.getValue();
                                    linkedHashMap.put(key, new m1.a(placeholder.f84041a.name(), placeholder.f84042b, placeholder.f84043c));
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            eVar = new a.e(str11, new m1(linkedHashMap, str12), fVar9.f201361c);
                        } else {
                            eVar = null;
                        }
                        String str13 = bottomSheet4.f201371c;
                        ArrayList arrayList14 = bottomSheet4.d;
                        int i592 = 10;
                        ArrayList arrayList15 = new ArrayList(w.t(arrayList14, 10));
                        Iterator it17 = arrayList14.iterator();
                        while (it17.hasNext()) {
                            m1c.b bVar = (m1c.b) it17.next();
                            m1c.e eVar2 = bVar.f201335a;
                            a.d dVar2 = eVar2 != null ? new a.d(eVar2.f201354a.name(), eVar2.f201356c, eVar2.f201355b) : null;
                            String str14 = bVar.f201336b;
                            String str15 = bVar.f201337c;
                            List list7 = bVar.d;
                            if (list7 != null) {
                                List<m1c.g> list8 = list7;
                                ArrayList arrayList16 = new ArrayList(w.t(list8, i592));
                                for (m1c.g gVar : list8) {
                                    arrayList16.add(new a.f(gVar.f201364a, gVar.f201365b));
                                    it17 = it17;
                                }
                                arrayList = arrayList16;
                            } else {
                                arrayList = null;
                            }
                            Iterator it18 = it17;
                            m1c.a aVar2 = bVar.e;
                            arrayList15.add(new a.b(dVar2, str14, str15, arrayList, new a.C1622a(aVar2.f201331a, aVar2.f201332b)));
                            it17 = it18;
                            i592 = 10;
                        }
                        m1c.c cVar9 = bottomSheet4.e;
                        a.c cVar10 = cVar9 != null ? new a.c(cVar9.f201344a, cVar9.f201345b) : null;
                        m1c.c cVar11 = bottomSheet4.f;
                        cVar8.G(new vxb.a(p1VarC, eVar, str13, arrayList15, cVar10, cVar11 != null ? new a.c(cVar11.f201344a, cVar11.f201345b) : null), str10, wim.z.d(o0.b(vxb.a.class)));
                        return Unit.f186387a;
                    case 26:
                        m1c.z balance2 = (m1c.z) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(balance2, "balance");
                        ue0.c cVar12 = this.f179120b.f179125b;
                        Intrinsics.checkNotNullParameter(balance2, "<this>");
                        if (balance2 instanceof y) {
                            m1c.x xVar = ((y) balance2).f201475a;
                            aVar = new e.a(xVar.f201470a, xVar.f201471b.name(), xVar.f201472c.J(), xVar.d.J(), xVar.e.J(), hx7.a.A(xVar.f), xVar.f201473g, xVar.f201474h);
                        } else {
                            if (!Intrinsics.f(balance2, z.a.f201476a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = e.b.f292940a;
                        }
                        cVar12.G(aVar, "REV_POINTS_ACCOUNT_STORAGE_KEY", wim.z.d(o0.b(vxb.e.class)));
                        return Unit.f186387a;
                    case 27:
                        w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        d0<List<hxb.e0>> productRates = this.f179120b.f179124a.getProductRates();
                        ju0.f fVar10 = new ju0.f(26, new g(12));
                        productRates.getClass();
                        ufm.i iVar11 = new ufm.i(productRates, fVar10, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                        return iVar11;
                    case 28:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179120b.f179126c.f("REV_POINTS_PRODUCT_RATES_MEM_KEY", rates);
                        return Unit.f186387a;
                    default:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar13 = this.f179120b.f179125b;
                        List<RevPointsProductRate> list9 = rates2;
                        ArrayList arrayList17 = new ArrayList(w.t(list9, 10));
                        for (RevPointsProductRate revPointsProductRate : list9) {
                            Intrinsics.checkNotNullParameter(revPointsProductRate, "<this>");
                            arrayList17.add(new x(revPointsProductRate.f84035a.name(), revPointsProductRate.f84036b.name(), revPointsProductRate.f84037c, revPointsProductRate.d));
                        }
                        cVar13.G(arrayList17, "REV_POINTS_PRODUCT_RATES_STORAGE_KEY", kii.e.o(x.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String b(EarnOptionsBottomSheetParams earnOptionsBottomSheetParams) {
        Double d = earnOptionsBottomSheetParams.f83942a;
        String str = earnOptionsBottomSheetParams.f83943b;
        m1c.i iVar = earnOptionsBottomSheetParams.f83944c;
        return d + "_" + str + "_" + (iVar != null ? iVar.name() : null);
    }

    public final r a(boolean z) {
        return this.e.e(Unit.f186387a, z ? w4l.i.f294643c : w4l.h.f294642c);
    }
}
