package xu;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f308850a;

    public i(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f308850a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f308850a, ((i) obj2).f308850a);
    }

    public final int hashCode() {
        return this.f308850a.hashCode() * 31;
    }
}
