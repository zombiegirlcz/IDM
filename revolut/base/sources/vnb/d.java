package vnb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290780a;

    public d(List productsData) {
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        this.f290780a = productsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f290780a, ((d) obj2).f290780a);
    }

    public final int hashCode() {
        return this.f290780a.hashCode();
    }
}
