package th1;

import com.revolut.feature.address.common.api.navigation.FindAddressControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindAddressControllerDescriptor$InputData f271245a;

    public e(FindAddressControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f271245a = inputData;
    }

    public final FindAddressControllerDescriptor$InputData b() {
        return this.f271245a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f271245a, ((e) obj2).f271245a);
    }

    public final int hashCode() {
        return this.f271245a.hashCode();
    }
}
