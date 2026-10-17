package xs4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f308403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f308404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f308405c;

    public k(j toolbarState, List items, i buttonState) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f308403a = toolbarState;
        this.f308404b = items;
        this.f308405c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f308404b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f308403a, kVar.f308403a) && Intrinsics.f(this.f308404b, kVar.f308404b) && Intrinsics.f(this.f308405c, kVar.f308405c);
    }

    public final int hashCode() {
        return this.f308405c.hashCode() + p.a.d(this.f308403a.hashCode() * 31, 31, this.f308404b);
    }
}
