package yui;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f317050b;

    public u(List items, t buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f317049a = items;
        this.f317050b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f317049a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f317049a, uVar.f317049a) && Intrinsics.f(this.f317050b, uVar.f317050b);
    }

    public final int hashCode() {
        return this.f317050b.hashCode() + (this.f317049a.hashCode() * 31);
    }
}
