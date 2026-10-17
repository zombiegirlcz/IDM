package k50;

import java.util.List;
import k50.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 extends n0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181177a;

    public m0(List validFiles) {
        Intrinsics.checkNotNullParameter(validFiles, "validFiles");
        this.f181177a = validFiles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f181177a, ((m0) obj2).f181177a);
    }

    public final int hashCode() {
        return this.f181177a.hashCode();
    }
}
