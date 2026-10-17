package tzd;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f275934a;

    public m(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f275934a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f275934a, ((m) obj2).f275934a);
    }

    public final int hashCode() {
        return this.f275934a.hashCode();
    }
}
