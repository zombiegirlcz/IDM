package com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$Step;
import e65.c;
import e65.f;
import e65.g;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import ji1.m;
import k3k.k;
import k3k.q0;
import k65.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import rd0.c;
import vkm.j2;
import y45.i;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements k65.a {

    @NotNull
    private static final b Companion = new b();
    public final LoanCancellationV2FlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y45.b f70376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f70377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r35.a f70378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e65.h f70379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f70380t;
    public final yki.i u;

    public a(LoanCancellationV2FlowContract$InputData inputData, y45.b interactor, i loanProductInteractor, r35.a loanCommandsFactory, e65.h actionExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanCommandsFactory, "loanCommandsFactory");
        Intrinsics.checkNotNullParameter(actionExtension, "actionExtension");
        this.o = inputData;
        this.f70376p = interactor;
        this.f70377q = loanProductInteractor;
        this.f70378r = loanCommandsFactory;
        this.f70379s = actionExtension;
        this.f70380t = e.b(this, new LoanCancellationV2FlowContract$State(null, null));
        this.u = d8l.d.a(this, new k(this, 7));
    }

    public static final void I2(a aVar, Throwable th10) {
        aVar.getClass();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, th10, h0Var);
        l.a1(aVar, aVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new k22.c(aVar, null, 7), 3);
    }

    public static final Object J2(a aVar, e65.c cVar, gim.i iVar) {
        yki.i iVar2 = aVar.u;
        if (cVar instanceof g) {
            Object objM2 = aVar.M2(((g) cVar).f122899a.f70144a.f70108a, iVar);
            return objM2 == fim.a.COROUTINE_SUSPENDED ? objM2 : Unit.f186387a;
        }
        if (cVar instanceof f) {
            h.t2(aVar, iVar2, new LoanCancellationV2FlowContract$Step.SelectLoan(((f) cVar).f122898a), false, null, false, 12);
        } else if (cVar instanceof e65.d) {
            aVar.l2(new q0(aVar, ((e65.d) cVar).f122896a, null, 16), new yi5.b(26));
        } else {
            if (cVar instanceof e65.e) {
                Object objL2 = aVar.L2(((e65.e) cVar).f122897a.f70108a, iVar);
                return objL2 == fim.a.COROUTINE_SUSPENDED ? objL2 : Unit.f186387a;
            }
            if (cVar instanceof c.a) {
                h.D2(iVar2);
            } else {
                if (!(cVar instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i = jli.h.f175850a;
            }
        }
        return Unit.f186387a;
    }

    public final z45.c K2() {
        z45.c cVar = ((LoanCancellationV2FlowContract$State) ((j2) this.f70380t.f22677a).getValue()).f70372b;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof k65.g
            if (r0 == 0) goto L13
            r0 = r7
            k65.g r0 = (k65.g) r0
            int r1 = r0.f181641w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181641w = r1
            goto L18
        L13:
            k65.g r0 = new k65.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181641w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            k65.f r7 = new k65.f
            r2 = 2
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.f181641w = r3
            java.lang.Object r7 = r5.p2(r0, r7)
            if (r7 != r1) goto L42
            return r1
        L42:
            com.revolut.feature.credit.loan.api.models.rev10.Loan r7 = (com.revolut.feature.credit.loan.api.models.rev10.Loan) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            r35.a r6 = r5.f70378r
            g55.a r6 = (g55.a) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = r6.a(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.C1(r6)
            yki.i r6 = r5.u
            oki.h.D2(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a.L2(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 29), new k65.d(1, this, a.class, "handleErrorAndQuit", "handleErrorAndQuit(Ljava/lang/Throwable;)Z", 0, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof k65.h
            if (r0 == 0) goto L13
            r0 = r10
            k65.h r0 = (k65.h) r0
            int r1 = r0.f181643x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181643x = r1
            goto L18
        L13:
            k65.h r0 = new k65.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181643x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L46
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            k65.f r10 = new k65.f
            r2 = 0
            r4 = 3
            r10.<init>(r8, r9, r2, r4)
            r0.u = r9
            r0.f181643x = r3
            java.lang.Object r10 = r8.p2(r0, r10)
            if (r10 != r1) goto L46
            return r1
        L46:
            z45.c r10 = (z45.c) r10
            k1.a r0 = new k1.a
            r1 = 28
            r0.<init>(r9, r10, r1)
            qki.d r9 = r8.f70380t
            r8.H2(r9, r0)
            r6 = 0
            r7 = 12
            yki.i r2 = r8.u
            com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$Step$Prompt r3 = com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$Step.Prompt.f70374a
            r4 = 0
            r5 = 0
            r1 = r8
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a.M2(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // qki.e
    public final d getState() {
        return this.f70380t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
