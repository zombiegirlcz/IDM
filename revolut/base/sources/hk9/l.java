package hk9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f152880b;

    public l(List items, i buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f152879a = items;
        this.f152880b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f152879a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f152879a, lVar.f152879a) && Intrinsics.f(this.f152880b, lVar.f152880b);
    }

    public final int hashCode() {
        return this.f152880b.hashCode() + (this.f152879a.hashCode() * 31);
    }
}
