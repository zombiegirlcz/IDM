package l72;

import a72.m;
import ie6.q;
import knd.g0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qe0.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a72.i f192514a;

    public i(a72.i repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f192514a = repository;
    }

    public final g0 a() {
        return new g0(o.c(((m) this.f192514a).f1766h, Unit.f186387a, m.f1761j, null, 28), new q(2, 20, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dj0.d r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof l72.g
            if (r0 == 0) goto L13
            r0 = r9
            l72.g r0 = (l72.g) r0
            int r1 = r0.f192511x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192511x = r1
            goto L18
        L13:
            l72.g r0 = new l72.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192511x
            a72.i r3 = r7.f192514a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode r8 = r0.u
            yhm.o.b(r9)
            return r8
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            goto L55
        L3a:
            yhm.o.b(r9)
            r0.f192511x = r5
            r9 = r3
            a72.m r9 = (a72.m) r9
            a1a.a r2 = new a1a.a
            r5 = 15
            r6 = 0
            r2.<init>(r9, r8, r6, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r8, r2, r0)
            if (r9 != r1) goto L55
            goto L6b
        L55:
            com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode r9 = (com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode) r9
            r0.u = r9
            r0.f192511x = r4
            a72.m r3 = (a72.m) r3
            x4l.c r8 = r3.f1765g
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r3 = 0
            java.lang.Object r8 = r8.d(r2, r3, r0)
            if (r8 != r1) goto L69
            r2 = r8
        L69:
            if (r2 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l72.i.b(dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof l72.h
            if (r0 == 0) goto L13
            r0 = r9
            l72.h r0 = (l72.h) r0
            int r1 = r0.f192513x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192513x = r1
            goto L18
        L13:
            l72.h r0 = new l72.h
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192513x
            a72.i r3 = r7.f192514a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode r8 = r0.u
            yhm.o.b(r9)
            return r8
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            goto L55
        L3a:
            yhm.o.b(r9)
            r0.f192513x = r5
            r9 = r3
            a72.m r9 = (a72.m) r9
            a1a.a r2 = new a1a.a
            r5 = 16
            r6 = 0
            r2.<init>(r9, r8, r6, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r8, r2, r0)
            if (r9 != r1) goto L55
            goto L6b
        L55:
            com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode r9 = (com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode) r9
            r0.u = r9
            r0.f192513x = r4
            a72.m r3 = (a72.m) r3
            x4l.c r8 = r3.f1765g
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r3 = 0
            java.lang.Object r8 = r8.d(r2, r3, r0)
            if (r8 != r1) goto L69
            r2 = r8
        L69:
            if (r2 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l72.i.c(java.lang.String, gim.c):java.lang.Object");
    }
}
