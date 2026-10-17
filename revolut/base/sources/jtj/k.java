package jtj;

import a31.v;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.impl.income_sorter.network.IncomeSorterService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f178518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsj.a f178519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f178520c;
    public final IncomeSorterService d;
    public final l80.e e;
    public final x4l.c f;

    public k(ue0.c storage, wsj.a dao, ne0.d memoryCache, IncomeSorterService service, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f178518a = storage;
        this.f178519b = dao;
        this.f178520c = memoryCache;
        this.d = service;
        this.e = dateProvider;
        Continuation continuation = null;
        this.f = new x4l.c(new ghl.l(this, continuation, 23), new b(this, 1), new jnf.d(this, 12), new g(this, continuation, 1), new eci.a(3, 26, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(jtj.k r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof jtj.j
            if (r0 == 0) goto L13
            r0 = r6
            jtj.j r0 = (jtj.j) r0
            int r1 = r0.f178517w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178517w = r1
            goto L18
        L13:
            jtj.j r0 = new jtj.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178517w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            r0.f178517w = r3
            java.lang.Object r5 = r4.d(r5, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            wsj.a r4 = r4.f178519b
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = zhm.w.t(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L52:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r4.next()
            ysj.k r6 = (ysj.k) r6
            com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution r6 = kotlin.jvm.internal.s.D(r6)
            r5.add(r6)
            goto L52
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jtj.k.a(jtj.k, java.lang.String, gim.c):java.io.Serializable");
    }

    public final Object b(String str, String str2, etj.d dVar) throws Throwable {
        eed.g gVar = new eed.g(this, str2, str, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, gVar, dVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final Object c(String str, etj.f fVar) throws Throwable {
        e eVar = new e(this, str, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, eVar, fVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // od0.e
    public final void clear() {
        this.f178519b.b();
        this.f178518a.clear();
        this.f178520c.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof jtj.f
            if (r0 == 0) goto L13
            r0 = r11
            jtj.f r0 = (jtj.f) r0
            int r1 = r0.f178515w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178515w = r1
            goto L18
        L13:
            jtj.f r0 = new jtj.f
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178515w
            java.lang.String r3 = "<get-LONG_TYPE>(...)"
            java.lang.String r4 = "LAST_UPDATE_KEY"
            ue0.c r5 = r9.f178518a
            r6 = 1
            if (r2 == 0) goto L35
            if (r2 != r6) goto L2d
            yhm.o.b(r11)
            goto L57
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            yhm.o.b(r11)
            java.lang.reflect.Type r11 = l21.d.f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
            java.lang.Object r11 = r5.T2(r4, r11)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L4a
            long r7 = r11.longValue()
            goto L4c
        L4a:
            r7 = 0
        L4c:
            r0.f178515w = r6
            com.revolut.retail.feature.impl.income_sorter.network.IncomeSorterService r11 = r9.d
            java.lang.Object r11 = r11.getIncomeSorterExecutions(r10, r7, r0)
            if (r11 != r1) goto L57
            return r1
        L57:
            htj.u r11 = (htj.u) r11
            java.util.List r10 = r11.f155443b
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L66:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r10.next()
            htj.r r1 = (htj.r) r1
            com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution r1 = io3.h.z(r1)     // Catch: java.lang.Exception -> L7b
            ysj.k r1 = kotlin.jvm.internal.s.N(r1)     // Catch: java.lang.Exception -> L7b
            goto L87
        L7b:
            r1 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r7 = 0
            rd0.d.a(r6, r7, r7, r1, r2)
            r1 = r7
        L87:
            if (r1 == 0) goto L66
            r0.add(r1)
            goto L66
        L8d:
            wsj.a r10 = r9.f178519b
            r10.insertAll(r0)
            long r10 = r11.f155442a
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r10)
            java.lang.reflect.Type r10 = l21.d.f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
            r5.G(r0, r4, r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jtj.k.d(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object e(String str, String str2, List list, IncomeSorterDestinationId incomeSorterDestinationId, Boolean bool, hzi.a aVar, etj.m mVar) throws Throwable {
        v vVar = new v(this, list, incomeSorterDestinationId, aVar, str2, bool, str, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, vVar, mVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
