package xs7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f308435a;

    public g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308435a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f308435a.equals(((g) obj2).f308435a);
    }

    public final int hashCode() {
        return this.f308435a.hashCode();
    }
}
