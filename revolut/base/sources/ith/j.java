package ith;

import cli.y;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsControllerContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentSection;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends oki.h implements h {
    public final AlternativeDocumentsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f168390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f168391q;

    public j(l stateMapper, AlternativeDocumentsControllerContract$InputData inputData, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f168390p = uriHelper;
        List list = inputData.f96415c;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a0.x(((AlternativeDocumentSection) it8.next()).f105572b, arrayList);
        }
        this.f168391q = mra.d.b(this, new f((DocumentGroup) d0.d0(arrayList), this.o.f96415c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f168391q;
    }
}
