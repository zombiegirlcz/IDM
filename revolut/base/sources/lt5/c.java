package lt5;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f199798a;

    public c(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f199798a = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f199798a, ((c) obj2).f199798a);
    }

    public final int hashCode() {
        return this.f199798a.hashCode();
    }
}
