package ta4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269094b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f269093a = items;
        this.f269094b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f269093a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f269093a, iVar.f269093a) && this.f269094b == iVar.f269094b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269094b) + (this.f269093a.hashCode() * 31);
    }
}
