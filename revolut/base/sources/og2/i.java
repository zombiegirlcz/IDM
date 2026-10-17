package og2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225003b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f225002a = items;
        this.f225003b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f225002a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f225002a, iVar.f225002a) && this.f225003b == iVar.f225003b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225003b) + (this.f225002a.hashCode() * 31);
    }
}
