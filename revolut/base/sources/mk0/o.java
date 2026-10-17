package mk0;

import com.revolut.data.model.Data;
import hy1.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import mh4.x;
import mk0.r;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.y;
import vkm.z1;
import wim.z;
import yhm.m;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class o implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f206164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f206165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f206166c;
    public final CoroutineScope d;
    public final hlm.c e;
    public final z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f206167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f206168h;
    public final e0m.b i;

    public o(d4m.a service, ue0.c localStorage, ne0.j activatedEntries, CoroutineScope scope, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(activatedEntries, "activatedEntries");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f206164a = service;
        this.f206165b = localStorage;
        this.f206166c = activatedEntries;
        this.d = scope;
        this.e = hlm.d.a();
        this.f = ta6.a.a(0);
        this.f206167g = new AtomicBoolean(false);
        this.f206168h = vkm.q.c(r.a.f206170a);
        this.i = new e0m.b(new ite.d(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(mk0.o r12, gim.c r13) throws java.lang.Exception {
        /*
            ue0.c r1 = r12.f206165b
            boolean r0 = r13 instanceof mk0.c
            if (r0 == 0) goto L15
            r0 = r13
            mk0.c r0 = (mk0.c) r0
            int r2 = r0.f206139w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.f206139w = r2
            goto L1a
        L15:
            mk0.c r0 = new mk0.c
            r0.<init>(r12, r13)
        L1a:
            java.lang.Object r13 = r0.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.f206139w
            java.lang.Class r4 = java.lang.Long.TYPE
            java.lang.String r5 = "KEY_LAST_REMOTE_UPDATE_TIME_MILLIS"
            r6 = 1
            if (r3 == 0) goto L39
            if (r3 != r6) goto L31
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L2d
            goto L53
        L2d:
            r0 = move-exception
            r12 = r0
            r9 = r12
            goto L56
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            yhm.o.b(r13)
            d4m.a r12 = r12.f206164a     // Catch: java.lang.Exception -> L2d
            java.lang.Object r12 = r12.get()     // Catch: java.lang.Exception -> L2d
            com.revolut.core.personalisation.data.network.PersonalisationService r12 = (com.revolut.core.personalisation.data.network.PersonalisationService) r12     // Catch: java.lang.Exception -> L2d
            java.lang.Object r13 = r1.T2(r5, r4)     // Catch: java.lang.Exception -> L2d
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.Exception -> L2d
            r0.f206139w = r6     // Catch: java.lang.Exception -> L2d
            java.lang.Object r13 = r12.getAll(r13, r0)     // Catch: java.lang.Exception -> L2d
            if (r13 != r2) goto L53
            return r2
        L53:
            pk0.a r13 = (pk0.a) r13     // Catch: java.lang.Exception -> L2d
            goto La2
        L56:
            boolean r12 = r9 instanceof retrofit2.HttpException
            r13 = 404(0x194, float:5.66E-43)
            if (r12 == 0) goto L66
            r0 = r9
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            int r0 = r0.code()
            if (r0 != r13) goto L7c
            goto L95
        L66:
            boolean r0 = r9 instanceof com.revolut.core.error.data.model.ServerErrorException
            if (r0 == 0) goto L7c
            r0 = r9
            com.revolut.core.error.data.model.ServerErrorException r0 = (com.revolut.core.error.data.model.ServerErrorException) r0
            int r2 = r0.e
            if (r2 == r13) goto L95
            com.revolut.core.error.data.model.ServerError r13 = r0.f
            int r13 = r13.getF51362a()
            r0 = 3006(0xbbe, float:4.212E-42)
            if (r13 != r0) goto L7c
            goto L95
        L7c:
            r13 = 304(0x130, float:4.26E-43)
            if (r12 == 0) goto L8a
            r12 = r9
            retrofit2.HttpException r12 = (retrofit2.HttpException) r12
            int r12 = r12.code()
            if (r12 != r13) goto Lae
            goto L95
        L8a:
            boolean r12 = r9 instanceof com.revolut.core.error.data.model.ServerErrorException
            if (r12 == 0) goto Lae
            r12 = r9
            com.revolut.core.error.data.model.ServerErrorException r12 = (com.revolut.core.error.data.model.ServerErrorException) r12
            int r12 = r12.e
            if (r12 != r13) goto Lae
        L95:
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r6 = rd0.c.VERBOSE
            r10 = 0
            r11 = 16
            r7 = 0
            r8 = 0
            rd0.d.b(r6, r7, r8, r9, r10, r11)
            r13 = 0
        La2:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.mlkit_vision_face.a.B(r4, r1, r5, r12)
            return r13
        Lae:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mk0.o.k(mk0.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r10.p(r2, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(mk0.o r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof mk0.n
            if (r0 == 0) goto L13
            r0 = r11
            mk0.n r0 = (mk0.n) r0
            int r1 = r0.f206163x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206163x = r1
            goto L18
        L13:
            mk0.n r0 = new mk0.n
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f206163x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r11)
            goto Lc3
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.util.ArrayList r2 = r0.u
            yhm.o.b(r11)
            goto Lb7
        L3a:
            yhm.o.b(r11)
            java.util.List r11 = r10.o()
            if (r11 != 0) goto L45
            zhm.f0 r11 = zhm.f0.f322471a
        L45:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r5 = r11.hasNext()
            java.lang.String r6 = "<this>"
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r11.next()
            r7 = r5
            qk0.b r7 = (qk0.b) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            java.lang.Long r6 = r7.f246930c
            if (r6 != 0) goto L67
            goto L50
        L67:
            r2.add(r5)
            goto L50
        L6b:
            java.util.ArrayList r11 = new java.util.ArrayList
            r5 = 10
            int r5 = zhm.w.t(r2, r5)
            r11.<init>(r5)
            java.util.Iterator r5 = r2.iterator()
        L7a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L96
            java.lang.Object r7 = r5.next()
            qk0.b r7 = (qk0.b) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            pk0.b r8 = new pk0.b
            java.lang.String r9 = r7.f246928a
            java.lang.Object r7 = r7.f246929b
            r8.<init>(r9, r7)
            r11.add(r8)
            goto L7a
        L96:
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto L9f
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L9f:
            d4m.a r5 = r10.f206164a
            java.lang.Object r5 = r5.get()
            com.revolut.core.personalisation.data.network.PersonalisationService r5 = (com.revolut.core.personalisation.data.network.PersonalisationService) r5
            pk0.a r6 = new pk0.a
            r6.<init>(r11)
            r0.u = r2
            r0.f206163x = r4
            java.lang.Object r11 = r5.putValues(r6, r0)
            if (r11 != r1) goto Lb7
            goto Lc2
        Lb7:
            r11 = 0
            r0.u = r11
            r0.f206163x = r3
            java.lang.Object r10 = r10.p(r2, r0)
            if (r10 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mk0.o.l(mk0.o, gim.c):java.lang.Object");
    }

    public static final Data m(o oVar, r rVar, tk0.g gVar) {
        Object objA = oVar.a(gVar);
        return objA != null ? zi0.c.P(objA, rVar instanceof r.a, null, 2) : rVar instanceof q ? new Data(null, ((q) rVar).f206169a, false, 5, null) : rVar instanceof r.a ? new Data(null, null, true, 3, null) : rVar instanceof r.b ? new Data(null, null, false, 7, null) : new Data(null, null, false, 7, null);
    }

    public static final List n(o oVar, ArrayList arrayList) {
        List listO = oVar.o();
        if (listO == null) {
            listO = f0.f322471a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listO) {
            qk0.b bVar = (qk0.b) obj2;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            if (bVar.f246930c != null) {
                arrayList2.add(obj2);
            }
        }
        List listQ = l9.l.q(arrayList, arrayList2, new x(25));
        if (listO.size() == listQ.size() && listO.containsAll(listQ)) {
            return listQ;
        }
        oVar.r(listQ);
        return listQ;
    }

    @Override // mk0.a
    public final Object a(tk0.g key) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        sk0.b bVar = (sk0.b) this.f206166c.get(key.getId());
        if (bVar == null) {
            return null;
        }
        if (bVar.a(key)) {
            Object obj2 = bVar.f263748b;
            Intrinsics.i(obj2, "null cannot be cast to non-null type T of com.revolut.core.personalisation.PersonalisationStorageImpl.get");
            return obj2;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            throw new IllegalArgumentException("Got incorrect type for " + key.getId() + " key");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            Throwable thA = yhm.m.a(yhm.o.a(th10));
            if (thA == null) {
                return null;
            }
            hx7.e.n(thA);
            return null;
        }
    }

    @Override // mk0.p
    public final Object b(gim.i iVar) throws Throwable {
        m mVar = new m(this, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, mVar, iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // mk0.a
    public final Object c(ArrayList arrayList, gim.i iVar) {
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            tk0.a aVar = (tk0.a) it8.next();
            tk0.g gVarA = aVar.a();
            Object objB = aVar.b();
            sk0.b.Companion.getClass();
            arrayList2.add(sk0.a.a(gVarA, objB));
        }
        Object objQ = q(arrayList2, true, iVar);
        return objQ == fim.a.COROUTINE_SUSPENDED ? objQ : Unit.f186387a;
    }

    @Override // mk0.a
    public final uk0.a d(uk0.b modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return new uk0.a(this, modifier);
    }

    @Override // mk0.a
    public final Object e(tk0.g gVar, Object obj2, Continuation continuation) {
        sk0.b.Companion.getClass();
        Object objQ = q(u.c(sk0.a.a(gVar, obj2)), true, continuation);
        return objQ == fim.a.COROUTINE_SUSPENDED ? objQ : Unit.f186387a;
    }

    @Override // mk0.a
    public final Flow f(tk0.g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return vkm.q.q(new y(new clm.k(this, key, (Continuation) null, 2), new k(vkm.q.J(new akg.n(this.f, key, 4), this.f206168h), this, key)));
    }

    @Override // mk0.a
    public final void g(tk0.g key, Serializable value) throws Throwable {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        sk0.b.Companion.getClass();
        e0.E(kotlin.coroutines.g.f186406a, new mhd.p0(this, sk0.a.a(key, value), null, 3));
    }

    @Override // mk0.a
    public final Object h(tk0.g key) throws Throwable {
        Object next;
        Intrinsics.checkNotNullParameter(key, "key");
        List listO = o();
        if (listO != null) {
            List<qk0.b> list = listO;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (qk0.b bVar : list) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList.add(new sk0.b(bVar.f246928a, bVar.f246929b));
            }
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(key.getId(), ((sk0.b) next).f263747a)) {
                    break;
                }
            }
            sk0.b bVar2 = (sk0.b) next;
            if (bVar2 != null) {
                if (bVar2.a(key)) {
                    Object obj2 = bVar2.f263748b;
                    Intrinsics.i(obj2, "null cannot be cast to non-null type T of com.revolut.core.personalisation.PersonalisationStorageImpl.getLocal");
                    return obj2;
                }
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    throw new IllegalArgumentException("Got incorrect type for " + key.getId() + " key");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    Throwable thA = yhm.m.a(yhm.o.a(th10));
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                }
            }
        }
        return null;
    }

    @Override // mk0.p
    public final Object i(gim.i iVar) {
        if (((Long) this.f206165b.T2("KEY_LAST_REMOTE_UPDATE_TIME_MILLIS", Long.TYPE)) != null) {
            j2 j2Var = this.f206168h;
            j2Var.getClass();
            j2Var.g(null, r.b.f206171a);
        }
        List listO = o();
        if (listO != null) {
            List<qk0.b> list = listO;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (qk0.b bVar : list) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList.add(new sk0.b(bVar.f246928a, bVar.f246929b));
            }
            this.f206166c.t1(arrayList, new jli.f(10));
        }
        this.i.init();
        return Unit.f186387a;
    }

    @Override // mk0.a
    public final Flow j(tk0.g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new y(new lr.l(this, key, (Continuation) null, 22), new b0(new akg.n(this.f, key, 4), this, key, 27));
    }

    public final List o() {
        qk0.d dVar = (qk0.d) this.f206165b.T2("KEY_PERSONALISATION_ENTRIES", qk0.d.class);
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.List r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk0.o.p(java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.util.List r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mk0.o.q(java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void r(List list) {
        this.f206165b.G(new qk0.d(list), "KEY_PERSONALISATION_ENTRIES", z.d(o0.b(qk0.d.class)));
    }
}
