package ta8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269164b;

    public k(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f269163a = items;
        this.f269164b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f269163a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f269163a, kVar.f269163a) && this.f269164b == kVar.f269164b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269164b) + (this.f269163a.hashCode() * 31);
    }
}
