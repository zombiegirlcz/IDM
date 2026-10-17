package ivk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f168878a;

    public l(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168878a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f168878a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f168878a.equals(((l) obj2).f168878a);
    }

    public final int hashCode() {
        return this.f168878a.hashCode();
    }
}
