package aem;

import io.ktor.client.engine.HttpClientEngine;
import io.ktor.http.UnsafeHeaderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.slf4j.Logger;
import skm.c2;

/* JADX INFO: loaded from: classes23.dex */
public final class d1 extends gim.i implements Function3 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u = 0;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3710x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3711y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Long l2, Long l3, Long l4, Continuation continuation) {
        super(3, continuation);
        this.f3711y = l2;
        this.z = l3;
        this.A = l4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                d1 d1Var = new d1((Long) this.f3711y, (Long) this.z, (Long) this.A, (Continuation) obj4);
                d1Var.v = (bem.i) obj2;
                d1Var.f3710x = (fem.d) obj3;
                return d1Var.invokeSuspend(Unit.f186387a);
            default:
                d1 d1Var2 = new d1((vdm.b) this.z, (HttpClientEngine) this.A, (Continuation) obj4);
                d1Var2.f3710x = (sem.f) obj2;
                d1Var2.f3711y = obj3;
                return d1Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        KType kTypeB;
        fem.e requestData;
        Object objO5;
        KType kTypeB2;
        int i = this.u;
        Object obj3 = this.z;
        Object obj4 = this.A;
        switch (i) {
            case 0:
                Long l2 = (Long) obj4;
                Long l3 = (Long) obj3;
                Long l4 = (Long) this.f3711y;
                bem.i iVar = (bem.i) this.v;
                fem.d dVar = (fem.d) this.f3710x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f3709w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Logger logger = e1.f3713a;
                kem.k0 k0Var = dVar.f134657a;
                oem.e eVar = dVar.f;
                kem.n0 n0VarD = k0Var.d();
                Intrinsics.checkNotNullParameter(n0VarD, "<this>");
                boolean z = (Intrinsics.f(n0VarD.f183217a, "ws") || Intrinsics.f(n0VarD.f183217a, "wss")) ? false : true;
                z0 key = z0.f3801a;
                Intrinsics.checkNotNullParameter(key, "key");
                oem.a aVar2 = ydm.f.f312720a;
                Map map = (Map) eVar.d(aVar2);
                b1 capability = (b1) (map != null ? map.get(key) : null);
                if (capability == null && ((z && l4 != null) || l3 != null || l2 != null)) {
                    capability = new b1();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(capability, "capability");
                    ((Map) eVar.a(aVar2, new v(19))).put(key, capability);
                }
                if (capability != null) {
                    Long l5 = capability.f3696b;
                    if (l5 != null) {
                        l3 = l5;
                    }
                    b1.a(l3);
                    capability.f3696b = l3;
                    Long l22 = capability.f3697c;
                    if (l22 != null) {
                        l2 = l22;
                    }
                    b1.a(l2);
                    capability.f3697c = l2;
                    if (z) {
                        Long l31 = capability.f3695a;
                        if (l31 != null) {
                            l4 = l31;
                        }
                        b1.a(l4);
                        capability.f3695a = l4;
                        if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                            dVar.e.k(new q(skm.e0.C(iVar, new skm.b0("request-timeout"), null, new r(l4, dVar, dVar.e, (Continuation) null), 2), 3));
                        }
                    }
                }
                this.v = null;
                this.f3710x = null;
                this.f3709w = 1;
                Object objA = iVar.f14889a.a(dVar, this);
                return objA == aVar ? aVar : objA;
            default:
                HttpClientEngine httpClientEngine = (HttpClientEngine) obj4;
                vdm.b client = (vdm.b) obj3;
                jem.b bVar = client.i;
                sem.f fVar = (sem.f) this.f3710x;
                Object obj5 = this.f3711y;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f3709w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    fem.d dVar2 = new fem.d();
                    dVar2.b((fem.d) fVar.f262233a);
                    if (obj5 == null) {
                        nem.a aVar4 = nem.a.f214640a;
                        Intrinsics.checkNotNullParameter(aVar4, "<set-?>");
                        dVar2.d = aVar4;
                        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(Object.class);
                        try {
                            kTypeB2 = kotlin.jvm.internal.o0.b(Object.class);
                        } catch (Throwable unused) {
                            kTypeB2 = null;
                        }
                        dVar2.a(new tem.a(kClassB, kTypeB2));
                    } else if (obj5 instanceof nem.c) {
                        Intrinsics.checkNotNullParameter(obj5, "<set-?>");
                        dVar2.d = obj5;
                        dVar2.a(null);
                    } else {
                        Intrinsics.checkNotNullParameter(obj5, "<set-?>");
                        dVar2.d = obj5;
                        KClass kClassB2 = kotlin.jvm.internal.o0.f186429a.b(Object.class);
                        try {
                            kTypeB = kotlin.jvm.internal.o0.b(Object.class);
                        } catch (Throwable unused2) {
                            kTypeB = null;
                        }
                        dVar2.a(new tem.a(kClassB2, kTypeB));
                    }
                    bVar.c(iem.a.f160831b);
                    kem.q0 q0VarB = dVar2.f134657a.b();
                    kem.y yVar = dVar2.f134658b;
                    kem.t tVarJ = dVar2.f134659c.j();
                    Object obj6 = dVar2.d;
                    nem.c cVar = obj6 instanceof nem.c ? (nem.c) obj6 : null;
                    if (cVar == null) {
                        throw new IllegalStateException(("No request transformation found: " + dVar2.d).toString());
                    }
                    c2 c2Var = dVar2.e;
                    oem.e eVar2 = dVar2.f;
                    requestData = new fem.e(q0VarB, yVar, tVarJ, cVar, c2Var, eVar2);
                    eVar2.e(ydm.g.f312722b, client.f288083j);
                    Set setKeySet = tVarJ.f224675b.keySet();
                    Intrinsics.checkNotNullParameter(setKeySet, "<this>");
                    Set setUnmodifiableSet = Collections.unmodifiableSet(setKeySet);
                    Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : setUnmodifiableSet) {
                        if (kem.u.f183239a.contains((String) obj7)) {
                            arrayList.add(obj7);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        String header = arrayList.toString();
                        Intrinsics.checkNotNullParameter(header, "header");
                        throw new UnsafeHeaderException("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
                    }
                    httpClientEngine.getClass();
                    for (ydm.e eVar3 : requestData.f134663g) {
                        if (!httpClientEngine.N3().contains(eVar3)) {
                            throw new IllegalArgumentException(("Engine doesn't support " + eVar3).toString());
                        }
                    }
                    this.f3710x = fVar;
                    this.f3711y = null;
                    this.v = requestData;
                    this.f3709w = 1;
                    objO5 = HttpClientEngine.O5(httpClientEngine, requestData, this);
                    if (objO5 == aVar3) {
                        return aVar3;
                    }
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    fem.e eVar4 = (fem.e) this.v;
                    yhm.o.b(obj2);
                    requestData = eVar4;
                    objO5 = obj2;
                }
                fem.h responseData = (fem.h) objO5;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(requestData, "requestData");
                Intrinsics.checkNotNullParameter(responseData, "responseData");
                wdm.f fVar2 = new wdm.f(client);
                fem.a aVar5 = new fem.a(fVar2, requestData);
                Intrinsics.checkNotNullParameter(aVar5, "<set-?>");
                fVar2.f296602b = aVar5;
                hem.a aVar6 = new hem.a(fVar2, responseData);
                Intrinsics.checkNotNullParameter(aVar6, "<set-?>");
                fVar2.f296603c = aVar6;
                oem.e attributes = fVar2.getAttributes();
                oem.a key2 = wdm.f.e;
                attributes.getClass();
                Intrinsics.checkNotNullParameter(key2, "key");
                attributes.c().remove(key2);
                Object obj8 = responseData.e;
                if (!(obj8 instanceof io.ktor.utils.io.t)) {
                    fVar2.getAttributes().e(key2, obj8);
                }
                hem.c cVarD = fVar2.d();
                bVar.c(iem.a.f160832c);
                skm.e0.t(cVarD.getF100596a()).k(new q(client, cVarD));
                this.f3710x = null;
                this.f3711y = null;
                this.v = null;
                this.f3709w = 2;
                if (fVar.d(fVar2, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(vdm.b bVar, HttpClientEngine httpClientEngine, Continuation continuation) {
        super(3, continuation);
        this.z = bVar;
        this.A = httpClientEngine;
    }
}
