package g1k;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f139699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f139700b;

    public j(Set filters, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f139699a = filters;
        this.f139700b = dateTime;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        return 50;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f139699a, jVar.f139699a) && Intrinsics.f(this.f139700b, jVar.f139700b);
    }

    public final int hashCode() {
        int iHashCode = this.f139699a.hashCode() * 31;
        DateTime dateTime = this.f139700b;
        return iHashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }
}
