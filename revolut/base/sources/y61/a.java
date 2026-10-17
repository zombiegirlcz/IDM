package y61;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f311114c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f311115g;

    public a(dj0.d topUpAmount, String idempotencyKey, String institutionId, String workflowId, String workflowStepId, String str, String str2) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f311112a = idempotencyKey;
        this.f311113b = institutionId;
        this.f311114c = topUpAmount;
        this.d = workflowId;
        this.e = workflowStepId;
        this.f = str;
        this.f311115g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f311112a, aVar.f311112a) && Intrinsics.f(this.f311113b, aVar.f311113b) && Intrinsics.f(this.f311114c, aVar.f311114c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f311115g, aVar.f311115g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(v7.c(p.a.c(this.f311112a.hashCode() * 31, 31, this.f311113b), 31, this.f311114c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f311115g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
