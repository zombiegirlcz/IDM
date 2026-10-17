package sob;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f264806a;

    public d(Data statistics) {
        Intrinsics.checkNotNullParameter(statistics, "statistics");
        this.f264806a = statistics;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f264806a, ((d) obj2).f264806a);
    }

    public final int hashCode() {
        return this.f264806a.hashCode();
    }
}
