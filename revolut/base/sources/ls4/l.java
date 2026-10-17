package ls4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f199621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f199622b;

    public l(List items, k buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f199621a = items;
        this.f199622b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f199621a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f199621a, lVar.f199621a) && Intrinsics.f(this.f199622b, lVar.f199622b);
    }

    public final int hashCode() {
        return this.f199622b.hashCode() + (this.f199621a.hashCode() * 31);
    }
}
