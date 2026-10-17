package z3d;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f319245a;

    public a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f319245a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f319245a.equals(((a) obj2).f319245a);
    }

    public final int hashCode() {
        return this.f319245a.hashCode();
    }
}
