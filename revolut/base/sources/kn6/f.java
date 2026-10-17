package kn6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f186016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExternalInstitution f186017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ho3.a f186018c;
    public final String d;
    public final String e;
    public final String f;

    public f(dj0.d amount, ExternalInstitution institution, ho3.a aVar, String workflowId, String workflowStepId, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f186016a = amount;
        this.f186017b = institution;
        this.f186018c = aVar;
        this.d = workflowId;
        this.e = workflowStepId;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f186016a, fVar.f186016a) && Intrinsics.f(this.f186017b, fVar.f186017b) && Intrinsics.f(this.f186018c, fVar.f186018c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f186017b.hashCode() + (this.f186016a.hashCode() * 31)) * 31;
        ho3.a aVar = this.f186018c;
        int iC = p.a.c(p.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
