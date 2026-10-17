package gd8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_consent.impl.data.service.JuniorConsentService;
import d9.t0;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements i {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f143098g = new TypeToken<List<? extends ed8.d>>() { // from class: com.revolut.feature.junior_consent.impl.data.repository.JuniorConsentRepositoryImpl$Companion$JUNIOR_CONSENTS_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorConsentService f143099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f143100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f143101c;
    public final kgm.i d;
    public final kgm.i e;
    public final w4l.f f;

    public p(JuniorConsentService service, ne0.j memoryCache, ue0.c storage, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f143099a = service;
        this.f143100b = memoryCache;
        this.f143101c = storage;
        final int i = 0;
        this.d = new kgm.i(new Function1(this) { // from class: gd8.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f143090b;

            {
                this.f143090b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                Object objA;
                int i2 = i;
                p pVar = this.f143090b;
                switch (i2) {
                    case 0:
                        n params = (n) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return ue0.e.L(pVar.f143099a.approveConsent(params.f143093a, params.f143094b), 2L);
                    case 1:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return ue0.e.L(pVar.f143099a.declineConsent(params2.f143093a, params2.f143094b), 2L);
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ad8.d>> consents = pVar.f143099a.getConsents();
                        g9j.v vVar = new g9j.v(new j(0), 24);
                        consents.getClass();
                        ufm.i iVar = new ufm.i(consents, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) pVar.f143100b.get("CACHE_KEY_JUNIOR_CONSENTS");
                    default:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar = pVar.f143101c;
                        Type JUNIOR_CONSENTS_TYPE = p.f143098g;
                        Intrinsics.checkNotNullExpressionValue(JUNIOR_CONSENTS_TYPE, "JUNIOR_CONSENTS_TYPE");
                        List<ed8.d> list = (List) cVar.T2("CACHE_KEY_JUNIOR_CONSENTS", JUNIOR_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        ArrayList arrayList = new ArrayList();
                        for (ed8.d dVar : list) {
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                objA = t0.y(dVar);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                objA = yhm.o.a(th10);
                            }
                            Throwable thA = yhm.m.a(objA);
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            if (objA instanceof yhm.n) {
                                objA = null;
                            }
                            xc8.g gVar = (xc8.g) objA;
                            if (gVar != null) {
                                arrayList.add(gVar);
                            }
                            break;
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this.e = new kgm.i(new Function1(this) { // from class: gd8.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f143090b;

            {
                this.f143090b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                Object objA;
                int i22 = i2;
                p pVar = this.f143090b;
                switch (i22) {
                    case 0:
                        n params = (n) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return ue0.e.L(pVar.f143099a.approveConsent(params.f143093a, params.f143094b), 2L);
                    case 1:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return ue0.e.L(pVar.f143099a.declineConsent(params2.f143093a, params2.f143094b), 2L);
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ad8.d>> consents = pVar.f143099a.getConsents();
                        g9j.v vVar = new g9j.v(new j(0), 24);
                        consents.getClass();
                        ufm.i iVar = new ufm.i(consents, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) pVar.f143100b.get("CACHE_KEY_JUNIOR_CONSENTS");
                    default:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar = pVar.f143101c;
                        Type JUNIOR_CONSENTS_TYPE = p.f143098g;
                        Intrinsics.checkNotNullExpressionValue(JUNIOR_CONSENTS_TYPE, "JUNIOR_CONSENTS_TYPE");
                        List<ed8.d> list = (List) cVar.T2("CACHE_KEY_JUNIOR_CONSENTS", JUNIOR_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        ArrayList arrayList = new ArrayList();
                        for (ed8.d dVar : list) {
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                objA = t0.y(dVar);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                objA = yhm.o.a(th10);
                            }
                            Throwable thA = yhm.m.a(objA);
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            if (objA instanceof yhm.n) {
                                objA = null;
                            }
                            xc8.g gVar = (xc8.g) objA;
                            if (gVar != null) {
                                arrayList.add(gVar);
                            }
                            break;
                        }
                        return arrayList;
                }
            }
        });
        final int i3 = 2;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: gd8.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f143090b;

            {
                this.f143090b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                Object objA;
                int i22 = i3;
                p pVar = this.f143090b;
                switch (i22) {
                    case 0:
                        n params = (n) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return ue0.e.L(pVar.f143099a.approveConsent(params.f143093a, params.f143094b), 2L);
                    case 1:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return ue0.e.L(pVar.f143099a.declineConsent(params2.f143093a, params2.f143094b), 2L);
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ad8.d>> consents = pVar.f143099a.getConsents();
                        g9j.v vVar = new g9j.v(new j(0), 24);
                        consents.getClass();
                        ufm.i iVar = new ufm.i(consents, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) pVar.f143100b.get("CACHE_KEY_JUNIOR_CONSENTS");
                    default:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar = pVar.f143101c;
                        Type JUNIOR_CONSENTS_TYPE = p.f143098g;
                        Intrinsics.checkNotNullExpressionValue(JUNIOR_CONSENTS_TYPE, "JUNIOR_CONSENTS_TYPE");
                        List<ed8.d> list = (List) cVar.T2("CACHE_KEY_JUNIOR_CONSENTS", JUNIOR_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        ArrayList arrayList = new ArrayList();
                        for (ed8.d dVar : list) {
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                objA = t0.y(dVar);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                objA = yhm.o.a(th10);
                            }
                            Throwable thA = yhm.m.a(objA);
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            if (objA instanceof yhm.n) {
                                objA = null;
                            }
                            xc8.g gVar = (xc8.g) objA;
                            if (gVar != null) {
                                arrayList.add(gVar);
                            }
                            break;
                        }
                        return arrayList;
                }
            }
        });
        final int i5 = 3;
        Function1 function1 = new Function1(this) { // from class: gd8.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f143090b;

            {
                this.f143090b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                Object objA;
                int i22 = i5;
                p pVar = this.f143090b;
                switch (i22) {
                    case 0:
                        n params = (n) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return ue0.e.L(pVar.f143099a.approveConsent(params.f143093a, params.f143094b), 2L);
                    case 1:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return ue0.e.L(pVar.f143099a.declineConsent(params2.f143093a, params2.f143094b), 2L);
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ad8.d>> consents = pVar.f143099a.getConsents();
                        g9j.v vVar = new g9j.v(new j(0), 24);
                        consents.getClass();
                        ufm.i iVar = new ufm.i(consents, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) pVar.f143100b.get("CACHE_KEY_JUNIOR_CONSENTS");
                    default:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar = pVar.f143101c;
                        Type JUNIOR_CONSENTS_TYPE = p.f143098g;
                        Intrinsics.checkNotNullExpressionValue(JUNIOR_CONSENTS_TYPE, "JUNIOR_CONSENTS_TYPE");
                        List<ed8.d> list = (List) cVar.T2("CACHE_KEY_JUNIOR_CONSENTS", JUNIOR_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        ArrayList arrayList = new ArrayList();
                        for (ed8.d dVar : list) {
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                objA = t0.y(dVar);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                objA = yhm.o.a(th10);
                            }
                            Throwable thA = yhm.m.a(objA);
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            if (objA instanceof yhm.n) {
                                objA = null;
                            }
                            xc8.g gVar = (xc8.g) objA;
                            if (gVar != null) {
                                arrayList.add(gVar);
                            }
                            break;
                        }
                        return arrayList;
                }
            }
        };
        final int i6 = 0;
        Function2 function2 = new Function2(this) { // from class: gd8.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f143092b;

            {
                this.f143092b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                Object objA;
                int i21 = i6;
                p pVar = this.f143092b;
                Unit unit = (Unit) obj2;
                List<xc8.g> juniorConsents = (List) obj3;
                switch (i21) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(juniorConsents, "juniorConsents");
                        pVar.f143100b.f("CACHE_KEY_JUNIOR_CONSENTS", juniorConsents);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(juniorConsents, "juniorConsents");
                        ue0.c cVar = pVar.f143101c;
                        Intrinsics.checkNotNullParameter(juniorConsents, "<this>");
                        ArrayList arrayList = new ArrayList();
                        for (xc8.g gVar : juniorConsents) {
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                objA = t0.C(gVar);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                objA = yhm.o.a(th10);
                            }
                            Throwable thA = yhm.m.a(objA);
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            if (objA instanceof yhm.n) {
                                objA = null;
                            }
                            ed8.d dVar = (ed8.d) objA;
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                            break;
                        }
                        cVar.G(arrayList, "CACHE_KEY_JUNIOR_CONSENTS", kii.e.o(ed8.d.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        final int i21 = 4;
        Function1 function12 = new Function1(this) { // from class: gd8.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f143090b;

            {
                this.f143090b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                Object objA;
                int i22 = i21;
                p pVar = this.f143090b;
                switch (i22) {
                    case 0:
                        n params = (n) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return ue0.e.L(pVar.f143099a.approveConsent(params.f143093a, params.f143094b), 2L);
                    case 1:
                        n params2 = (n) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return ue0.e.L(pVar.f143099a.declineConsent(params2.f143093a, params2.f143094b), 2L);
                    case 2:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ad8.d>> consents = pVar.f143099a.getConsents();
                        g9j.v vVar = new g9j.v(new j(0), 24);
                        consents.getClass();
                        ufm.i iVar = new ufm.i(consents, vVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) pVar.f143100b.get("CACHE_KEY_JUNIOR_CONSENTS");
                    default:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ue0.c cVar = pVar.f143101c;
                        Type JUNIOR_CONSENTS_TYPE = p.f143098g;
                        Intrinsics.checkNotNullExpressionValue(JUNIOR_CONSENTS_TYPE, "JUNIOR_CONSENTS_TYPE");
                        List<ed8.d> list = (List) cVar.T2("CACHE_KEY_JUNIOR_CONSENTS", JUNIOR_CONSENTS_TYPE);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        ArrayList arrayList = new ArrayList();
                        for (ed8.d dVar : list) {
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                objA = t0.y(dVar);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                objA = yhm.o.a(th10);
                            }
                            Throwable thA = yhm.m.a(objA);
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            if (objA instanceof yhm.n) {
                                objA = null;
                            }
                            xc8.g gVar = (xc8.g) objA;
                            if (gVar != null) {
                                arrayList.add(gVar);
                            }
                            break;
                        }
                        return arrayList;
                }
            }
        };
        final int i22 = 1;
        this.f = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: gd8.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f143092b;

            {
                this.f143092b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                Object objA;
                int i212 = i22;
                p pVar = this.f143092b;
                Unit unit = (Unit) obj2;
                List<xc8.g> juniorConsents = (List) obj3;
                switch (i212) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(juniorConsents, "juniorConsents");
                        pVar.f143100b.f("CACHE_KEY_JUNIOR_CONSENTS", juniorConsents);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(juniorConsents, "juniorConsents");
                        ue0.c cVar = pVar.f143101c;
                        Intrinsics.checkNotNullParameter(juniorConsents, "<this>");
                        ArrayList arrayList = new ArrayList();
                        for (xc8.g gVar : juniorConsents) {
                            try {
                                m.Companion companion = yhm.m.INSTANCE;
                                objA = t0.C(gVar);
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = yhm.m.INSTANCE;
                                objA = yhm.o.a(th10);
                            }
                            Throwable thA = yhm.m.a(objA);
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            if (objA instanceof yhm.n) {
                                objA = null;
                            }
                            ed8.d dVar = (ed8.d) objA;
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                            break;
                        }
                        cVar.G(arrayList, "CACHE_KEY_JUNIOR_CONSENTS", kii.e.o(ed8.d.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final synchronized void a(String str, v6d.a aVar, xc8.a aVar2) {
        try {
            List list = (List) this.f143100b.get("CACHE_KEY_JUNIOR_CONSENTS");
            if (list != null) {
                Iterator it8 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.f(((xc8.g) it8.next()).f304107a, str)) {
                        break;
                    } else {
                        i++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                List listD1 = null;
                if (i == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    xc8.g gVar = (xc8.g) list.get(iIntValue);
                    xc8.c cVar = (xc8.c) gVar.f304108b.get(aVar);
                    if (cVar != null) {
                        xc8.g gVarA = xc8.g.a(gVar, r0.q(gVar.f304108b, new Pair(aVar, xc8.c.a(cVar, aVar2))));
                        ArrayList arrayListF1 = zhm.d0.f1(list);
                        arrayListF1.set(iIntValue, gVarA);
                        listD1 = zhm.d0.d1(arrayListF1);
                    }
                }
                if (listD1 != null) {
                    this.f.k(Unit.f186387a, listD1);
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
