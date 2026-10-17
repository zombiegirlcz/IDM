package ffk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfk.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements cha.c {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f134821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f134822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f134823c;

    static {
        Intrinsics.checkNotNullParameter("HIDE_STUDENT", "id");
    }

    public c0(ang.f userInteractor, mk0.a personalisationStorage, t0 studentPlanRepository) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(studentPlanRepository, "studentPlanRepository");
        this.f134821a = userInteractor;
        this.f134822b = personalisationStorage;
        this.f134823c = studentPlanRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (c(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ffk.y
            if (r0 == 0) goto L13
            r0 = r8
            ffk.y r0 = (ffk.y) r0
            int r1 = r0.f134854w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134854w = r1
            goto L18
        L13:
            ffk.y r0 = new ffk.y
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134854w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L67
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            goto L5e
        L36:
            yhm.o.b(r8)
            r0.f134854w = r4
            pfk.t0 r8 = r7.f134823c
            r8.getClass()
            pfk.q0 r2 = pfk.q0.GRADUATE
            pdi.j r4 = new pdi.j
            r5 = 0
            r6 = 7
            r4.<init>(r8, r2, r5, r6)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r4, r0)
            if (r8 != r1) goto L54
            goto L56
        L54:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L56:
            if (r8 != r1) goto L59
            goto L5b
        L59:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L5b:
            if (r8 != r1) goto L5e
            goto L66
        L5e:
            r0.f134854w = r3
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.c0.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ffk.z
            if (r0 == 0) goto L13
            r0 = r6
            ffk.z r0 = (ffk.z) r0
            int r1 = r0.f134855w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134855w = r1
            goto L18
        L13:
            ffk.z r0 = new ffk.z
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134855w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            ang.f r6 = r5.f134821a
            pfm.h r6 = r6.i()
            r0.f134855w = r4
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L48
            goto L60
        L48:
            r0.f134855w = r3
            ffk.a0 r6 = new ffk.a0
            r2 = 0
            r3 = 0
            r6.<init>(r5, r2, r3)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L5e:
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.c0.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (c(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ffk.b0
            if (r0 == 0) goto L13
            r0 = r8
            ffk.b0 r0 = (ffk.b0) r0
            int r1 = r0.f134819w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134819w = r1
            goto L18
        L13:
            ffk.b0 r0 = new ffk.b0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134819w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L67
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            goto L5e
        L36:
            yhm.o.b(r8)
            r0.f134819w = r4
            pfk.t0 r8 = r7.f134823c
            r8.getClass()
            pfk.q0 r2 = pfk.q0.WITHDRAWAL
            pdi.j r4 = new pdi.j
            r5 = 0
            r6 = 7
            r4.<init>(r8, r2, r5, r6)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r4, r0)
            if (r8 != r1) goto L54
            goto L56
        L54:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L56:
            if (r8 != r1) goto L59
            goto L5b
        L59:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L5b:
            if (r8 != r1) goto L5e
            goto L66
        L5e:
            r0.f134819w = r3
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.c0.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
