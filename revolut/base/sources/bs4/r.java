package bs4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f18057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18058b;

    public r(q toolbarState, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f18057a = toolbarState;
        this.f18058b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f18058b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f18057a, rVar.f18057a) && Intrinsics.f(this.f18058b, rVar.f18058b);
    }

    public final int hashCode() {
        return this.f18058b.hashCode() + (this.f18057a.hashCode() * 31);
    }
}
