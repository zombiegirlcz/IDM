package qf0;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f245209a = new CopyOnWriteArrayList();

    public final void a(a guardian) {
        Intrinsics.checkNotNullParameter(guardian, "guardian");
        this.f245209a.remove(guardian);
    }

    public final void b(a guardian) {
        Intrinsics.checkNotNullParameter(guardian, "guardian");
        this.f245209a.add(guardian);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0060 -> B:21:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Exception r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qf0.b
            if (r0 == 0) goto L13
            r0 = r7
            qf0.b r0 = (qf0.b) r0
            int r1 = r0.f245208y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f245208y = r1
            goto L18
        L13:
            qf0.b r0 = new qf0.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f245206w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f245208y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r6 = r0.v
            java.lang.Exception r2 = r0.u
            yhm.o.b(r7)
            goto L63
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.f245209a
            java.util.List r7 = zhm.d0.d1(r7)
            kotlin.text.m r7 = zhm.b0.L(r7)
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L47:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r6.next()
            qf0.a r2 = (qf0.a) r2
            r0.u = r7
            r0.v = r6
            r0.f245208y = r3
            java.lang.Object r2 = r2.P(r7, r0)
            if (r2 != r1) goto L60
            return r1
        L60:
            r4 = r2
            r2 = r7
            r7 = r4
        L63:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6e
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L6e:
            r7 = r2
            goto L47
        L70:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qf0.c.c(java.lang.Exception, gim.c):java.lang.Object");
    }
}
