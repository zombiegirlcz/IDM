package ql4;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f247115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f247116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f247117c;
    public final r0 d;
    public final e0 e;
    public final n0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f247118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f247119h;

    public e(dj0.d maxPlanAmount, dj0.d minTransactionAmount, List transactionIds, r0 transactionSelectionRule, e0 eligibilityStatus, n0 n0Var, List terms, ArrayList documents) {
        Intrinsics.checkNotNullParameter(maxPlanAmount, "maxPlanAmount");
        Intrinsics.checkNotNullParameter(minTransactionAmount, "minTransactionAmount");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(transactionSelectionRule, "transactionSelectionRule");
        Intrinsics.checkNotNullParameter(eligibilityStatus, "eligibilityStatus");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f247115a = maxPlanAmount;
        this.f247116b = minTransactionAmount;
        this.f247117c = transactionIds;
        this.d = transactionSelectionRule;
        this.e = eligibilityStatus;
        this.f = n0Var;
        this.f247118g = terms;
        this.f247119h = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f247115a.equals(eVar.f247115a) && this.f247116b.equals(eVar.f247116b) && Intrinsics.f(this.f247117c, eVar.f247117c) && this.d == eVar.d && this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f247118g, eVar.f247118g) && this.f247119h.equals(eVar.f247119h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + p.a.d(v7.c(this.f247115a.hashCode() * 31, 31, this.f247116b), 31, this.f247117c)) * 31)) * 31;
        n0 n0Var = this.f;
        return this.f247119h.hashCode() + p.a.d((iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31, 31, this.f247118g);
    }
}
