package ql4;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f247081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f247082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f247083c;
    public final List d;
    public final r0 e;
    public final e0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f247084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f247085h;
    public final ArrayList i;

    public a(dj0.d maxPlanAmount, dj0.d minTransactionAmount, List transactionIds, List tagAvailableTransactionIds, r0 transactionSelectionRule, e0 eligibilityStatus, n0 n0Var, List terms, ArrayList documents) {
        Intrinsics.checkNotNullParameter(maxPlanAmount, "maxPlanAmount");
        Intrinsics.checkNotNullParameter(minTransactionAmount, "minTransactionAmount");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(tagAvailableTransactionIds, "tagAvailableTransactionIds");
        Intrinsics.checkNotNullParameter(transactionSelectionRule, "transactionSelectionRule");
        Intrinsics.checkNotNullParameter(eligibilityStatus, "eligibilityStatus");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f247081a = maxPlanAmount;
        this.f247082b = minTransactionAmount;
        this.f247083c = transactionIds;
        this.d = tagAvailableTransactionIds;
        this.e = transactionSelectionRule;
        this.f = eligibilityStatus;
        this.f247084g = n0Var;
        this.f247085h = terms;
        this.i = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f247081a.equals(aVar.f247081a) && this.f247082b.equals(aVar.f247082b) && Intrinsics.f(this.f247083c, aVar.f247083c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && Intrinsics.f(this.f247084g, aVar.f247084g) && Intrinsics.f(this.f247085h, aVar.f247085h) && this.i.equals(aVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + p.a.d(p.a.d(v7.c(this.f247081a.hashCode() * 31, 31, this.f247082b), 31, this.f247083c), 31, this.d)) * 31)) * 31;
        n0 n0Var = this.f247084g;
        return this.i.hashCode() + p.a.d((iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31, 31, this.f247085h);
    }
}
