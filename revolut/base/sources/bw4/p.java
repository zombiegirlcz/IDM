package bw4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f19233b;

    public p(List items, o buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f19232a = items;
        this.f19233b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f19232a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f19232a, pVar.f19232a) && Intrinsics.f(this.f19233b, pVar.f19233b);
    }

    public final int hashCode() {
        return this.f19233b.hashCode() + (this.f19232a.hashCode() * 31);
    }
}
