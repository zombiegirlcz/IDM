package com.revolut.feature.kyc_documents_scan.ui.document_scan_flow;

import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xge.h;
import xy8.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData;", "Lxy8/b;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentScanFlow extends BaseFlow<DocumentScanFlowContract$Step, DocumentScanFlowContract$InputData, b> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentScanFlow(DocumentScanFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new xfj.a(this, inputData, 28));
        this.Q = w.y0(new h(this, 16));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (qy8.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (qy8.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (xy8.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        DocumentScanFlowContract$Step step = (DocumentScanFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
