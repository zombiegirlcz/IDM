package oli;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226435a;

    public j(List files) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.f226435a = files;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f226435a, ((j) obj2).f226435a);
    }

    public final int hashCode() {
        return this.f226435a.hashCode();
    }
}
