package upi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f282063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f282064b;

    public d(List files, Integer num) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.f282063a = files;
        this.f282064b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f282063a, dVar.f282063a) && Intrinsics.f(this.f282064b, dVar.f282064b);
    }

    public final int hashCode() {
        int iHashCode = this.f282063a.hashCode() * 31;
        Integer num = this.f282064b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
