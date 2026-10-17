package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow;

import c84.a0;
import c84.g;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.AddEvidenceFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.navigable.flow.FlowStep;
import e60.i;
import e60.s;
import ip0.u00;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m84.e;
import mb4.b;
import mb4.d;
import org.jetbrains.annotations.NotNull;
import sb4.c;
import yji.l;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends a0 implements b {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AddEvidenceFlowContract$InputData f67700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f67701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e60.a f67702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f67703s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AddEvidenceFlowContract$InputData inputData, c financialEvidenceFlowInteractor, e60.a mediaPickerControllerExtension, g pluginControllerModelExtension) {
        FlowStep evidenceTypeSelection;
        super(pluginControllerModelExtension);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(financialEvidenceFlowInteractor, "financialEvidenceFlowInteractor");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(pluginControllerModelExtension, "pluginControllerModelExtension");
        this.f67700p = inputData;
        this.f67701q = financialEvidenceFlowInteractor;
        this.f67702r = mediaPickerControllerExtension;
        xu3.d dVar = inputData.f67689a;
        if (dVar instanceof xu3.b) {
            evidenceTypeSelection = new AddEvidenceFlowContract$Step.EvidenceCategorySelection((xu3.b) dVar);
        } else {
            if (!(dVar instanceof xu3.c)) {
                throw new NoWhenBranchMatchedException();
            }
            evidenceTypeSelection = new AddEvidenceFlowContract$Step.EvidenceTypeSelection(zv3.a.CLOSE, ((xu3.c) dVar).f308883a);
        }
        this.f67703s = cp5.d.a(this, evidenceTypeSelection, f0.f322471a, new e(this, 5));
    }

    public final void I2(String str) {
        ((s) this.f67702r).T(new i(null, new TextLocalisedClause(R$string.financial_evidence_document_picker_title, u.c(str), null, 12), null, true, 0, 0, null, null, false, u00.BACK, null, 15861));
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(((s) this.f67702r).f122868g), null, new m75.i(this, null, 8), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67703s;
    }
}
