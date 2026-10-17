package rx6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f258053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258054b;

    public q(p toolbarState, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258053a = toolbarState;
        this.f258054b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f258054b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f258053a, qVar.f258053a) && Intrinsics.f(this.f258054b, qVar.f258054b);
    }

    public final int hashCode() {
        return this.f258054b.hashCode() + (this.f258053a.hashCode() * 31);
    }
}
