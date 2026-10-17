package s43;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f259745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f259746c;

    public k(List sections, boolean z, List items) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f259744a = sections;
        this.f259745b = items;
        this.f259746c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f259744a, kVar.f259744a) && Intrinsics.f(this.f259745b, kVar.f259745b) && this.f259746c == kVar.f259746c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259746c) + p.a.d(this.f259744a.hashCode() * 31, 31, this.f259745b);
    }
}
