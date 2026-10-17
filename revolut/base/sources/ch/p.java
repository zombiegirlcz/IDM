package ch;

import com.google.common.base.Preconditions;
import ecm.t1;
import gcm.z0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f24048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24049c;

    public /* synthetic */ p(int i, Object obj2, boolean z, Object obj3) {
        this.f24047a = i;
        this.f24049c = obj2;
        this.f24048b = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        ((java.lang.Runnable) r9.f24048b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        de.l.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r9.f24048b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r9.f24048b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f24049c     // Catch: java.lang.Throwable -> L5a
            de.l r2 = (de.l) r2     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayDeque r2 = r2.f113282b     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f24049c     // Catch: java.lang.Throwable -> L20
            de.l r0 = (de.l) r0     // Catch: java.lang.Throwable -> L20
            de.k r3 = r0.f113283c     // Catch: java.lang.Throwable -> L20
            de.k r4 = de.k.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L48
        L20:
            r0 = move-exception
            goto L7f
        L22:
            long r5 = r0.d     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.d = r5     // Catch: java.lang.Throwable -> L20
            r0.f113283c = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f24049c     // Catch: java.lang.Throwable -> L20
            de.l r3 = (de.l) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f113282b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            r9.f24048b = r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L49
            java.lang.Object r0 = r9.f24049c     // Catch: java.lang.Throwable -> L20
            de.l r0 = (de.l) r0     // Catch: java.lang.Throwable -> L20
            de.k r3 = de.k.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f113283c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
            goto L18
        L48:
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5a
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r9.f24048b     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
        L57:
            r9.f24048b = r2     // Catch: java.lang.Throwable -> L5a
            goto L2
        L5a:
            r0 = move-exception
            goto L81
        L5c:
            r0 = move-exception
            goto L7c
        L5e:
            r3 = move-exception
            java.util.logging.Logger r4 = de.l.f     // Catch: java.lang.Throwable -> L5c
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r9.f24048b     // Catch: java.lang.Throwable -> L5c
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5c
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
            goto L57
        L7c:
            r9.f24048b = r2     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        L7f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5a
        L81:
            if (r1 == 0) goto L8a
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.p.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e8  */
    /* JADX WARN: Type inference failed for: r0v265, types: [java.lang.Throwable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.p.run():void");
    }

    public String toString() {
        switch (this.f24047a) {
            case 2:
                Runnable runnable = (Runnable) this.f24048b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + ((de.l) this.f24049c).f113283c + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p(Object obj2, Object obj3, int i) {
        this.f24047a = i;
        this.f24048b = obj2;
        this.f24049c = obj3;
    }

    public p(de.l lVar) {
        this.f24047a = 2;
        this.f24049c = lVar;
    }

    public p(z0 z0Var, t1 t1Var) {
        this.f24047a = 11;
        this.f24049c = z0Var;
        this.f24048b = (t1) Preconditions.checkNotNull(t1Var, "savedListener");
    }
}
