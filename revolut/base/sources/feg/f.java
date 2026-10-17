package feg;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f134612b;

    public f(List items, List filters) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f134611a = items;
        this.f134612b = filters;
    }

    @Override // cli.p
    public final List c() {
        return this.f134611a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f134611a, fVar.f134611a) && Intrinsics.f(this.f134612b, fVar.f134612b);
    }

    public final int hashCode() {
        return this.f134612b.hashCode() + (this.f134611a.hashCode() * 961);
    }
}
