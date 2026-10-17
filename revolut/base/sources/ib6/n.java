package ib6;

import cli.y;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeContract$InputData;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends oki.h implements dli.b {
    public final SpareChangeContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aa6.c f160104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f160105q;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeContract$InputData r7, aa6.c r8, ib6.i r9) {
        /*
            r6 = this;
            java.lang.String r0 = "inputData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "donationsInteractor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "stateMapper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r6.<init>()
            r6.o = r7
            r6.f160104p = r8
            yvh.b r7 = r7.f72011b
            r8 = 0
            if (r7 == 0) goto L21
            boolean r0 = r7.f317177b
            r1 = 1
            if (r0 != r1) goto L21
            r8 = r1
        L21:
            if (r7 == 0) goto L39
            java.lang.Float r7 = r7.i
            if (r7 == 0) goto L39
            float r0 = r7.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L31
            goto L32
        L31:
            r7 = 0
        L32:
            if (r7 == 0) goto L39
            float r7 = r7.floatValue()
            goto L3b
        L39:
            r7 = 1065353216(0x3f800000, float:1.0)
        L3b:
            ib6.c r1 = new ib6.c
            r1.<init>(r8, r7)
            r4 = 0
            r5 = 12
            r3 = 0
            r0 = r6
            r2 = r9
            cli.y r7 = mra.d.b(r0, r1, r2, r3, r4, r5)
            r0.f160105q = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ib6.n.<init>(com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeContract$InputData, aa6.c, ib6.i):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ib6.n r16, boolean r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ib6.n.I2(ib6.n, boolean, gim.c):java.lang.Object");
    }

    public final void J2(Object obj2) {
        Continuation continuation = null;
        if (obj2 instanceof b) {
            l2(new l(this, continuation, 1), new yi5.b(26));
        } else if (obj2 instanceof a) {
            l2(new l(this, continuation, 0), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f160105q;
    }
}
