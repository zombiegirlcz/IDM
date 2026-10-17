package ba0;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressFlowContract$OutputData f13862a;

    public b(AddressFlowContract$OutputData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f13862a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f13862a, ((b) obj2).f13862a);
    }

    public final int hashCode() {
        return this.f13862a.hashCode();
    }
}
