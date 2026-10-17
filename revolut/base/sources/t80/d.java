package t80;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f268763a;

    public d(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f268763a = directory;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f268763a, ((d) obj2).f268763a);
    }

    public final int hashCode() {
        return this.f268763a.hashCode();
    }
}
