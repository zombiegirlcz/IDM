package ry3;

import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f258207a;

    public a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f258207a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f258207a, ((a) obj2).f258207a);
    }

    public final int hashCode() {
        return this.f258207a.hashCode();
    }
}
