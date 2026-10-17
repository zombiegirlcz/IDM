package l0c;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f191218a;

    public p(File pdfFile) {
        Intrinsics.checkNotNullParameter(pdfFile, "pdfFile");
        this.f191218a = pdfFile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f191218a, ((p) obj2).f191218a);
    }

    public final int hashCode() {
        return this.f191218a.hashCode();
    }
}
