package u85;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f278112a;

    public g(Data loanDetails) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        this.f278112a = loanDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f278112a, ((g) obj2).f278112a);
    }

    public final int hashCode() {
        return this.f278112a.hashCode();
    }
}
