package gr;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f145792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f145793b;

    public r(long j2, List uploadStatesList) {
        Intrinsics.checkNotNullParameter(uploadStatesList, "uploadStatesList");
        this.f145792a = j2;
        this.f145793b = uploadStatesList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f145792a == rVar.f145792a && Intrinsics.f(this.f145793b, rVar.f145793b);
    }

    public final int hashCode() {
        return this.f145793b.hashCode() + (Long.hashCode(this.f145792a) * 31);
    }
}
