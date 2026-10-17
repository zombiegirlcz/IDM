package s1c;

import com.revolut.feature.rev_points.models.SpareChangeAmount;
import com.revolut.feature.rev_points.models.SpareChangeCalculation;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.models.SpareChangeRate;
import com.revolut.feature.rev_points.models.SpareChangeRefund;
import com.revolut.feature.rev_points.spare_change.impl.data.network.RevPointsSpareChangeService;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import le.u1;
import m1c.w1;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ryd.k;
import s08.g;
import ufm.i;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeService f259131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f259132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f259133c;
    public final w4l.f d;
    public final w4l.f e;

    public f(RevPointsSpareChangeService revPointsSpareChangeService, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(revPointsSpareChangeService, "revPointsSpareChangeService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f259131a = revPointsSpareChangeService;
        this.f259132b = storage;
        this.f259133c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: s1c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259127b;

            {
                this.f259127b = this;
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                f fVar = this.f259127b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<r1c.d> calculations = fVar.f259131a.getCalculations();
                        g gVar = new g(8, new k(29));
                        calculations.getClass();
                        i iVar = new i(calculations, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations, "spareChangeCalculations");
                        fVar.f259133c.f("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY", spareChangeCalculations);
                        return Unit.f186387a;
                    case 2:
                        SpareChangeCalculations spareChangeCalculations2 = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "spareChangeCalculations");
                        ue0.c cVar = fVar.f259132b;
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "<this>");
                        SpareChangeRate spareChangeRate = spareChangeCalculations2.f84084a;
                        Intrinsics.checkNotNullParameter(spareChangeRate, "<this>");
                        t1c.d dVar = new t1c.d(spareChangeRate.f84087a, spareChangeRate.f84088b.J());
                        SpareChangeAmount spareChangeAmount = spareChangeCalculations2.f84085b;
                        Intrinsics.checkNotNullParameter(spareChangeAmount, "<this>");
                        t1c.a aVar = new t1c.a(spareChangeAmount.f84079a, spareChangeAmount.f84080b);
                        ArrayList<SpareChangeCalculation> arrayList = spareChangeCalculations2.f84086c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (SpareChangeCalculation spareChangeCalculation : arrayList) {
                            Intrinsics.checkNotNullParameter(spareChangeCalculation, "<this>");
                            int i3 = spareChangeCalculation.f84081a;
                            SpareChangeAmount spareChangeAmount2 = spareChangeCalculation.f84082b;
                            Intrinsics.checkNotNullParameter(spareChangeAmount2, "<this>");
                            arrayList2.add(new t1c.b(i3, new t1c.a(spareChangeAmount2.f84079a, spareChangeAmount2.f84080b), spareChangeCalculation.f84083c.J()));
                        }
                        cVar.G(new t1c.c(dVar, aVar, arrayList2), "SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", z.d(o0.b(t1c.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<r1c.g> spareChangeRefund = fVar.f259131a.getSpareChangeRefund();
                        g gVar2 = new g(9, new a(2));
                        spareChangeRefund.getClass();
                        i iVar2 = new i(spareChangeRefund, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        SpareChangeRefund spareChangeRefund2 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund2, "spareChangeRefund");
                        fVar.f259133c.f("SPARE_CHANGE_REFUND_MEMORY_KEY", spareChangeRefund2);
                        return Unit.f186387a;
                    default:
                        SpareChangeRefund spareChangeRefund3 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "spareChangeRefund");
                        ue0.c cVar2 = fVar.f259132b;
                        Object obj4 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "<this>");
                        String str = spareChangeRefund3.f84089a;
                        String strH = u1.h(spareChangeRefund3.f84090b, q1c.a.f241419a);
                        if (strH == null) {
                            strH = "NOT_REQUESTED";
                        }
                        String str2 = strH;
                        jo3.b bVarA = hx7.a.A(spareChangeRefund3.f84091c);
                        jo3.b bVarA2 = hx7.a.A(spareChangeRefund3.d);
                        Long l2 = spareChangeRefund3.f;
                        if (l2 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        long jLongValue = l2.longValue();
                        Long l3 = spareChangeRefund3.f84092g;
                        if (l3 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        cVar2.G(new t1c.e(str, str2, bVarA, bVarA2, jLongValue, l3.longValue()), "SPARE_CHANGE_REFUND_STORAGE_KEY", z.d(o0.b(t1c.e.class)));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: s1c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259129b;

            {
                this.f259129b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                w1 w1Var = null;
                f fVar = this.f259129b;
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SpareChangeCalculations) fVar.f259133c.get("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t1c.c cVar = (t1c.c) fVar.f259132b.T2("SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", t1c.c.class);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        t1c.d rate = cVar.getRate();
                        Intrinsics.checkNotNullParameter(rate, "<this>");
                        SpareChangeRate spareChangeRate = new SpareChangeRate(rate.getPerCurrencyUnitsSpent(), qvb.a.a(rate.getPoints()));
                        t1c.a spent = cVar.getSpent();
                        Intrinsics.checkNotNullParameter(spent, "<this>");
                        SpareChangeAmount spareChangeAmount = new SpareChangeAmount(spent.getAmount(), spent.getCurrency());
                        List<t1c.b> calculations = cVar.getCalculations();
                        ArrayList arrayList = new ArrayList(w.t(calculations, 10));
                        for (t1c.b bVar : calculations) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            int multiplier = bVar.getMultiplier();
                            t1c.a roundUp = bVar.getRoundUp();
                            Intrinsics.checkNotNullParameter(roundUp, "<this>");
                            arrayList.add(new SpareChangeCalculation(multiplier, new SpareChangeAmount(roundUp.getAmount(), roundUp.getCurrency()), qvb.a.a(bVar.getPoints())));
                        }
                        return new SpareChangeCalculations(spareChangeRate, spareChangeAmount, arrayList);
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SpareChangeRefund) fVar.f259133c.get("SPARE_CHANGE_REFUND_MEMORY_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t1c.e eVar = (t1c.e) fVar.f259132b.T2("SPARE_CHANGE_REFUND_STORAGE_KEY", t1c.e.class);
                        if (eVar == null) {
                            return null;
                        }
                        Object obj3 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        String strB = eVar.b();
                        String strE = eVar.e();
                        w1[] w1VarArrValues = w1.values();
                        int length = w1VarArrValues.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                w1 w1Var2 = w1VarArrValues[i3];
                                if (a0.z(w1Var2.name(), strE, true)) {
                                    w1Var = w1Var2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        if (w1Var == null) {
                            w1Var = w1.NOT_REQUESTED;
                        }
                        return new SpareChangeRefund(strB, w1Var, hx7.a.v(eVar.d()), hx7.a.v(eVar.c()), null, Long.valueOf(eVar.a()), Long.valueOf(eVar.f()));
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: s1c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259127b;

            {
                this.f259127b = this;
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                f fVar = this.f259127b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<r1c.d> calculations = fVar.f259131a.getCalculations();
                        g gVar = new g(8, new k(29));
                        calculations.getClass();
                        i iVar = new i(calculations, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations, "spareChangeCalculations");
                        fVar.f259133c.f("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY", spareChangeCalculations);
                        return Unit.f186387a;
                    case 2:
                        SpareChangeCalculations spareChangeCalculations2 = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "spareChangeCalculations");
                        ue0.c cVar = fVar.f259132b;
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "<this>");
                        SpareChangeRate spareChangeRate = spareChangeCalculations2.f84084a;
                        Intrinsics.checkNotNullParameter(spareChangeRate, "<this>");
                        t1c.d dVar = new t1c.d(spareChangeRate.f84087a, spareChangeRate.f84088b.J());
                        SpareChangeAmount spareChangeAmount = spareChangeCalculations2.f84085b;
                        Intrinsics.checkNotNullParameter(spareChangeAmount, "<this>");
                        t1c.a aVar = new t1c.a(spareChangeAmount.f84079a, spareChangeAmount.f84080b);
                        ArrayList<SpareChangeCalculation> arrayList = spareChangeCalculations2.f84086c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (SpareChangeCalculation spareChangeCalculation : arrayList) {
                            Intrinsics.checkNotNullParameter(spareChangeCalculation, "<this>");
                            int i3 = spareChangeCalculation.f84081a;
                            SpareChangeAmount spareChangeAmount2 = spareChangeCalculation.f84082b;
                            Intrinsics.checkNotNullParameter(spareChangeAmount2, "<this>");
                            arrayList2.add(new t1c.b(i3, new t1c.a(spareChangeAmount2.f84079a, spareChangeAmount2.f84080b), spareChangeCalculation.f84083c.J()));
                        }
                        cVar.G(new t1c.c(dVar, aVar, arrayList2), "SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", z.d(o0.b(t1c.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<r1c.g> spareChangeRefund = fVar.f259131a.getSpareChangeRefund();
                        g gVar2 = new g(9, new a(2));
                        spareChangeRefund.getClass();
                        i iVar2 = new i(spareChangeRefund, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        SpareChangeRefund spareChangeRefund2 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund2, "spareChangeRefund");
                        fVar.f259133c.f("SPARE_CHANGE_REFUND_MEMORY_KEY", spareChangeRefund2);
                        return Unit.f186387a;
                    default:
                        SpareChangeRefund spareChangeRefund3 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "spareChangeRefund");
                        ue0.c cVar2 = fVar.f259132b;
                        Object obj4 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "<this>");
                        String str = spareChangeRefund3.f84089a;
                        String strH = u1.h(spareChangeRefund3.f84090b, q1c.a.f241419a);
                        if (strH == null) {
                            strH = "NOT_REQUESTED";
                        }
                        String str2 = strH;
                        jo3.b bVarA = hx7.a.A(spareChangeRefund3.f84091c);
                        jo3.b bVarA2 = hx7.a.A(spareChangeRefund3.d);
                        Long l2 = spareChangeRefund3.f;
                        if (l2 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        long jLongValue = l2.longValue();
                        Long l3 = spareChangeRefund3.f84092g;
                        if (l3 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        cVar2.G(new t1c.e(str, str2, bVarA, bVarA2, jLongValue, l3.longValue()), "SPARE_CHANGE_REFUND_STORAGE_KEY", z.d(o0.b(t1c.e.class)));
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: s1c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259129b;

            {
                this.f259129b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                w1 w1Var = null;
                f fVar = this.f259129b;
                Unit it8 = (Unit) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SpareChangeCalculations) fVar.f259133c.get("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t1c.c cVar = (t1c.c) fVar.f259132b.T2("SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", t1c.c.class);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        t1c.d rate = cVar.getRate();
                        Intrinsics.checkNotNullParameter(rate, "<this>");
                        SpareChangeRate spareChangeRate = new SpareChangeRate(rate.getPerCurrencyUnitsSpent(), qvb.a.a(rate.getPoints()));
                        t1c.a spent = cVar.getSpent();
                        Intrinsics.checkNotNullParameter(spent, "<this>");
                        SpareChangeAmount spareChangeAmount = new SpareChangeAmount(spent.getAmount(), spent.getCurrency());
                        List<t1c.b> calculations = cVar.getCalculations();
                        ArrayList arrayList = new ArrayList(w.t(calculations, 10));
                        for (t1c.b bVar : calculations) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            int multiplier = bVar.getMultiplier();
                            t1c.a roundUp = bVar.getRoundUp();
                            Intrinsics.checkNotNullParameter(roundUp, "<this>");
                            arrayList.add(new SpareChangeCalculation(multiplier, new SpareChangeAmount(roundUp.getAmount(), roundUp.getCurrency()), qvb.a.a(bVar.getPoints())));
                        }
                        return new SpareChangeCalculations(spareChangeRate, spareChangeAmount, arrayList);
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SpareChangeRefund) fVar.f259133c.get("SPARE_CHANGE_REFUND_MEMORY_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t1c.e eVar = (t1c.e) fVar.f259132b.T2("SPARE_CHANGE_REFUND_STORAGE_KEY", t1c.e.class);
                        if (eVar == null) {
                            return null;
                        }
                        Object obj3 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        String strB = eVar.b();
                        String strE = eVar.e();
                        w1[] w1VarArrValues = w1.values();
                        int length = w1VarArrValues.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                w1 w1Var2 = w1VarArrValues[i3];
                                if (a0.z(w1Var2.name(), strE, true)) {
                                    w1Var = w1Var2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        if (w1Var == null) {
                            w1Var = w1.NOT_REQUESTED;
                        }
                        return new SpareChangeRefund(strB, w1Var, hx7.a.v(eVar.d()), hx7.a.v(eVar.c()), null, Long.valueOf(eVar.a()), Long.valueOf(eVar.f()));
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: s1c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259127b;

            {
                this.f259127b = this;
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                f fVar = this.f259127b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<r1c.d> calculations = fVar.f259131a.getCalculations();
                        g gVar = new g(8, new k(29));
                        calculations.getClass();
                        i iVar = new i(calculations, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations, "spareChangeCalculations");
                        fVar.f259133c.f("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY", spareChangeCalculations);
                        return Unit.f186387a;
                    case 2:
                        SpareChangeCalculations spareChangeCalculations2 = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "spareChangeCalculations");
                        ue0.c cVar = fVar.f259132b;
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "<this>");
                        SpareChangeRate spareChangeRate = spareChangeCalculations2.f84084a;
                        Intrinsics.checkNotNullParameter(spareChangeRate, "<this>");
                        t1c.d dVar = new t1c.d(spareChangeRate.f84087a, spareChangeRate.f84088b.J());
                        SpareChangeAmount spareChangeAmount = spareChangeCalculations2.f84085b;
                        Intrinsics.checkNotNullParameter(spareChangeAmount, "<this>");
                        t1c.a aVar = new t1c.a(spareChangeAmount.f84079a, spareChangeAmount.f84080b);
                        ArrayList<SpareChangeCalculation> arrayList = spareChangeCalculations2.f84086c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (SpareChangeCalculation spareChangeCalculation : arrayList) {
                            Intrinsics.checkNotNullParameter(spareChangeCalculation, "<this>");
                            int i32 = spareChangeCalculation.f84081a;
                            SpareChangeAmount spareChangeAmount2 = spareChangeCalculation.f84082b;
                            Intrinsics.checkNotNullParameter(spareChangeAmount2, "<this>");
                            arrayList2.add(new t1c.b(i32, new t1c.a(spareChangeAmount2.f84079a, spareChangeAmount2.f84080b), spareChangeCalculation.f84083c.J()));
                        }
                        cVar.G(new t1c.c(dVar, aVar, arrayList2), "SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", z.d(o0.b(t1c.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<r1c.g> spareChangeRefund = fVar.f259131a.getSpareChangeRefund();
                        g gVar2 = new g(9, new a(2));
                        spareChangeRefund.getClass();
                        i iVar2 = new i(spareChangeRefund, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        SpareChangeRefund spareChangeRefund2 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund2, "spareChangeRefund");
                        fVar.f259133c.f("SPARE_CHANGE_REFUND_MEMORY_KEY", spareChangeRefund2);
                        return Unit.f186387a;
                    default:
                        SpareChangeRefund spareChangeRefund3 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "spareChangeRefund");
                        ue0.c cVar2 = fVar.f259132b;
                        Object obj4 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "<this>");
                        String str = spareChangeRefund3.f84089a;
                        String strH = u1.h(spareChangeRefund3.f84090b, q1c.a.f241419a);
                        if (strH == null) {
                            strH = "NOT_REQUESTED";
                        }
                        String str2 = strH;
                        jo3.b bVarA = hx7.a.A(spareChangeRefund3.f84091c);
                        jo3.b bVarA2 = hx7.a.A(spareChangeRefund3.d);
                        Long l2 = spareChangeRefund3.f;
                        if (l2 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        long jLongValue = l2.longValue();
                        Long l3 = spareChangeRefund3.f84092g;
                        if (l3 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        cVar2.G(new t1c.e(str, str2, bVarA, bVarA2, jLongValue, l3.longValue()), "SPARE_CHANGE_REFUND_STORAGE_KEY", z.d(o0.b(t1c.e.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 3;
        Function2 function23 = new Function2(this) { // from class: s1c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259127b;

            {
                this.f259127b = this;
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                f fVar = this.f259127b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<r1c.d> calculations = fVar.f259131a.getCalculations();
                        g gVar = new g(8, new k(29));
                        calculations.getClass();
                        i iVar = new i(calculations, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations, "spareChangeCalculations");
                        fVar.f259133c.f("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY", spareChangeCalculations);
                        return Unit.f186387a;
                    case 2:
                        SpareChangeCalculations spareChangeCalculations2 = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "spareChangeCalculations");
                        ue0.c cVar = fVar.f259132b;
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "<this>");
                        SpareChangeRate spareChangeRate = spareChangeCalculations2.f84084a;
                        Intrinsics.checkNotNullParameter(spareChangeRate, "<this>");
                        t1c.d dVar = new t1c.d(spareChangeRate.f84087a, spareChangeRate.f84088b.J());
                        SpareChangeAmount spareChangeAmount = spareChangeCalculations2.f84085b;
                        Intrinsics.checkNotNullParameter(spareChangeAmount, "<this>");
                        t1c.a aVar = new t1c.a(spareChangeAmount.f84079a, spareChangeAmount.f84080b);
                        ArrayList<SpareChangeCalculation> arrayList = spareChangeCalculations2.f84086c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (SpareChangeCalculation spareChangeCalculation : arrayList) {
                            Intrinsics.checkNotNullParameter(spareChangeCalculation, "<this>");
                            int i32 = spareChangeCalculation.f84081a;
                            SpareChangeAmount spareChangeAmount2 = spareChangeCalculation.f84082b;
                            Intrinsics.checkNotNullParameter(spareChangeAmount2, "<this>");
                            arrayList2.add(new t1c.b(i32, new t1c.a(spareChangeAmount2.f84079a, spareChangeAmount2.f84080b), spareChangeCalculation.f84083c.J()));
                        }
                        cVar.G(new t1c.c(dVar, aVar, arrayList2), "SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", z.d(o0.b(t1c.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<r1c.g> spareChangeRefund = fVar.f259131a.getSpareChangeRefund();
                        g gVar2 = new g(9, new a(2));
                        spareChangeRefund.getClass();
                        i iVar2 = new i(spareChangeRefund, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        SpareChangeRefund spareChangeRefund2 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund2, "spareChangeRefund");
                        fVar.f259133c.f("SPARE_CHANGE_REFUND_MEMORY_KEY", spareChangeRefund2);
                        return Unit.f186387a;
                    default:
                        SpareChangeRefund spareChangeRefund3 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "spareChangeRefund");
                        ue0.c cVar2 = fVar.f259132b;
                        Object obj4 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "<this>");
                        String str = spareChangeRefund3.f84089a;
                        String strH = u1.h(spareChangeRefund3.f84090b, q1c.a.f241419a);
                        if (strH == null) {
                            strH = "NOT_REQUESTED";
                        }
                        String str2 = strH;
                        jo3.b bVarA = hx7.a.A(spareChangeRefund3.f84091c);
                        jo3.b bVarA2 = hx7.a.A(spareChangeRefund3.d);
                        Long l2 = spareChangeRefund3.f;
                        if (l2 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        long jLongValue = l2.longValue();
                        Long l3 = spareChangeRefund3.f84092g;
                        if (l3 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        cVar2.G(new t1c.e(str, str2, bVarA, bVarA2, jLongValue, l3.longValue()), "SPARE_CHANGE_REFUND_STORAGE_KEY", z.d(o0.b(t1c.e.class)));
                        return Unit.f186387a;
                }
            }
        };
        final int i6 = 2;
        Function1 function13 = new Function1(this) { // from class: s1c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259129b;

            {
                this.f259129b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i6;
                w1 w1Var = null;
                f fVar = this.f259129b;
                Unit it8 = (Unit) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SpareChangeCalculations) fVar.f259133c.get("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t1c.c cVar = (t1c.c) fVar.f259132b.T2("SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", t1c.c.class);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        t1c.d rate = cVar.getRate();
                        Intrinsics.checkNotNullParameter(rate, "<this>");
                        SpareChangeRate spareChangeRate = new SpareChangeRate(rate.getPerCurrencyUnitsSpent(), qvb.a.a(rate.getPoints()));
                        t1c.a spent = cVar.getSpent();
                        Intrinsics.checkNotNullParameter(spent, "<this>");
                        SpareChangeAmount spareChangeAmount = new SpareChangeAmount(spent.getAmount(), spent.getCurrency());
                        List<t1c.b> calculations = cVar.getCalculations();
                        ArrayList arrayList = new ArrayList(w.t(calculations, 10));
                        for (t1c.b bVar : calculations) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            int multiplier = bVar.getMultiplier();
                            t1c.a roundUp = bVar.getRoundUp();
                            Intrinsics.checkNotNullParameter(roundUp, "<this>");
                            arrayList.add(new SpareChangeCalculation(multiplier, new SpareChangeAmount(roundUp.getAmount(), roundUp.getCurrency()), qvb.a.a(bVar.getPoints())));
                        }
                        return new SpareChangeCalculations(spareChangeRate, spareChangeAmount, arrayList);
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SpareChangeRefund) fVar.f259133c.get("SPARE_CHANGE_REFUND_MEMORY_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t1c.e eVar = (t1c.e) fVar.f259132b.T2("SPARE_CHANGE_REFUND_STORAGE_KEY", t1c.e.class);
                        if (eVar == null) {
                            return null;
                        }
                        Object obj3 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        String strB = eVar.b();
                        String strE = eVar.e();
                        w1[] w1VarArrValues = w1.values();
                        int length = w1VarArrValues.length;
                        int i32 = 0;
                        while (true) {
                            if (i32 < length) {
                                w1 w1Var2 = w1VarArrValues[i32];
                                if (a0.z(w1Var2.name(), strE, true)) {
                                    w1Var = w1Var2;
                                } else {
                                    i32++;
                                }
                            }
                        }
                        if (w1Var == null) {
                            w1Var = w1.NOT_REQUESTED;
                        }
                        return new SpareChangeRefund(strB, w1Var, hx7.a.v(eVar.d()), hx7.a.v(eVar.c()), null, Long.valueOf(eVar.a()), Long.valueOf(eVar.f()));
                }
            }
        };
        final int i21 = 4;
        Function2 function24 = new Function2(this) { // from class: s1c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259127b;

            {
                this.f259127b = this;
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i21;
                f fVar = this.f259127b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<r1c.d> calculations = fVar.f259131a.getCalculations();
                        g gVar = new g(8, new k(29));
                        calculations.getClass();
                        i iVar = new i(calculations, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations, "spareChangeCalculations");
                        fVar.f259133c.f("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY", spareChangeCalculations);
                        return Unit.f186387a;
                    case 2:
                        SpareChangeCalculations spareChangeCalculations2 = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "spareChangeCalculations");
                        ue0.c cVar = fVar.f259132b;
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "<this>");
                        SpareChangeRate spareChangeRate = spareChangeCalculations2.f84084a;
                        Intrinsics.checkNotNullParameter(spareChangeRate, "<this>");
                        t1c.d dVar = new t1c.d(spareChangeRate.f84087a, spareChangeRate.f84088b.J());
                        SpareChangeAmount spareChangeAmount = spareChangeCalculations2.f84085b;
                        Intrinsics.checkNotNullParameter(spareChangeAmount, "<this>");
                        t1c.a aVar = new t1c.a(spareChangeAmount.f84079a, spareChangeAmount.f84080b);
                        ArrayList<SpareChangeCalculation> arrayList = spareChangeCalculations2.f84086c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (SpareChangeCalculation spareChangeCalculation : arrayList) {
                            Intrinsics.checkNotNullParameter(spareChangeCalculation, "<this>");
                            int i32 = spareChangeCalculation.f84081a;
                            SpareChangeAmount spareChangeAmount2 = spareChangeCalculation.f84082b;
                            Intrinsics.checkNotNullParameter(spareChangeAmount2, "<this>");
                            arrayList2.add(new t1c.b(i32, new t1c.a(spareChangeAmount2.f84079a, spareChangeAmount2.f84080b), spareChangeCalculation.f84083c.J()));
                        }
                        cVar.G(new t1c.c(dVar, aVar, arrayList2), "SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", z.d(o0.b(t1c.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<r1c.g> spareChangeRefund = fVar.f259131a.getSpareChangeRefund();
                        g gVar2 = new g(9, new a(2));
                        spareChangeRefund.getClass();
                        i iVar2 = new i(spareChangeRefund, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        SpareChangeRefund spareChangeRefund2 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund2, "spareChangeRefund");
                        fVar.f259133c.f("SPARE_CHANGE_REFUND_MEMORY_KEY", spareChangeRefund2);
                        return Unit.f186387a;
                    default:
                        SpareChangeRefund spareChangeRefund3 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "spareChangeRefund");
                        ue0.c cVar2 = fVar.f259132b;
                        Object obj4 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "<this>");
                        String str = spareChangeRefund3.f84089a;
                        String strH = u1.h(spareChangeRefund3.f84090b, q1c.a.f241419a);
                        if (strH == null) {
                            strH = "NOT_REQUESTED";
                        }
                        String str2 = strH;
                        jo3.b bVarA = hx7.a.A(spareChangeRefund3.f84091c);
                        jo3.b bVarA2 = hx7.a.A(spareChangeRefund3.d);
                        Long l2 = spareChangeRefund3.f;
                        if (l2 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        long jLongValue = l2.longValue();
                        Long l3 = spareChangeRefund3.f84092g;
                        if (l3 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        cVar2.G(new t1c.e(str, str2, bVarA, bVarA2, jLongValue, l3.longValue()), "SPARE_CHANGE_REFUND_STORAGE_KEY", z.d(o0.b(t1c.e.class)));
                        return Unit.f186387a;
                }
            }
        };
        final int i22 = 3;
        Function1 function14 = new Function1(this) { // from class: s1c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259129b;

            {
                this.f259129b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i222 = i22;
                w1 w1Var = null;
                f fVar = this.f259129b;
                Unit it8 = (Unit) obj2;
                switch (i222) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SpareChangeCalculations) fVar.f259133c.get("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t1c.c cVar = (t1c.c) fVar.f259132b.T2("SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", t1c.c.class);
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        t1c.d rate = cVar.getRate();
                        Intrinsics.checkNotNullParameter(rate, "<this>");
                        SpareChangeRate spareChangeRate = new SpareChangeRate(rate.getPerCurrencyUnitsSpent(), qvb.a.a(rate.getPoints()));
                        t1c.a spent = cVar.getSpent();
                        Intrinsics.checkNotNullParameter(spent, "<this>");
                        SpareChangeAmount spareChangeAmount = new SpareChangeAmount(spent.getAmount(), spent.getCurrency());
                        List<t1c.b> calculations = cVar.getCalculations();
                        ArrayList arrayList = new ArrayList(w.t(calculations, 10));
                        for (t1c.b bVar : calculations) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            int multiplier = bVar.getMultiplier();
                            t1c.a roundUp = bVar.getRoundUp();
                            Intrinsics.checkNotNullParameter(roundUp, "<this>");
                            arrayList.add(new SpareChangeCalculation(multiplier, new SpareChangeAmount(roundUp.getAmount(), roundUp.getCurrency()), qvb.a.a(bVar.getPoints())));
                        }
                        return new SpareChangeCalculations(spareChangeRate, spareChangeAmount, arrayList);
                    case 2:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (SpareChangeRefund) fVar.f259133c.get("SPARE_CHANGE_REFUND_MEMORY_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        t1c.e eVar = (t1c.e) fVar.f259132b.T2("SPARE_CHANGE_REFUND_STORAGE_KEY", t1c.e.class);
                        if (eVar == null) {
                            return null;
                        }
                        Object obj3 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        String strB = eVar.b();
                        String strE = eVar.e();
                        w1[] w1VarArrValues = w1.values();
                        int length = w1VarArrValues.length;
                        int i32 = 0;
                        while (true) {
                            if (i32 < length) {
                                w1 w1Var2 = w1VarArrValues[i32];
                                if (a0.z(w1Var2.name(), strE, true)) {
                                    w1Var = w1Var2;
                                } else {
                                    i32++;
                                }
                            }
                        }
                        if (w1Var == null) {
                            w1Var = w1.NOT_REQUESTED;
                        }
                        return new SpareChangeRefund(strB, w1Var, hx7.a.v(eVar.d()), hx7.a.v(eVar.c()), null, Long.valueOf(eVar.a()), Long.valueOf(eVar.f()));
                }
            }
        };
        final int i32 = 5;
        this.e = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: s1c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f259127b;

            {
                this.f259127b = this;
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i32;
                f fVar = this.f259127b;
                switch (i222) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<r1c.d> calculations = fVar.f259131a.getCalculations();
                        g gVar = new g(8, new k(29));
                        calculations.getClass();
                        i iVar = new i(calculations, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations, "spareChangeCalculations");
                        fVar.f259133c.f("SPARE_CHANGE_CALCULATIONS_MEMORY_KEY", spareChangeCalculations);
                        return Unit.f186387a;
                    case 2:
                        SpareChangeCalculations spareChangeCalculations2 = (SpareChangeCalculations) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "spareChangeCalculations");
                        ue0.c cVar = fVar.f259132b;
                        Intrinsics.checkNotNullParameter(spareChangeCalculations2, "<this>");
                        SpareChangeRate spareChangeRate = spareChangeCalculations2.f84084a;
                        Intrinsics.checkNotNullParameter(spareChangeRate, "<this>");
                        t1c.d dVar = new t1c.d(spareChangeRate.f84087a, spareChangeRate.f84088b.J());
                        SpareChangeAmount spareChangeAmount = spareChangeCalculations2.f84085b;
                        Intrinsics.checkNotNullParameter(spareChangeAmount, "<this>");
                        t1c.a aVar = new t1c.a(spareChangeAmount.f84079a, spareChangeAmount.f84080b);
                        ArrayList<SpareChangeCalculation> arrayList = spareChangeCalculations2.f84086c;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (SpareChangeCalculation spareChangeCalculation : arrayList) {
                            Intrinsics.checkNotNullParameter(spareChangeCalculation, "<this>");
                            int i322 = spareChangeCalculation.f84081a;
                            SpareChangeAmount spareChangeAmount2 = spareChangeCalculation.f84082b;
                            Intrinsics.checkNotNullParameter(spareChangeAmount2, "<this>");
                            arrayList2.add(new t1c.b(i322, new t1c.a(spareChangeAmount2.f84079a, spareChangeAmount2.f84080b), spareChangeCalculation.f84083c.J()));
                        }
                        cVar.G(new t1c.c(dVar, aVar, arrayList2), "SPARE_CHANGE_CALCULATIONS_STORAGE_KEY", z.d(o0.b(t1c.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<r1c.g> spareChangeRefund = fVar.f259131a.getSpareChangeRefund();
                        g gVar2 = new g(9, new a(2));
                        spareChangeRefund.getClass();
                        i iVar2 = new i(spareChangeRefund, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        SpareChangeRefund spareChangeRefund2 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund2, "spareChangeRefund");
                        fVar.f259133c.f("SPARE_CHANGE_REFUND_MEMORY_KEY", spareChangeRefund2);
                        return Unit.f186387a;
                    default:
                        SpareChangeRefund spareChangeRefund3 = (SpareChangeRefund) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "spareChangeRefund");
                        ue0.c cVar2 = fVar.f259132b;
                        Object obj4 = q1c.a.f241419a;
                        Intrinsics.checkNotNullParameter(spareChangeRefund3, "<this>");
                        String str = spareChangeRefund3.f84089a;
                        String strH = u1.h(spareChangeRefund3.f84090b, q1c.a.f241419a);
                        if (strH == null) {
                            strH = "NOT_REQUESTED";
                        }
                        String str2 = strH;
                        jo3.b bVarA = hx7.a.A(spareChangeRefund3.f84091c);
                        jo3.b bVarA2 = hx7.a.A(spareChangeRefund3.d);
                        Long l2 = spareChangeRefund3.f;
                        if (l2 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        long jLongValue = l2.longValue();
                        Long l3 = spareChangeRefund3.f84092g;
                        if (l3 == null) {
                            throw new IllegalArgumentException("when we save it to DB this should always be not null");
                        }
                        cVar2.G(new t1c.e(str, str2, bVarA, bVarA2, jLongValue, l3.longValue()), "SPARE_CHANGE_REFUND_STORAGE_KEY", z.d(o0.b(t1c.e.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
