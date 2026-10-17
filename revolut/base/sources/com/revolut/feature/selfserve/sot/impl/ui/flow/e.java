package com.revolut.feature.selfserve.sot.impl.ui.flow;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.api.navigation.SotDestination;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import java.util.List;
import k7i.i;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import xyc.l;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends h implements xyc.d {

    @NotNull
    private static final l Companion = new l();
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c0 f85941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f85942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xyc.f f85943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f85944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f85945t;
    public boolean u;
    public final qki.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f85946w;

    public e(SotDestination.Config input, f sotInteractor, c0 sotInstructionsInteractor, i sotStoriesInteractor, xyc.f sotFlowDialogMapper, j60.a bottomDialog) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(sotInteractor, "sotInteractor");
        Intrinsics.checkNotNullParameter(sotInstructionsInteractor, "sotInstructionsInteractor");
        Intrinsics.checkNotNullParameter(sotStoriesInteractor, "sotStoriesInteractor");
        Intrinsics.checkNotNullParameter(sotFlowDialogMapper, "sotFlowDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.o = sotInteractor;
        this.f85941p = sotInstructionsInteractor;
        this.f85942q = sotStoriesInteractor;
        this.f85943r = sotFlowDialogMapper;
        this.f85944s = bottomDialog;
        this.f85945t = v0.a.d("create(...)");
        SotDestination.Config.Sot sot = input instanceof SotDestination.Config.Sot ? (SotDestination.Config.Sot) input : null;
        this.v = hx7.e.b(this, new SotFlowContract$FlowState(sot != null ? sot.f85899a : false, 16382));
        this.f85946w = cp5.d.a(this, SotFlowContract$Step.Loading.f85930a, f0.f322471a, new xwd.a(this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.selfserve.sot.impl.ui.flow.e r6, gim.c r7) {
        /*
            qki.d r0 = r6.v
            boolean r1 = r7 instanceof xyc.m
            if (r1 == 0) goto L15
            r1 = r7
            xyc.m r1 = (xyc.m) r1
            int r2 = r1.f309721w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f309721w = r2
            goto L1a
        L15:
            xyc.m r1 = new xyc.m
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f309721w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r7)
            goto L5d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            java.lang.Object r7 = r0.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState r7 = (com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState) r7
            com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence r7 = r7.k
            if (r7 == 0) goto L45
            java.lang.String r7 = r7.f85881a
            goto L46
        L45:
            r7 = 0
        L46:
            xx9.f r3 = new xx9.f
            r5 = 13
            r3.<init>(r5)
            r6.H2(r0, r3)
            if (r7 == 0) goto L6b
            kpj.f r3 = r6.o
            r1.f309721w = r4
            java.io.Serializable r7 = r3.m(r7, r1)
            if (r7 != r2) goto L5d
            return r2
        L5d:
            com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence r7 = (com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence) r7
            if (r7 == 0) goto L6b
            xw9.c r1 = new xw9.c
            r2 = 20
            r1.<init>(r7, r2)
            r6.H2(r0, r1)
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.selfserve.sot.impl.ui.flow.e.I2(com.revolut.feature.selfserve.sot.impl.ui.flow.e, gim.c):java.lang.Object");
    }

    public static SotFlowContract$Step.EvidenceList J2(e eVar, DocumentType documentType) {
        qki.d dVar = eVar.v;
        return new SotFlowContract$Step.EvidenceList(documentType, ((SotFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).k, ((SotFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).f85917l, false);
    }

    public final SotFlowContract$Step.Summary K2() {
        SotFlowContract$FlowState sotFlowContract$FlowState = (SotFlowContract$FlowState) ((j2) this.v.f22677a).getValue();
        return new SotFlowContract$Step.Summary(sotFlowContract$FlowState.f85912b, sotFlowContract$FlowState.f85913c, sotFlowContract$FlowState.k, sotFlowContract$FlowState.f85914g, sotFlowContract$FlowState.f85915h, sotFlowContract$FlowState.f, sotFlowContract$FlowState.e, sotFlowContract$FlowState.f85916j);
    }

    public final void L2(IncomeSource incomeSource) {
        H2(this.v, new xw9.c(incomeSource, 16));
        if (incomeSource.e.size() != 1) {
            N2(incomeSource);
        } else {
            A1(new xnl.f(this, incomeSource, null, 20), new yi5.b(25));
        }
    }

    public final void M2() {
        List list;
        qki.d dVar = this.v;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        IncomeSource incomeSource = ((SotFlowContract$FlowState) j2Var.getValue()).f85913c;
        if (incomeSource != null) {
            IncomeSource incomeSource2 = ((SotFlowContract$FlowState) j2Var2.getValue()).f85913c;
            yki.a aVar = this.f85946w;
            if (incomeSource2 != null && (list = incomeSource2.e) != null && list.size() > 1) {
                h.t2(this, aVar, new SotFlowContract$Step.DocumentSelection(incomeSource, ((SotFlowContract$FlowState) j2Var2.getValue()).d), true, null, false, 12);
                return;
            }
            DocumentType documentType = ((SotFlowContract$FlowState) j2Var2.getValue()).e;
            if (documentType == null) {
                return;
            }
            h.t2(this, aVar, J2(this, documentType), true, null, false, 12);
            if (((SotFlowContract$FlowState) j2Var2.getValue()).k == null) {
                n2(new xge.f(this, incomeSource, documentType, null, 20), new whi.b(6));
            }
        }
    }

    public final void N2(IncomeSource incomeSource) {
        if (!Intrinsics.f(incomeSource.f85873a, "OTHER_TRANSACTION")) {
            M2();
        } else {
            h.t2(this, this.f85946w, new SotFlowContract$Step.EvidenceDescription(((SotFlowContract$FlowState) ((j2) this.v.f22677a).getValue()).f85914g), true, null, false, 12);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.u) {
            return;
        }
        this.u = true;
        if (this.f226127l) {
            return;
        }
        n2(new a(this, null), new whi.b(6));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85946w;
    }
}
