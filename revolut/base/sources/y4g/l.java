package y4g;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f310932b;

    public l(List items, f confirmButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(confirmButtonState, "confirmButtonState");
        this.f310931a = items;
        this.f310932b = confirmButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f310931a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f310931a, lVar.f310931a) && this.f310932b == lVar.f310932b;
    }

    public final int hashCode() {
        return this.f310932b.hashCode() + (this.f310931a.hashCode() * 31);
    }
}
