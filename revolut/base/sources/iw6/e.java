package iw6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f168971a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f168971a, ((e) obj2).f168971a);
    }

    public final int hashCode() {
        return this.f168971a.hashCode();
    }

    public e(Data customerData) {
        Intrinsics.checkNotNullParameter(customerData, "customerData");
        this.f168971a = customerData;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
