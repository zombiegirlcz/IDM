package uf7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f279620b;

    public t(String title, Set transactionIds) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f279619a = title;
        this.f279620b = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f279619a, tVar.f279619a) && Intrinsics.f(this.f279620b, tVar.f279620b);
    }

    public final int hashCode() {
        return this.f279620b.hashCode() + (this.f279619a.hashCode() * 31);
    }
}
