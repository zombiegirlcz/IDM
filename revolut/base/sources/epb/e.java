package epb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f128132a;

    public e(Data productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f128132a = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f128132a, ((e) obj2).f128132a);
    }

    public final int hashCode() {
        return this.f128132a.hashCode();
    }
}
