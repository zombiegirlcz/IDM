package mu8;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f209003a;

    public d(File file) {
        this.f209003a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f209003a, ((d) obj2).f209003a);
    }

    public final int hashCode() {
        File file = this.f209003a;
        if (file == null) {
            return 0;
        }
        return file.hashCode();
    }
}
