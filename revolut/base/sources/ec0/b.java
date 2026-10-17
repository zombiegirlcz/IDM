package ec0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124405a;

    public b(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f124405a = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f124405a, ((b) obj2).f124405a);
    }

    public final int hashCode() {
        return this.f124405a.hashCode();
    }
}
