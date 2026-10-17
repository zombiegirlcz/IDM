package v30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f285777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f285778b;

    public h0(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f285777a = items;
        this.f285778b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f285777a, h0Var.f285777a) && this.f285778b == h0Var.f285778b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285778b) + (this.f285777a.hashCode() * 31);
    }
}
