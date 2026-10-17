package zt2;

import android.telecom.TelecomManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import be7.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import vfg.p;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.u1;
import vkm.z1;
import zfd.s;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f325048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m30.j f325049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f325050c;
    public final y80.a d;
    public final p e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TelecomManager f325051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o7.b f325052h;
    public final j2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1 f325053j;
    public final z1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a2 f325054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u1 f325055m;

    public c(CoroutineScope appCoroutineScope, m30.j inAppCallRequestsInteractor, k inAppCallsInteractor, y80.a permissionProvider, p callSecurityInfoAvailabilityInteractor, h phoneCallStateReceiver, TelecomManager telecomManager, o7.b activeCallsRepository, Lifecycle appLifecycle) {
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(inAppCallRequestsInteractor, "inAppCallRequestsInteractor");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(callSecurityInfoAvailabilityInteractor, "callSecurityInfoAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(phoneCallStateReceiver, "phoneCallStateReceiver");
        Intrinsics.checkNotNullParameter(telecomManager, "telecomManager");
        Intrinsics.checkNotNullParameter(activeCallsRepository, "activeCallsRepository");
        Intrinsics.checkNotNullParameter(appLifecycle, "appLifecycle");
        this.f325048a = appCoroutineScope;
        this.f325049b = inAppCallRequestsInteractor;
        this.f325050c = inAppCallsInteractor;
        this.d = permissionProvider;
        this.e = callSecurityInfoAvailabilityInteractor;
        this.f = phoneCallStateReceiver;
        this.f325051g = telecomManager;
        this.f325052h = activeCallsRepository;
        j2 j2VarC = q.c(st2.a.f265447a);
        this.i = j2VarC;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        z1 z1VarB = q.b(0, 2, fVar);
        Boolean bool = Boolean.FALSE;
        z1VarB.k(bool);
        this.f325053j = z1VarB;
        z1 z1VarB2 = q.b(0, 2, fVar);
        z1VarB2.k(bool);
        this.k = z1VarB2;
        appLifecycle.addObserver(this);
        this.f325055m = q.h(j2VarC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(zt2.c r7, zt2.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof zt2.b
            if (r0 == 0) goto L13
            r0 = r9
            zt2.b r0 = (zt2.b) r0
            int r1 = r0.f325047y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f325047y = r1
            goto L18
        L13:
            zt2.b r0 = new zt2.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f325045w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f325047y
            r3 = 2
            r4 = 0
            st2.a r5 = st2.a.f265447a
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L38
            if (r2 != r3) goto L30
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            goto L89
        L2d:
            r7 = move-exception
            goto L98
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            int r8 = r0.v
            int r2 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            goto L72
        L40:
            yhm.o.b(r9)
            vfg.p r9 = r7.e
            boolean r9 = r9.d()
            if (r9 != 0) goto L4c
            goto L5e
        L4c:
            boolean r9 = r8.f325042a
            if (r9 == 0) goto L56
            st2.b r7 = new st2.b
            r7.<init>(r6)
            return r7
        L56:
            boolean r9 = r8.f325043b
            if (r9 != 0) goto L5f
            boolean r8 = r8.f325044c
            if (r8 != 0) goto L5f
        L5e:
            return r5
        L5f:
            m30.j r8 = r7.f325049b     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            r0.u = r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            r0.v = r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            r0.f325047y = r6     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            n30.p0 r8 = (n30.p0) r8     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            java.lang.Object r9 = r8.e(r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            if (r9 != r1) goto L70
            goto L88
        L70:
            r8 = r4
            r2 = r8
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            if (r9 != 0) goto L91
            o7.b r7 = r7.f325052h     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            r0.u = r2     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            r0.v = r8     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            r0.f325047y = r3     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            java.lang.Object r9 = r7.n(r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            if (r9 != r1) goto L89
        L88:
            return r1
        L89:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            boolean r7 = r9.booleanValue()     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            if (r7 == 0) goto L92
        L91:
            r4 = r6
        L92:
            st2.b r7 = new st2.b     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            r7.<init>(r4)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> La7
            goto La3
        L98:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r9, r0, r0, r7, r8)
            r7 = r0
        La3:
            if (r7 == 0) goto La6
            r5 = r7
        La6:
            return r5
        La7:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zt2.c.a(zt2.c, zt2.a, gim.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        this.k.k(Boolean.valueOf(this.e.d() && this.d.c("android.permission.READ_PHONE_STATE") && this.f325051g.isInCall()));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        if (this.e.d()) {
            if (this.d.c("android.permission.READ_PHONE_STATE")) {
                this.f.a(this);
            }
            a2 a2Var = this.f325054l;
            Continuation continuation = null;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.f325054l = q.G(new q0(q.H(new zr5.k(this, continuation, 3), ta6.a.h(rd0.e.b(((com.revolut.feature.in_app_calls.b) this.f325050c).f74794b), this.f325053j, this.k, new puk.p(4, 1, null))), new s(this, continuation, 29), 1), this.f325048a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        this.f.onStop();
        a2 a2Var = this.f325054l;
        if (a2Var != null) {
            a2Var.f(null);
        }
        Boolean bool = Boolean.FALSE;
        this.f325053j.k(bool);
        this.k.k(bool);
        j2 j2Var = this.i;
        j2Var.getClass();
        j2Var.g(null, st2.a.f265447a);
    }
}
