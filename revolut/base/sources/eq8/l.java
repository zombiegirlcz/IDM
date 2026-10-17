package eq8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f128393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f128394b;

    public l(Data juniorProfileData, Data tasksAndCoparentsData) {
        Intrinsics.checkNotNullParameter(juniorProfileData, "juniorProfileData");
        Intrinsics.checkNotNullParameter(tasksAndCoparentsData, "tasksAndCoparentsData");
        this.f128393a = juniorProfileData;
        this.f128394b = tasksAndCoparentsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f128393a, lVar.f128393a) && Intrinsics.f(this.f128394b, lVar.f128394b);
    }

    public final int hashCode() {
        return this.f128394b.hashCode() + (this.f128393a.hashCode() * 31);
    }
}
