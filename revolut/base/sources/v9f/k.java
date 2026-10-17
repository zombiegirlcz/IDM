package v9f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f287037b;

    public k(String searchQuery, List items) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f287036a = searchQuery;
        this.f287037b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f287037b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f287036a, kVar.f287036a) && Intrinsics.f(this.f287037b, kVar.f287037b);
    }

    public final int hashCode() {
        return this.f287037b.hashCode() + (this.f287036a.hashCode() * 31);
    }
}
