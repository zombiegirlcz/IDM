package vnb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290778a;

    public b(List productsData) {
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        this.f290778a = productsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f290778a, ((b) obj2).f290778a);
    }

    public final int hashCode() {
        return this.f290778a.hashCode();
    }
}
