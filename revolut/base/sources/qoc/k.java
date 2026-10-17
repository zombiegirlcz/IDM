package qoc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.l f248127a;

    public k(ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f248127a = tradingConfigInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof qoc.j
            if (r0 == 0) goto L13
            r0 = r6
            qoc.j r0 = (qoc.j) r0
            int r1 = r0.f248123w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248123w = r1
            goto L18
        L13:
            qoc.j r0 = new qoc.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248123w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            ybl.l r6 = r5.f248127a
            akg.n r6 = ybl.l.d(r6)
            qjj.g r2 = new qjj.g
            r4 = 16
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f248123w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r6 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r6
            hel.b r6 = r6.f105106a
            if (r6 != 0) goto L55
            r6 = -1
            goto L5d
        L55:
            int[] r0 = qoc.i.f248122a
            int r6 = r6.ordinal()
            r6 = r0[r6]
        L5d:
            if (r6 != r3) goto L62
            r6 = 360(0x168, float:5.04E-43)
            goto L64
        L62:
            r6 = 120(0x78, float:1.68E-43)
        L64:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qoc.k.a(gim.c):java.lang.Object");
    }
}
