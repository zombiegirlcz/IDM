package qq3;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements h {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hlm.c f248472a = hlm.d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f248473b = h0.f322473a;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:25:0x0074, B:27:0x007a, B:29:0x0086, B:34:0x00a0, B:24:0x0067), top: B:39:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009b -> B:33:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof qq3.j
            if (r0 == 0) goto L13
            r0 = r12
            qq3.j r0 = (qq3.j) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            qq3.j r0 = new qq3.j
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            int r11 = r0.z
            int r2 = r0.f248476y
            int r4 = r0.f248475x
            java.util.Iterator r5 = r0.f248474w
            hlm.a r7 = r0.v
            com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent r8 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L39
            goto L9d
        L39:
            r11 = move-exception
            goto La6
        L3c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L44:
            int r11 = r0.f248475x
            hlm.a r2 = r0.v
            com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent r4 = r0.u
            yhm.o.b(r12)
            r12 = r11
            r7 = r2
            r11 = r4
            goto L67
        L51:
            yhm.o.b(r12)
            r0.u = r11
            hlm.c r12 = r10.f248472a
            r0.v = r12
            r0.f248475x = r5
            r0.C = r4
            java.lang.Object r2 = r12.lock(r6, r0)
            if (r2 != r1) goto L65
            goto L9a
        L65:
            r7 = r12
            r12 = r5
        L67:
            java.util.Set r2 = r10.f248473b     // Catch: java.lang.Throwable -> L39
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L39
            r8 = r11
            r4 = r12
            r11 = r5
            r12 = r11
            r5 = r2
        L74:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto La0
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L39
            nxh.b r2 = (nxh.b) r2     // Catch: java.lang.Throwable -> L39
            boolean r9 = r2.a()     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L74
            r0.u = r8     // Catch: java.lang.Throwable -> L39
            r0.v = r7     // Catch: java.lang.Throwable -> L39
            r0.f248474w = r5     // Catch: java.lang.Throwable -> L39
            r0.f248475x = r4     // Catch: java.lang.Throwable -> L39
            r0.f248476y = r11     // Catch: java.lang.Throwable -> L39
            r0.z = r12     // Catch: java.lang.Throwable -> L39
            r0.C = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.b(r8, r0)     // Catch: java.lang.Throwable -> L39
            if (r2 != r1) goto L9b
        L9a:
            return r1
        L9b:
            r2 = r11
            r11 = r12
        L9d:
            r12 = r11
            r11 = r2
            goto L74
        La0:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L39
            r7.unlock(r6)
            return r11
        La6:
            r7.unlock(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qq3.i.a(com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0036, B:46:0x00fd, B:48:0x0103, B:51:0x011e, B:24:0x0071, B:25:0x0081, B:27:0x0087, B:29:0x009e, B:30:0x00a2, B:31:0x00ab, B:33:0x00b1, B:35:0x00c0, B:44:0x00e5, B:38:0x00ca, B:39:0x00ce, B:41:0x00d4, B:45:0x00e9), top: B:56:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qq3.i.b(java.util.Set, gim.c):java.lang.Object");
    }
}
