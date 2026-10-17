package com.revolut.retail.feature.pricing_plans.ui.impl.flows.student;

import cha.c;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step;
import com.revolut.revolut.feature_fourthline_impl.R;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import rbh.k;
import rik.b;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final StudentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f103269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f103270q;

    public a(StudentFlowContract$InputData inputData, c studentPlanInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        this.o = inputData;
        this.f103269p = studentPlanInteractor;
        this.f103270q = d.a(this, new r6f.i(this, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof rik.f
            if (r0 == 0) goto L13
            r0 = r6
            rik.f r0 = (rik.f) r0
            int r1 = r0.f254592w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254592w = r1
            goto L18
        L13:
            rik.f r0 = new rik.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254592w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L4c
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            cha.c r5 = r5.f103269p
            akg.n r5 = cha.c.a(r5)
            rhj.m r6 = new rhj.m
            r2 = 6
            r6.<init>(r2)
            jhi.b r5 = mo3.a.g(r5, r4, r6, r3)
            r0.f254592w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            pha.a r6 = (pha.a) r6
            do3.u r5 = r6.f236250a
            if (r5 == 0) goto L55
            do3.t r5 = r5.f116432a
            goto L56
        L55:
            r5 = r4
        L56:
            r6 = -1
            if (r5 != 0) goto L5b
            r5 = r6
            goto L63
        L5b:
            int[] r0 = rik.d.f254590a
            int r5 = r5.ordinal()
            r5 = r0[r5]
        L63:
            if (r5 == r6) goto L82
            if (r5 == r3) goto L7c
            r6 = 2
            if (r5 == r6) goto L79
            r6 = 3
            if (r5 != r6) goto L73
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step$StudentVerification r5 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step$StudentVerification
            r5.<init>(r4)
            return r5
        L73:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L79:
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step$StudentHub r5 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step.StudentHub.f103266a
            return r5
        L7c:
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step$StudentVerification r5 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step$StudentVerification
            r5.<init>(r4)
            return r5
        L82:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "StudentFlow initial step couldn't be resolved as student is null"
            r5.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a.I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a, gim.c):java.lang.Object");
    }

    public final void J2() {
        l.b1(this, X1(new y0(null, new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, new r0e.c(this, null, 26), 3);
    }

    @Override // yki.j
    public final void M0() {
        StudentFlowContract$InputData studentFlowContract$InputData = this.o;
        StudentFlowContract$InputData.Mode mode = studentFlowContract$InputData.f103261a;
        Continuation continuation = null;
        if (Intrinsics.f(mode, StudentFlowContract$InputData.Mode.Default.f103262a)) {
            l2(new k(this, continuation, 5), new rik.c(this, 0));
            return;
        }
        boolean zF = Intrinsics.f(mode, StudentFlowContract$InputData.Mode.Status.f103263a);
        i iVar = this.f103270q;
        if (zF) {
            h.t2(this, iVar, StudentFlowContract$Step.StudentStatus.f103267a, false, null, false, 14);
        } else if (mode instanceof StudentFlowContract$InputData.Mode.VerificationCode) {
            h.t2(this, iVar, new StudentFlowContract$Step.StudentVerification(((StudentFlowContract$InputData.Mode.VerificationCode) studentFlowContract$InputData.f103261a).f103265a), false, null, false, 12);
        } else {
            if (!Intrinsics.f(mode, StudentFlowContract$InputData.Mode.Verification.f103264a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, iVar, new StudentFlowContract$Step.StudentVerification(null), false, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103270q;
    }
}
