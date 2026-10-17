package vd4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f287787b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f287786a = items;
        this.f287787b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f287786a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f287786a, iVar.f287786a) && this.f287787b == iVar.f287787b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f287787b) + (this.f287786a.hashCode() * 31);
    }
}
