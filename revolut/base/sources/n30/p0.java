package n30;

import az0.r1;
import com.revolut.chat.data.network.InAppCallSupportApi;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.feature.in_app_calls.CallModuleNotAvailableException;
import com.revolut.feature.in_app_calls.Callee;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements m30.j, be7.p {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f211653l = TimeUnit.DAYS.toMillis(180);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f211654m = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f211655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z70.a f211656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InAppCallSupportApi f211657c;
    public final be7.h d;
    public final be7.k e;
    public final phm.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue0.c f211658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bm0.a f211659h;
    public final hh0.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tf3.b f211660j;
    public final hlm.c k;

    public p0(CoroutineScope appScope, s20.d agentDataSource, z70.a contextProvider, InAppCallSupportApi inAppCallSupportApi, y10.c callMapper, be7.h inAppCalls, be7.k inAppCallsInteractor, h30.m inAppCallsFeatureAvailabilityLogger, ue0.c storage, bm0.a cryptoWrapper, l80.e dateProvider, hh0.e cloudMessagingTokenProvider, tf3.b chatAuthorizationStatus) {
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        Intrinsics.checkNotNullParameter(agentDataSource, "agentDataSource");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(inAppCallSupportApi, "inAppCallSupportApi");
        Intrinsics.checkNotNullParameter(callMapper, "callMapper");
        Intrinsics.checkNotNullParameter(inAppCalls, "inAppCalls");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(inAppCallsFeatureAvailabilityLogger, "inAppCallsFeatureAvailabilityLogger");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(cloudMessagingTokenProvider, "cloudMessagingTokenProvider");
        Intrinsics.checkNotNullParameter(chatAuthorizationStatus, "chatAuthorizationStatus");
        this.f211655a = appScope;
        this.f211656b = contextProvider;
        this.f211657c = inAppCallSupportApi;
        this.d = inAppCalls;
        this.e = inAppCallsInteractor;
        this.f = inAppCallsFeatureAvailabilityLogger;
        this.f211658g = storage;
        this.f211659h = cryptoWrapper;
        this.i = cloudMessagingTokenProvider;
        this.f211660j = chatAuthorizationStatus;
        this.k = hlm.d.a();
        skm.e0.C(appScope, null, null, new r1(this, null, 9), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n30.p0 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof n30.n0
            if (r0 == 0) goto L13
            r0 = r6
            n30.n0 r0 = (n30.n0) r0
            int r1 = r0.f211650w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211650w = r1
            goto L18
        L13:
            n30.n0 r0 = new n30.n0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211650w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            return r5
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            yhm.o.b(r6)
            goto L4e
        L3a:
            yhm.o.b(r6)
            hh0.e r6 = r5.i
            hi0.c r6 = (hi0.c) r6
            ufm.b r6 = r6.a()
            r0.f211650w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L4e
            goto L5b
        L4e:
            java.lang.String r6 = (java.lang.String) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            r0.f211650w = r3
            java.lang.Object r5 = r5.d(r0, r6, r4)
            if (r5 != r1) goto L5c
        L5b:
            return r1
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.p0.a(n30.p0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof n30.i0
            if (r0 == 0) goto L13
            r0 = r12
            n30.i0 r0 = (n30.i0) r0
            int r1 = r0.f211633x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211633x = r1
            goto L18
        L13:
            n30.i0 r0 = new n30.i0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211633x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.UUID r11 = r0.u
            yhm.o.b(r12)
            goto L63
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            yhm.o.b(r12)
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r4 = rd0.c.DEBUG
            java.lang.String r12 = "confirmUserIdentity >> ticketId="
            java.lang.String r6 = prk.o.r(r11, r12)
            r8 = 0
            r9 = 16
            java.lang.String r5 = "InAppCalls"
            r7 = 0
            rd0.d.b(r4, r5, r6, r7, r8, r9)
            java.util.UUID r12 = java.util.UUID.randomUUID()
            java.lang.String r2 = "randomUUID(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            r0.u = r11
            r0.f211633x = r3
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            com.revolut.chat.data.network.InAppCallSupportApi r3 = r10.f211657c
            java.lang.Object r12 = r3.confirmIdentity(r11, r12, r2, r0)
            if (r12 != r1) goto L63
            return r1
        L63:
            be7.k r12 = r10.e
            com.revolut.feature.in_app_calls.b r12 = (com.revolut.feature.in_app_calls.b) r12
            r12.c(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.p0.b(java.util.UUID, gim.c):java.lang.Object");
    }

    public final pfm.r c(String fcmToken) {
        Intrinsics.checkNotNullParameter(fcmToken, "fcmToken");
        return te0.w.g0(pd.b.n(skm.p0.f264003c, new j0(this, fcmToken, null)));
    }

    @Override // od0.e
    public final void clear() {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "InAppCalls", "Clear Twilio registration state", null, null, 16);
        this.f211658g.I0("TWILIO_REGISTRATION_STATE_V1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021d A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:14:0x0043, B:70:0x0215, B:72:0x021d, B:74:0x023f, B:75:0x0244, B:76:0x0247, B:77:0x024c, B:21:0x006c, B:66:0x01e9, B:24:0x0099, B:62:0x01c1, B:27:0x00ad, B:29:0x00ba, B:31:0x00ce, B:35:0x0102, B:37:0x010a, B:40:0x0111, B:42:0x0117, B:54:0x0136, B:55:0x0148, B:58:0x01b4), top: B:83:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0259  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r30, java.lang.String r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.p0.d(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof n30.l0
            if (r0 == 0) goto L13
            r0 = r5
            n30.l0 r0 = (n30.l0) r0
            int r1 = r0.f211644w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211644w = r1
            goto L18
        L13:
            n30.l0 r0 = new n30.l0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211644w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f211644w = r3
            com.revolut.chat.data.network.InAppCallSupportApi r5 = r4.f211657c
            java.lang.Object r5 = r5.getCallsInfo(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            f20.c r5 = (f20.c) r5
            boolean r5 = r5.getInProgressPhoneCall()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.p0.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r11, java.lang.String r12, java.util.UUID r13, gim.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof n30.o0
            if (r0 == 0) goto L13
            r0 = r14
            n30.o0 r0 = (n30.o0) r0
            int r1 = r0.f211652w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211652w = r1
            goto L18
        L13:
            n30.o0 r0 = new n30.o0
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211652w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L55
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r14)
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r14 = "randomUUID(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r14)
            if (r11 != 0) goto L40
            java.lang.String r11 = "flow"
        L40:
            r8 = r11
            f20.i r5 = f20.i.IN_APP
            f20.g r4 = new f20.g
            r6 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f211652w = r3
            com.revolut.chat.data.network.InAppCallSupportApi r11 = r10.f211657c
            java.lang.Object r14 = r11.createInboundCall(r4, r0)
            if (r14 != r1) goto L55
            return r1
        L55:
            m20.n r14 = (m20.n) r14
            java.util.UUID r11 = r14.getId()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.p0.g(java.lang.String, java.lang.String, java.util.UUID, gim.c):java.lang.Object");
    }

    public final void h(UUID uuid, UUID uuid2, String str, ChatAgent.Live live) {
        String name;
        boolean zB = ((com.revolut.feature.in_app_calls.b) this.e).b();
        be7.h hVar = this.d;
        if (zB) {
            ((com.revolut.feature.in_app_calls.a) hVar).c();
            return;
        }
        com.revolut.feature.in_app_calls.a aVar = (com.revolut.feature.in_app_calls.a) hVar;
        if (!aVar.b()) {
            throw new CallModuleNotAvailableException(0);
        }
        Callee callee = null;
        if (live != null && (name = live.getName()) != null) {
            callee = new Callee(name, live.getTitle(), live.getId(), live.getAvatarUrl());
        }
        aVar.e(uuid, uuid2, str, callee);
    }
}
