package e0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f121590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bgf.h f121591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121592c;

    public d0(c0 type, bgf.h transactionWorkflow, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        this.f121590a = type;
        this.f121591b = transactionWorkflow;
        this.f121592c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f121590a == d0Var.f121590a && Intrinsics.f(this.f121591b, d0Var.f121591b) && Intrinsics.f(this.f121592c, d0Var.f121592c);
    }

    public final int hashCode() {
        int iHashCode = (this.f121591b.hashCode() + (this.f121590a.hashCode() * 31)) * 31;
        String str = this.f121592c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
