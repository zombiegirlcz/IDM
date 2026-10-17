package gig;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144195a;

    public j(List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f144195a = pages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f144195a, ((j) obj2).f144195a);
    }

    public final int hashCode() {
        return this.f144195a.hashCode();
    }
}
