package com.revolut.feature_credit_data_monitoring_sdk_proxy;

import b41.c;
import com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements nxh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f96652a;

    public a(c delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f96652a = delegate;
    }

    @Override // nxh.b
    public final boolean a() {
        return false;
    }

    @Override // nxh.b
    public final Object b(IncogniaCustomEvent incogniaCustomEvent, Continuation continuation) {
        return Unit.f186387a;
    }

    @Override // nxh.b
    public final Object c(Continuation continuation) throws Throwable {
        Object objA = this.f96652a.a((gim.c) continuation);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nxh.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof nxh.a
            if (r0 == 0) goto L13
            r0 = r5
            nxh.a r0 = (nxh.a) r0
            int r1 = r0.f220575w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220575w = r1
            goto L18
        L13:
            nxh.a r0 = new nxh.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220575w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.IllegalArgumentException -> L4b
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            b41.c r5 = r4.f96652a     // Catch: java.lang.IllegalArgumentException -> L4b
            r0.f220575w = r3     // Catch: java.lang.IllegalArgumentException -> L4b
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.IllegalArgumentException -> L4b
            if (r5 != r1) goto L3d
            return r1
        L3d:
            t31.a r5 = (t31.a) r5     // Catch: java.lang.IllegalArgumentException -> L4b
            qxh.a r0 = new qxh.a
            java.lang.String r1 = r5.f267609a
            java.time.Instant r2 = r5.f267610b
            java.time.Instant r5 = r5.f267611c
            r0.<init>(r1, r2, r5)
            return r0
        L4b:
            com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError$InvalidStateError r5 = com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError.InvalidStateError.f96651a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_credit_data_monitoring_sdk_proxy.a.d(gim.c):java.lang.Object");
    }
}
