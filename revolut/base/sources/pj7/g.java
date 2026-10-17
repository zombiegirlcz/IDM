package pj7;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f236682a;

    public g(File document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f236682a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f236682a, ((g) obj2).f236682a);
    }

    public final int hashCode() {
        return this.f236682a.hashCode();
    }
}
