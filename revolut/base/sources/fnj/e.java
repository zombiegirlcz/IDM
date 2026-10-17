package fnj;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f136689a;

    public e(d bottomSheetType) {
        Intrinsics.checkNotNullParameter(bottomSheetType, "bottomSheetType");
        this.f136689a = bottomSheetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f136689a == ((e) obj2).f136689a;
    }

    public final int hashCode() {
        return this.f136689a.hashCode();
    }
}
