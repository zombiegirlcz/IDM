package gpb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f145416a;

    public g(Data productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f145416a = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f145416a, ((g) obj2).f145416a);
    }

    public final int hashCode() {
        return this.f145416a.hashCode();
    }
}
