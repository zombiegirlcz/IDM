package es;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zr.k f128745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t31.b f128746c;
    public skm.r d;

    public a0(String verificationToken, zr.k biometricVerificationInteractor, t31.b deviceFingerprintApi) {
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        Intrinsics.checkNotNullParameter(biometricVerificationInteractor, "biometricVerificationInteractor");
        Intrinsics.checkNotNullParameter(deviceFingerprintApi, "deviceFingerprintApi");
        this.f128744a = verificationToken;
        this.f128745b = biometricVerificationInteractor;
        this.f128746c = deviceFingerprintApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(es.a0 r6, long r7, gim.c r9) throws java.lang.Throwable {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof es.x
            if (r0 == 0) goto L16
            r0 = r9
            es.x r0 = (es.x) r0
            int r1 = r0.f128777x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f128777x = r1
            goto L1b
        L16:
            es.x r0 = new es.x
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128777x
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r6 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L5b
        L2c:
            r8 = move-exception
            goto L62
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r9)
            pkm.k r9 = pkm.k.f237220a
            r9.getClass()
            pkm.j r9 = pkm.j.f237218a
            r9.getClass()
            long r4 = pkm.j.a()
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L60
            es.y r9 = new es.y     // Catch: java.lang.Throwable -> L60
            r2 = 0
            r9.<init>(r6, r2, r3)     // Catch: java.lang.Throwable -> L60
            r0.u = r4     // Catch: java.lang.Throwable -> L60
            r0.f128777x = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r9 = skm.h2.d(r7, r9, r0)     // Catch: java.lang.Throwable -> L60
            if (r9 != r1) goto L5a
            return r1
        L5a:
            r6 = r4
        L5b:
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Throwable -> L2c
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c
            goto L68
        L60:
            r8 = move-exception
            r6 = r4
        L62:
            yhm.m$a r9 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r8)
        L68:
            java.lang.Throwable r8 = yhm.m.a(r9)
            r0 = 0
            if (r8 != 0) goto La4
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L8e
            es.u r8 = new es.u
            java.util.Map r9 = zhm.r0.g()
            es.v r2 = es.v.TIMED_OUT
            long r6 = kotlin.time.f.b(r6)
            long r6 = kotlin.time.b.f(r6)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 >= 0) goto L89
            goto L8a
        L89:
            r0 = r6
        L8a:
            r8.<init>(r9, r2, r0)
            goto Lc1
        L8e:
            es.u r8 = new es.u
            es.v r2 = es.v.COMPLETED
            long r6 = kotlin.time.f.b(r6)
            long r6 = kotlin.time.b.f(r6)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto La0
        L9f:
            r0 = r6
        La0:
            r8.<init>(r9, r2, r0)
            goto Lc1
        La4:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto Lc2
            es.u r8 = new es.u
            java.util.Map r9 = zhm.r0.g()
            es.v r2 = es.v.FAILED
            long r6 = kotlin.time.f.b(r6)
            long r6 = kotlin.time.b.f(r6)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 >= 0) goto Lbd
            goto Lbe
        Lbd:
            r0 = r6
        Lbe:
            r8.<init>(r9, r2, r0)
        Lc1:
            return r8
        Lc2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: es.a0.a(es.a0, long, gim.c):java.lang.Object");
    }

    public static final LinkedHashMap b(a0 a0Var, u uVar) {
        a0Var.getClass();
        Map map = uVar.f128773a;
        aim.f builder = new aim.f();
        builder.put("duration_ms", Long.valueOf(uVar.f128775c));
        builder.put("status", uVar.f128774b.name());
        Unit unit = Unit.f186387a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        return r0.p(map, q0.c(new Pair("fingerprint_collection", builder.b())));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(es.a0 r5, java.util.LinkedHashMap r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof es.z
            if (r0 == 0) goto L16
            r0 = r7
            es.z r0 = (es.z) r0
            int r1 = r0.f128779w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f128779w = r1
            goto L1b
        L16:
            es.z r0 = new es.z
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128779w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5c
        L2b:
            r5 = move-exception
            goto L61
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            zr.k r7 = r5.f128745b     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r5.f128744a     // Catch: java.lang.Throwable -> L2b
            r0.f128779w = r3     // Catch: java.lang.Throwable -> L2b
            lr.p r7 = r7.f324516a     // Catch: java.lang.Throwable -> L2b
            lr.l r2 = new lr.l     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r7, r6, r5, r4)     // Catch: java.lang.Throwable -> L2b
            skm.p0 r5 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2b
            elm.f r5 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = skm.e0.J(r5, r2, r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2b
        L54:
            if (r5 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2b
        L59:
            if (r5 != r1) goto L5c
            return r1
        L5c:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2b
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L67
        L61:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L67:
            java.lang.Throwable r5 = yhm.m.a(r5)
            if (r5 == 0) goto L7e
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L7d
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            java.lang.String r0 = "Device fingerprint upload failed"
            rd0.d.a(r7, r4, r0, r5, r6)
            goto L7e
        L7d:
            throw r5
        L7e:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: es.a0.c(es.a0, java.util.LinkedHashMap, gim.c):java.lang.Object");
    }
}
