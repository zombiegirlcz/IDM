package xg7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f305616a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f305616a, ((d) obj2).f305616a);
    }

    public final int hashCode() {
        return this.f305616a.hashCode();
    }

    public d(Data lotteryEnrollmentDetails) {
        Intrinsics.checkNotNullParameter(lotteryEnrollmentDetails, "lotteryEnrollmentDetails");
        this.f305616a = lotteryEnrollmentDetails;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
