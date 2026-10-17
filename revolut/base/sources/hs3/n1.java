package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n1 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154921c;
    public final ht3.l0 d;

    public n1(String sessionId, String customizationId, String str, ht3.l0 l0Var) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(customizationId, "customizationId");
        this.f154919a = sessionId;
        this.f154920b = customizationId;
        this.f154921c = str;
        this.d = l0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f154919a, n1Var.f154919a) && Intrinsics.f(this.f154920b, n1Var.f154920b) && Intrinsics.f(this.f154921c, n1Var.f154921c) && Intrinsics.f(this.d, n1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f154919a.hashCode() * 31, 31, this.f154920b);
        String str = this.f154921c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        ht3.l0 l0Var = this.d;
        return iHashCode + (l0Var != null ? l0Var.hashCode() : 0);
    }
}
