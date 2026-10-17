package ns9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f218763a;

    public e(Data transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f218763a = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f218763a, ((e) obj2).f218763a);
    }

    public final int hashCode() {
        return this.f218763a.hashCode();
    }
}
