package oqk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f227989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227990c;

    public t(List transactionItems, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(transactionItems, "transactionItems");
        this.f227988a = z;
        this.f227989b = transactionItems;
        this.f227990c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f227988a == tVar.f227988a && Intrinsics.f(this.f227989b, tVar.f227989b) && this.f227990c == tVar.f227990c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227990c) + p.a.d(Boolean.hashCode(this.f227988a) * 31, 31, this.f227989b);
    }
}
