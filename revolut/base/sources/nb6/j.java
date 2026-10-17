package nb6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f213996a;

    public j(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f213996a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f213996a.equals(((j) obj2).f213996a);
    }

    public final int hashCode() {
        return this.f213996a.hashCode();
    }
}
