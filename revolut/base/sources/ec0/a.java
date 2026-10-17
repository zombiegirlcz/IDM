package ec0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124404a;

    public a(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f124404a = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f124404a, ((a) obj2).f124404a);
    }

    public final int hashCode() {
        return this.f124404a.hashCode();
    }
}
