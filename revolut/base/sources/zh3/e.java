package zh3;

import e7l.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f322222a;

    public e(fk3.a configurationInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f322222a = configurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(th3.a r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.e.a(th3.a, gim.c):java.lang.Object");
    }

    public final Object b(d dVar) {
        return nim.a.b(o.l(((ik3.c) this.f322222a).l(g.b.f123407a, w4l.h.f294642c), null, null, 3, "firstOrError(...)"), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(th3.a r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zh3.d
            if (r0 == 0) goto L13
            r0 = r8
            zh3.d r0 = (zh3.d) r0
            int r1 = r0.f322221w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322221w = r1
            goto L18
        L13:
            zh3.d r0 = new zh3.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322221w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L5a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L6e
        L39:
            yhm.o.b(r8)
            goto L7c
        L3d:
            yhm.o.b(r8)
            int[] r8 = zh3.b.f322218a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r5) goto L73
            if (r7 == r4) goto L65
            if (r7 == r3) goto L80
            r8 = 4
            if (r7 != r8) goto L5f
            r0.f322221w = r3
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r1) goto L5a
            goto L7b
        L5a:
            e7l.f r8 = (e7l.f) r8
            int r5 = r8.f123391s
            goto L80
        L5f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L65:
            r0.f322221w = r4
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r1) goto L6e
            goto L7b
        L6e:
            e7l.f r8 = (e7l.f) r8
            int r5 = r8.f123388q
            goto L80
        L73:
            r0.f322221w = r5
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            e7l.f r8 = (e7l.f) r8
            int r5 = r8.f123389r
        L80:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.e.c(th3.a, gim.c):java.lang.Object");
    }
}
