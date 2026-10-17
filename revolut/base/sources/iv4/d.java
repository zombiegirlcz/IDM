package iv4;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f168714a;

    public d(Data transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f168714a = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f168714a, ((d) obj2).f168714a);
    }

    public final int hashCode() {
        return this.f168714a.hashCode();
    }
}
