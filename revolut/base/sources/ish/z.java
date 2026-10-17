package ish;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements ash.i {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f168299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.d f168300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f168301c;
    public final ConcurrentHashMap d;

    public z(h widgetContentInteractor, r10.d widgetRepositoryProvider) {
        Intrinsics.checkNotNullParameter(widgetContentInteractor, "widgetContentInteractor");
        Intrinsics.checkNotNullParameter(widgetRepositoryProvider, "widgetRepositoryProvider");
        this.f168299a = widgetContentInteractor;
        this.f168300b = widgetRepositoryProvider;
        this.f168301c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (((gsh.n) r6).c(r9, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.widgets.api.dependencies.WidgetContext r6, java.lang.String r7, dsh.e r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ish.n
            if (r0 == 0) goto L13
            r0 = r9
            ish.n r0 = (ish.n) r0
            int r1 = r0.f168273y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168273y = r1
            goto L18
        L13:
            ish.n r0 = new ish.n
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f168271w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168273y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r6 = r0.v
            dsh.i r6 = (dsh.i) r6
            yhm.o.b(r9)
            goto L7b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.String r7 = r0.v
            com.revolut.feature.widgets.api.dependencies.WidgetContext r6 = r0.u
            yhm.o.b(r9)
            goto L5f
        L3e:
            yhm.o.b(r9)
            ish.h r9 = r5.f168299a
            boolean r2 = r9.g(r6, r7)
            if (r2 != 0) goto L4c
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L4c:
            if (r8 != 0) goto L62
            r0.u = r6
            r0.v = r7
            r0.f168273y = r4
            csh.e r8 = r9.e(r6, r7)
            java.lang.Object r9 = r8.b(r7, r0)
            if (r9 != r1) goto L5f
            goto L7a
        L5f:
            r8 = r9
            dsh.e r8 = (dsh.e) r8
        L62:
            dsh.i r9 = new dsh.i
            r9.<init>(r7, r8)
            ish.j r6 = r5.c(r6)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f168273y = r3
            gsh.n r6 = (gsh.n) r6
            java.lang.Object r6 = r6.c(r9, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.z.a(com.revolut.feature.widgets.api.dependencies.WidgetContext, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final l b(WidgetContext widgetContext) {
        Object objPutIfAbsent;
        Class<?> cls = widgetContext.getClass();
        ConcurrentHashMap concurrentHashMap = this.f168301c;
        Object lVar = concurrentHashMap.get(cls);
        if (lVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (lVar = new l()))) != null) {
            lVar = objPutIfAbsent;
        }
        return (l) lVar;
    }

    public final j c(WidgetContext widgetContext) {
        Object objPutIfAbsent;
        Class<?> contextClass = widgetContext.getClass();
        String contextKey = widgetContext.getContextKey();
        Intrinsics.checkNotNullParameter(contextClass, "contextClass");
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        r10.d dVar = this.f168300b;
        hsh.d dVar2 = (hsh.d) dVar.f250818a;
        csh.k dependenciesApi = (csh.k) dVar.f250819b;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
        Intrinsics.checkNotNullParameter(contextClass, "contextClass");
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        ConcurrentHashMap concurrentHashMap = dVar2.e;
        Pair pair = new Pair(contextClass, contextKey);
        Object nVar = concurrentHashMap.get(pair);
        if (nVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, (nVar = new gsh.n(contextClass, contextKey, dVar2.f155059a, new h(dependenciesApi.e(), new r10.f(dependenciesApi.c())), dVar2.f155061c, new hl6.b(dVar2, dependenciesApi, 14), new hq1.f(dependenciesApi, 4))))) != null) {
            nVar = objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(nVar, "getOrPut(...)");
        return (j) nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.widgets.api.dependencies.WidgetContext r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ish.o
            if (r0 == 0) goto L13
            r0 = r8
            ish.o r0 = (ish.o) r0
            int r1 = r0.f168275x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168275x = r1
            goto L18
        L13:
            ish.o r0 = new ish.o
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168275x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L72
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            java.util.concurrent.ConcurrentHashMap r8 = r5.f168301c
            java.lang.Class r2 = r6.getClass()
            java.lang.Object r8 = r8.get(r2)
            ish.l r8 = (ish.l) r8
            if (r8 == 0) goto L54
            fd0.d r8 = r8.f168267b
            java.lang.Object r8 = r8.c(r6)
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            if (r8 == 0) goto L54
            java.lang.Object r8 = r8.get(r7)
            ish.m r8 = (ish.m) r8
            goto L55
        L54:
            r8 = r4
        L55:
            if (r8 == 0) goto L5a
            dsh.p r8 = r8.f168269a
            goto L5b
        L5a:
            r8 = r4
        L5b:
            if (r8 != 0) goto L95
            ish.j r6 = r5.c(r6)
            gsh.n r6 = (gsh.n) r6
            kotlinx.coroutines.flow.Flow r6 = r6.k()
            r0.u = r7
            r0.f168275x = r3
            java.lang.Object r8 = vkm.q.z(r6, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L94
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L7c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L92
            java.lang.Object r8 = r6.next()
            r0 = r8
            dsh.p r0 = (dsh.p) r0
            java.lang.String r0 = r0.f117336a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r7)
            if (r0 == 0) goto L7c
            r4 = r8
        L92:
            dsh.p r4 = (dsh.p) r4
        L94:
            return r4
        L95:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.z.d(com.revolut.feature.widgets.api.dependencies.WidgetContext, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(com.revolut.feature.widgets.api.dependencies.WidgetContext r5, dsh.t r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ish.p
            if (r0 == 0) goto L13
            r0 = r7
            ish.p r0 = (ish.p) r0
            int r1 = r0.f168277x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168277x = r1
            goto L18
        L13:
            ish.p r0 = new ish.p
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168277x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dsh.t r6 = r0.u
            yhm.o.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            ish.j r5 = r4.c(r5)
            gsh.n r5 = (gsh.n) r5
            kotlinx.coroutines.flow.Flow r5 = r5.k()
            r0.u = r6
            r0.f168277x = r3
            java.lang.Object r7 = vkm.q.z(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L6d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r7.iterator()
        L58:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r7.next()
            r1 = r0
            dsh.p r1 = (dsh.p) r1
            dsh.t r1 = r1.d
            if (r1 != r6) goto L58
            r5.add(r0)
            goto L58
        L6d:
            r5 = 0
        L6e:
            if (r5 != 0) goto L72
            zhm.f0 r5 = zhm.f0.f322471a
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.z.e(com.revolut.feature.widgets.api.dependencies.WidgetContext, dsh.t, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.Personal r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ish.q
            if (r0 == 0) goto L13
            r0 = r7
            ish.q r0 = (ish.q) r0
            int r1 = r0.f168279x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168279x = r1
            goto L18
        L13:
            ish.q r0 = new ish.q
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168279x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            ish.j r5 = r4.c(r5)
            gsh.n r5 = (gsh.n) r5
            kotlinx.coroutines.flow.Flow r5 = r5.k()
            r0.u = r6
            r0.f168279x = r3
            java.lang.Object r7 = vkm.q.z(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.util.List r7 = (java.util.List) r7
            r5 = 0
            if (r7 == 0) goto L77
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L5e
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5e
            goto L77
        L5e:
            java.util.Iterator r7 = r7.iterator()
        L62:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r7.next()
            dsh.p r0 = (dsh.p) r0
            java.lang.String r0 = r0.f117337b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r6)
            if (r0 == 0) goto L62
            goto L78
        L77:
            r3 = r5
        L78:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.z.f(com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$Personal, java.lang.String, gim.c):java.lang.Object");
    }

    public final boolean g(WidgetContext widgetContext, String widgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        List listE = ((gsh.n) c(widgetContext)).e();
        if ((listE instanceof Collection) && listE.isEmpty()) {
            return false;
        }
        Iterator it8 = listE.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(widgetType, ((dsh.i) it8.next()).f117323a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0107, code lost:
    
        if (((gsh.n) r1).i(r13, r15, r3) == r4) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.widgets.api.dependencies.WidgetContext r17, int r18, int r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.z.h(com.revolut.feature.widgets.api.dependencies.WidgetContext, int, int, gim.c):java.lang.Object");
    }

    public final void i(WidgetContext widgetContext, String str, m mVar) {
        Object objC;
        fd0.d dVar = b(widgetContext).f168267b;
        synchronized (dVar) {
            objC = dVar.c(widgetContext);
            if (objC == null) {
                objC = new ConcurrentHashMap();
                dVar.d(widgetContext, objC);
            }
        }
        ((ConcurrentHashMap) objC).put(str, mVar);
    }

    public final void j(WidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        gsh.n nVar = (gsh.n) c(widgetContext);
        nVar.f146503m = true;
        nVar.f146501j.mo3647trySendJP2dKIU(Unit.f186387a);
    }

    public final boolean k(WidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Boolean bool = (Boolean) this.d.get(widgetContext.getContextKey());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
