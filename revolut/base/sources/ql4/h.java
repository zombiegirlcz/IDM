package ql4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f247124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f247125b;

    public h(List transactions, Object obj2) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f247124a = transactions;
        this.f247125b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f247124a, hVar.f247124a) && Intrinsics.f(this.f247125b, hVar.f247125b);
    }

    public final int hashCode() {
        int iHashCode = this.f247124a.hashCode() * 31;
        Object obj2 = this.f247125b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
