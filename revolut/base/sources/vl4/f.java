package vl4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f290245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f290246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f290247c;

    public f(a completedTransactions, List includeTransactionIds, boolean z) {
        Intrinsics.checkNotNullParameter(completedTransactions, "completedTransactions");
        Intrinsics.checkNotNullParameter(includeTransactionIds, "includeTransactionIds");
        this.f290245a = completedTransactions;
        this.f290246b = includeTransactionIds;
        this.f290247c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f290245a, fVar.f290245a) && Intrinsics.f(this.f290246b, fVar.f290246b) && this.f290247c == fVar.f290247c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f290247c) + p.a.d(this.f290245a.hashCode() * 31, 31, this.f290246b);
    }
}
