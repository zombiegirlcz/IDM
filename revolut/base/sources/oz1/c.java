package oz1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz1.b f231102a;

    public c(iz1.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f231102a = repository;
    }

    public final Object a(String str, gim.c cVar) throws Throwable {
        iz1.b bVar = this.f231102a;
        bVar.getClass();
        iz1.a aVar = new iz1.a(bVar, str, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, aVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof oz1.b
            if (r0 == 0) goto L13
            r0 = r7
            oz1.b r0 = (oz1.b) r0
            int r1 = r0.f231101w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231101w = r1
            goto L18
        L13:
            oz1.b r0 = new oz1.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f231101w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L52
        L28:
            r7 = move-exception
            goto L60
        L2a:
            r7 = move-exception
            goto L84
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f231101w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            iz1.b r7 = r6.f231102a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r7.getClass()     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            imk.p0 r2 = new imk.p0     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r5 = 9
            r2.<init>(r7, r4, r5)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r7 != r1) goto L52
            return r1
        L52:
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r7 = r7 ^ r3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L66
        L60:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L66:
            java.lang.Throwable r0 = yhm.m.a(r7)
            if (r0 == 0) goto L6f
            hx7.e.n(r0)
        L6f:
            boolean r0 = r7 instanceof yhm.n
            if (r0 == 0) goto L74
            goto L75
        L74:
            r4 = r7
        L75:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L7e
            boolean r7 = r4.booleanValue()
            goto L7f
        L7e:
            r7 = 0
        L7f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L84:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oz1.c.b(gim.c):java.lang.Object");
    }

    public final Object c(String str, gim.c cVar) throws Throwable {
        iz1.b bVar = this.f231102a;
        bVar.getClass();
        iz1.a aVar = new iz1.a(bVar, str, null, 2);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, aVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
