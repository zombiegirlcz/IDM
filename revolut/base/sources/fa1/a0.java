package fa1;

import fa1.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f133188a;

    public a0(List cardReaders) {
        Intrinsics.checkNotNullParameter(cardReaders, "cardReaders");
        this.f133188a = cardReaders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f133188a, ((a0) obj2).f133188a);
    }

    public final int hashCode() {
        return this.f133188a.hashCode();
    }
}
