package xq3;

import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr3.k f308064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xr3.n f308065b;

    public c(xr3.k creditApplicationRepository, xr3.n creditExternalClientMonitoringRepository) {
        Intrinsics.checkNotNullParameter(creditApplicationRepository, "creditApplicationRepository");
        Intrinsics.checkNotNullParameter(creditExternalClientMonitoringRepository, "creditExternalClientMonitoringRepository");
        this.f308064a = creditApplicationRepository;
        this.f308065b = creditExternalClientMonitoringRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r13 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, bs3.h r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof xq3.a
            if (r0 == 0) goto L13
            r0 = r13
            xq3.a r0 = (xq3.a) r0
            int r1 = r0.f308060x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308060x = r1
            goto L18
        L13:
            xq3.a r0 = new xq3.a
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308060x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L72
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.String r11 = r0.u
            yhm.o.b(r13)
            goto L4c
        L38:
            yhm.o.b(r13)
            bs3.g r13 = r12.f18036a
            bs3.g r2 = bs3.g.CREDOLAB
            if (r13 != r2) goto L4f
            r0.u = r11
            r0.f308060x = r4
            java.lang.Object r13 = r10.c(r11, r12, r0)
            if (r13 != r1) goto L4c
            goto L71
        L4c:
            r12 = r13
            bs3.h r12 = (bs3.h) r12
        L4f:
            r7 = r11
            r5 = r12
            r8 = 0
            r0.u = r8
            r0.f308060x = r3
            xr3.k r6 = r10.f308064a
            r6.getClass()
            xge.f r4 = new xge.f
            r9 = 13
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L6d
            goto L6f
        L6d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L6f:
            if (r11 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.c.a(java.lang.String, bs3.h, gim.c):java.lang.Object");
    }

    public final Object b(String str, qq3.c cVar) {
        xr3.k kVar = this.f308064a;
        kVar.getClass();
        xr3.j jVar = new xr3.j(kVar, str, null, 2);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, jVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, bs3.h r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof xq3.b
            if (r0 == 0) goto L13
            r0 = r11
            xq3.b r0 = (xq3.b) r0
            int r1 = r0.f308063y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308063y = r1
            goto L18
        L13:
            xq3.b r0 = new xq3.b
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f308061w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308063y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r9 = r0.v
            bs3.h r10 = r0.u
            yhm.o.b(r11)
        L2a:
            r4 = r9
            goto L81
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            yhm.o.b(r11)
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.lang.String r2 = "_"
            java.lang.String r9 = com.google.android.gms.internal.mlkit_vision_face.a.o(r9, r2, r11)
            java.lang.String r11 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r11)
            java.lang.String r11 = "referenceNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r11)
            java.lang.String r11 = r10.e
            if (r11 == 0) goto La3
            sq3.a r2 = new sq3.a
            java.lang.String r4 = r10.f18037b
            r2.<init>(r11, r4, r9)
            r0.u = r10
            r0.v = r9
            r0.f308063y = r3
            xr3.n r11 = r8.f308065b
            r11.getClass()
            xnl.f r3 = new xnl.f
            r4 = 6
            r5 = 0
            r3.<init>(r2, r11, r5, r4)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r3, r0)
            if (r11 != r1) goto L7c
            goto L7e
        L7c:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L7e:
            if (r11 != r1) goto L2a
            return r1
        L81:
            bs3.g r3 = r10.f18036a
            java.time.Instant r5 = r10.f18038c
            java.time.Instant r6 = r10.d
            java.lang.String r7 = r10.e
            java.lang.String r9 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r9)
            java.lang.String r9 = "token"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r9)
            java.lang.String r9 = "startDate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r9)
            java.lang.String r9 = "endDate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r9)
            bs3.h r2 = new bs3.h
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        La3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Upload token is not correct"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xq3.c.c(java.lang.String, bs3.h, gim.c):java.lang.Object");
    }
}
