package rq3;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature_credit_data_monitoring_sdk_proxy.b f256457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f256458b;

    public d(com.revolut.feature_credit_data_monitoring_sdk_proxy.b dataMonitoringFactory, Context context) {
        Intrinsics.checkNotNullParameter(dataMonitoringFactory, "dataMonitoringFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f256457a = dataMonitoringFactory;
        this.f256458b = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(bs3.d r12, gim.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof rq3.b
            if (r0 == 0) goto L13
            r0 = r13
            rq3.b r0 = (rq3.b) r0
            int r1 = r0.f256453w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256453w = r1
            goto L18
        L13:
            rq3.b r0 = new rq3.b
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256453w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)     // Catch: com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError -> L27
            goto L60
        L27:
            r0 = move-exception
            r12 = r0
            goto L63
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            java.lang.String r13 = "applicationContext"
            android.content.Context r6 = r11.f256458b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r13)
            java.lang.String r12 = r12.f18035a
            if (r12 != 0) goto L46
            java.lang.String r12 = "toString(...)"
            java.lang.String r12 = j6.a.p(r12)
        L46:
            r5 = r12
            od0.a r12 = od0.a.f224253a
            boolean r8 = od0.a.e()
            com.revolut.feature_credit_data_monitoring_sdk_proxy.seon.SeonConfiguration r4 = new com.revolut.feature_credit_data_monitoring_sdk_proxy.seon.SeonConfiguration
            r9 = 4
            r10 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.revolut.feature_credit_data_monitoring_sdk_proxy.b r12 = r11.f256457a     // Catch: com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError -> L27
            r0.f256453w = r3     // Catch: com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError -> L27
            java.lang.Object r13 = r12.a(r4, r0)     // Catch: com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError -> L27
            if (r13 != r1) goto L60
            return r1
        L60:
            nxh.b r13 = (nxh.b) r13     // Catch: com.revolut.feature_credit_data_monitoring_sdk_proxy.DataMonitoringError -> L27
            return r13
        L63:
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "ClientMonitoringConfigurationMapper"
            r2 = 0
            rd0.d.a(r0, r1, r2, r12, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rq3.d.a(bs3.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:26:0x00a2, B:35:0x00fd], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:37:0x0107, B:45:0x013f], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008f -> B:23:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f6 -> B:46:0x0141). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(bs3.a r22, java.lang.String r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rq3.d.b(bs3.a, java.lang.String, gim.c):java.lang.Object");
    }
}
