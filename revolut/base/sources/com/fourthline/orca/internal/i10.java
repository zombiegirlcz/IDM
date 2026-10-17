package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowResults;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rc1 f29463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final le f29464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WorkflowResults.IDV f29465c;

    public i10(rc1 part, le request, WorkflowResults.IDV result) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f29463a = part;
        this.f29464b = request;
        this.f29465c = result;
    }

    public final le a() {
        return this.f29464b;
    }

    public final WorkflowResults.IDV b() {
        return this.f29465c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj2;
        return this.f29463a == i10Var.f29463a && Intrinsics.f(this.f29464b, i10Var.f29464b) && Intrinsics.f(this.f29465c, i10Var.f29465c);
    }

    public int hashCode() {
        return (((this.f29463a.hashCode() * 31) + this.f29464b.hashCode()) * 31) + this.f29465c.hashCode();
    }

    public String toString() {
        return "IdvUploadDataRequestSingleUnit(part=" + this.f29463a + ", request=" + this.f29464b + ", result=" + this.f29465c + ")";
    }
}
