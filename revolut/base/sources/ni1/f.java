package ni1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f215624b;

    public f(Data data, String postalCode) {
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        this.f215623a = postalCode;
        this.f215624b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f215623a, fVar.f215623a) && Intrinsics.f(this.f215624b, fVar.f215624b);
    }

    public final int hashCode() {
        int iHashCode = this.f215623a.hashCode() * 31;
        Data data = this.f215624b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
