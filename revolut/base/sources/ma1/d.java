package ma1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa1.d f203873a;

    public d(sa1.d sdkAdapter) {
        Intrinsics.checkNotNullParameter(sdkAdapter, "sdkAdapter");
        this.f203873a = sdkAdapter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ma1.c
            if (r0 == 0) goto L13
            r0 = r8
            ma1.c r0 = (ma1.c) r0
            int r1 = r0.f203872w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203872w = r1
            goto L18
        L13:
            ma1.c r0 = new ma1.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203872w
            sa1.d r3 = r7.f203873a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            goto L6d
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            yhm.o.b(r8)
            goto L5a
        L38:
            yhm.o.b(r8)
            r8 = r3
            sa1.q r8 = (sa1.q) r8
            r8.getClass()
            s2i.i r2 = new s2i.i
            r6 = 1
            r2.<init>(r8, r6)
            rfm.o r8 = new rfm.o
            r8.<init>(r2)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f203872w = r5
            java.lang.Object r8 = nim.a.i(r8, r0)
            if (r8 != r1) goto L5a
            goto L6c
        L5a:
            qa1.e r8 = (qa1.e) r8
            if (r8 != 0) goto L6f
            sa1.q r3 = (sa1.q) r3
            efm.d0 r8 = r3.a()
            r0.f203872w = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            qa1.e r8 = (qa1.e) r8
        L6f:
            int r8 = r8.f243933a
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.d.a(gim.c):java.lang.Object");
    }

    public final rfm.l b() {
        sa1.q qVar = (sa1.q) this.f203873a;
        qVar.getClass();
        rfm.o oVar = new rfm.o(new s2i.i(qVar, 1));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        rfm.m mVar = new rfm.m(new rfm.f(oVar, new m78.e(new m98.k(this, 3), 7), 2), new m78.e(new m9l.d(3), 8), 1);
        ufm.i iVar = new ufm.i(new ufm.c(new h4d.d(this, 21), 0), new m78.e(new m9l.d(4), 9), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        rfm.l lVarL = mVar.l(iVar);
        Intrinsics.checkNotNullExpressionValue(lVarL, "switchIfEmpty(...)");
        return lVarL;
    }
}
