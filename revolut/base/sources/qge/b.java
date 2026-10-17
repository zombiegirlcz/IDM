package qge;

import hlm.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wxl.a f245787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f245788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f245789c;
    public boolean d;

    public b(wxl.a nudgeInteractor, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(nudgeInteractor, "nudgeInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f245787a = nudgeInteractor;
        this.f245788b = appCoroutineScope;
        this.f245789c = d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lai.d r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof qge.a
            if (r0 == 0) goto L13
            r0 = r10
            qge.a r0 = (qge.a) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            qge.a r0 = new qge.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f245785x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r9 = r0.v
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2d
            goto L72
        L2d:
            r10 = move-exception
            goto L81
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            int r9 = r0.f245784w
            hlm.a r2 = r0.v
            lai.d r6 = r0.u
            yhm.o.b(r10)
            r10 = r2
            r2 = r9
            r9 = r6
            goto L59
        L44:
            yhm.o.b(r10)
            r0.u = r9
            hlm.c r10 = r8.f245789c
            r0.v = r10
            r2 = 0
            r0.f245784w = r2
            r0.z = r4
            java.lang.Object r6 = r10.lock(r5, r0)
            if (r6 != r1) goto L59
            goto L6e
        L59:
            boolean r6 = r8.d     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L60
            r9 = r10
            r10 = r5
            goto L79
        L60:
            r0.u = r5     // Catch: java.lang.Throwable -> L7d
            r0.v = r10     // Catch: java.lang.Throwable -> L7d
            r0.f245784w = r2     // Catch: java.lang.Throwable -> L7d
            r0.z = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L7d
            if (r9 != r1) goto L6f
        L6e:
            return r1
        L6f:
            r7 = r10
            r10 = r9
            r9 = r7
        L72:
            r0 = r10
            txl.e r0 = (txl.e) r0     // Catch: java.lang.Throwable -> L2d
            r8.d = r4     // Catch: java.lang.Throwable -> L2d
            txl.e r10 = (txl.e) r10     // Catch: java.lang.Throwable -> L2d
        L79:
            r9.unlock(r5)
            return r10
        L7d:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L81:
            r9.unlock(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qge.b.a(lai.d, gim.c):java.lang.Object");
    }
}
