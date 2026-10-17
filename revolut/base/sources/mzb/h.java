package mzb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f210752a;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f210752a, ((h) obj2).f210752a);
    }

    public final int hashCode() {
        return this.f210752a.hashCode();
    }

    public h(Data loyaltyEngagementLearnItemsData) {
        Intrinsics.checkNotNullParameter(loyaltyEngagementLearnItemsData, "loyaltyEngagementLearnItemsData");
        this.f210752a = loyaltyEngagementLearnItemsData;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
