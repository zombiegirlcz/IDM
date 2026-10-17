package gw1;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zu1.a f147269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f147270m;

    public g(zu1.a brebInteractor, b aliasOperationErrorParser) {
        Intrinsics.checkNotNullParameter(brebInteractor, "brebInteractor");
        Intrinsics.checkNotNullParameter(aliasOperationErrorParser, "aliasOperationErrorParser");
        this.f147269l = brebInteractor;
        this.f147270m = aliasOperationErrorParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(gw1.g r4, com.revolut.feature.apm.core.models.alias.Alias r5, com.revolut.feature.apm.core.models.alias.Alias r6, java.lang.String r7, a5b.a r8, gim.c r9) {
        /*
            r4.getClass()
            boolean r0 = r9 instanceof gw1.f
            if (r0 == 0) goto L16
            r0 = r9
            gw1.f r0 = (gw1.f) r0
            int r1 = r0.f147268y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f147268y = r1
            goto L1b
        L16:
            gw1.f r0 = new gw1.f
            r0.<init>(r4, r9)
        L1b:
            java.lang.Object r9 = r0.f147266w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f147268y
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            a5b.a r8 = r0.v
            a5b.a r5 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4e
        L2e:
            r6 = move-exception
            r8 = r5
            goto L5a
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            yhm.o.b(r9)
            zu1.a r9 = r4.f147269l     // Catch: java.lang.Throwable -> L59
            r0.u = r8     // Catch: java.lang.Throwable -> L59
            r0.v = r8     // Catch: java.lang.Throwable -> L59
            r0.f147268y = r3     // Catch: java.lang.Throwable -> L59
            rv1.r r9 = (rv1.r) r9     // Catch: java.lang.Throwable -> L56
            java.lang.Object r9 = r9.l(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L56
            if (r9 != r1) goto L4d
            return r1
        L4d:
            r5 = r8
        L4e:
            zz1.e r9 = (zz1.e) r9     // Catch: java.lang.Throwable -> L2e
            gw1.h r6 = new gw1.h     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L2e
            goto L67
        L56:
            r5 = move-exception
            r6 = r5
            goto L5a
        L59:
            r6 = move-exception
        L5a:
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            skm.e0.p(r5)
            gw1.b r4 = r4.f147270m
            gw1.j r6 = r4.a(r6)
        L67:
            r8.invoke(r6)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gw1.g.Z2(gw1.g, com.revolut.feature.apm.core.models.alias.Alias, com.revolut.feature.apm.core.models.alias.Alias, java.lang.String, a5b.a, gim.c):java.lang.Object");
    }
}
