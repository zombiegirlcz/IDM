package ivf;

import com.revolut.feature.transport.models.TransportLocation;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements ouf.a {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wi0.b f168857c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final suf.h f168858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final usc.a f168859b;

    static {
        wi0.b.Companion.getClass();
        f168857c = wi0.b.t2;
    }

    public r(suf.h repository, usc.a ticketQrCodeValidator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(ticketQrCodeValidator, "ticketQrCodeValidator");
        this.f168858a = repository;
        this.f168859b = ticketQrCodeValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r10, java.lang.Double r11, java.lang.Double r12, gim.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof ivf.k
            if (r0 == 0) goto L13
            r0 = r13
            ivf.k r0 = (ivf.k) r0
            int r1 = r0.f168850x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168850x = r1
            goto L18
        L13:
            ivf.k r0 = new ivf.k
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168850x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r10 = r0.u
            yhm.o.b(r13)
            goto L54
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r13)
            r0.u = r10
            r0.f168850x = r3
            suf.h r4 = r9.f168858a
            r4.getClass()
            qg7.p r2 = new qg7.p
            r8 = 0
            r3 = 29
            wi0.b r5 = ivf.r.f168857c
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r11, r2, r0)
            if (r13 != r1) goto L54
            return r1
        L54:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r13.iterator()
        L5f:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L7a
            java.lang.Object r13 = r12.next()
            r0 = r13
            com.revolut.feature.transport.models.TransportLocation r0 = (com.revolut.feature.transport.models.TransportLocation) r0
            java.lang.String r0 = r0.getName()
            boolean r0 = jli.g.d(r0, r10)
            if (r0 == 0) goto L5f
            r11.add(r13)
            goto L5f
        L7a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ivf.r.a(java.lang.String, java.lang.Double, java.lang.Double, gim.c):java.io.Serializable");
    }

    public final Flow b() {
        return vkm.q.q(c6d.b.i(this.f168858a.f265756g.b(Unit.f186387a, w4l.i.f294643c), new i(this, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.transport.models.TransportLocation r6, gim.c r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ivf.r.c(com.revolut.feature.transport.models.TransportLocation, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r6, gim.c r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ivf.p
            if (r0 == 0) goto L13
            r0 = r7
            ivf.p r0 = (ivf.p) r0
            int r1 = r0.f168855x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168855x = r1
            goto L18
        L13:
            ivf.p r0 = new ivf.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168855x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            boolean r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2a
            goto L61
        L2a:
            r7 = move-exception
            goto L56
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            suf.h r7 = r5.f168858a     // Catch: java.lang.Exception -> L2a
            r0.u = r6     // Catch: java.lang.Exception -> L2a
            r0.f168855x = r4     // Catch: java.lang.Exception -> L2a
            r7.getClass()     // Catch: java.lang.Exception -> L2a
            suf.c r2 = new suf.c     // Catch: java.lang.Exception -> L2a
            r4 = 2
            r2.<init>(r7, r3, r4)     // Catch: java.lang.Exception -> L2a
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Exception -> L2a
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Exception -> L2a
            if (r7 != r1) goto L51
            goto L53
        L51:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2a
        L53:
            if (r7 != r1) goto L61
            return r1
        L56:
            if (r6 == 0) goto L64
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r7, r6)
        L61:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L64:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivf.r.d(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ivf.q
            if (r0 == 0) goto L13
            r0 = r7
            ivf.q r0 = (ivf.q) r0
            int r1 = r0.f168856w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168856w = r1
            goto L18
        L13:
            ivf.q r0 = new ivf.q
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168856w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28
            goto L55
        L28:
            r6 = move-exception
            goto L4c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            suf.h r7 = r5.f168858a     // Catch: java.lang.Exception -> L28
            r0.f168856w = r4     // Catch: java.lang.Exception -> L28
            r7.getClass()     // Catch: java.lang.Exception -> L28
            suf.g r2 = new suf.g     // Catch: java.lang.Exception -> L28
            r2.<init>(r7, r6, r3, r4)     // Catch: java.lang.Exception -> L28
            skm.p0 r6 = skm.p0.f264001a     // Catch: java.lang.Exception -> L28
            elm.f r6 = elm.f.f127540b     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)     // Catch: java.lang.Exception -> L28
            if (r6 != r1) goto L55
            return r1
        L4c:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r6, r7)
        L55:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ivf.r.e(java.util.List, gim.c):java.lang.Object");
    }

    public final Object f(boolean z, gim.c cVar) {
        x4l.c cVar2 = this.f168858a.f265756g;
        Unit unit = Unit.f186387a;
        Object objD = cVar2.d(unit, z, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = unit;
        }
        return objD == aVar ? objD : unit;
    }

    public final void g(TransportLocation transportLocation) {
        Intrinsics.checkNotNullParameter(transportLocation, "transportLocation");
        suf.h hVar = this.f168858a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(transportLocation, "transportLocation");
        hVar.d.G(transportLocation, Intrinsics.f(transportLocation.getAutoSelected(), Boolean.TRUE) ? "AUTO_SELECTED_LOCATION_KEY" : "SELECTED_LOCATION_KEY", TransportLocation.class);
    }
}
