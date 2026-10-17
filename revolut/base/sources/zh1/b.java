package zh1;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import oki.h;
import qki.d;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements qh1.a {
    public final AddressFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f322212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f322213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f322214r;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData r23, gte.a r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "inputData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "featureToggleInteractor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r0.<init>()
            r0.o = r1
            r0.f322212p = r2
            com.revolut.feature.address.common.api.flow.AddressFlowContract$State r2 = new com.revolut.feature.address.common.api.flow.AddressFlowContract$State
            com.revolut.feature.address.models.Address r3 = r1.f60926a
            com.revolut.feature.address.models.Address r1 = r1.f60926a
            if (r3 != 0) goto L25
            com.revolut.feature.address.models.Address$Companion r3 = com.revolut.feature.address.models.Address.INSTANCE
            com.revolut.feature.address.models.Address r3 = r3.getEMPTY()
        L25:
            r2.<init>(r3)
            qki.d r2 = hx7.e.b(r0, r2)
            r0.f322213q = r2
            com.revolut.feature.address.common.api.flow.AddressFlowContract$Step$AddAddress r2 = new com.revolut.feature.address.common.api.flow.AddressFlowContract$Step$AddAddress
            if (r1 == 0) goto L61
            com.revolut.feature.address.models.Address$Companion r3 = com.revolut.feature.address.models.Address.INSTANCE
            com.revolut.feature.address.models.Address r4 = r3.getEMPTY()
            kotlin.jvm.internal.Intrinsics.h(r1)
            java.lang.String r10 = r1.getCountry()
            r20 = 32735(0x7fdf, float:4.5872E-41)
            r21 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.revolut.feature.address.models.Address r3 = com.revolut.feature.address.models.Address.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L61
            r1 = 1
            goto L62
        L61:
            r1 = 0
        L62:
            r2.<init>(r1)
            zba.a r1 = new zba.a
            r3 = 19
            r1.<init>(r0, r3)
            zhm.f0 r3 = zhm.f0.f322471a
            yki.a r1 = cp5.d.a(r0, r2, r3, r1)
            r0.f322214r = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.b.<init>(com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData, gte.a):void");
    }

    @Override // qki.e
    public final d getState() {
        return this.f322213q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f322214r;
    }
}
