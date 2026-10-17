package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class pi implements le, z90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31970c;
    private final String d;
    private final String e;

    public pi(String workflowId, String documentId, String data) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f31969b = workflowId;
        this.f31970c = documentId;
        this.d = data;
        this.e = "documentDataUpload";
    }

    @Override // com.fourthline.orca.internal.le
    public String a() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.le
    public /* bridge */ int b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.z90
    public ab0 c() {
        return new ab0.a("workflow_document_details", ab0.b.f26760b, "/v1/workflows/" + this.f31969b + "/documents/" + this.f31970c + "/confirm", bx.a(), null, tc.a(this.d), 16, null);
    }

    @Override // com.fourthline.orca.internal.le
    public /* bridge */ boolean d() {
        return super.d();
    }
}
