package lbc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f193647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f193648b;

    public u(q navBarUIState, List items) {
        Intrinsics.checkNotNullParameter(navBarUIState, "navBarUIState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193647a = navBarUIState;
        this.f193648b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f193648b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f193647a, uVar.f193647a) && Intrinsics.f(this.f193648b, uVar.f193648b);
    }

    public final int hashCode() {
        return this.f193648b.hashCode() + (this.f193647a.hashCode() * 31);
    }
}
