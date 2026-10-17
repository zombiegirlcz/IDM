package com.fourthline.orca.internal;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yh0 implements d90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f35306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f35307b;

    public yh0(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f35306a = tracker;
        this.f35307b = new LinkedHashMap();
    }

    private final Pair b(String str) {
        return new Pair("request_duration", Long.valueOf(e(str)));
    }

    private final Pair c(String str) {
        return new Pair("request_name", str);
    }

    private final Pair d(String str) {
        if (str == null) {
            str = "N/A";
        }
        return new Pair("trace_id", str);
    }

    private final long e(String str) {
        Long l2 = (Long) this.f35307b.get(str);
        if (l2 == null) {
            return -1L;
        }
        return a() - l2.longValue();
    }

    @Override // com.fourthline.orca.internal.d90
    public void a(String requestName, Integer num) {
        Intrinsics.checkNotNullParameter(requestName, "requestName");
        this.f35307b.put(requestName, Long.valueOf(a()));
        jr0.a(jr0.f30017a, "orca_network_request_start", null, zhm.r0.k(c(requestName), new Pair("isPublic", Boolean.FALSE)), 2, null);
        this.f35306a.a(new h90(requestName, num != null ? num.intValue() : 0));
    }

    private final Pair b(Integer num) {
        return new Pair("status_code", Integer.valueOf(num != null ? num.intValue() : -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // com.fourthline.orca.internal.d90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21, com.fourthline.orca.internal.bb0 r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            java.lang.String r3 = "requestName"
            r5 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            if (r22 == 0) goto L27
            long r3 = r22.p()
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 < 0) goto L1e
            goto L1f
        L1e:
            r6 = 0
        L1f:
            if (r6 == 0) goto L27
            long r3 = r6.longValue()
        L25:
            r8 = r3
            goto L2c
        L27:
            long r3 = r17.e(r18)
            goto L25
        L2c:
            com.fourthline.orca.internal.jr0 r10 = com.fourthline.orca.internal.jr0.f30017a
            kotlin.Pair r11 = r17.c(r18)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            kotlin.Pair r12 = new kotlin.Pair
            java.lang.String r4 = "request_duration"
            r12.<init>(r4, r3)
            kotlin.Pair r13 = r0.a(r1)
            r3 = r21
            kotlin.Pair r14 = r0.d(r3)
            kotlin.Pair r15 = r0.b(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r6 = "isPublic"
            r4.<init>(r6, r3)
            r16 = r4
            kotlin.Pair[] r3 = new kotlin.Pair[]{r11, r12, r13, r14, r15, r16}
            java.util.Map r13 = zhm.r0.k(r3)
            r14 = 2
            r15 = 0
            java.lang.String r11 = "orca_network_request_succeed"
            r12 = 0
            com.fourthline.orca.internal.jr0.a(r10, r11, r12, r13, r14, r15)
            com.fourthline.orca.internal.f90 r4 = new com.fourthline.orca.internal.f90
            if (r1 == 0) goto L70
            int r1 = r1.intValue()
        L6e:
            r6 = r1
            goto L72
        L70:
            r1 = 0
            goto L6e
        L72:
            if (r2 == 0) goto L7c
            int r1 = r2.intValue()
        L78:
            r10 = r22
            r7 = r1
            goto L7e
        L7c:
            r1 = -1
            goto L78
        L7e:
            r4.<init>(r5, r6, r7, r8, r10)
            com.fourthline.orca.internal.sg0 r1 = r0.f35306a
            r1.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.yh0.a(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, com.fourthline.orca.internal.bb0):void");
    }

    @Override // com.fourthline.orca.internal.d90
    public void a(String requestName, Integer num, Integer num2, String str, Throwable th10) {
        Intrinsics.checkNotNullParameter(requestName, "requestName");
        jr0.a(jr0.f30017a, "orca_network_request_failed", null, zhm.r0.k(c(requestName), b(requestName), a(num), d(str), b(num2), a(th10 != null ? rg0.b(th10) : null), new Pair("isPublic", Boolean.FALSE)), 2, null);
        this.f35306a.a(new g90(requestName, num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : -1, th10, e(requestName)));
    }

    private final Pair a(Integer num) {
        return new Pair("request_size", Long.valueOf(num == null ? 0L : num.intValue()));
    }

    private final Pair a(String str) {
        if (str == null) {
            str = "N/A";
        }
        return new Pair("error_message", str);
    }

    private final long a() {
        return SystemClock.uptimeMillis();
    }
}
