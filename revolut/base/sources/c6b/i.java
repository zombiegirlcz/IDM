package c6b;

import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import y5b.c0;
import y5b.i0;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements q5b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f21763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f21764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f21765c;
    public final q5b.a d;
    public final t e;

    public i(c0 repository, i0 widgetRepository, fk3.a configurationInteractor, q5b.a dataRefresherInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(widgetRepository, "widgetRepository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(dataRefresherInteractor, "dataRefresherInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f21763a = repository;
        this.f21764b = widgetRepository;
        this.f21765c = configurationInteractor;
        this.d = dataRefresherInteractor;
        this.e = pricingPlanInteractor;
    }

    public final Flow a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.q(q.Q(q.r(new c2f.m(14), nim.a.v(rd0.e.b(this.e.v(w4l.h.f294642c)), new c42.j(19))), new a32.b((Continuation) null, this, loadingStrategy, 18)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (fk3.a.a(r11.f21765c, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof c6b.h
            if (r0 == 0) goto L13
            r0 = r15
            c6b.h r0 = (c6b.h) r0
            int r1 = r0.f21762w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21762w = r1
            goto L18
        L13:
            c6b.h r0 = new c6b.h
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21762w
            y5b.c0 r5 = r11.f21763a
            r10 = 2
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 == r3) goto L35
            if (r2 != r10) goto L2d
            yhm.o.b(r15)
            goto L9e
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            yhm.o.b(r15)
            goto L5c
        L39:
            yhm.o.b(r15)
            r0.f21762w = r3
            r5.getClass()
            wh3.h r3 = new wh3.h
            r9 = 0
            r4 = 22
            r6 = r12
            r7 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r3, r0)
            if (r12 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L59:
            if (r12 != r1) goto L5c
            goto L9d
        L5c:
            ffk.t r12 = r11.e
            hha.d r12 = r12.d()
            if (r12 == 0) goto L87
            java.lang.String r12 = r12.f152287a
            if (r12 == 0) goto L87
            r5.getClass()
            java.lang.String r13 = "currentPlanId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            ne0.j r13 = r5.f311028c
            y5b.x r14 = y5b.c0.Companion
            r14.getClass()
            java.lang.String r14 = y5b.x.b(r12)
            r13.remove(r14)
            ue0.c r13 = r5.f311027b
            java.lang.String r12 = y5b.x.b(r12)
            r13.I0(r12)
        L87:
            y5b.i0 r12 = r11.f21764b
            ne0.j r13 = r12.f311047c
            r13.clear()
            ue0.c r12 = r12.f311046b
            r12.clear()
            r0.f21762w = r10
            fk3.a r12 = r11.f21765c
            java.lang.Object r12 = fk3.a.a(r12, r0)
            if (r12 != r1) goto L9e
        L9d:
            return r1
        L9e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c6b.i.b(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
