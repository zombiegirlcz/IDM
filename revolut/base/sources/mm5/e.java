package mm5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207146a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f207146a, ((e) obj2).f207146a);
    }

    public final int hashCode() {
        return this.f207146a.hashCode();
    }

    public e(List meshEvents) {
        Intrinsics.checkNotNullParameter(meshEvents, "meshEvents");
        this.f207146a = meshEvents;
    }

    public e(int i) {
        this(f0.f322471a);
    }
}
