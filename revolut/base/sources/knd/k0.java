package knd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he3.j f186102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186103b;

    public k0(he3.j selectedCategory, ArrayList transactions) {
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f186102a = selectedCategory;
        this.f186103b = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f186102a.equals(k0Var.f186102a) && this.f186103b.equals(k0Var.f186103b);
    }

    public final int hashCode() {
        return this.f186103b.hashCode() + (this.f186102a.hashCode() * 31);
    }
}
