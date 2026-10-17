package com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import d8l.d;
import hib.n;
import hth.g;
import ivh.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements hth.b {

    @NotNull
    public static final g Companion = new g();
    public final WorkflowDocumentSelectionFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oth.a f96416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jvh.a f96417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qd0.b f96418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f96419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f80.a f96420t;
    public final i u;

    public b(WorkflowDocumentSelectionFlowContract$InputData inputData, oth.a citizenshipPickerControllerInteractorFactory, jvh.a workflowInteractor, qd0.b languageProvider, c workflowsErrorHandlerExtension, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(citizenshipPickerControllerInteractorFactory, "citizenshipPickerControllerInteractorFactory");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(workflowsErrorHandlerExtension, "workflowsErrorHandlerExtension");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f96416p = citizenshipPickerControllerInteractorFactory;
        this.f96417q = workflowInteractor;
        this.f96418r = languageProvider;
        this.f96419s = workflowsErrorHandlerExtension;
        this.f96420t = uriHelper;
        this.u = d.a(this, new hfb.d(this, 20));
    }

    public final void I2(MobileScreenParams mobileScreenParams) {
        c.c3(this.f96419s, "DocumentSelection", new n((Object) this, (Object) mobileScreenParams, (Continuation) null, 11), new hth.h(this, null, 1), null, 24);
    }

    @Override // yki.j
    public final void M0() {
        c.c3(this.f96419s, "DocumentSelection", new a(this, null), new hth.h(this, null, 0), null, 24);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
