package oec;

import aii.e;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContactsScreenDescriptor$InputData f224579a;

    public d(ShippingContactsScreenDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f224579a = inputData;
    }

    public final ShippingContactsScreenDescriptor$InputData b() {
        return this.f224579a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f224579a, ((d) obj2).f224579a);
    }

    public final int hashCode() {
        return this.f224579a.hashCode();
    }
}
