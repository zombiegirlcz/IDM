package rzd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import y7a.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f258591a;

    public a(Set selectedProductTypes) {
        Intrinsics.checkNotNullParameter(selectedProductTypes, "selectedProductTypes");
        this.f258591a = selectedProductTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f258591a, ((a) obj2).f258591a);
    }

    public final int hashCode() {
        return this.f258591a.hashCode();
    }
}
