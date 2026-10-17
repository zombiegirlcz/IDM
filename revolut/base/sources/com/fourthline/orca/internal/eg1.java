package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class eg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg1 f28128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye1 f28129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ny f28130c;

    public eg1(lg1 networkConfig, ye1 tenantConfig, ny nyVar) {
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(tenantConfig, "tenantConfig");
        this.f28128a = networkConfig;
        this.f28129b = tenantConfig;
        this.f28130c = nyVar;
    }

    public final ny a() {
        return this.f28130c;
    }

    public final lg1 b() {
        return this.f28128a;
    }

    public final ye1 c() {
        return this.f28129b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof eg1)) {
            return false;
        }
        eg1 eg1Var = (eg1) obj2;
        return Intrinsics.f(this.f28128a, eg1Var.f28128a) && Intrinsics.f(this.f28129b, eg1Var.f28129b) && Intrinsics.f(this.f28130c, eg1Var.f28130c);
    }

    public int hashCode() {
        int iHashCode = ((this.f28128a.hashCode() * 31) + this.f28129b.hashCode()) * 31;
        ny nyVar = this.f28130c;
        return iHashCode + (nyVar == null ? 0 : nyVar.hashCode());
    }

    public String toString() {
        return "WorkflowMobileSession(networkConfig=" + this.f28128a + ", tenantConfig=" + this.f28129b + ", firstFlow=" + this.f28130c + ")";
    }
}
