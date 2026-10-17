package lk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f196174a;

    public g(List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f196174a = pages;
    }

    public static g a(List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new g(pages);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f196174a, ((g) obj2).f196174a);
    }

    public final int hashCode() {
        return this.f196174a.hashCode();
    }
}
