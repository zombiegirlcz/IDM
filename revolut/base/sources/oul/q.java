package oul;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f229916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f229917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f229918c;

    public q(p toolbar, List items, o nextButton) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.f229916a = toolbar;
        this.f229917b = items;
        this.f229918c = nextButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f229917b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f229916a, qVar.f229916a) && Intrinsics.f(this.f229917b, qVar.f229917b) && Intrinsics.f(this.f229918c, qVar.f229918c);
    }

    public final int hashCode() {
        return this.f229918c.hashCode() + p.a.d(this.f229916a.hashCode() * 31, 31, this.f229917b);
    }
}
