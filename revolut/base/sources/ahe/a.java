package ahe;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4971b;

    public a(List items, Map entries) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f4970a = items;
        this.f4971b = entries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f4970a, aVar.f4970a) && Intrinsics.f(this.f4971b, aVar.f4971b);
    }

    public final int hashCode() {
        return this.f4971b.hashCode() + (this.f4970a.hashCode() * 31);
    }
}
