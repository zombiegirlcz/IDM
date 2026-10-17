package qzb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250499a;

    public h(List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f250499a = pages;
    }

    @Override // qzb.i
    public final List a() {
        return this.f250499a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f250499a, ((h) obj2).f250499a);
    }

    public final int hashCode() {
        return this.f250499a.hashCode();
    }
}
