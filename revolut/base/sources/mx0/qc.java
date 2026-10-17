package mx0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f209965b;

    public qc(List tags, Integer num) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f209964a = tags;
        this.f209965b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj2;
        return Intrinsics.f(this.f209964a, qcVar.f209964a) && Intrinsics.f(this.f209965b, qcVar.f209965b);
    }

    public final int hashCode() {
        int iHashCode = this.f209964a.hashCode() * 31;
        Integer num = this.f209965b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
