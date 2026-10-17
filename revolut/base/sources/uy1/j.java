package uy1;

import com.revolut.feature.apm.core.impl.data.network.alias.AliasService;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import pti.s;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements vw1.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasService f284043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe0.e f284044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f284045c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f284046g;

    public j(zz1.h aliasSystem, AliasService service, xe0.e storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(aliasSystem, "aliasSystem");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f284043a = service;
        this.f284044b = storage;
        this.f284045c = memoryCache;
        String str = aliasSystem.f326492a;
        this.d = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.e = lowerCase;
        this.f = j6.a.q("ALIAS_KEY_", aliasSystem.f326492a);
        Continuation continuation = null;
        this.f284046g = new x4l.c(new s(this, continuation, 24), new uu9.b(this, 10), new umd.n(this, 19), new e(this, continuation, 0), new ska.c(this, continuation, 20), new e(this, continuation, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable e(uy1.j r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof uy1.g
            if (r0 == 0) goto L13
            r0 = r9
            uy1.g r0 = (uy1.g) r0
            int r1 = r0.f284037w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284037w = r1
            goto L18
        L13:
            uy1.g r0 = new uy1.g
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284037w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L52
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE
            r4 = 1000(0x3e8, double:4.94E-321)
            pkm.e r9 = pkm.e.MILLISECONDS
            long r4 = kotlin.time.c.h(r4, r9)
            pti.s r9 = new pti.s
            r2 = 3
            r6 = 0
            r9.<init>(r2, r6)
            uk9.h r2 = new uk9.h
            r7 = 6
            r2.<init>(r8, r6, r7)
            r0.f284037w = r3
            java.lang.Object r9 = a.a.y(r4, r9, r2, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L5d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r9.next()
            wy1.e r0 = (wy1.e) r0
            com.revolut.feature.apm.core.models.alias.Alias r0 = vy1.b.a(r0)
            if (r0 == 0) goto L5d
            r8.add(r0)
            goto L5d
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uy1.j.e(uy1.j, gim.c):java.io.Serializable");
    }

    public static final c f(j jVar, String str) {
        c cVar;
        c[] cVarArrValues = c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i];
            if (a0.z(cVar.name(), str, true)) {
                break;
            }
            i++;
        }
        return cVar == null ? c.UNKNOWN : cVar;
    }

    public final Object g(gim.c cVar) {
        f fVar = new f(this, null);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, fVar, cVar);
    }

    public final Object h(String str, gim.c cVar) {
        f fVar = new f(this, str, null, 2);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, fVar, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r15 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007e -> B:31:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum i(zz1.f r11, long r12, int r14, gim.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof uy1.i
            if (r0 == 0) goto L13
            r0 = r15
            uy1.i r0 = (uy1.i) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            uy1.i r0 = new uy1.i
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.f284042y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r11 = r0.f284041x
            int r12 = r0.f284040w
            long r13 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r15)     // Catch: java.lang.Throwable -> L32
            goto L81
        L32:
            r15 = move-exception
            goto L8d
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            int r11 = r0.f284041x
            int r12 = r0.f284040w
            long r13 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r15)
            goto L70
        L49:
            yhm.o.b(r15)
            java.lang.String r15 = r11.f326483a
            zz1.e r11 = r11.f326484b
            r2 = r0
            r0 = r15
            r15 = r14
        L53:
            zz1.e r5 = zz1.e.COMPLETED
            if (r11 == r5) goto La0
            if (r14 <= 0) goto La0
            r2.u = r0
            r2.v = r12
            r2.f284040w = r15
            r2.f284041x = r14
            r2.A = r4
            java.lang.Object r11 = skm.k0.b(r12, r2)
            if (r11 != r1) goto L6a
            goto L80
        L6a:
            r11 = r2
            r2 = r0
            r0 = r11
            r11 = r14
            r13 = r12
            r12 = r15
        L70:
            r0.u = r2     // Catch: java.lang.Throwable -> L32
            r0.v = r13     // Catch: java.lang.Throwable -> L32
            r0.f284040w = r12     // Catch: java.lang.Throwable -> L32
            r0.f284041x = r11     // Catch: java.lang.Throwable -> L32
            r0.A = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r15 = r10.h(r2, r0)     // Catch: java.lang.Throwable -> L32
            if (r15 != r1) goto L81
        L80:
            return r1
        L81:
            zz1.f r15 = (zz1.f) r15     // Catch: java.lang.Throwable -> L32
            zz1.e r15 = r15.f326484b     // Catch: java.lang.Throwable -> L32
        L85:
            r8 = r12
            r12 = r11
            r11 = r15
            r15 = r8
            r8 = r2
            r2 = r0
            r0 = r8
            goto L9a
        L8d:
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r7 = 0
            rd0.d.a(r6, r7, r7, r15, r5)
            zz1.e r15 = zz1.e.PROCESSING
            goto L85
        L9a:
            int r12 = r12 + (-1)
            r8 = r13
            r14 = r12
            r12 = r8
            goto L53
        La0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uy1.j.i(zz1.f, long, int, gim.c):java.lang.Enum");
    }

    public final Object j(boolean z, Continuation continuation) {
        Unit unit = Unit.f186387a;
        Object objD = this.f284046g.d(unit, z, continuation);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : unit;
    }

    public final Object k(zz1.k kVar, gim.c cVar) throws Throwable {
        un8.j jVar = new un8.j(this, kVar, null, 21);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, jVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
