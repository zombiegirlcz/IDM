package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class il implements le, z90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29624c;
    private final String d;
    private final List e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f29625g;

    public il(String workflowId, String documentId, String imageId, List bodyParts) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(bodyParts, "bodyParts");
        this.f29623b = workflowId;
        this.f29624c = documentId;
        this.d = imageId;
        this.e = bodyParts;
        this.f = "documentImageUpload_" + imageId;
        this.f29625g = true;
    }

    @Override // com.fourthline.orca.internal.le
    public String a() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.le
    public /* bridge */ int b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.z90
    public ab0 c() {
        return new ab0.c("workflow_upload_document_picture", "/v1/workflows/" + this.f29623b + "/documents/" + this.f29624c + "/file", bx.g(), null, this.e, 8, null);
    }

    @Override // com.fourthline.orca.internal.le
    public boolean d() {
        return this.f29625g;
    }

    public final String e() {
        return this.f29623b;
    }
}
