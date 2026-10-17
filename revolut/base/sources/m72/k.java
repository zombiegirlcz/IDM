package m72;

import android.content.Context;
import e8.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import tb4.t;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x92.j f203294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f203295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l72.e f203296c;
    public final ang.f d;
    public final z80.b e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f203297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f203298h;
    public static final /* synthetic */ KProperty[] i = {o0.f186429a.j(new h0(k.class, "triggerSdkFlow", "getTriggerSdkFlow()Lkotlinx/coroutines/flow/MutableSharedFlow;", 0))};

    @NotNull
    public static final c Companion = new c();

    public k(x92.j sdkProxy, t sdkLoader, l72.e multibancoInteractor, ang.f userInteractor, z80.b phoneToolsProvider, Context context, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(sdkProxy, "sdkProxy");
        Intrinsics.checkNotNullParameter(sdkLoader, "sdkLoader");
        Intrinsics.checkNotNullParameter(multibancoInteractor, "multibancoInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f203294a = sdkProxy;
        this.f203295b = sdkLoader;
        this.f203296c = multibancoInteractor;
        this.d = userInteractor;
        this.e = phoneToolsProvider;
        this.f = context;
        this.f203297g = b.y(null, null, true, 3, null);
        this.f203298h = new r((Function0) new ltf.b(coroutineScope, this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus.Registered r12, gim.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof m72.d
            if (r0 == 0) goto L13
            r0 = r13
            m72.d r0 = (m72.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            m72.d r0 = new m72.d
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f203281x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L4a
            if (r2 == r7) goto L46
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r13)
            return r13
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            int r12 = r0.f203280w
            int r2 = r0.v
            com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered r5 = r0.u
            yhm.o.b(r13)
            r10 = r13
            r13 = r12
            r12 = r5
            r5 = r2
            r2 = r10
            goto L8d
        L46:
            yhm.o.b(r13)
            return r13
        L4a:
            yhm.o.b(r13)
            tb4.t r13 = r11.f203295b
            java.lang.Object r2 = r13.f269456b
            xg0.a r2 = (xg0.a) r2
            java.lang.Object r8 = r13.f269457c
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r9 = "feature_apm_multibanco_sdk_impl"
            java.util.Set r9 = zhm.y0.b(r9)
            oi0.b r2 = (oi0.b) r2
            xg0.h r2 = r2.d(r8, r9)
            java.util.Set r2 = r2.f305464a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L7b
            r0.u = r6
            r0.v = r7
            r0.f203280w = r3
            r0.z = r7
            java.lang.Object r12 = r11.b(r12, r7, r3, r0)
            if (r12 != r1) goto L7a
            goto La4
        L7a:
            return r12
        L7b:
            r0.u = r12
            r0.v = r7
            r0.f203280w = r3
            r0.z = r5
            java.lang.Object r13 = r13.q(r0)
            if (r13 != r1) goto L8a
            goto La4
        L8a:
            r2 = r13
            r13 = r3
            r5 = r7
        L8d:
            xg0.u r2 = (xg0.u) r2
            boolean r2 = r2 instanceof xg0.q
            if (r2 == 0) goto La6
            if (r5 == 0) goto L96
            r3 = r7
        L96:
            r0.u = r6
            r0.v = r5
            r0.f203280w = r13
            r0.z = r4
            java.lang.Object r12 = r11.b(r12, r3, r13, r0)
            if (r12 != r1) goto La5
        La4:
            return r1
        La5:
            return r12
        La6:
            z92.g r12 = z92.j.Companion
            r12.getClass()
            java.lang.String r12 = "operation"
            java.lang.String r13 = "INSTALL"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r12)
            z92.h r12 = new z92.h
            com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkUnavailable r0 = new com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkUnavailable
            r0.<init>(r13, r6)
            r12.<init>(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m72.k.a(com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus.Registered r20, boolean r21, int r22, gim.c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m72.k.b(com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered, boolean, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1 A[PHI: r1 r4
      0x00f1: PHI (r1v12 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:42:0x00ee, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r4v12 boolean) = (r4v11 boolean), (r4v16 boolean) binds: [B:42:0x00ee, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m72.k.c(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [m72.k] */
    /* JADX WARN: Type inference failed for: r9v0, types: [z92.h, z92.j] */
    /* JADX WARN: Type inference failed for: r9v1, types: [z92.j] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, z92.j] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [z92.j] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(z92.h r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof m72.g
            if (r0 == 0) goto L13
            r0 = r10
            m72.g r0 = (m72.g) r0
            int r1 = r0.f203290x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203290x = r1
            goto L18
        L13:
            m72.g r0 = new m72.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203290x
            l72.e r3 = r8.f203296c
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L40
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            z92.j r9 = r0.u
            yhm.o.b(r10)
            goto L8b
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            z92.j r9 = r0.u
            yhm.o.b(r10)
            goto L76
        L40:
            z92.j r9 = r0.u
            yhm.o.b(r10)
            goto L69
        L46:
            yhm.o.b(r10)
            r0.u = r9
            r0.f203290x = r7
            a72.h r10 = r3.f192508a
            a72.g r2 = new a72.g
            r2.<init>(r10, r6, r5)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r0)
            if (r10 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L61:
            if (r10 != r1) goto L64
            goto L66
        L64:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L66:
            if (r10 != r1) goto L69
            goto L8a
        L69:
            r0.u = r9
            r0.f203290x = r5
            a72.h r10 = r3.f192508a
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L76
            goto L8a
        L76:
            boolean r2 = r10 instanceof com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus.Registered
            if (r2 == 0) goto L7d
            r6 = r10
            com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus$Registered r6 = (com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus.Registered) r6
        L7d:
            if (r6 == 0) goto L91
            r0.u = r9
            r0.f203290x = r4
            r10 = 0
            java.lang.Object r10 = r8.b(r6, r10, r7, r0)
            if (r10 != r1) goto L8b
        L8a:
            return r1
        L8b:
            z92.j r10 = (z92.j) r10
            if (r10 != 0) goto L90
            return r9
        L90:
            return r10
        L91:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m72.k.d(z92.h, gim.c):java.lang.Object");
    }
}
