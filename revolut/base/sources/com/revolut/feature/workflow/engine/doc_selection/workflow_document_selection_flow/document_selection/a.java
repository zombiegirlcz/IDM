package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionConfiguration;
import com.revolut.kompot.common.ExternalDestination;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mnl.g;
import mra.d;
import mth.i;
import mth.m;
import mth.p;
import oki.h;
import rd0.c;
import yi5.b;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements m {
    public final DocumentSelectionControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oth.a f96430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jvh.a f96431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f80.a f96432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WorkflowDocumentSelectionConfiguration.CitizenshipPicker f96433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f96434t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(n stateMapper, DocumentSelectionControllerContract$InputData inputData, oth.a citizenshipPickerControllerInteractorFactory, jvh.a workflowInteractor, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(citizenshipPickerControllerInteractorFactory, "citizenshipPickerControllerInteractorFactory");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f96430p = citizenshipPickerControllerInteractorFactory;
        this.f96431q = workflowInteractor;
        this.f96432r = uriHelper;
        this.f96433s = inputData.f96421a.f96393b;
        this.f96434t = d.b(this, new i(inputData.f96422b, new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.u = e.a(this, new g(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        l2(new p(this, null), new b(26));
    }

    public final void I2() {
        WorkflowDocumentSelectionConfiguration.AlternativeDocuments alternativeDocuments = this.o.f96421a.f96392a.f;
        String str = alternativeDocuments != null ? alternativeDocuments.d : null;
        if (str != null && !d0.W(str)) {
            C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) this.f96432r).f(str), 0, null, 494));
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("Alternative methods faq deeplink can't be null");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, nullPointerException, h0Var);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f96434t;
    }
}
