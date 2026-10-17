package sl7;

import com.revolut.kompot.common.StackDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StackDestination f264155a;

    public d(StackDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f264155a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f264155a.equals(((d) obj2).f264155a);
    }

    public final int hashCode() {
        return this.f264155a.hashCode();
    }
}
