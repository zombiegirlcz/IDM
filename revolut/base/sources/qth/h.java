package qth;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionFlowContract$InputData;
import java.util.Set;
import ql7.v1;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowDocumentSelectionFlowContract$InputData f249146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f249147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f249148c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f249149g;

    public h(g gVar, WorkflowDocumentSelectionFlowContract$InputData workflowDocumentSelectionFlowContract$InputData) {
        this.f249147b = gVar;
        this.f249146a = workflowDocumentSelectionFlowContract$InputData;
        int i = 6;
        this.d = e4m.b.b(new v1(gVar, this, 1, i));
        this.e = e4m.b.b(new v1(gVar, this, 0, i));
        this.f = e4m.b.b(new v1(gVar, this, 3, i));
        this.f249149g = e4m.b.b(new v1(gVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
