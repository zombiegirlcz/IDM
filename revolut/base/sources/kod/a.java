package kod;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186299a;

    public a(List availableOptions) {
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        this.f186299a = availableOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f186299a, ((a) obj2).f186299a);
    }

    public final int hashCode() {
        return this.f186299a.hashCode();
    }
}
