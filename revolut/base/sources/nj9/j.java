package nj9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f216421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f216422b;

    public j(List items, g buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f216421a = items;
        this.f216422b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f216421a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f216421a, jVar.f216421a) && Intrinsics.f(this.f216422b, jVar.f216422b);
    }

    public final int hashCode() {
        return this.f216422b.hashCode() + (this.f216421a.hashCode() * 31);
    }
}
