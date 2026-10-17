package y6b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f311251a;

    public f(Data billingData) {
        Intrinsics.checkNotNullParameter(billingData, "billingData");
        this.f311251a = billingData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f311251a, ((f) obj2).f311251a);
    }

    public final int hashCode() {
        return this.f311251a.hashCode();
    }
}
