package syc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266653a;

    public f(List documentGroup) {
        Intrinsics.checkNotNullParameter(documentGroup, "documentGroup");
        this.f266653a = documentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f266653a, ((f) obj2).f266653a);
    }

    public final int hashCode() {
        return this.f266653a.hashCode();
    }
}
