package qm8;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f247779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f247780b;

    public b(Data reward, Data juniorProfile) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        this.f247779a = reward;
        this.f247780b = juniorProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f247779a, bVar.f247779a) && Intrinsics.f(this.f247780b, bVar.f247780b);
    }

    public final int hashCode() {
        return this.f247780b.hashCode() + (this.f247779a.hashCode() * 31);
    }
}
