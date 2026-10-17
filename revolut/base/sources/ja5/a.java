package ja5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f172439a;

    public a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172439a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f172439a.equals(((a) obj2).f172439a);
    }

    public final int hashCode() {
        return this.f172439a.hashCode();
    }
}
