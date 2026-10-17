package f9i;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f132976a;

    public d(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f132976a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f132976a, ((d) obj2).f132976a);
    }

    public final int hashCode() {
        return this.f132976a.hashCode();
    }
}
