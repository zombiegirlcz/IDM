package xlm;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vlm.j;
import wlm.l;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f307055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f307057c;
    public a d;
    public final ArrayList e;
    public boolean f;

    public b(d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f307055a = taskRunner;
        this.f307056b = name;
        this.e = new ArrayList();
    }

    public static void c(b bVar, String name, long j2, Function0 block, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        boolean z = (i & 4) != 0;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        bVar.d(new l(name, z, block), j2);
    }

    public final void a() {
        d dVar = this.f307055a;
        TimeZone timeZone = j.f290512a;
        synchronized (dVar) {
            try {
                if (b()) {
                    this.f307055a.c(this);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f307053b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f307053b) {
                Logger logger = this.f307055a.f307060b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    gc0.c.e(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(a task, long j2) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f307055a) {
            if (!this.f307057c) {
                if (f(task, j2, false)) {
                    this.f307055a.c(this);
                }
                Unit unit = Unit.f186387a;
            } else if (task.f307053b) {
                Logger logger = this.f307055a.f307060b;
                if (logger.isLoggable(Level.FINE)) {
                    gc0.c.e(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f307055a.f307060b;
                if (logger2.isLoggable(Level.FINE)) {
                    gc0.c.e(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(xlm.a r12, long r13, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r12.getClass()
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            xlm.b r0 = r12.f307054c
            if (r0 != r11) goto L12
            goto L16
        L12:
            if (r0 != 0) goto L94
            r12.f307054c = r11
        L16:
            xlm.d r0 = r11.f307055a
            vc.j r1 = r0.f307059a
            java.util.logging.Logger r0 = r0.f307060b
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.e
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L43
            long r9 = r12.d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L40
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L93
            java.lang.String r13 = "already scheduled"
            gc0.c.e(r0, r12, r11, r13)
            return r7
        L40:
            r5.remove(r6)
        L43:
            r12.d = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L69
            if (r15 == 0) goto L5b
            long r3 = r3 - r1
            java.lang.String r15 = gc0.c.i(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L66
        L5b:
            long r3 = r3 - r1
            java.lang.String r15 = gc0.c.i(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L66:
            gc0.c.e(r0, r12, r11, r15)
        L69:
            java.util.Iterator r15 = r5.iterator()
            r0 = r7
        L6e:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r15.next()
            xlm.a r3 = (xlm.a) r3
            long r3 = r3.d
            long r3 = r3 - r1
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L82
            goto L86
        L82:
            int r0 = r0 + 1
            goto L6e
        L85:
            r0 = r8
        L86:
            if (r0 != r8) goto L8c
            int r0 = r5.size()
        L8c:
            r5.add(r0, r12)
            if (r0 != 0) goto L93
            r12 = 1
            return r12
        L93:
            return r7
        L94:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xlm.b.f(xlm.a, long, boolean):boolean");
    }

    public final void g() {
        d dVar = this.f307055a;
        TimeZone timeZone = j.f290512a;
        synchronized (dVar) {
            try {
                this.f307057c = true;
                if (b()) {
                    this.f307055a.c(this);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final String toString() {
        return this.f307056b;
    }
}
