package fee;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f134592a;

    public e(Data transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f134592a = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f134592a, ((e) obj2).f134592a);
    }

    public final int hashCode() {
        return this.f134592a.hashCode();
    }
}
