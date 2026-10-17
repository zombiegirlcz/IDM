package owf;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f230442a;

    public f(File pdfFile) {
        Intrinsics.checkNotNullParameter(pdfFile, "pdfFile");
        this.f230442a = pdfFile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f230442a, ((f) obj2).f230442a);
    }

    public final int hashCode() {
        return this.f230442a.hashCode();
    }
}
