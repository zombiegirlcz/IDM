package v2e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f285726a;

    public s(Data voucherProductGroupDetails) {
        Intrinsics.checkNotNullParameter(voucherProductGroupDetails, "voucherProductGroupDetails");
        this.f285726a = voucherProductGroupDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f285726a, ((s) obj2).f285726a);
    }

    public final int hashCode() {
        return this.f285726a.hashCode();
    }
}
