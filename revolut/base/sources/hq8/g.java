package hq8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f154627a;

    public g(Data juniorProfile) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        this.f154627a = juniorProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f154627a, ((g) obj2).f154627a);
    }

    public final int hashCode() {
        return this.f154627a.hashCode();
    }
}
