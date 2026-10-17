package b22;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11859a;

    public g(List files) {
        Intrinsics.checkNotNullParameter(files, "files");
        this.f11859a = files;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f11859a, ((g) obj2).f11859a);
    }

    public final int hashCode() {
        return this.f11859a.hashCode();
    }
}
