package jxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsPlanService;
import efm.d0;
import hxb.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import le.u1;
import m1c.a1;
import m1c.b1;
import m1c.f1;
import m1c.r;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import vxb.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPlanService f179111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f179112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f179113c;
    public final w4l.f d;

    public e(RevPointsPlanService revPointsPlanService, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(revPointsPlanService, "revPointsPlanService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f179111a = revPointsPlanService;
        this.f179112b = storage;
        this.f179113c = memoryCache;
        final int i = 2;
        Function2 function2 = new Function2(this) { // from class: jxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179109b;

            {
                this.f179109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179109b.f179113c.f("REV_POINTS_PLAN_REWARDS_MEM_KEY", rates);
                        return Unit.f186387a;
                    case 1:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar = this.f179109b.f179112b;
                        List<b1> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (b1 b1Var : list) {
                            Intrinsics.checkNotNullParameter(b1Var, "<this>");
                            arrayList.add(new u(b1Var.f201341a.name(), b1Var.f201342b, hx7.a.A(b1Var.f201343c)));
                        }
                        cVar.G(arrayList, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY", kii.e.o(u.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<List<c0>> revPointsPlanRates = this.f179109b.f179111a.getRevPointsPlanRates(u1.h(request.f179110a, fub.g.f138167a), null);
                        ju0.f fVar = new ju0.f(11, new jt2.d(28));
                        revPointsPlanRates.getClass();
                        ufm.i iVar = new ufm.i(revPointsPlanRates, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        List rates3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rates3, "rates");
                        this.f179109b.f179113c.f(e.a(request2.f179110a, "REV_POINTS_RATES_MEM_KEY"), rates3);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        List rates4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rates4, "rates");
                        this.f179109b.f179112b.G(rates4, e.a(request3.f179110a, "REV_POINTS_RATES_STORAGE_KEY"), kii.e.o(a1.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<hxb.d0>> planRewards = this.f179109b.f179111a.getPlanRewards();
                        ju0.f fVar2 = new ju0.f(12, new jt2.d(29));
                        planRewards.getClass();
                        ufm.i iVar2 = new ufm.i(planRewards, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: jxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179107b;

            {
                this.f179107b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r rVar;
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f179107b.f179113c.get("REV_POINTS_PLAN_REWARDS_MEM_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) p.a.j(u.class, KTypeProjection.INSTANCE, List.class, this.f179107b.f179112b, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<u> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (u uVar : list2) {
                            Intrinsics.checkNotNullParameter(uVar, "<this>");
                            String strB = uVar.b();
                            r[] rVarArrValues = r.values();
                            int length = rVarArrValues.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    rVar = rVarArrValues[i2];
                                    if (!a0.z(rVar.name(), strB, true)) {
                                        i2++;
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                rVar = r.UNKNOWN;
                            }
                            arrayList.add(new b1(rVar, uVar.c(), hx7.a.v(uVar.a())));
                        }
                        return arrayList;
                    case 2:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (List) this.f179107b.f179113c.get(e.a(request.f179110a, "REV_POINTS_RATES_MEM_KEY"));
                    default:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        return (List) p.a.j(a1.class, KTypeProjection.INSTANCE, List.class, this.f179107b.f179112b, e.a(request2.f179110a, "REV_POINTS_RATES_STORAGE_KEY"));
                }
            }
        };
        final int i2 = 3;
        Function2 function22 = new Function2(this) { // from class: jxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179109b;

            {
                this.f179109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179109b.f179113c.f("REV_POINTS_PLAN_REWARDS_MEM_KEY", rates);
                        return Unit.f186387a;
                    case 1:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar = this.f179109b.f179112b;
                        List<b1> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (b1 b1Var : list) {
                            Intrinsics.checkNotNullParameter(b1Var, "<this>");
                            arrayList.add(new u(b1Var.f201341a.name(), b1Var.f201342b, hx7.a.A(b1Var.f201343c)));
                        }
                        cVar.G(arrayList, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY", kii.e.o(u.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<List<c0>> revPointsPlanRates = this.f179109b.f179111a.getRevPointsPlanRates(u1.h(request.f179110a, fub.g.f138167a), null);
                        ju0.f fVar = new ju0.f(11, new jt2.d(28));
                        revPointsPlanRates.getClass();
                        ufm.i iVar = new ufm.i(revPointsPlanRates, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        List rates3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rates3, "rates");
                        this.f179109b.f179113c.f(e.a(request2.f179110a, "REV_POINTS_RATES_MEM_KEY"), rates3);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        List rates4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rates4, "rates");
                        this.f179109b.f179112b.G(rates4, e.a(request3.f179110a, "REV_POINTS_RATES_STORAGE_KEY"), kii.e.o(a1.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<hxb.d0>> planRewards = this.f179109b.f179111a.getPlanRewards();
                        ju0.f fVar2 = new ju0.f(12, new jt2.d(29));
                        planRewards.getClass();
                        ufm.i iVar2 = new ufm.i(planRewards, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: jxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179107b;

            {
                this.f179107b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r rVar;
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f179107b.f179113c.get("REV_POINTS_PLAN_REWARDS_MEM_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) p.a.j(u.class, KTypeProjection.INSTANCE, List.class, this.f179107b.f179112b, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<u> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (u uVar : list2) {
                            Intrinsics.checkNotNullParameter(uVar, "<this>");
                            String strB = uVar.b();
                            r[] rVarArrValues = r.values();
                            int length = rVarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    rVar = rVarArrValues[i22];
                                    if (!a0.z(rVar.name(), strB, true)) {
                                        i22++;
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                rVar = r.UNKNOWN;
                            }
                            arrayList.add(new b1(rVar, uVar.c(), hx7.a.v(uVar.a())));
                        }
                        return arrayList;
                    case 2:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (List) this.f179107b.f179113c.get(e.a(request.f179110a, "REV_POINTS_RATES_MEM_KEY"));
                    default:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        return (List) p.a.j(a1.class, KTypeProjection.INSTANCE, List.class, this.f179107b.f179112b, e.a(request2.f179110a, "REV_POINTS_RATES_STORAGE_KEY"));
                }
            }
        };
        final int i3 = 4;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: jxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179109b;

            {
                this.f179109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179109b.f179113c.f("REV_POINTS_PLAN_REWARDS_MEM_KEY", rates);
                        return Unit.f186387a;
                    case 1:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar = this.f179109b.f179112b;
                        List<b1> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (b1 b1Var : list) {
                            Intrinsics.checkNotNullParameter(b1Var, "<this>");
                            arrayList.add(new u(b1Var.f201341a.name(), b1Var.f201342b, hx7.a.A(b1Var.f201343c)));
                        }
                        cVar.G(arrayList, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY", kii.e.o(u.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<List<c0>> revPointsPlanRates = this.f179109b.f179111a.getRevPointsPlanRates(u1.h(request.f179110a, fub.g.f138167a), null);
                        ju0.f fVar = new ju0.f(11, new jt2.d(28));
                        revPointsPlanRates.getClass();
                        ufm.i iVar = new ufm.i(revPointsPlanRates, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        List rates3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rates3, "rates");
                        this.f179109b.f179113c.f(e.a(request2.f179110a, "REV_POINTS_RATES_MEM_KEY"), rates3);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        List rates4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rates4, "rates");
                        this.f179109b.f179112b.G(rates4, e.a(request3.f179110a, "REV_POINTS_RATES_STORAGE_KEY"), kii.e.o(a1.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<hxb.d0>> planRewards = this.f179109b.f179111a.getPlanRewards();
                        ju0.f fVar2 = new ju0.f(12, new jt2.d(29));
                        planRewards.getClass();
                        ufm.i iVar2 = new ufm.i(planRewards, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 5;
        Function2 function23 = new Function2(this) { // from class: jxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179109b;

            {
                this.f179109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179109b.f179113c.f("REV_POINTS_PLAN_REWARDS_MEM_KEY", rates);
                        return Unit.f186387a;
                    case 1:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar = this.f179109b.f179112b;
                        List<b1> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (b1 b1Var : list) {
                            Intrinsics.checkNotNullParameter(b1Var, "<this>");
                            arrayList.add(new u(b1Var.f201341a.name(), b1Var.f201342b, hx7.a.A(b1Var.f201343c)));
                        }
                        cVar.G(arrayList, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY", kii.e.o(u.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<List<c0>> revPointsPlanRates = this.f179109b.f179111a.getRevPointsPlanRates(u1.h(request.f179110a, fub.g.f138167a), null);
                        ju0.f fVar = new ju0.f(11, new jt2.d(28));
                        revPointsPlanRates.getClass();
                        ufm.i iVar = new ufm.i(revPointsPlanRates, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        List rates3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rates3, "rates");
                        this.f179109b.f179113c.f(e.a(request2.f179110a, "REV_POINTS_RATES_MEM_KEY"), rates3);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        List rates4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rates4, "rates");
                        this.f179109b.f179112b.G(rates4, e.a(request3.f179110a, "REV_POINTS_RATES_STORAGE_KEY"), kii.e.o(a1.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<hxb.d0>> planRewards = this.f179109b.f179111a.getPlanRewards();
                        ju0.f fVar2 = new ju0.f(12, new jt2.d(29));
                        planRewards.getClass();
                        ufm.i iVar2 = new ufm.i(planRewards, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i6 = 0;
        Function1 function13 = new Function1(this) { // from class: jxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179107b;

            {
                this.f179107b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r rVar;
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f179107b.f179113c.get("REV_POINTS_PLAN_REWARDS_MEM_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) p.a.j(u.class, KTypeProjection.INSTANCE, List.class, this.f179107b.f179112b, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<u> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (u uVar : list2) {
                            Intrinsics.checkNotNullParameter(uVar, "<this>");
                            String strB = uVar.b();
                            r[] rVarArrValues = r.values();
                            int length = rVarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    rVar = rVarArrValues[i22];
                                    if (!a0.z(rVar.name(), strB, true)) {
                                        i22++;
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                rVar = r.UNKNOWN;
                            }
                            arrayList.add(new b1(rVar, uVar.c(), hx7.a.v(uVar.a())));
                        }
                        return arrayList;
                    case 2:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (List) this.f179107b.f179113c.get(e.a(request.f179110a, "REV_POINTS_RATES_MEM_KEY"));
                    default:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        return (List) p.a.j(a1.class, KTypeProjection.INSTANCE, List.class, this.f179107b.f179112b, e.a(request2.f179110a, "REV_POINTS_RATES_STORAGE_KEY"));
                }
            }
        };
        Function2 function24 = new Function2(this) { // from class: jxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179109b;

            {
                this.f179109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179109b.f179113c.f("REV_POINTS_PLAN_REWARDS_MEM_KEY", rates);
                        return Unit.f186387a;
                    case 1:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar = this.f179109b.f179112b;
                        List<b1> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (b1 b1Var : list) {
                            Intrinsics.checkNotNullParameter(b1Var, "<this>");
                            arrayList.add(new u(b1Var.f201341a.name(), b1Var.f201342b, hx7.a.A(b1Var.f201343c)));
                        }
                        cVar.G(arrayList, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY", kii.e.o(u.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<List<c0>> revPointsPlanRates = this.f179109b.f179111a.getRevPointsPlanRates(u1.h(request.f179110a, fub.g.f138167a), null);
                        ju0.f fVar = new ju0.f(11, new jt2.d(28));
                        revPointsPlanRates.getClass();
                        ufm.i iVar = new ufm.i(revPointsPlanRates, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        List rates3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rates3, "rates");
                        this.f179109b.f179113c.f(e.a(request2.f179110a, "REV_POINTS_RATES_MEM_KEY"), rates3);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        List rates4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rates4, "rates");
                        this.f179109b.f179112b.G(rates4, e.a(request3.f179110a, "REV_POINTS_RATES_STORAGE_KEY"), kii.e.o(a1.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<hxb.d0>> planRewards = this.f179109b.f179111a.getPlanRewards();
                        ju0.f fVar2 = new ju0.f(12, new jt2.d(29));
                        planRewards.getClass();
                        ufm.i iVar2 = new ufm.i(planRewards, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i21 = 1;
        new w4l.f(function23, function13, function24, new Function1(this) { // from class: jxb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179107b;

            {
                this.f179107b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                r rVar;
                switch (i21) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f179107b.f179113c.get("REV_POINTS_PLAN_REWARDS_MEM_KEY");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) p.a.j(u.class, KTypeProjection.INSTANCE, List.class, this.f179107b.f179112b, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY");
                        if (list == null) {
                            return null;
                        }
                        List<u> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (u uVar : list2) {
                            Intrinsics.checkNotNullParameter(uVar, "<this>");
                            String strB = uVar.b();
                            r[] rVarArrValues = r.values();
                            int length = rVarArrValues.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    rVar = rVarArrValues[i22];
                                    if (!a0.z(rVar.name(), strB, true)) {
                                        i22++;
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                rVar = r.UNKNOWN;
                            }
                            arrayList.add(new b1(rVar, uVar.c(), hx7.a.v(uVar.a())));
                        }
                        return arrayList;
                    case 2:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (List) this.f179107b.f179113c.get(e.a(request.f179110a, "REV_POINTS_RATES_MEM_KEY"));
                    default:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        return (List) p.a.j(a1.class, KTypeProjection.INSTANCE, List.class, this.f179107b.f179112b, e.a(request2.f179110a, "REV_POINTS_RATES_STORAGE_KEY"));
                }
            }
        }, new Function2(this) { // from class: jxb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f179109b;

            {
                this.f179109b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        List rates = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f179109b.f179113c.f("REV_POINTS_PLAN_REWARDS_MEM_KEY", rates);
                        return Unit.f186387a;
                    case 1:
                        List rates2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(rates2, "rates");
                        ue0.c cVar = this.f179109b.f179112b;
                        List<b1> list = rates2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (b1 b1Var : list) {
                            Intrinsics.checkNotNullParameter(b1Var, "<this>");
                            arrayList.add(new u(b1Var.f201341a.name(), b1Var.f201342b, hx7.a.A(b1Var.f201343c)));
                        }
                        cVar.G(arrayList, "REV_POINTS_PLAN_REWARDS_STORAGE_KEY", kii.e.o(u.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        d0<List<c0>> revPointsPlanRates = this.f179109b.f179111a.getRevPointsPlanRates(u1.h(request.f179110a, fub.g.f138167a), null);
                        ju0.f fVar = new ju0.f(11, new jt2.d(28));
                        revPointsPlanRates.getClass();
                        ufm.i iVar = new ufm.i(revPointsPlanRates, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        List rates3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rates3, "rates");
                        this.f179109b.f179113c.f(e.a(request2.f179110a, "REV_POINTS_RATES_MEM_KEY"), rates3);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        List rates4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rates4, "rates");
                        this.f179109b.f179112b.G(rates4, e.a(request3.f179110a, "REV_POINTS_RATES_STORAGE_KEY"), kii.e.o(a1.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<hxb.d0>> planRewards = this.f179109b.f179111a.getPlanRewards();
                        ju0.f fVar2 = new ju0.f(12, new jt2.d(29));
                        planRewards.getClass();
                        ufm.i iVar2 = new ufm.i(planRewards, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static String a(f1 f1Var, String str) {
        String strH = u1.h(f1Var, fub.g.f138167a);
        if (strH == null) {
            m70.a.c(t0.f186434a);
            strH = "";
        }
        return str.concat(strH);
    }
}
