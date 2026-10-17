package th1;

import com.revolut.feature.address.common.api.navigation.SelectAddressControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectAddressControllerDescriptor$InputData f271248a;

    public i(SelectAddressControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f271248a = inputData;
    }

    public final SelectAddressControllerDescriptor$InputData b() {
        return this.f271248a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f271248a, ((i) obj2).f271248a);
    }

    public final int hashCode() {
        return this.f271248a.hashCode();
    }
}
