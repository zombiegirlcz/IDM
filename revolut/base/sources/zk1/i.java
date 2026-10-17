package zk1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f322894a;

    public i(Data paymentCode) {
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        this.f322894a = paymentCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f322894a, ((i) obj2).f322894a);
    }

    public final int hashCode() {
        return this.f322894a.hashCode();
    }
}
