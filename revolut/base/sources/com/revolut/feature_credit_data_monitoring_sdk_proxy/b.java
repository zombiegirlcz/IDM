package com.revolut.feature_credit_data_monitoring_sdk_proxy;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import nmm.h;
import nxh.c;
import org.jetbrains.annotations.NotNull;
import w31.e;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg0.a f96653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f96654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f96655c;
    public final Lazy d;
    public final Lazy e;

    public b(xg0.a dynamicDelivery, Context context, e deviceFingerprintInteractor) {
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceFingerprintInteractor, "deviceFingerprintInteractor");
        this.f96653a = dynamicDelivery;
        this.f96654b = context;
        this.f96655c = deviceFingerprintInteractor;
        this.d = j.b(new h(this, 24));
        this.e = j.b(new nwf.b(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_credit_data_monitoring_sdk_proxy.seon.SeonConfiguration r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof nxh.d
            if (r0 == 0) goto L13
            r0 = r12
            nxh.d r0 = (nxh.d) r0
            int r1 = r0.f220576w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220576w = r1
            goto L18
        L13:
            nxh.d r0 = new nxh.d
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220576w
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r12)
            goto L51
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r12)
            java.lang.String r6 = r11.getSessionId()
            int r7 = r11.getDnsTimeout()
            r0.f220576w = r3
            w31.e r5 = r10.f96655c
            dp4.y0 r4 = new dp4.y0
            r9 = 18
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r11, r4, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            b41.c r12 = (b41.c) r12
            if (r12 == 0) goto L5b
            com.revolut.feature_credit_data_monitoring_sdk_proxy.a r11 = new com.revolut.feature_credit_data_monitoring_sdk_proxy.a
            r11.<init>(r12)
            return r11
        L5b:
            com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError$SdkDisabled r11 = new com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError$SdkDisabled
            r11.<init>(r8)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_credit_data_monitoring_sdk_proxy.b.a(com.revolut.feature_credit_data_monitoring_sdk_proxy.seon.SeonConfiguration, gim.c):java.lang.Object");
    }
}
