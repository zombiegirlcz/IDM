package ayc;

import a0e.o;
import a72.k;
import au6.z0;
import com.revolut.feature.selfserve.entity.config.shared.services.EntityConfigService;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import efm.d0;
import efm.r;
import gr2.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ne0.j;
import okhttp3.RequestBody;
import org.bouncycastle.asn1.BERTags;
import ulm.a1;
import ulm.b1;
import ulm.o1;
import ulm.p1;
import wim.z;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements bal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f11129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityConfigService f11130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f11131c;
    public final sf0.h d;
    public final z9l.h e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f11132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f11133h;

    public i(ue0.c storage, EntityConfigService service, j memoryCache, sf0.h serverErrorParser, z9l.h fincrimeHomeScreenMapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(fincrimeHomeScreenMapper, "fincrimeHomeScreenMapper");
        this.f11129a = storage;
        this.f11130b = service;
        this.f11131c = memoryCache;
        this.d = serverErrorParser;
        this.e = fincrimeHomeScreenMapper;
        Continuation continuation = null;
        final int i = 4;
        int i2 = 18;
        this.f = new x4l.c(new k(this, continuation, 19), new a(this, 6), new Function2(this) { // from class: ayc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f11123b;

            {
                this.f11123b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List<String> ticketIds = (List) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(ticketIds, "ticketIds");
                        Intrinsics.checkNotNullParameter(data, "data");
                        i iVar = this.f11123b;
                        iVar.getClass();
                        List list = data;
                        int iB = q0.b(w.t(list, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        Iterator it8 = list.iterator();
                        while (true) {
                            String str = null;
                            if (!it8.hasNext()) {
                                for (String str2 : ticketIds) {
                                    e eVar = (e) linkedHashMap.get(str2);
                                    if (eVar == null) {
                                        eVar = new e(null);
                                    }
                                    iVar.f11131c.f(str2, eVar);
                                }
                            } else {
                                Object next = it8.next();
                                y yVar = ((e) next).f11125a;
                                if (yVar != null) {
                                    str = yVar.f145881m;
                                }
                                linkedHashMap.put(str, next);
                            }
                            break;
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String param = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        d0<y> sectionsForTransactionChargeback = this.f11123b.f11130b.getSectionsForTransactionChargeback(param);
                        z0 z0Var = new z0(new ax9.a(19), 21);
                        sectionsForTransactionChargeback.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.i(sectionsForTransactionChargeback, z0Var, 1), new z0(new ax9.a(20), 22), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                        break;
                    case 2:
                        String param2 = (String) obj2;
                        e wrapper = (e) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                        this.f11123b.f11131c.f("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY" + param2, wrapper);
                        break;
                    case 3:
                        String params = (String) obj2;
                        e data2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f11123b.f11129a.G(data2, j6.a.q("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY", params), z.d(o0.b(e.class)));
                        break;
                    default:
                        EntityConfigRepository$Params params2 = (EntityConfigRepository$Params) obj2;
                        y dto = (y) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        this.f11123b.f11131c.f(i.d(params2), new e(dto));
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, 1), new o(this, continuation, i2));
        k kVar = new k(this, continuation, i2);
        final int i3 = 0;
        this.f11132g = new x4l.c(kVar, new a(this, i3), new Function2(this) { // from class: ayc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f11123b;

            {
                this.f11123b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List<String> ticketIds = (List) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(ticketIds, "ticketIds");
                        Intrinsics.checkNotNullParameter(data, "data");
                        i iVar = this.f11123b;
                        iVar.getClass();
                        List list = data;
                        int iB = q0.b(w.t(list, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        Iterator it8 = list.iterator();
                        while (true) {
                            String str = null;
                            if (!it8.hasNext()) {
                                for (String str2 : ticketIds) {
                                    e eVar = (e) linkedHashMap.get(str2);
                                    if (eVar == null) {
                                        eVar = new e(null);
                                    }
                                    iVar.f11131c.f(str2, eVar);
                                }
                            } else {
                                Object next = it8.next();
                                y yVar = ((e) next).f11125a;
                                if (yVar != null) {
                                    str = yVar.f145881m;
                                }
                                linkedHashMap.put(str, next);
                            }
                            break;
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String param = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        d0<y> sectionsForTransactionChargeback = this.f11123b.f11130b.getSectionsForTransactionChargeback(param);
                        z0 z0Var = new z0(new ax9.a(19), 21);
                        sectionsForTransactionChargeback.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.i(sectionsForTransactionChargeback, z0Var, 1), new z0(new ax9.a(20), 22), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                        break;
                    case 2:
                        String param2 = (String) obj2;
                        e wrapper = (e) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                        this.f11123b.f11131c.f("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY" + param2, wrapper);
                        break;
                    case 3:
                        String params = (String) obj2;
                        e data2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f11123b.f11129a.G(data2, j6.a.q("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY", params), z.d(o0.b(e.class)));
                        break;
                    default:
                        EntityConfigRepository$Params params2 = (EntityConfigRepository$Params) obj2;
                        y dto = (y) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        this.f11123b.f11131c.f(i.d(params2), new e(dto));
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, i3), new o(this, continuation, 17));
        final int i5 = 1;
        Function2 function2 = new Function2(this) { // from class: ayc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f11123b;

            {
                this.f11123b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        List<String> ticketIds = (List) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(ticketIds, "ticketIds");
                        Intrinsics.checkNotNullParameter(data, "data");
                        i iVar = this.f11123b;
                        iVar.getClass();
                        List list = data;
                        int iB = q0.b(w.t(list, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        Iterator it8 = list.iterator();
                        while (true) {
                            String str = null;
                            if (!it8.hasNext()) {
                                for (String str2 : ticketIds) {
                                    e eVar = (e) linkedHashMap.get(str2);
                                    if (eVar == null) {
                                        eVar = new e(null);
                                    }
                                    iVar.f11131c.f(str2, eVar);
                                }
                            } else {
                                Object next = it8.next();
                                y yVar = ((e) next).f11125a;
                                if (yVar != null) {
                                    str = yVar.f145881m;
                                }
                                linkedHashMap.put(str, next);
                            }
                            break;
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String param = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        d0<y> sectionsForTransactionChargeback = this.f11123b.f11130b.getSectionsForTransactionChargeback(param);
                        z0 z0Var = new z0(new ax9.a(19), 21);
                        sectionsForTransactionChargeback.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.i(sectionsForTransactionChargeback, z0Var, 1), new z0(new ax9.a(20), 22), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                        break;
                    case 2:
                        String param2 = (String) obj2;
                        e wrapper = (e) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                        this.f11123b.f11131c.f("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY" + param2, wrapper);
                        break;
                    case 3:
                        String params = (String) obj2;
                        e data2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f11123b.f11129a.G(data2, j6.a.q("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY", params), z.d(o0.b(e.class)));
                        break;
                    default:
                        EntityConfigRepository$Params params2 = (EntityConfigRepository$Params) obj2;
                        y dto = (y) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        this.f11123b.f11131c.f(i.d(params2), new e(dto));
                        break;
                }
                return Unit.f186387a;
            }
        };
        a aVar = new a(this, i5);
        final int i6 = 2;
        Function2 function22 = new Function2(this) { // from class: ayc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f11123b;

            {
                this.f11123b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        List<String> ticketIds = (List) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(ticketIds, "ticketIds");
                        Intrinsics.checkNotNullParameter(data, "data");
                        i iVar = this.f11123b;
                        iVar.getClass();
                        List list = data;
                        int iB = q0.b(w.t(list, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        Iterator it8 = list.iterator();
                        while (true) {
                            String str = null;
                            if (!it8.hasNext()) {
                                for (String str2 : ticketIds) {
                                    e eVar = (e) linkedHashMap.get(str2);
                                    if (eVar == null) {
                                        eVar = new e(null);
                                    }
                                    iVar.f11131c.f(str2, eVar);
                                }
                            } else {
                                Object next = it8.next();
                                y yVar = ((e) next).f11125a;
                                if (yVar != null) {
                                    str = yVar.f145881m;
                                }
                                linkedHashMap.put(str, next);
                            }
                            break;
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String param = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        d0<y> sectionsForTransactionChargeback = this.f11123b.f11130b.getSectionsForTransactionChargeback(param);
                        z0 z0Var = new z0(new ax9.a(19), 21);
                        sectionsForTransactionChargeback.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.i(sectionsForTransactionChargeback, z0Var, 1), new z0(new ax9.a(20), 22), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                        break;
                    case 2:
                        String param2 = (String) obj2;
                        e wrapper = (e) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                        this.f11123b.f11131c.f("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY" + param2, wrapper);
                        break;
                    case 3:
                        String params = (String) obj2;
                        e data2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f11123b.f11129a.G(data2, j6.a.q("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY", params), z.d(o0.b(e.class)));
                        break;
                    default:
                        EntityConfigRepository$Params params2 = (EntityConfigRepository$Params) obj2;
                        y dto = (y) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        this.f11123b.f11131c.f(i.d(params2), new e(dto));
                        break;
                }
                return Unit.f186387a;
            }
        };
        a aVar2 = new a(this, i6);
        final int i21 = 3;
        this.f11133h = new w4l.f(function2, aVar, function22, aVar2, new Function2(this) { // from class: ayc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f11123b;

            {
                this.f11123b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        List<String> ticketIds = (List) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(ticketIds, "ticketIds");
                        Intrinsics.checkNotNullParameter(data, "data");
                        i iVar = this.f11123b;
                        iVar.getClass();
                        List list = data;
                        int iB = q0.b(w.t(list, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        Iterator it8 = list.iterator();
                        while (true) {
                            String str = null;
                            if (!it8.hasNext()) {
                                for (String str2 : ticketIds) {
                                    e eVar = (e) linkedHashMap.get(str2);
                                    if (eVar == null) {
                                        eVar = new e(null);
                                    }
                                    iVar.f11131c.f(str2, eVar);
                                }
                            } else {
                                Object next = it8.next();
                                y yVar = ((e) next).f11125a;
                                if (yVar != null) {
                                    str = yVar.f145881m;
                                }
                                linkedHashMap.put(str, next);
                            }
                            break;
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String param = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        d0<y> sectionsForTransactionChargeback = this.f11123b.f11130b.getSectionsForTransactionChargeback(param);
                        z0 z0Var = new z0(new ax9.a(19), 21);
                        sectionsForTransactionChargeback.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.i(sectionsForTransactionChargeback, z0Var, 1), new z0(new ax9.a(20), 22), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                        break;
                    case 2:
                        String param2 = (String) obj2;
                        e wrapper = (e) obj3;
                        Intrinsics.checkNotNullParameter(param2, "param");
                        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                        this.f11123b.f11131c.f("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY" + param2, wrapper);
                        break;
                    case 3:
                        String params = (String) obj2;
                        e data2 = (e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f11123b.f11129a.G(data2, j6.a.q("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY", params), z.d(o0.b(e.class)));
                        break;
                    default:
                        EntityConfigRepository$Params params2 = (EntityConfigRepository$Params) obj2;
                        y dto = (y) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        this.f11123b.f11131c.f(i.d(params2), new e(dto));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r8 == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ayc.i r6, com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params r7, gim.c r8) throws java.lang.Exception {
        /*
            com.revolut.feature.selfserve.entity.config.shared.services.EntityConfigService r0 = r6.f11130b
            boolean r1 = r8 instanceof ayc.h
            if (r1 == 0) goto L15
            r1 = r8
            ayc.h r1 = (ayc.h) r1
            int r2 = r1.f11128w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f11128w = r2
            goto L1a
        L15:
            ayc.h r1 = new ayc.h
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f11128w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2c
            goto L67
        L2c:
            r7 = move-exception
            goto L70
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2c
            goto L53
        L3a:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params.Config     // Catch: java.lang.Exception -> L2c
            if (r8 == 0) goto L56
            r8 = r7
            com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params$Config r8 = (com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params.Config) r8     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = r8.f104892a     // Catch: java.lang.Exception -> L2c
            com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params$Config r7 = (com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params.Config) r7     // Catch: java.lang.Exception -> L2c
            java.util.Map r7 = r7.f104893b     // Catch: java.lang.Exception -> L2c
            r1.f11128w = r5     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = r0.getEntityConfigByFlow(r8, r7, r1)     // Catch: java.lang.Exception -> L2c
            if (r8 != r2) goto L53
            goto L66
        L53:
            gr2.y r8 = (gr2.y) r8     // Catch: java.lang.Exception -> L2c
            return r8
        L56:
            boolean r8 = r7 instanceof com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params.Ticket     // Catch: java.lang.Exception -> L2c
            if (r8 == 0) goto L6a
            com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params$Ticket r7 = (com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params.Ticket) r7     // Catch: java.lang.Exception -> L2c
            java.lang.String r7 = r7.f104894a     // Catch: java.lang.Exception -> L2c
            r1.f11128w = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = r0.getEntityConfigByTicket(r7, r1)     // Catch: java.lang.Exception -> L2c
            if (r8 != r2) goto L67
        L66:
            return r2
        L67:
            gr2.y r8 = (gr2.y) r8     // Catch: java.lang.Exception -> L2c
            return r8
        L6a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2c
            r7.<init>()     // Catch: java.lang.Exception -> L2c
            throw r7     // Catch: java.lang.Exception -> L2c
        L70:
            sf0.h r6 = r6.d
            com.revolut.core.error.data.model.ServerError r6 = r6.a(r7)
            if (r6 == 0) goto L80
            int r6 = r6.f51362a
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r6)
            goto L81
        L80:
            r8 = 0
        L81:
            if (r8 != 0) goto L84
            goto L8c
        L84:
            int r6 = r8.intValue()
            r0 = 20002(0x4e22, float:2.8029E-41)
            if (r6 == r0) goto L99
        L8c:
            if (r8 == 0) goto L9b
            int r6 = r8.intValue()
            r8 = 20005(0x4e25, float:2.8033E-41)
            if (r6 != r8) goto L9b
            com.revolut.feature.be_driven_design.models.exception.AccountCantBeClosedException r7 = com.revolut.feature.be_driven_design.models.exception.AccountCantBeClosedException.f64201a
            goto L9b
        L99:
            com.revolut.feature.be_driven_design.models.exception.NoActionsToBePerformedException r7 = com.revolut.feature.be_driven_design.models.exception.NoActionsToBePerformedException.f64202a
        L9b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ayc.i.a(ayc.i, com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params, gim.c):java.lang.Object");
    }

    public static o1 c(String str) {
        p1 p1Var = RequestBody.Companion;
        if (str == null) {
            str = "";
        }
        b1.Companion.getClass();
        b1 b1VarB = a1.b("application/json");
        p1Var.getClass();
        return p1.b(str, b1VarB);
    }

    public static String d(EntityConfigRepository$Params entityConfigRepository$Params) {
        if (!(entityConfigRepository$Params instanceof EntityConfigRepository$Params.Config)) {
            if (entityConfigRepository$Params instanceof EntityConfigRepository$Params.Ticket) {
                return ((EntityConfigRepository$Params.Ticket) entityConfigRepository$Params).f104894a;
            }
            throw new NoWhenBranchMatchedException();
        }
        EntityConfigRepository$Params.Config config = (EntityConfigRepository$Params.Config) entityConfigRepository$Params;
        return config.f104892a + config.f104893b;
    }

    public final r b(EntityConfigRepository$Params params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.k loadingStrategy = z ? w4l.i.f294643c : w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.c(nim.a.v(this.f.b(params, loadingStrategy), new a(this, 4)), kotlin.coroutines.g.f186406a);
    }
}
