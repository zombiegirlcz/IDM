package nci;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f214203a;

    public i(File pdfFile) {
        Intrinsics.checkNotNullParameter(pdfFile, "pdfFile");
        this.f214203a = pdfFile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f214203a, ((i) obj2).f214203a);
    }

    public final int hashCode() {
        return this.f214203a.hashCode();
    }
}
