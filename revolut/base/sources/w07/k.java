package w07;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f293658b;

    public k(List items, g footerUIState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerUIState, "footerUIState");
        this.f293657a = items;
        this.f293658b = footerUIState;
    }

    @Override // cli.p
    public final List c() {
        return this.f293657a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f293657a, kVar.f293657a) && Intrinsics.f(this.f293658b, kVar.f293658b);
    }

    public final int hashCode() {
        return this.f293658b.hashCode() + (this.f293657a.hashCode() * 31);
    }
}
