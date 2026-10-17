package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow;

import android.os.Parcelable;
import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w;
import s42.f;
import sb4.j;
import vkm.j2;
import xu3.a0;
import xu3.n0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends t implements sb4.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sb4.c f67730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FinancialEvidenceFlowContract$InputData f67731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qki.d f67732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f67733s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sb4.c financialEvidenceFlowInteractor, FinancialEvidenceFlowContract$InputData inputData, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(financialEvidenceFlowInteractor, "financialEvidenceFlowInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67730p = financialEvidenceFlowInteractor;
        this.f67731q = inputData;
        this.f67732r = hx7.e.b(this, new FinancialEvidenceFlowContract$State(null));
        f fVar = new f(this, 21);
        this.f67733s = cp5.d.a(this, FinancialEvidenceFlowContract$Step.Initial.f67717a, f0.f322471a, fVar);
    }

    public static final w P2(e eVar, a0 a0Var) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.financial_evidence_summary_success_title, u.c(a0Var.f308876a), null, 12);
        String str = a0Var.f308877b;
        TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(R$string.financial_evidence_summary_success_description, u.c(str), null, 12) : null;
        int i = sb4.e.f261504a[a0Var.f308878c.ordinal()];
        if (i == 1) {
            return new g0(textLocalisedClause, textLocalisedClause2, null, null, null, null, null, null, false, null, false, null, 16380);
        }
        if (i == 2) {
            return new j0((Clause) textLocalisedClause, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final n0 Q2() {
        n0 n0Var = ((FinancialEvidenceFlowContract$State) ((j2) this.f67732r.f22677a).getValue()).f67713a;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f67733s.d() instanceof FinancialEvidenceFlowContract$Step.Initial) {
            n2(new j(this, null, 1), new whi.b(6));
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f67732r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67733s;
    }
}
