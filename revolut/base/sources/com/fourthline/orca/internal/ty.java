package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ty implements le, z90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33893c;
    private final List d;
    private final String e;

    public ty(String identifier, String workflowId, List bodyParts, String alias) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(bodyParts, "bodyParts");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f33892b = identifier;
        this.f33893c = workflowId;
        this.d = bodyParts;
        this.e = alias;
    }

    @Override // com.fourthline.orca.internal.le
    public String a() {
        return this.f33892b;
    }

    @Override // com.fourthline.orca.internal.le
    public /* bridge */ int b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.z90
    public ab0 c() {
        return new ab0.c(this.e, "/v1/workflows/" + this.f33893c + "/document", bx.g(), null, this.d, 8, null);
    }

    public final String e() {
        return this.f33893c;
    }

    public /* synthetic */ ty(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? "workflow_upload_document" : str3);
    }
}
