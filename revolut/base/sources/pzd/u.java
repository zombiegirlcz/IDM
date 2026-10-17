package pzd;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f240979a;

    public u(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f240979a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f240979a, ((u) obj2).f240979a);
    }

    public final int hashCode() {
        return this.f240979a.hashCode();
    }
}
