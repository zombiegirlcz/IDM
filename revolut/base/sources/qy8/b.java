package qy8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlowContract$InputData;
import java.util.Set;
import ql7.d2;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentScanFlowContract$InputData f250250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f250251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f250252c = this;
    public final e4m.e d;
    public final e4m.e e;

    public b(a aVar, DocumentScanFlowContract$InputData documentScanFlowContract$InputData) {
        this.f250251b = aVar;
        this.f250250a = documentScanFlowContract$InputData;
        this.d = e4m.b.b(new d2(aVar, this, 1));
        this.e = e4m.b.b(new d2(aVar, this, 0));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
