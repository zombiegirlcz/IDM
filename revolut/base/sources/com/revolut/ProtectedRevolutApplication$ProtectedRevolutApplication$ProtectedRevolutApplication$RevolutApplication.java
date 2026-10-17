package com.revolut;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$RevolutApplication extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f50266a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:40:0x0073 A[Catch: Throwable -> 0x006c, TRY_LEAVE, TryCatch #0 {Throwable -> 0x006c, blocks: (B:16:0x002f, B:24:0x0056, B:35:0x006b, B:40:0x0073, B:39:0x006f, B:34:0x0068), top: B:44:0x002f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.f
            boolean r0 = r0.get()
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.d
            monitor-enter(r1)
        Lb:
            java.util.ArrayList r0 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.d     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L22
            java.util.ArrayList r0 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.d     // Catch: java.lang.InterruptedException -> L19 java.lang.Throwable -> L5f
            r0.wait()     // Catch: java.lang.InterruptedException -> L19 java.lang.Throwable -> L5f
            goto Lb
        L19:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.f     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r0.set(r2)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
        L21:
            return
        L22:
            java.util.ArrayList r0 = r4.f50266a     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r2 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.d     // Catch: java.lang.Throwable -> L5f
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r0 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.d     // Catch: java.lang.Throwable -> L5f
            r0.clear()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            com.revolut.ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q r3 = new com.revolut.ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q     // Catch: java.lang.Throwable -> L6c
            android.content.Context r0 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.h     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            boolean r0 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.a(r3)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
            if (r0 == 0) goto L4f
            java.util.ArrayList r0 = r4.f50266a     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
            r1 = 1
            if (r0 != r1) goto L4f
            java.util.ArrayList r0 = r4.f50266a     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
            java.util.ArrayList r1 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.b()     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
        L4f:
            android.content.Context r0 = com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.h     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
            java.util.ArrayList r1 = r4.f50266a     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
            com.revolut.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.ProtectedRevolutApplication.q.a(r0, r3, r1)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L77
            r3.close()     // Catch: java.lang.Throwable -> L6c
        L59:
            java.util.ArrayList r0 = r4.f50266a
            r0.clear()
            goto L0
        L5f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            throw r0
        L62:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r1 = move-exception
            r2 = r0
        L66:
            if (r2 == 0) goto L73
            r3.close()     // Catch: java.lang.Throwable -> L6e
        L6b:
            throw r1     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            goto L59
        L6e:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L6c
            goto L6b
        L73:
            r3.close()     // Catch: java.lang.Throwable -> L6c
            goto L6b
        L77:
            r0 = move-exception
            r1 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$RevolutApplication.run():void");
    }
}
