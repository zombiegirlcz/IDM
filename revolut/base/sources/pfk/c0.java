package pfk;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanService;
import gfk.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements y {

    @NotNull
    public static final b0 Companion = new b0();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanService f235623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f235624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f235625c;
    public final w4l.f d;

    static {
        Type type = new TypeToken<List<? extends gfk.k>>() { // from class: com.revolut.retail.feature.pricing_plans.impl.repository.PricingPlanLimitsRepositoryImpl$Companion$PLANS_LIMITS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public c0(PricingPlanService service, xe0.e storage, ne0.j memoryCache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f235623a = service;
        this.f235624b = storage;
        this.f235625c = memoryCache;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: pfk.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f235711b;

            {
                this.f235711b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<gfk.r> plansUsageLimits = this.f235711b.f235623a.getPlansUsageLimits();
                        pfa.c cVar = new pfa.c(new pd4.u(29), 3);
                        plansUsageLimits.getClass();
                        ufm.i iVar = new ufm.i(plansUsageLimits, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235711b.f235625c.get("KEY_PLANS_LIMITS");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) this.f235711b.f235624b.T2("KEY_PLANS_LIMITS", c0.e);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        ArrayList arrayList = new ArrayList();
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            mha.h hVarA = nfk.d.a((gfk.k) it9.next());
                            if (hVarA != null) {
                                arrayList.add(hVarA);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: pfk.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f235711b;

            {
                this.f235711b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<gfk.r> plansUsageLimits = this.f235711b.f235623a.getPlansUsageLimits();
                        pfa.c cVar = new pfa.c(new pd4.u(29), 3);
                        plansUsageLimits.getClass();
                        ufm.i iVar = new ufm.i(plansUsageLimits, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235711b.f235625c.get("KEY_PLANS_LIMITS");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) this.f235711b.f235624b.T2("KEY_PLANS_LIMITS", c0.e);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        ArrayList arrayList = new ArrayList();
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            mha.h hVarA = nfk.d.a((gfk.k) it9.next());
                            if (hVarA != null) {
                                arrayList.add(hVarA);
                            }
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: pfk.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f235620b;

            {
                this.f235620b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object aVar;
                Object cVar;
                Object hVar;
                Unit unit = (Unit) obj2;
                List domain = (List) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f235620b.f235625c.f("KEY_PLANS_LIMITS", domain);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "value");
                        xe0.e eVar = this.f235620b.f235624b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<mha.h> list = domain;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mha.h hVar2 : list) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            if (hVar2 instanceof mha.f) {
                                mha.f fVar = (mha.f) hVar2;
                                cVar = new k.f(fVar.f205448a, fVar.f205449b);
                            } else {
                                if (hVar2 instanceof mha.d) {
                                    mha.d dVar = (mha.d) hVar2;
                                    String str = dVar.f205442a;
                                    String str2 = dVar.f205443b.f306286a;
                                    dj0.d dVar2 = dVar.f205444c;
                                    hVar = new k.d(str, str2, dVar2 != null ? ksj.b.N(dVar2) : null);
                                } else if (hVar2 instanceof mha.g) {
                                    mha.g gVar = (mha.g) hVar2;
                                    String str3 = gVar.f205450a;
                                    String str4 = gVar.f205451b.f306286a;
                                    mha.j jVar = gVar.f205452c;
                                    hVar = new k.h(str3, str4, jVar != null ? ksj.b.J(jVar) : null);
                                } else if (hVar2 instanceof mha.c) {
                                    mha.c cVar2 = (mha.c) hVar2;
                                    String str5 = cVar2.f205439a;
                                    String str6 = cVar2.f205440b.f306286a;
                                    dj0.d dVar3 = cVar2.f205441c;
                                    cVar = new k.c(str5, str6, dVar3 != null ? ksj.b.N(dVar3) : null, ksj.b.J(cVar2.d), ksj.b.J(cVar2.e));
                                } else {
                                    if (hVar2 instanceof mha.b) {
                                        mha.b bVar = (mha.b) hVar2;
                                        aVar = new k.b(bVar.f205436a, bVar.f205437b.f306286a, ksj.b.J(bVar.f205438c), ksj.b.J(bVar.d));
                                    } else if (hVar2 instanceof mha.e) {
                                        mha.e eVar2 = (mha.e) hVar2;
                                        String str7 = eVar2.f205445a;
                                        String str8 = eVar2.f205446b.f306286a;
                                        Long l2 = eVar2.f205447c;
                                        aVar = new k.e(str7, str8, l2 != null ? new gfk.o("QUANTITY", String.valueOf(l2.longValue())) : null, ksj.b.J(eVar2.d));
                                    } else {
                                        if (!(hVar2 instanceof mha.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        mha.a aVar2 = (mha.a) hVar2;
                                        aVar = new k.a(aVar2.f205433a, aVar2.f205434b.f306286a, ksj.b.N(aVar2.f205435c), ksj.b.J(aVar2.d));
                                    }
                                    cVar = aVar;
                                }
                                cVar = hVar;
                            }
                            arrayList.add(cVar);
                        }
                        eVar.G(arrayList, "KEY_PLANS_LIMITS", kii.e.o(gfk.k.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: pfk.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f235711b;

            {
                this.f235711b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<gfk.r> plansUsageLimits = this.f235711b.f235623a.getPlansUsageLimits();
                        pfa.c cVar = new pfa.c(new pd4.u(29), 3);
                        plansUsageLimits.getClass();
                        ufm.i iVar = new ufm.i(plansUsageLimits, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f235711b.f235625c.get("KEY_PLANS_LIMITS");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) this.f235711b.f235624b.T2("KEY_PLANS_LIMITS", c0.e);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        ArrayList arrayList = new ArrayList();
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            mha.h hVarA = nfk.d.a((gfk.k) it9.next());
                            if (hVarA != null) {
                                arrayList.add(hVarA);
                            }
                        }
                        return arrayList;
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: pfk.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f235620b;

            {
                this.f235620b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object aVar;
                Object cVar;
                Object hVar;
                Unit unit = (Unit) obj2;
                List domain = (List) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f235620b.f235625c.f("KEY_PLANS_LIMITS", domain);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "value");
                        xe0.e eVar = this.f235620b.f235624b;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        List<mha.h> list = domain;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mha.h hVar2 : list) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            if (hVar2 instanceof mha.f) {
                                mha.f fVar = (mha.f) hVar2;
                                cVar = new k.f(fVar.f205448a, fVar.f205449b);
                            } else {
                                if (hVar2 instanceof mha.d) {
                                    mha.d dVar = (mha.d) hVar2;
                                    String str = dVar.f205442a;
                                    String str2 = dVar.f205443b.f306286a;
                                    dj0.d dVar2 = dVar.f205444c;
                                    hVar = new k.d(str, str2, dVar2 != null ? ksj.b.N(dVar2) : null);
                                } else if (hVar2 instanceof mha.g) {
                                    mha.g gVar = (mha.g) hVar2;
                                    String str3 = gVar.f205450a;
                                    String str4 = gVar.f205451b.f306286a;
                                    mha.j jVar = gVar.f205452c;
                                    hVar = new k.h(str3, str4, jVar != null ? ksj.b.J(jVar) : null);
                                } else if (hVar2 instanceof mha.c) {
                                    mha.c cVar2 = (mha.c) hVar2;
                                    String str5 = cVar2.f205439a;
                                    String str6 = cVar2.f205440b.f306286a;
                                    dj0.d dVar3 = cVar2.f205441c;
                                    cVar = new k.c(str5, str6, dVar3 != null ? ksj.b.N(dVar3) : null, ksj.b.J(cVar2.d), ksj.b.J(cVar2.e));
                                } else {
                                    if (hVar2 instanceof mha.b) {
                                        mha.b bVar = (mha.b) hVar2;
                                        aVar = new k.b(bVar.f205436a, bVar.f205437b.f306286a, ksj.b.J(bVar.f205438c), ksj.b.J(bVar.d));
                                    } else if (hVar2 instanceof mha.e) {
                                        mha.e eVar2 = (mha.e) hVar2;
                                        String str7 = eVar2.f205445a;
                                        String str8 = eVar2.f205446b.f306286a;
                                        Long l2 = eVar2.f205447c;
                                        aVar = new k.e(str7, str8, l2 != null ? new gfk.o("QUANTITY", String.valueOf(l2.longValue())) : null, ksj.b.J(eVar2.d));
                                    } else {
                                        if (!(hVar2 instanceof mha.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        mha.a aVar2 = (mha.a) hVar2;
                                        aVar = new k.a(aVar2.f205433a, aVar2.f205434b.f306286a, ksj.b.N(aVar2.f205435c), ksj.b.J(aVar2.d));
                                    }
                                    cVar = aVar;
                                }
                                cVar = hVar;
                            }
                            arrayList.add(cVar);
                        }
                        eVar.G(arrayList, "KEY_PLANS_LIMITS", kii.e.o(gfk.k.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
