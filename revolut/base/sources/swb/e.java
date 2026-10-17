package swb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f266173a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f266173a, ((e) obj2).f266173a);
    }

    public final int hashCode() {
        return this.f266173a.hashCode();
    }

    public e(Data userVoucherListData) {
        Intrinsics.checkNotNullParameter(userVoucherListData, "userVoucherListData");
        this.f266173a = userVoucherListData;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
