package wbl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f296273a;

    public m(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f296273a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f296273a, ((m) obj2).f296273a);
    }

    public final int hashCode() {
        return this.f296273a.hashCode();
    }
}
