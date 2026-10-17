package jjd;

import cli.j;
import com.revolut.feature.shops.impl.ui.items_details.cancellation.ShopsCancelOrderContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsCancelOrderContract$InputData f174813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f174814b;

    public a(ShopsCancelOrderContract$InputData inputData, boolean z) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f174813a = inputData;
        this.f174814b = z;
    }

    public static a a(a aVar, boolean z) {
        ShopsCancelOrderContract$InputData inputData = aVar.f174813a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new a(inputData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f174813a, aVar.f174813a) && this.f174814b == aVar.f174814b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174814b) + (this.f174813a.hashCode() * 31);
    }
}
