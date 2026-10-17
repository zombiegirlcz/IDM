package tyc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275547b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f275546a = items;
        this.f275547b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f275546a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f275546a, iVar.f275546a) && this.f275547b == iVar.f275547b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275547b) + (this.f275546a.hashCode() * 31);
    }
}
