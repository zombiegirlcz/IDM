package ill;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162262a;

    public a(List challenges) {
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f162262a = challenges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f162262a, ((a) obj2).f162262a);
    }

    public final int hashCode() {
        return this.f162262a.hashCode();
    }
}
