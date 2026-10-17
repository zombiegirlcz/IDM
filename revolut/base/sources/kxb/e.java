package kxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsBenefitsService;
import com.revolut.feature.rev_points.models.RevPointsBenefits;
import efm.d0;
import hxb.g;
import hxb.k;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kp0.w0;
import m1c.f0;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import vxb.i;
import w4l.f;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsBenefitsService f190550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f190551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f190552c;
    public final f d;
    public final f e;

    public e(RevPointsBenefitsService revPointsBenefitsService, ue0.c revPointsStorage, j memoryCache) {
        Intrinsics.checkNotNullParameter(revPointsBenefitsService, "revPointsBenefitsService");
        Intrinsics.checkNotNullParameter(revPointsStorage, "revPointsStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f190550a = revPointsBenefitsService;
        this.f190551b = revPointsStorage;
        this.f190552c = memoryCache;
        final int i = 6;
        Function2 function2 = new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: kxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190546b;

            {
                this.f190546b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) p.a.j(i.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<i> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (i iVar : list2) {
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            arrayList.add(new f0(hx7.a.v(iVar.getMonthlySpent()), hx7.a.v(iVar.getSavings())));
                        }
                        return arrayList;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        return (RevPointsBenefits) v7.r("REV_POINTS_BENEFITS_MEM_KEY", pricingPlan.f152288b, this.f190546b.f190552c);
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        vxb.f fVar = (vxb.f) this.f190546b.f190551b.T2("REV_POINTS_BENEFITS_STORAGE_KEY" + pricingPlan2.f152288b, vxb.f.class);
                        if (fVar != null) {
                            return w0.u(fVar);
                        }
                        return null;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_BENEFITS_PREVIEW_KEY");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        List list3 = (List) p.a.j(vxb.f.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_BENEFITS_PREVIEW_KEY");
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(w0.u((vxb.f) it11.next()));
                        }
                        return arrayList2;
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                }
            }
        };
        Function2 function22 = new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 2;
        this.d = new f(function2, function1, function22, new Function1(this) { // from class: kxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190546b;

            {
                this.f190546b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) p.a.j(i.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<i> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (i iVar : list2) {
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            arrayList.add(new f0(hx7.a.v(iVar.getMonthlySpent()), hx7.a.v(iVar.getSavings())));
                        }
                        return arrayList;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        return (RevPointsBenefits) v7.r("REV_POINTS_BENEFITS_MEM_KEY", pricingPlan.f152288b, this.f190546b.f190552c);
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        vxb.f fVar = (vxb.f) this.f190546b.f190551b.T2("REV_POINTS_BENEFITS_STORAGE_KEY" + pricingPlan2.f152288b, vxb.f.class);
                        if (fVar != null) {
                            return w0.u(fVar);
                        }
                        return null;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_BENEFITS_PREVIEW_KEY");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        List list3 = (List) p.a.j(vxb.f.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_BENEFITS_PREVIEW_KEY");
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(w0.u((vxb.f) it11.next()));
                        }
                        return arrayList2;
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                }
            }
        }, new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 3;
        Function2 function23 = new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: kxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190546b;

            {
                this.f190546b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) p.a.j(i.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<i> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (i iVar : list2) {
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            arrayList.add(new f0(hx7.a.v(iVar.getMonthlySpent()), hx7.a.v(iVar.getSavings())));
                        }
                        return arrayList;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        return (RevPointsBenefits) v7.r("REV_POINTS_BENEFITS_MEM_KEY", pricingPlan.f152288b, this.f190546b.f190552c);
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        vxb.f fVar = (vxb.f) this.f190546b.f190551b.T2("REV_POINTS_BENEFITS_STORAGE_KEY" + pricingPlan2.f152288b, vxb.f.class);
                        if (fVar != null) {
                            return w0.u(fVar);
                        }
                        return null;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_BENEFITS_PREVIEW_KEY");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        List list3 = (List) p.a.j(vxb.f.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_BENEFITS_PREVIEW_KEY");
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(w0.u((vxb.f) it11.next()));
                        }
                        return arrayList2;
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                }
            }
        };
        final int i6 = 4;
        Function2 function24 = new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function13 = new Function1(this) { // from class: kxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190546b;

            {
                this.f190546b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) p.a.j(i.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<i> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (i iVar : list2) {
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            arrayList.add(new f0(hx7.a.v(iVar.getMonthlySpent()), hx7.a.v(iVar.getSavings())));
                        }
                        return arrayList;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        return (RevPointsBenefits) v7.r("REV_POINTS_BENEFITS_MEM_KEY", pricingPlan.f152288b, this.f190546b.f190552c);
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        vxb.f fVar = (vxb.f) this.f190546b.f190551b.T2("REV_POINTS_BENEFITS_STORAGE_KEY" + pricingPlan2.f152288b, vxb.f.class);
                        if (fVar != null) {
                            return w0.u(fVar);
                        }
                        return null;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_BENEFITS_PREVIEW_KEY");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        List list3 = (List) p.a.j(vxb.f.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_BENEFITS_PREVIEW_KEY");
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(w0.u((vxb.f) it11.next()));
                        }
                        return arrayList2;
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                }
            }
        };
        final int i21 = 5;
        this.e = new f(function23, function12, function24, function13, new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 7;
        Function2 function25 = new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        };
        final int i32 = 5;
        Function1 function14 = new Function1(this) { // from class: kxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190546b;

            {
                this.f190546b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) p.a.j(i.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<i> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (i iVar : list2) {
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            arrayList.add(new f0(hx7.a.v(iVar.getMonthlySpent()), hx7.a.v(iVar.getSavings())));
                        }
                        return arrayList;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        return (RevPointsBenefits) v7.r("REV_POINTS_BENEFITS_MEM_KEY", pricingPlan.f152288b, this.f190546b.f190552c);
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        vxb.f fVar = (vxb.f) this.f190546b.f190551b.T2("REV_POINTS_BENEFITS_STORAGE_KEY" + pricingPlan2.f152288b, vxb.f.class);
                        if (fVar != null) {
                            return w0.u(fVar);
                        }
                        return null;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_BENEFITS_PREVIEW_KEY");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        List list3 = (List) p.a.j(vxb.f.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_BENEFITS_PREVIEW_KEY");
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(w0.u((vxb.f) it11.next()));
                        }
                        return arrayList2;
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                }
            }
        };
        final int i33 = 8;
        Function2 function26 = new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        };
        final int i43 = 0;
        new f(function25, function14, function26, new Function1(this) { // from class: kxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190546b;

            {
                this.f190546b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i43) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) p.a.j(i.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<i> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (i iVar : list2) {
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            arrayList.add(new f0(hx7.a.v(iVar.getMonthlySpent()), hx7.a.v(iVar.getSavings())));
                        }
                        return arrayList;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        return (RevPointsBenefits) v7.r("REV_POINTS_BENEFITS_MEM_KEY", pricingPlan.f152288b, this.f190546b.f190552c);
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        vxb.f fVar = (vxb.f) this.f190546b.f190551b.T2("REV_POINTS_BENEFITS_STORAGE_KEY" + pricingPlan2.f152288b, vxb.f.class);
                        if (fVar != null) {
                            return w0.u(fVar);
                        }
                        return null;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_BENEFITS_PREVIEW_KEY");
                    case 4:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        List list3 = (List) p.a.j(vxb.f.class, KTypeProjection.INSTANCE, List.class, this.f190546b.f190551b, "REV_POINTS_BENEFITS_PREVIEW_KEY");
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List list4 = list3;
                        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList2.add(w0.u((vxb.f) it11.next()));
                        }
                        return arrayList2;
                    default:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) this.f190546b.f190552c.get("REV_POINTS_CARD_SPEND_BENEFITS_KEY");
                }
            }
        }, new Function2(this) { // from class: kxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f190548b;

            {
                this.f190548b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        List benefits = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits, "benefits");
                        List<f0> list = benefits;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (f0 f0Var : list) {
                            Intrinsics.checkNotNullParameter(f0Var, "<this>");
                            arrayList.add(new i(hx7.a.A(f0Var.f201362a), hx7.a.A(f0Var.f201363b)));
                        }
                        this.f190548b.f190551b.G(arrayList, "REV_POINTS_CARD_SPEND_BENEFITS_KEY", kii.e.o(i.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 1:
                        hha.d pricingPlan = (hha.d) obj2;
                        RevPointsBenefits benefits2 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits2, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_MEM_KEY" + pricingPlan.f152288b, benefits2);
                        return Unit.f186387a;
                    case 2:
                        hha.d pricingPlan2 = (hha.d) obj2;
                        RevPointsBenefits benefits3 = (RevPointsBenefits) obj3;
                        Intrinsics.checkNotNullParameter(pricingPlan2, "pricingPlan");
                        Intrinsics.checkNotNullParameter(benefits3, "benefits");
                        this.f190548b.f190551b.G(w0.D(benefits3), j6.a.q("REV_POINTS_BENEFITS_STORAGE_KEY", pricingPlan2.f152288b), z.d(o0.b(vxb.f.class)));
                        return Unit.f186387a;
                    case 3:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<g>> revPointsAccountBenefitsPreviews = this.f190548b.f190550a.getRevPointsAccountBenefitsPreviews();
                        ksb.a aVar = new ksb.a(new kvg.j(29), 21);
                        revPointsAccountBenefitsPreviews.getClass();
                        ufm.i iVar = new ufm.i(revPointsAccountBenefitsPreviews, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 4:
                        List benefits4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits4, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_BENEFITS_PREVIEW_KEY", benefits4);
                        return Unit.f186387a;
                    case 5:
                        List benefits5 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits5, "benefits");
                        ue0.c cVar = this.f190548b.f190551b;
                        Intrinsics.checkNotNullParameter(benefits5, "<this>");
                        List list2 = benefits5;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(w0.D((RevPointsBenefits) it9.next()));
                        }
                        cVar.G(arrayList2, "REV_POINTS_BENEFITS_PREVIEW_KEY", kii.e.o(vxb.f.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 6:
                        f DataObservableDelegate2 = (f) obj2;
                        hha.d pricingPlan3 = (hha.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pricingPlan3, "pricingPlan");
                        d0<g> revPointsAccountBenefits = this.f190548b.f190550a.getRevPointsAccountBenefits(pricingPlan3.f152288b);
                        ksb.a aVar2 = new ksb.a(new c(1), 23);
                        revPointsAccountBenefits.getClass();
                        ufm.i iVar2 = new ufm.i(revPointsAccountBenefits, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 7:
                        f DataObservableDelegate3 = (f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<k> cardSpendBenefits = this.f190548b.f190550a.getCardSpendBenefits();
                        ksb.a aVar3 = new ksb.a(new c(0), 22);
                        cardSpendBenefits.getClass();
                        ufm.i iVar3 = new ufm.i(cardSpendBenefits, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        List benefits6 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(benefits6, "benefits");
                        this.f190548b.f190552c.f("REV_POINTS_CARD_SPEND_BENEFITS_KEY", benefits6);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
