package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d2 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f127312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2k.e f127313m;

    public d2(j60.a bottomDialogExtension, b2k.e taxesItemProvider) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        this.f127312l = bottomDialogExtension;
        this.f127313m = taxesItemProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(z3l.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof elf.c2
            if (r0 == 0) goto L13
            r0 = r6
            elf.c2 r0 = (elf.c2) r0
            int r1 = r0.f127306w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127306w = r1
            goto L18
        L13:
            elf.c2 r0 = new elf.c2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127306w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            b2k.e r6 = r4.f127313m
            v2k.c r6 = (v2k.c) r6
            rp0.y r5 = r6.b(r5)
            j60.a r6 = r4.f127312l
            efm.b r5 = r6.G(r5)
            r0.f127306w = r3
            java.lang.Object r5 = nim.a.a(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.d2.Z2(z3l.b, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return obj2 instanceof z3l.b ? Z2((z3l.b) obj2, (gim.c) continuation) : Boolean.FALSE;
    }
}
