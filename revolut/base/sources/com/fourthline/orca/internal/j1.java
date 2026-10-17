package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f1 f29780c;

    public j1(long j2, boolean z, f1 popupStrategy) {
        Intrinsics.checkNotNullParameter(popupStrategy, "popupStrategy");
        this.f29778a = j2;
        this.f29779b = z;
        this.f29780c = popupStrategy;
    }

    @Override // com.fourthline.orca.internal.i1
    public f1 a() {
        return this.f29780c;
    }

    @Override // com.fourthline.orca.internal.i1
    public long b() {
        return this.f29778a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return this.f29778a == j1Var.f29778a && this.f29779b == j1Var.f29779b && Intrinsics.f(this.f29780c, j1Var.f29780c);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f29778a) * 31) + Boolean.hashCode(this.f29779b)) * 31) + this.f29780c.hashCode();
    }

    @Override // com.fourthline.orca.internal.i1
    public boolean isDynamicStepsEnabled() {
        return this.f29779b;
    }

    public String toString() {
        return "AnalysisStepRepositoryBundle(imageUploadTimeoutMs=" + this.f29778a + ", isDynamicStepsEnabled=" + this.f29779b + ", popupStrategy=" + this.f29780c + ")";
    }
}
