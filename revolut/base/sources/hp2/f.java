package hp2;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn2.a f154386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f154387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f154388c;

    public f(mn2.a serviceType, LocalDate localDate, Data data) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f154386a = serviceType;
        this.f154387b = localDate;
        this.f154388c = data;
    }

    public static f a(f fVar, LocalDate localDate, Data data, int i) {
        mn2.a serviceType = fVar.f154386a;
        if ((i & 2) != 0) {
            localDate = fVar.f154387b;
        }
        if ((i & 4) != 0) {
            data = fVar.f154388c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(data, "data");
        return new f(serviceType, localDate, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f154386a == fVar.f154386a && Intrinsics.f(this.f154387b, fVar.f154387b) && Intrinsics.f(this.f154388c, fVar.f154388c);
    }

    public final int hashCode() {
        int iHashCode = this.f154386a.hashCode() * 31;
        LocalDate localDate = this.f154387b;
        return this.f154388c.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}
