package t0e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f267005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f267006b;

    public f(Data data, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f267005a = countryCode;
        this.f267006b = data;
    }

    public static f a(f fVar, Data data) {
        wi0.b countryCode = fVar.f267005a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(data, "data");
        return new f(data, countryCode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f267005a, fVar.f267005a) && Intrinsics.f(this.f267006b, fVar.f267006b);
    }

    public final int hashCode() {
        return this.f267006b.hashCode() + (this.f267005a.f297794a.hashCode() * 31);
    }
}
