package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class qy implements le, z90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32560c;
    private final String d;

    public qy(String identifier, String workflowId, String data) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f32559b = identifier;
        this.f32560c = workflowId;
        this.d = data;
    }

    @Override // com.fourthline.orca.internal.le
    public String a() {
        return this.f32559b;
    }

    @Override // com.fourthline.orca.internal.le
    public /* bridge */ int b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.z90
    public ab0 c() {
        return new ab0.a("workflow_upload_data", ab0.b.f26761c, "/v1/workflows/" + this.f32560c + "/data", bx.a(), null, tc.a(this.d), 16, null);
    }

    @Override // com.fourthline.orca.internal.le
    public /* bridge */ boolean d() {
        return super.d();
    }
}
