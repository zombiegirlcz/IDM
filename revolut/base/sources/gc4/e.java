package gc4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f142325a;

    public e(Data howItWorksInfoData) {
        Intrinsics.checkNotNullParameter(howItWorksInfoData, "howItWorksInfoData");
        this.f142325a = howItWorksInfoData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f142325a, ((e) obj2).f142325a);
    }

    public final int hashCode() {
        return this.f142325a.hashCode();
    }
}
