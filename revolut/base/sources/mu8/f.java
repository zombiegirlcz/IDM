package mu8;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f209006a;

    public f(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f209006a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f209006a, ((f) obj2).f209006a);
    }

    public final int hashCode() {
        return this.f209006a.hashCode();
    }
}
