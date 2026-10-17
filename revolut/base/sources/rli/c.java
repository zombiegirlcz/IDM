package rli;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh0.c f255080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f255081b;

    public c(fh0.c installer) {
        Intrinsics.checkNotNullParameter(installer, "installer");
        this.f255080a = installer;
        this.f255081b = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof rli.b
            if (r0 == 0) goto L13
            r0 = r6
            rli.b r0 = (rli.b) r0
            int r1 = r0.f255079w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255079w = r1
            goto L18
        L13:
            rli.b r0 = new rli.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255079w
            java.lang.String r3 = "ModuleInstaller"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L45
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            fh0.c r6 = r5.f255080a     // Catch: java.lang.Throwable -> L29
            fh0.b r2 = fh0.b.BARCODE     // Catch: java.lang.Throwable -> L29
            r0.f255079w = r4     // Catch: java.lang.Throwable -> L29
            ei0.b r6 = (ei0.b) r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r6.b(r2, r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r1) goto L45
            return r1
        L45:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f255081b     // Catch: java.lang.Throwable -> L29
            r6.set(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = "BARCODE warm up completed successfully."
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L29
            return r6
        L52:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BARCODE warm up completed with error: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rli.c.a(gim.c):java.lang.Object");
    }
}
