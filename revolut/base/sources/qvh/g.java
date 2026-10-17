package qvh;

import com.revolut.feature.workflow.sso.impl.ui.flow.WorkflowSsoFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends oki.h implements b {
    public final WorkflowSsoFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f249703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f249704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f249705r;

    public g(WorkflowSsoFlowContract$InputData inputData, jvh.a workflowInteractor, h dialogFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        this.o = inputData;
        this.f249703p = workflowInteractor;
        this.f249704q = dialogFactory;
        this.f249705r = d8l.d.a(this, new qsk.d(12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(qvh.g r6, java.lang.String r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof qvh.d
            if (r0 == 0) goto L13
            r0 = r8
            qvh.d r0 = (qvh.d) r0
            int r1 = r0.f249701x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249701x = r1
            goto L18
        L13:
            qvh.d r0 = new qvh.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249701x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L39
            goto L59
        L39:
            r8 = move-exception
            goto L4e
        L3b:
            yhm.o.b(r8)
            qvh.e r8 = new qvh.e     // Catch: java.lang.Exception -> L39
            r8.<init>(r6, r7, r5)     // Catch: java.lang.Exception -> L39
            r0.u = r7     // Catch: java.lang.Exception -> L39
            r0.f249701x = r4     // Catch: java.lang.Exception -> L39
            java.lang.Object r6 = ue8.c.f0(r6, r8, r0)     // Catch: java.lang.Exception -> L39
            if (r6 != r1) goto L59
            goto L5b
        L4e:
            r0.u = r5
            r0.f249701x = r3
            java.lang.Object r6 = r6.J2(r8, r7, r0)
            if (r6 != r1) goto L59
            goto L5b
        L59:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qvh.g.I2(qvh.g, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(java.lang.Exception r9, java.lang.String r10, gim.c r11) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r11 instanceof qvh.c
            if (r0 == 0) goto L14
            r0 = r11
            qvh.c r0 = (qvh.c) r0
            int r1 = r0.f249699w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f249699w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            qvh.c r0 = new qvh.c
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f249699w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r11)
            r1 = r8
            goto L66
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r11)
            boolean r11 = r9 instanceof com.revolut.sso.api.exceptions.UserCancelledSSOExceptionLegacy
            if (r11 == 0) goto L40
            mvh.a$a r9 = mvh.a.C1180a.f209253a
            r8.C2(r9)
            r1 = r8
            goto L6b
        L40:
            boolean r11 = r9 instanceof com.revolut.sso.api.exceptions.UserFailedSsoException
            if (r11 == 0) goto L6e
            lic.a r3 = new lic.a
            r9 = 11
            r3.<init>(r8, r9)
            iuf.y r4 = new iuf.y
            r9 = 20
            r4.<init>(r8, r9)
            pmk.t r5 = new pmk.t
            r9 = 24
            r11 = 0
            r5.<init>(r8, r10, r11, r9)
            r6.f249699w = r2
            r2 = 0
            r7 = 1
            r1 = r8
            java.lang.Object r9 = n14.k.V(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L66
            return r0
        L66:
            mvh.a$b r9 = mvh.a.b.f209254a
            r8.C2(r9)
        L6b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6e:
            r1 = r8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qvh.g.J2(java.lang.Exception, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new qc8.b(this, null, 16), new qtb.c(this, 9));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f249705r;
    }
}
