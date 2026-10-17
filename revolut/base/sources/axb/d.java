package axb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f10915a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f10915a, ((d) obj2).f10915a);
    }

    public final int hashCode() {
        return this.f10915a.hashCode();
    }

    public d(Data userVoucherListData) {
        Intrinsics.checkNotNullParameter(userVoucherListData, "userVoucherListData");
        this.f10915a = userVoucherListData;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
