package l40;

import android.os.Build;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.ui.agent_offline.AgentOfflineScreen;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.kompot.common.ModalDestination;
import java.util.UUID;
import kkf.r6;
import kkf.x5;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n30.p0;
import org.jetbrains.annotations.NotNull;
import v20.f0;
import v30.c0;
import vkm.z1;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final be7.k f192013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final be7.h f192014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n30.n f192015n;
    public final m30.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u20.f f192016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y80.a f192017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rf3.j f192018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p10.h f192019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final phm.a f192020t;
    public final z1 u;

    public q(be7.k inAppCallsInteractor, be7.h inAppCalls, n30.n chatInteractor, m30.j inAppCallRequestsInteractor, u20.f callRequestRepository, y80.a permissionProvider, j30.c chatFeatureToggles, rf3.j callRequestAvailabilityProvider, p10.h twilioModuleInstaller, h30.m inAppCallsFeatureAvailabilityLogger) {
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(inAppCalls, "inAppCalls");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(inAppCallRequestsInteractor, "inAppCallRequestsInteractor");
        Intrinsics.checkNotNullParameter(callRequestRepository, "callRequestRepository");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(callRequestAvailabilityProvider, "callRequestAvailabilityProvider");
        Intrinsics.checkNotNullParameter(twilioModuleInstaller, "twilioModuleInstaller");
        Intrinsics.checkNotNullParameter(inAppCallsFeatureAvailabilityLogger, "inAppCallsFeatureAvailabilityLogger");
        this.f192013l = inAppCallsInteractor;
        this.f192014m = inAppCalls;
        this.f192015n = chatInteractor;
        this.o = inAppCallRequestsInteractor;
        this.f192016p = callRequestRepository;
        this.f192017q = permissionProvider;
        this.f192018r = callRequestAvailabilityProvider;
        this.f192019s = twilioModuleInstaller;
        this.f192020t = inAppCallsFeatureAvailabilityLogger;
        this.u = vkm.q.b(1, 1, ukm.f.DROP_LATEST);
    }

    public static final void g3(q qVar, r rVar) {
        y80.a aVar = qVar.f192017q;
        boolean zC = aVar.c("android.permission.RECORD_AUDIO");
        int i = Build.VERSION.SDK_INT;
        boolean z = i < 31 || aVar.a();
        if (zC && z) {
            qVar.T2(new m(qVar, rVar, null), new yi5.b(27));
            return;
        }
        Companion.getClass();
        aim.e eVarB = zhm.u.b();
        if (i >= 31) {
            PermissionsControllerContract$Explanation.None none = PermissionsControllerContract$Explanation.None.f80324a;
            eVarB.add(new PermissionsControllerContract$Permission("android.permission.BLUETOOTH_CONNECT", none, none, false));
        }
        eVarB.add(new PermissionsControllerContract$Permission("android.permission.RECORD_AUDIO", new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.chat_permissions_microphone_denied_title, null, null, 14), new TextLocalisedClause(R$string.chat_permissions_microphone_denied_subtitle, null, null, 14), new TextLocalisedClause(R$string.chat_permissions_microphone_denied_request_access, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.chat_permissions_microphone_denied_title, null, null, 14), new TextLocalisedClause(R$string.chat_permissions_microphone_denied_subtitle, null, null, 14), new TextLocalisedClause(R$string.chat_permissions_microphone_denied_open_settings, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), true));
        yji.n.P2(qVar, new PermissionsController(new PermissionsControllerContract$InputData(zhm.u.a(eVarB))), null, new b(qVar, rVar, 0), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h3(l40.q r7, gim.c r8) {
        /*
            p10.h r0 = r7.f192019s
            boolean r1 = r8 instanceof l40.g
            if (r1 == 0) goto L15
            r1 = r8
            l40.g r1 = (l40.g) r1
            int r2 = r1.f191994w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f191994w = r2
            goto L1a
        L15:
            l40.g r1 = new l40.g
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f191994w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L32
            if (r3 != r5) goto L2a
            yhm.o.b(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            r8 = r0
            l40.v r8 = (l40.v) r8
            boolean r3 = r8.b()
            if (r3 == 0) goto L41
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L41:
            l40.t r3 = new l40.t
            r3.<init>(r8, r4, r5)
            vkm.v1 r8 = new vkm.v1
            r8.<init>(r3)
            blj.t r3 = new blj.t
            r6 = 10
            r3.<init>(r7, r6)
            r1.f191994w = r5
            java.lang.Object r8 = r8.collect(r3, r1)
            if (r8 != r2) goto L5b
            return r2
        L5b:
            r7.t2()
            l40.v r0 = (l40.v) r0
            boolean r8 = r0.b()
            if (r8 != 0) goto L85
            phm.a r7 = r7.f192020t
            java.lang.Object r7 = r7.get()
            be7.j r7 = (be7.j) r7
            r7.getClass()
            com.revolut.feature.in_app_calls.InAppCallsDisabledException r0 = new com.revolut.feature.in_app_calls.InAppCallsDisabledException
            java.lang.String r1 = "Call start failed: Twilio dynamic module is not installed"
            r0.<init>(r1)
            java.util.Set r7 = r7.a()
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "InAppCalls"
            rd0.d.a(r1, r2, r4, r0, r7)
        L85:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.q.h3(l40.q, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i3(l40.q r5, java.util.UUID r6, java.util.UUID r7, gim.c r8) {
        /*
            n30.n r0 = r5.f192015n
            boolean r1 = r8 instanceof l40.h
            if (r1 == 0) goto L15
            r1 = r8
            l40.h r1 = (l40.h) r1
            int r2 = r1.f191995w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f191995w = r2
            goto L1a
        L15:
            l40.h r1 = new l40.h
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r5 = r1.u
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f191995w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L70
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r5)
            if (r6 == 0) goto L49
            r0.getClass()
            java.lang.String r5 = "loadingStrategy"
            w4l.j r7 = w4l.j.f294644c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            v20.o r5 = r0.f211647a
            v20.f0 r5 = (v20.f0) r5
            efm.r r5 = r5.n(r6, r7)
            goto L50
        L49:
            if (r7 == 0) goto L75
            r5 = 0
            efm.r r5 = r0.h(r7, r5)
        L50:
            k8d.t r6 = new k8d.t
            r7 = 21
            r6.<init>(r7)
            l2c.v r7 = new l2c.v
            r0 = 5
            r7.<init>(r0)
            l2c.v r0 = new l2c.v
            r2 = 6
            r0.<init>(r2)
            efm.r r5 = m70.a.f(r5, r6, r7, r0)
            r1.f191995w = r3
            java.lang.Object r5 = nim.a.c(r5, r1)
            if (r5 != r8) goto L70
            return r8
        L70:
            od0.i r5 = (od0.i) r5
            java.lang.Object r5 = r5.f224257a
            return r5
        L75:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.q.i3(l40.q, java.util.UUID, java.util.UUID, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j3(l40.q r8, java.util.UUID r9, l40.r r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof l40.i
            if (r0 == 0) goto L13
            r0 = r11
            l40.i r0 = (l40.i) r0
            int r1 = r0.f191998y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191998y = r1
            goto L18
        L13:
            l40.i r0 = new l40.i
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f191996w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191998y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            l40.r r10 = r0.v
            java.util.UUID r9 = r0.u
            yhm.o.b(r11)
        L2a:
            r3 = r9
            r7 = r10
            goto L51
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            yhm.o.b(r11)
            n30.n r11 = r8.f192015n
            w4l.j r2 = w4l.j.f294644c
            jhi.k r11 = r11.i(r2)
            zfd.e r11 = zi0.c.w(r11)
            r0.u = r9
            r0.v = r10
            r0.f191998y = r3
            java.lang.Object r11 = vkm.q.x(r11, r0)
            if (r11 != r1) goto L2a
            return r1
        L51:
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            java.lang.Object r9 = r11.getContent()
            java.util.List r9 = (java.util.List) r9
            r10 = 0
            if (r9 == 0) goto L7d
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L62:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L76
            java.lang.Object r11 = r9.next()
            r0 = r11
            v30.y r0 = (v30.y) r0
            v30.c0 r0 = r0.f285834b
            v30.c0 r1 = v30.c0.SUPPORT
            if (r0 != r1) goto L62
            goto L77
        L76:
            r11 = r10
        L77:
            v30.y r11 = (v30.y) r11
            if (r11 == 0) goto L7d
            java.util.UUID r10 = r11.f285833a
        L7d:
            r4 = r10
            java.lang.String r5 = r7.d
            r6 = 0
            r2 = r8
            r2.o3(r3, r4, r5, r6, r7)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.q.j3(l40.q, java.util.UUID, l40.r, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k3(l40.q r11, v30.j r12, java.util.UUID r13, java.util.UUID r14, l40.r r15, gim.c r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.q.k3(l40.q, v30.j, java.util.UUID, java.util.UUID, l40.r, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l3(l40.q r7, java.util.UUID r8, java.util.UUID r9, l40.r r10, gim.c r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof l40.o
            if (r0 == 0) goto L14
            r0 = r11
            l40.o r0 = (l40.o) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            l40.o r0 = new l40.o
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f192008x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.z
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            l40.r r10 = r6.f192007w
            java.util.UUID r9 = r6.v
            java.util.UUID r8 = r6.u
            yhm.o.b(r11)
            r1 = r7
            goto L54
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            yhm.o.b(r11)
            if (r8 == 0) goto L63
            r6.u = r8
            r6.v = r9
            r6.f192007w = r10
            r6.z = r2
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            java.lang.Object r11 = r1.p3(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L51
            return r0
        L51:
            r8 = r2
            r9 = r3
            r10 = r5
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r7 = r11.booleanValue()
            if (r7 == 0) goto L5f
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5f:
            r3 = r8
            r2 = r9
            r6 = r10
            goto L6b
        L63:
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r3
            r3 = r2
            r2 = r6
            r6 = r5
        L6b:
            java.lang.String r4 = r6.d
            r5 = 0
            r1.o3(r2, r3, r4, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.q.l3(l40.q, java.util.UUID, java.util.UUID, l40.r, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[PHI: r2
      0x000c: PHI (r2v1 com.revolut.chat.domain.model.AgentPresenceState) = (r2v0 com.revolut.chat.domain.model.AgentPresenceState), (r2v9 com.revolut.chat.domain.model.AgentPresenceState) binds: [B:3:0x0001, B:7:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static w30.b m3(com.revolut.chat.domain.model.AgentPresenceState r2, com.revolut.chat.data.repository.chat.AgentInfo r3) {
        /*
            r0 = 0
            if (r2 != 0) goto Lc
            if (r3 == 0) goto L8
            com.revolut.chat.domain.model.AgentPresenceState r2 = r3.f51009s
            goto L9
        L8:
            r2 = r0
        L9:
            if (r2 != 0) goto Lc
            goto L12
        Lc:
            v30.e r3 = r2.f51026a
            v30.e r1 = v30.e.ACTIVE
            if (r3 != r1) goto L13
        L12:
            return r0
        L13:
            int[] r0 = v30.f.f285772a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            switch(r3) {
                case 1: goto L2a;
                case 2: goto L2a;
                case 3: goto L2a;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L24;
                default: goto L1e;
            }
        L1e:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L24:
            v30.a r3 = v30.a.OUT_OF_OFFICE
            goto L2c
        L27:
            v30.a r3 = v30.a.OFFLINE
            goto L2c
        L2a:
            v30.a r3 = v30.a.ONLINE
        L2c:
            int[] r0 = l40.d.f191991b
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L4a
            r0 = 2
            if (r3 == r0) goto L4a
            r2 = 3
            if (r3 == r2) goto L47
            r2 = 4
            if (r3 != r2) goto L41
            goto L47
        L41:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L47:
            w30.b$a r2 = w30.b.a.f294077a
            return r2
        L4a:
            w30.a r3 = new w30.a
            org.joda.time.Instant r2 = r2.f51027b
            r3.<init>(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.q.m3(com.revolut.chat.domain.model.AgentPresenceState, com.revolut.chat.data.repository.chat.AgentInfo):w30.b");
    }

    @Override // l40.a
    public final Flow Z2(UUID feedId, c0 feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        int i = d.f191990a[feedType.ordinal()];
        if (i == 1) {
            return new go.g(Boolean.FALSE, 2);
        }
        if (i == 2) {
            return new x5(this.f192018r.a(), 25);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (feedId == null) {
            return new go.g(Boolean.FALSE, 2);
        }
        n30.n nVar = this.f192015n;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new r6(new n1g.p(((f0) nVar.f211647a).m(loadingStrategy), feedId, 2), 12);
    }

    @Override // l40.a
    public final z1 b3() {
        return this.u;
    }

    @Override // l40.a
    public final z1 c3() {
        return ((v) this.f192019s).e;
    }

    @Override // l40.a
    public final Flow d3() {
        return vkm.q.q(new an9.i(rd0.e.b(((com.revolut.feature.in_app_calls.b) this.f192013l).f74794b), 26));
    }

    @Override // l40.a
    public final void e3(v20.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        T2(new l34.a(this, message, null, 2), new yi5.b(27));
    }

    @Override // l40.a
    public final void f3(r request) {
        Intrinsics.checkNotNullParameter(request, "request");
        T2(new l34.a(this, request, null, 3), new yi5.b(27));
    }

    public final void n3(w30.b bVar, UUID uuid, r rVar) {
        N2(new AgentOfflineScreen(bVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new khg.s(this, 18, uuid, rVar));
    }

    public final void o3(UUID uuid, UUID uuid2, String str, ChatAgent.Live live, r rVar) {
        ((p0) this.o).h(uuid, uuid2, str, live);
        this.u.k(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p3(java.util.UUID r11, java.util.UUID r12, com.revolut.chat.data.repository.chat.AgentInfo r13, l40.r r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.q.p3(java.util.UUID, java.util.UUID, com.revolut.chat.data.repository.chat.AgentInfo, l40.r, gim.c):java.lang.Object");
    }
}
