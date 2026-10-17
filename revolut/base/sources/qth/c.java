package qth;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentSelectionControllerContract$InputData f249121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249123c;

    public c(g gVar, h hVar, DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData) {
        this.f249121a = documentSelectionControllerContract$InputData;
        this.f249122b = e4m.b.b(new ppd.j(gVar, hVar, this, 1, 13));
        this.f249123c = e4m.b.b(new ppd.j(gVar, hVar, this, 0, 13));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
