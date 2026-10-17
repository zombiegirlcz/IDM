package qzb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250498a;

    public g(List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f250498a = pages;
    }

    @Override // qzb.i
    public final List a() {
        return this.f250498a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f250498a, ((g) obj2).f250498a);
    }

    public final int hashCode() {
        return this.f250498a.hashCode();
    }
}
