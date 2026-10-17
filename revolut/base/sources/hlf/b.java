package hlf;

import elf.s0;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f153455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ap5.b f153456m;

    public b(h0 commonDataSource, ap5.b cryptoWithdrawInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        this.f153455l = commonDataSource;
        this.f153456m = cryptoWithdrawInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof hlf.a
            if (r0 == 0) goto L13
            r0 = r7
            hlf.a r0 = (hlf.a) r0
            int r1 = r0.f153454x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153454x = r1
            goto L18
        L13:
            hlf.a r0 = new hlf.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f153454x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            java.lang.String r0 = r0.u
            yhm.o.b(r7)
            goto L6d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            klf.h0 r7 = r6.f153455l
            kotlinx.coroutines.flow.SharedFlow r7 = r7.d()
            r0.f153454x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L4a
            goto L69
        L4a:
            tof.a3 r7 = (tof.a3) r7
            tof.p3 r7 = r7.W
            if (r7 == 0) goto L92
            java.lang.String r7 = r7.f272985g
            if (r7 != 0) goto L55
            goto L92
        L55:
            ap5.b r2 = r6.f153456m
            efm.r r2 = r2.g()
            vkm.d r2 = rd0.e.b(r2)
            r0.u = r7
            r0.f153454x = r4
            java.lang.Object r0 = vkm.q.x(r2, r0)
            if (r0 != r1) goto L6a
        L69:
            return r1
        L6a:
            r5 = r0
            r0 = r7
            r7 = r5
        L6d:
            zk5.c r7 = (zk5.c) r7
            java.lang.Object r7 = r7.f322909b
            java.lang.Object r7 = r7.get(r0)
            zk5.a r7 = (zk5.a) r7
            if (r7 == 0) goto L8f
            java.lang.String r7 = r7.f322905a
            if (r7 != 0) goto L7e
            goto L8f
        L7e:
            com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendDestination r0 = new com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendDestination
            com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput$BeneficiaryDetails r1 = new com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput$BeneficiaryDetails
            r2 = 0
            r1.<init>(r7, r2)
            r0.<init>(r1)
            r6.A2(r0)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L8f:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L92:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hlf.b.Z2(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_NAV_BAR_ICON") ? Z2((gim.c) continuation) : Boolean.FALSE;
    }
}
