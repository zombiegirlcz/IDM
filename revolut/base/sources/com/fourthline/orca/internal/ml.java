package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ml implements r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg1 f31212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye1 f31213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OrcaFlavor f31214c;
    private final ny d;
    private final OnProductCompleted e;
    private final um f;

    public ml(lg1 lg1Var, ye1 tenantConfig, OrcaFlavor flavor, ny firstFlow, OnProductCompleted completionBlock, um documentConfig) {
        Intrinsics.checkNotNullParameter(tenantConfig, "tenantConfig");
        Intrinsics.checkNotNullParameter(flavor, "flavor");
        Intrinsics.checkNotNullParameter(firstFlow, "firstFlow");
        Intrinsics.checkNotNullParameter(completionBlock, "completionBlock");
        Intrinsics.checkNotNullParameter(documentConfig, "documentConfig");
        this.f31212a = lg1Var;
        this.f31213b = tenantConfig;
        this.f31214c = flavor;
        this.d = firstFlow;
        this.e = completionBlock;
        this.f = documentConfig;
    }

    @Override // com.fourthline.orca.internal.r70
    public /* bridge */ ff a() {
        return super.a();
    }

    @Override // com.fourthline.orca.internal.r70
    public lg1 b() {
        return this.f31212a;
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
        return this.d;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj2;
        return Intrinsics.f(this.f31212a, mlVar.f31212a) && Intrinsics.f(this.f31213b, mlVar.f31213b) && Intrinsics.f(this.f31214c, mlVar.f31214c) && Intrinsics.f(this.d, mlVar.d) && Intrinsics.f(this.e, mlVar.e) && Intrinsics.f(this.f, mlVar.f);
    }

    @Override // com.fourthline.orca.internal.r70
    public ye1 f() {
        return this.f31213b;
    }

    public final OnProductCompleted g() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.r70
    public OrcaFlavor getFlavor() {
        return this.f31214c;
    }

    public final um h() {
        return this.f;
    }

    public int hashCode() {
        lg1 lg1Var = this.f31212a;
        return ((((((((((lg1Var == null ? 0 : lg1Var.hashCode()) * 31) + this.f31213b.hashCode()) * 31) + this.f31214c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "DocumentMainRepository(networkConfig=" + this.f31212a + ", tenantConfig=" + this.f31213b + ", flavor=" + this.f31214c + ", firstFlow=" + this.d + ", completionBlock=" + this.e + ", documentConfig=" + this.f + ")";
    }

    @Override // com.fourthline.orca.internal.r70, com.fourthline.orca.internal.ch1
    public /* bridge */ void a(eg1 eg1Var) {
        super.a(eg1Var);
    }
}
