package hjl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152831a;

    public d(Data socialAccountsData) {
        Intrinsics.checkNotNullParameter(socialAccountsData, "socialAccountsData");
        this.f152831a = socialAccountsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f152831a, ((d) obj2).f152831a);
    }

    public final int hashCode() {
        return this.f152831a.hashCode();
    }
}
