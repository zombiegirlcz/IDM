package xvj;

import com.revolut.retail.feature.impl.trips.network.TripsApiService;
import java.time.ZonedDateTime;
import java.util.List;
import kjk.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import uyd.e0;
import wtc.b0;
import xif.k;
import xng.l;
import xni.h;
import xnl.f;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements od0.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qvj.a f309287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f309288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TripsApiService f309289c;
    public final ue0.c d;
    public final i90.b e;
    public final x4l.c f;

    public e(qvj.a dao, ne0.d memoryCache, TripsApiService service, ue0.c storage, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f309287a = dao;
        this.f309288b = memoryCache;
        this.f309289c = service;
        this.d = storage;
        this.e = uuidUtils;
        Continuation continuation = null;
        int i = 29;
        this.f = new x4l.c(new b0(this, continuation, 8), new l(this, i), new k(this, i), new h(this, continuation, 14), new e0(3, 22, continuation));
    }

    public final Object a(String str, vvj.b bVar) throws Throwable {
        f fVar = new f(this, str, null, 16);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, fVar, bVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(gim.c r17) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xvj.e.b(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xvj.c
            if (r0 == 0) goto L13
            r0 = r8
            xvj.c r0 = (xvj.c) r0
            int r1 = r0.f309285x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f309285x = r1
            goto L18
        L13:
            xvj.c r0 = new xvj.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f309285x
            ne0.d r3 = r6.f309288b
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L69
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "trips_amounts_cache_"
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object r8 = r3.get(r7)
            boolean r2 = r8 instanceof java.lang.Long
            r5 = 0
            if (r2 == 0) goto L50
            java.lang.Long r8 = (java.lang.Long) r8
            goto L51
        L50:
            r8 = r5
        L51:
            if (r8 == 0) goto L54
            return r8
        L54:
            xvj.d r8 = new xvj.d
            r2 = 0
            r8.<init>(r6, r7, r5, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.u = r7
            r0.f309285x = r4
            java.lang.Object r8 = skm.e0.J(r2, r8, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L70
            r3.f(r7, r8)
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xvj.e.c(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // od0.e
    public final void clear() {
        this.f309288b.clear();
        this.f309287a.a();
        this.d.clear();
    }

    public final Object d(String str, long j2, vvj.e eVar) throws Throwable {
        String strQ = j6.a.q("trips_amounts_cache_", str);
        this.f309288b.f(strQ, new Long(j2));
        s sVar = new s(this, strQ, j2, null, 7);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, sVar, eVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final Object e(String str, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List list, vvj.f fVar) throws Throwable {
        xkl.e eVar = new xkl.e(2, zonedDateTime2, zonedDateTime, list, this, str, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, eVar, fVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
