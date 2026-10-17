package wwf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300655a;

    public h(List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f300655a = ids;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f300655a, ((h) obj2).f300655a);
    }

    public final int hashCode() {
        return this.f300655a.hashCode();
    }
}
