package et6;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements gr6.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f129226c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.a f129227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.m f129228b;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f129226c = kotlin.time.c.f(1.2d, pkm.e.SECONDS);
    }

    public g(au6.a freelancerAccountDetailsRepository, gr6.m freelancerPocketsInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsRepository, "freelancerAccountDetailsRepository");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        this.f129227a = freelancerAccountDetailsRepository;
        this.f129228b = freelancerPocketsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof et6.c
            if (r0 == 0) goto L13
            r0 = r7
            et6.c r0 = (et6.c) r0
            int r1 = r0.f129202x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129202x = r1
            goto L18
        L13:
            et6.c r0 = new et6.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129202x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            mr6.i r0 = r0.u
            yhm.o.b(r7)
            return r0
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L57
        L38:
            yhm.o.b(r7)
            r0.f129202x = r4
            au6.a r7 = r6.f129227a
            au6.f r7 = (au6.f) r7
            r7.getClass()
            akb.s r2 = new akb.s
            r4 = 0
            r5 = 17
            r2.<init>(r7, r4, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L57
            goto L6a
        L57:
            mr6.j r7 = (mr6.j) r7
            boolean r2 = r7 instanceof mr6.i
            if (r2 == 0) goto L6b
            r2 = r7
            mr6.i r2 = (mr6.i) r2
            r0.u = r2
            r0.f129202x = r3
            java.lang.Object r0 = r6.f(r0)
            if (r0 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(w4l.h r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof et6.d
            if (r0 == 0) goto L13
            r0 = r7
            et6.d r0 = (et6.d) r0
            int r1 = r0.f129209w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129209w = r1
            goto L18
        L13:
            et6.d r0 = new et6.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129209w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            au6.a r7 = r5.f129227a
            au6.f r7 = (au6.f) r7
            r7.getClass()
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            x4l.c r7 = r7.f
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r6 = r7.b(r2, r6)
            et6.a r7 = new et6.a
            r2 = 0
            r7.<init>(r2)
            en6.a r2 = new en6.a
            r4 = 19
            r2.<init>(r4)
            r4 = 2
            jhi.b r6 = mo3.a.h(r6, r7, r2, r4)
            r0.f129209w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L6a
            boolean r6 = r7.booleanValue()
            goto L6b
        L6a:
            r6 = 0
        L6b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.g.b(w4l.h, gim.c):java.lang.Object");
    }

    public final Object c(w4l.k kVar, gim.c cVar) {
        return vkm.q.x(rd0.e.e(mo3.a.g(e(kVar), null, new en6.a(18), 1), zhm.h0.f322473a, new eob.e(3, 3, null)), cVar);
    }

    public final vkm.d d(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        au6.f fVar = (au6.f) this.f129227a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return fVar.f.b(Unit.f186387a, loadingStrategy);
    }

    public final Flow e(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.v(d(loadingStrategy), new eqd.h(24)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof et6.e
            if (r0 == 0) goto L13
            r0 = r7
            et6.e r0 = (et6.e) r0
            int r1 = r0.f129215x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129215x = r1
            goto L18
        L13:
            et6.e r0 = new et6.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129215x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.u
            yhm.o.b(r7)
            return r0
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L57
        L38:
            yhm.o.b(r7)
            r0.f129215x = r4
            au6.a r7 = r6.f129227a
            au6.f r7 = (au6.f) r7
            r7.getClass()
            ald.l r2 = new ald.l
            r4 = 0
            r5 = 14
            r2.<init>(r7, r4, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L57
            goto L69
        L57:
            r2 = r7
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState r2 = (com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState) r2
            r0.u = r7
            r0.f129215x = r3
            gr6.m r2 = r6.f129228b
            et6.i2 r2 = (et6.i2) r2
            r3 = 0
            java.lang.Object r0 = r2.e(r3, r0)
            if (r0 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.g.f(gim.c):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:25:0x008f, B:30:0x00a2], limit reached: 43 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009a -> B:29:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b8 -> B:29:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.g.g(gim.c):java.lang.Object");
    }
}
