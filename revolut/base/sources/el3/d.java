package el3;

import com.revolut.feature.contacts.api.navigation.BlockUserBottomSheetInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockUserBottomSheetInputData f127237a;

    public d(BlockUserBottomSheetInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f127237a = inputData;
    }

    public final BlockUserBottomSheetInputData b() {
        return this.f127237a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f127237a, ((d) obj2).f127237a);
    }

    public final int hashCode() {
        return this.f127237a.hashCode();
    }
}
