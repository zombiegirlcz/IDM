package c1g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0g.d f20485a;

    public g(q0g.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f20485a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof c1g.f
            if (r0 == 0) goto L13
            r0 = r6
            c1g.f r0 = (c1g.f) r0
            int r1 = r0.f20484w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20484w = r1
            goto L18
        L13:
            c1g.f r0 = new c1g.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20484w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L4e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            r0.f20484w = r3
            q0g.d r6 = r5.f20485a
            w4l.f r6 = r6.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r3 = 0
            efm.r r6 = r6.f(r2, r3)
            r2 = 3
            java.lang.String r3 = "firstOrError(...)"
            efm.d0 r6 = prk.o.l(r6, r4, r4, r2, r3)
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L78
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L58:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r6.next()
            r1 = r0
            ryf.a r1 = (ryf.a) r1
            java.lang.String r1 = r1.f258367a
            java.lang.String r2 = "VIATOR"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L58
            goto L71
        L70:
            r0 = r4
        L71:
            ryf.a r0 = (ryf.a) r0
            if (r0 == 0) goto L78
            java.lang.String r6 = r0.f258368b
            return r6
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c1g.g.a(gim.c):java.lang.Object");
    }
}
