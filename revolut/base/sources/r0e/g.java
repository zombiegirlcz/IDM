package r0e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f250773a;

    public g(Data taxYears) {
        Intrinsics.checkNotNullParameter(taxYears, "taxYears");
        this.f250773a = taxYears;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f250773a, ((g) obj2).f250773a);
    }

    public final int hashCode() {
        return this.f250773a.hashCode();
    }
}
