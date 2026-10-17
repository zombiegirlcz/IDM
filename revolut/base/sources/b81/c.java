package b81;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hlm.a f13086a;

    public c(hlm.a mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.f13086a = mutex;
    }

    public static String b(i81.c cVar) {
        if (Intrinsics.f(cVar, i81.a.f159409a)) {
            return "Ignore";
        }
        if (cVar instanceof i81.b) {
            return p.a.p("StatusDialog(dialogModel=", ((i81.b) cVar).f159410a.getClass().getSimpleName(), ")");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(i81.c r8, yji.l r9, gim.c r10) {
        /*
            r7 = this;
            java.lang.String r0 = "ErrorActionPerformer failed: "
            boolean r1 = r10 instanceof b81.b
            if (r1 == 0) goto L15
            r1 = r10
            b81.b r1 = (b81.b) r1
            int r2 = r1.f13085x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13085x = r2
            goto L1a
        L15:
            b81.b r1 = new b81.b
            r1.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f13085x
            r4 = 0
            hlm.a r5 = r7.f13086a
            r6 = 1
            if (r3 == 0) goto L3b
            if (r3 != r6) goto L33
            i81.b r8 = r1.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            goto L7d
        L2e:
            r8 = move-exception
            goto Lab
        L31:
            r9 = move-exception
            goto L87
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            yhm.o.b(r10)
            boolean r10 = r5.tryLock(r4)
            if (r10 != 0) goto L5c
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r10 = rd0.d.f253311a
            rd0.c r10 = rd0.c.ERROR
            java.lang.String r8 = b(r8)
            java.lang.String r0 = "performAction ignored as previous one is in progress, new action: "
            java.lang.String r8 = j6.a.q(r0, r8)
            java.lang.String r0 = "ErrorActionPerformer"
            rd0.d.a(r10, r0, r8, r4, r9)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L5c:
            boolean r10 = r8 instanceof i81.b     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            if (r10 == 0) goto L77
            r10 = r8
            i81.b r10 = (i81.b) r10     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            nii.y0 r10 = r10.f159410a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            kotlinx.coroutines.flow.Flow r9 = r9.X1(r10)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            r10 = r8
            i81.b r10 = (i81.b) r10     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            r1.u = r10     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            r1.f13085x = r6     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            java.lang.Object r8 = vkm.q.z(r9, r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            if (r8 != r2) goto L7d
            return r2
        L77:
            boolean r9 = r8 instanceof i81.a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            if (r9 == 0) goto L81
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
        L7d:
            r5.unlock(r4)
            goto La8
        L81:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            r9.<init>()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            throw r9     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
        L87:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = b(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r1.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = ", action: "
            r1.append(r9)     // Catch: java.lang.Throwable -> L2e
            r1.append(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            hx7.e.h(r10)     // Catch: java.lang.Throwable -> L2e
            goto L7d
        La8:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lab:
            r5.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b81.c.a(i81.c, yji.l, gim.c):java.lang.Object");
    }
}
