package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q11 implements r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OrcaFlavor f32159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ny f32160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OnProductCompleted f32161c;
    private final e01 d;
    private final ye1 e;
    private final lg1 f;

    public q11(OrcaFlavor flavor, ny firstFlow, OnProductCompleted completionBlock, e01 selfieConfig, ye1 tenantConfig, lg1 networkConfig) {
        Intrinsics.checkNotNullParameter(flavor, "flavor");
        Intrinsics.checkNotNullParameter(firstFlow, "firstFlow");
        Intrinsics.checkNotNullParameter(completionBlock, "completionBlock");
        Intrinsics.checkNotNullParameter(selfieConfig, "selfieConfig");
        Intrinsics.checkNotNullParameter(tenantConfig, "tenantConfig");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f32159a = flavor;
        this.f32160b = firstFlow;
        this.f32161c = completionBlock;
        this.d = selfieConfig;
        this.e = tenantConfig;
        this.f = networkConfig;
    }

    @Override // com.fourthline.orca.internal.r70
    public /* bridge */ ff a() {
        return super.a();
    }

    @Override // com.fourthline.orca.internal.r70
    public lg1 b() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.r70
    public /* bridge */ boolean c() {
        return super.c();
    }

    @Override // com.fourthline.orca.internal.r70
    public /* bridge */ WorkflowDataDelegate d() {
        return super.d();
    }

    @Override // com.fourthline.orca.internal.r70
    public ny e() {
        return this.f32160b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q11)) {
            return false;
        }
        q11 q11Var = (q11) obj2;
        return Intrinsics.f(this.f32159a, q11Var.f32159a) && Intrinsics.f(this.f32160b, q11Var.f32160b) && Intrinsics.f(this.f32161c, q11Var.f32161c) && Intrinsics.f(this.d, q11Var.d) && Intrinsics.f(this.e, q11Var.e) && Intrinsics.f(this.f, q11Var.f);
    }

    @Override // com.fourthline.orca.internal.r70
    public ye1 f() {
        return this.e;
    }

    public final OnProductCompleted g() {
        return this.f32161c;
    }

    @Override // com.fourthline.orca.internal.r70
    public OrcaFlavor getFlavor() {
        return this.f32159a;
    }

    public final e01 h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.f32159a.hashCode() * 31) + this.f32160b.hashCode()) * 31) + this.f32161c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "SelfieMainRepository(flavor=" + this.f32159a + ", firstFlow=" + this.f32160b + ", completionBlock=" + this.f32161c + ", selfieConfig=" + this.d + ", tenantConfig=" + this.e + ", networkConfig=" + this.f + ")";
    }

    @Override // com.fourthline.orca.internal.r70, com.fourthline.orca.internal.ch1
    public /* bridge */ void a(eg1 eg1Var) {
        super.a(eg1Var);
    }

    public /* synthetic */ q11(OrcaFlavor orcaFlavor, ny nyVar, OnProductCompleted onProductCompleted, e01 e01Var, ye1 ye1Var, lg1 lg1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orcaFlavor, (i & 2) != 0 ? new v11() : nyVar, onProductCompleted, e01Var, ye1Var, lg1Var);
    }
}
