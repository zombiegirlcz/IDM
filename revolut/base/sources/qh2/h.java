package qh2;

import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusUserDetailsDetails;
import com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import te0.w;
import tof.cc;
import tof.f7;
import tof.h7;
import tof.i7;
import tof.sa;
import tof.u9;
import tof.v5;
import tof.y6;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oh2.d f246436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nh2.e f246437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1.a f246438c;
    public final ang.f d;
    public final whf.b e;

    public h(oh2.d weroErrorProvider, nh2.e weroKeyProvider, fx1.a apmOnboardingRepository, ang.f userInteractor, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(weroErrorProvider, "weroErrorProvider");
        Intrinsics.checkNotNullParameter(weroKeyProvider, "weroKeyProvider");
        Intrinsics.checkNotNullParameter(apmOnboardingRepository, "apmOnboardingRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f246436a = weroErrorProvider;
        this.f246437b = weroKeyProvider;
        this.f246438c = apmOnboardingRepository;
        this.d = userInteractor;
        this.e = transactionsContentProvider;
    }

    public static WeroRegistrationStatus g(ApmOnboardingStatus apmOnboardingStatus) {
        if (apmOnboardingStatus instanceof ApmOnboardingStatus.Active) {
            return WeroRegistrationStatus.Active.f63035a;
        }
        if (!(apmOnboardingStatus instanceof ApmOnboardingStatus.NotRegistered)) {
            if (apmOnboardingStatus instanceof ApmOnboardingStatus.Pending) {
                return WeroRegistrationStatus.Pending.f63039a;
            }
            if (apmOnboardingStatus instanceof ApmOnboardingStatus.PendingUserAction) {
                throw new IllegalStateException("Unsupported Pending User Action status");
            }
            if (apmOnboardingStatus instanceof ApmOnboardingStatus.RemediationRequired) {
                throw new IllegalStateException(j6.a.q("Unsupported remediation status, workflowId=", ((ApmOnboardingStatus.RemediationRequired) apmOnboardingStatus).f61975a));
            }
            throw new NoWhenBranchMatchedException();
        }
        ApmOnboardingStatus.NotRegistered notRegistered = (ApmOnboardingStatus.NotRegistered) apmOnboardingStatus;
        ApmOnboardingStatusUserDetailsDetails apmOnboardingStatusUserDetailsDetails = notRegistered.f;
        if (apmOnboardingStatusUserDetailsDetails == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList arrayList = notRegistered.d;
        String str = notRegistered.f61968a;
        String str2 = notRegistered.f61969b;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str3 = notRegistered.f61970c;
        if (str3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str4 = apmOnboardingStatusUserDetailsDetails.f61980a;
        if (str4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str5 = apmOnboardingStatusUserDetailsDetails.f61981b;
        if (str5 != null) {
            return new WeroRegistrationStatus.NotRegistered(str2, str3, str, str4, str5, arrayList);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final vkm.d a() {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new f7(tof.l.WERO), new h7(tof.n.WERO), new sa(v5.WERO), new cc(u.c(y6.WERO_PAYMENT))};
        cVar.getClass();
        return rd0.e.b(whf.b.a(this.e, w.h(i7.c.a(i7.c.b(i7VarArr), new u9(false), i7.m.f272819a)), null, null, null, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof qh2.d
            if (r0 == 0) goto L13
            r0 = r6
            qh2.d r0 = (qh2.d) r0
            int r1 = r0.f246432w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246432w = r1
            goto L18
        L13:
            qh2.d r0 = new qh2.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246432w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f246432w = r4
            java.lang.Object r6 = r5.d(r0)
            if (r6 != r1) goto L42
            goto L52
        L42:
            qh2.b r6 = (qh2.b) r6
            com.revolut.feature.apm.core.api.product.ApmWero r2 = com.revolut.feature.apm.core.api.product.ApmWero.f61829c
            r0.f246432w = r3
            fx1.a r3 = r5.f246438c
            iz1.h r3 = (iz1.h) r3
            java.lang.Object r6 = r3.c(r2, r6, r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus r6 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus) r6
            com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus r6 = g(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.h.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qh2.e
            if (r0 == 0) goto L13
            r0 = r5
            qh2.e r0 = (qh2.e) r0
            int r1 = r0.f246433w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246433w = r1
            goto L18
        L13:
            qh2.e r0 = new qh2.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246433w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.d
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f246433w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            do3.n r5 = (do3.n) r5
            wi0.b r5 = do3.q.y(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.h.c(gim.c):java.io.Serializable");
    }

    public final Object d(gim.c cVar) {
        qc8.b bVar = new qc8.b(this, null, 5);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, bVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof qh2.f
            if (r0 == 0) goto L13
            r0 = r7
            qh2.f r0 = (qh2.f) r0
            int r1 = r0.f246434w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246434w = r1
            goto L18
        L13:
            qh2.f r0 = new qh2.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246434w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            yhm.o.b(r7)
            goto L56
        L39:
            yhm.o.b(r7)
            goto L4d
        L3d:
            yhm.o.b(r7)
            r0.f246434w = r5
            nh2.e r7 = r6.f246437b
            com.revolut.feature.apm.core.impl.crypto.o r7 = r7.f215296a
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4d
            goto L66
        L4d:
            r0.f246434w = r4
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L56
            goto L66
        L56:
            qh2.b r7 = (qh2.b) r7
            com.revolut.feature.apm.core.api.product.ApmWero r2 = com.revolut.feature.apm.core.api.product.ApmWero.f61829c
            r0.f246434w = r3
            fx1.a r3 = r6.f246438c
            iz1.h r3 = (iz1.h) r3
            java.lang.Object r7 = r3.d(r2, r7, r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.h.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof qh2.g
            if (r0 == 0) goto L13
            r0 = r7
            qh2.g r0 = (qh2.g) r0
            int r1 = r0.f246435w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246435w = r1
            goto L18
        L13:
            qh2.g r0 = new qh2.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246435w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            goto L91
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L39
            goto L5c
        L39:
            r7 = move-exception
            goto L5f
        L3b:
            yhm.o.b(r7)
            goto L4b
        L3f:
            yhm.o.b(r7)
            r0.f246435w = r5
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L4b
            goto L90
        L4b:
            qh2.b r7 = (qh2.b) r7
            fx1.a r2 = r6.f246438c     // Catch: java.lang.Throwable -> L39
            com.revolut.feature.apm.core.api.product.ApmWero r5 = com.revolut.feature.apm.core.api.product.ApmWero.f61829c     // Catch: java.lang.Throwable -> L39
            r0.f246435w = r4     // Catch: java.lang.Throwable -> L39
            iz1.h r2 = (iz1.h) r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r7 = r2.d(r5, r7, r0)     // Catch: java.lang.Throwable -> L39
            if (r7 != r1) goto L5c
            goto L90
        L5c:
            i02.h r7 = (i02.h) r7     // Catch: java.lang.Throwable -> L39
            return r7
        L5f:
            java.lang.String r2 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            boolean r2 = r7 instanceof com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException
            r4 = 0
            if (r2 != 0) goto L7e
            boolean r2 = r7 instanceof com.revolut.core.network.exceptions.HandledNetworkException
            if (r2 == 0) goto L6e
            goto L7e
        L6e:
            oh2.d r2 = r6.f246436a
            sf0.h r2 = r2.f225272a
            com.revolut.core.error.data.model.ServerError r2 = r2.a(r7)
            if (r2 == 0) goto L7e
            int r2 = r2.f51362a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
        L7e:
            if (r4 == 0) goto L94
            int r2 = r4.intValue()
            r4 = 2007(0x7d7, float:2.812E-42)
            if (r2 != r4) goto L94
            r0.f246435w = r3
            java.lang.Object r7 = r6.e(r0)
            if (r7 != r1) goto L91
        L90:
            return r1
        L91:
            i02.h r7 = (i02.h) r7
            return r7
        L94:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qh2.h.f(gim.c):java.lang.Object");
    }
}
