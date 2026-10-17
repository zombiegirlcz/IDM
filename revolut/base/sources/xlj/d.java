package xlj;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f307022a;

    public d(Data payments) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f307022a = payments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f307022a, ((d) obj2).f307022a);
    }

    public final int hashCode() {
        return this.f307022a.hashCode();
    }
}
