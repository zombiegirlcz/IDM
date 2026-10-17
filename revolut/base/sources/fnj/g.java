package fnj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f136690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f136691b;

    public g(List items, lw0.a navBarBottomSheetHeaderModel) {
        Intrinsics.checkNotNullParameter(navBarBottomSheetHeaderModel, "navBarBottomSheetHeaderModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f136690a = navBarBottomSheetHeaderModel;
        this.f136691b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f136691b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f136690a.equals(gVar.f136690a) && Intrinsics.f(this.f136691b, gVar.f136691b);
    }

    public final int hashCode() {
        return this.f136691b.hashCode() + (this.f136690a.hashCode() * 31);
    }
}
