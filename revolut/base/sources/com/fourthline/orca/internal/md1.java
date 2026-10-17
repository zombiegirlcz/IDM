package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class md1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd1 f31164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final od1 f31165b;

    public md1(pd1 pd1Var, od1 od1Var) {
        this.f31164a = pd1Var;
        this.f31165b = od1Var;
    }

    public final od1 a() {
        return this.f31165b;
    }

    public final pd1 b() {
        return this.f31164a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof md1)) {
            return false;
        }
        md1 md1Var = (md1) obj2;
        return Intrinsics.f(this.f31164a, md1Var.f31164a) && Intrinsics.f(this.f31165b, md1Var.f31165b);
    }

    public int hashCode() {
        pd1 pd1Var = this.f31164a;
        int iHashCode = (pd1Var == null ? 0 : pd1Var.hashCode()) * 31;
        od1 od1Var = this.f31165b;
        return iHashCode + (od1Var != null ? od1Var.hashCode() : 0);
    }

    public String toString() {
        return "ValidationDocAnalysisInput(recognitionData=" + this.f31164a + ", documentIdData=" + this.f31165b + ")";
    }

    public /* synthetic */ md1(pd1 pd1Var, od1 od1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pd1Var, (i & 2) != 0 ? null : od1Var);
    }
}
