package ndh;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends p5d.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z5j.d f214370l;

    public c(z5j.d commodityNavigationCommandProvider) {
        Intrinsics.checkNotNullParameter(commodityNavigationCommandProvider, "commodityNavigationCommandProvider");
        this.f214370l = commodityNavigationCommandProvider;
    }

    @Override // p5d.d
    public final Set Z2() {
        return h0.f322473a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p5d.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(p5d.b r5, p5d.f r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ndh.b
            if (r0 == 0) goto L13
            r0 = r7
            ndh.b r0 = (ndh.b) r0
            int r1 = r0.f214369x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214369x = r1
            goto L18
        L13:
            ndh.b r0 = new ndh.b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214369x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ndh.c r5 = r0.u
            yhm.o.b(r7)
            goto L66
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            int[] r7 = ndh.a.f214367a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r3) goto L4a
            r7 = 2
            if (r6 != r7) goto L44
            wd6.e r6 = wd6.e.SELL
            goto L4c
        L44:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L4a:
            wd6.e r6 = wd6.e.BUY
        L4c:
            xi0.a r7 = xi0.b.Companion
            java.lang.String r5 = r5.f233095a
            r7.getClass()
            xi0.b r5 = xi0.a.a(r5)
            r0.u = r4
            r0.f214369x = r3
            r7 = 0
            z5j.d r2 = r4.f214370l
            java.lang.Object r7 = r2.a(r6, r5, r7, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r5 = r4
        L66:
            aii.u r7 = (aii.u) r7
            r5.A2(r7)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ndh.c.b3(p5d.b, p5d.f, gim.c):java.lang.Object");
    }
}
