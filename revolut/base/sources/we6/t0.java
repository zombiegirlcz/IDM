package we6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f296680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f296681c;
    public final String d;
    public final String e;
    public final String f;

    public t0(dj0.d amount, String workflowId, String workflowStepId, String str, List applicableCountries, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(applicableCountries, "applicableCountries");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f296679a = amount;
        this.f296680b = applicableCountries;
        this.f296681c = z;
        this.d = workflowId;
        this.e = workflowStepId;
        this.f = str;
    }

    public final dj0.d b() {
        return this.f296679a;
    }

    public final List c() {
        return this.f296680b;
    }

    public final boolean d() {
        return this.f296681c;
    }

    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f296679a, t0Var.f296679a) && Intrinsics.f(this.f296680b, t0Var.f296680b) && this.f296681c == t0Var.f296681c && Intrinsics.f(this.d, t0Var.d) && Intrinsics.f(this.e, t0Var.e) && Intrinsics.f(this.f, t0Var.f);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.c(p.a.d(this.f296679a.hashCode() * 31, 31, this.f296680b), 31, this.f296681c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
