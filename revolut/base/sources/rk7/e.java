package rk7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f254753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f254754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl7.a f254755c;

    public e(Data claimDetails, Data transactionsContent, dl7.a policySubtype) {
        Intrinsics.checkNotNullParameter(claimDetails, "claimDetails");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter("123", "policyId");
        Intrinsics.checkNotNullParameter(policySubtype, "policySubtype");
        this.f254753a = claimDetails;
        this.f254754b = transactionsContent;
        this.f254755c = policySubtype;
    }

    public static e a(e eVar, Data claimDetails, Data transactionsContent, int i) {
        if ((i & 1) != 0) {
            claimDetails = eVar.f254753a;
        }
        if ((i & 2) != 0) {
            transactionsContent = eVar.f254754b;
        }
        eVar.getClass();
        dl7.a policySubtype = eVar.f254755c;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(claimDetails, "claimDetails");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter("123", "policyId");
        Intrinsics.checkNotNullParameter(policySubtype, "policySubtype");
        return new e(claimDetails, transactionsContent, policySubtype);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f254753a, eVar.f254753a) && Intrinsics.f(this.f254754b, eVar.f254754b) && this.f254755c == eVar.f254755c;
    }

    public final int hashCode() {
        return this.f254755c.hashCode() + ((((this.f254754b.hashCode() + (this.f254753a.hashCode() * 31)) * 31) + 48690) * 31);
    }
}
