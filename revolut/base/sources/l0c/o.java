package l0c;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f191217a;

    public o(File htmlFile) {
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        this.f191217a = htmlFile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f191217a, ((o) obj2).f191217a);
    }

    public final int hashCode() {
        return this.f191217a.hashCode();
    }
}
