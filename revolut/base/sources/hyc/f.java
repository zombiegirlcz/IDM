package hyc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f156783a;

    public f(e sourceOfTransactions) {
        Intrinsics.checkNotNullParameter(sourceOfTransactions, "sourceOfTransactions");
        this.f156783a = sourceOfTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f156783a, ((f) obj2).f156783a);
    }

    public final int hashCode() {
        return this.f156783a.hashCode();
    }
}
