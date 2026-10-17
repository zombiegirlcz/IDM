package kvk;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f190147a;

    public l(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f190147a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f190147a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f190147a.equals(((l) obj2).f190147a);
    }

    public final int hashCode() {
        return this.f190147a.hashCode();
    }
}
