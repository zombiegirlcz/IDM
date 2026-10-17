package a35;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f1069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1071c;

    public p(i contract, List products, List applicationAccounts) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(applicationAccounts, "applicationAccounts");
        this.f1069a = contract;
        this.f1070b = products;
        this.f1071c = applicationAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f1069a, pVar.f1069a) && Intrinsics.f(this.f1070b, pVar.f1070b) && Intrinsics.f(this.f1071c, pVar.f1071c);
    }

    public final int hashCode() {
        return this.f1071c.hashCode() + p.a.d(this.f1069a.hashCode() * 31, 31, this.f1070b);
    }
}
