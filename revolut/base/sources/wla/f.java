package wla;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f298468b;

    public f(List items, e buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f298467a = items;
        this.f298468b = buttonState;
    }

    @Override // jki.n
    public final List c() {
        return this.f298467a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f298467a, fVar.f298467a) && Intrinsics.f(this.f298468b, fVar.f298468b);
    }

    public final int hashCode() {
        return this.f298468b.hashCode() + (this.f298467a.hashCode() * 31);
    }
}
