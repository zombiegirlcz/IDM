package ega;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvh.a f125576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f125577b;

    public d(jvh.a workflowInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f125576a = workflowInteractor;
        this.f125577b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ega.b
            if (r0 == 0) goto L13
            r0 = r8
            ega.b r0 = (ega.b) r0
            int r1 = r0.f125573w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125573w = r1
            goto L18
        L13:
            ega.b r0 = new ega.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125573w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L4a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            jvh.a r8 = r6.f125576a
            vkm.d r7 = r8.f(r7)
            d4f.m r8 = new d4f.m
            r2 = 2
            r4 = 10
            r5 = 0
            r8.<init>(r2, r4, r5)
            r0.f125573w = r3
            java.lang.Object r8 = vkm.q.y(r7, r8, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r7 = r8.getContent()
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L57
            yhm.m$a r8 = yhm.m.INSTANCE
            return r7
        L57:
            java.lang.Throwable r7 = r8.getError()
            if (r7 == 0) goto L64
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
            return r7
        L64:
            yhm.m$a r7 = yhm.m.INSTANCE
            zhm.f0 r7 = zhm.f0.f322471a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ega.d.a(java.util.Map, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x010e, code lost:
    
        if (r10 == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r10) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ega.d.b(gim.c):java.lang.Object");
    }
}
