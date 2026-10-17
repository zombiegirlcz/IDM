package thd;

import aii.e;
import com.revolut.feature.shops.api.navigation.descriptor.ShopsItemsDetailsController$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsItemsDetailsController$InputData f271366a;

    public a(ShopsItemsDetailsController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f271366a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f271366a, ((a) obj2).f271366a);
    }

    public final int hashCode() {
        return this.f271366a.hashCode();
    }
}
