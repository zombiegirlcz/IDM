package jz6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f179598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f179599c;

    public l(List items, k footerState, j buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f179597a = items;
        this.f179598b = footerState;
        this.f179599c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f179597a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f179597a, lVar.f179597a) && Intrinsics.f(this.f179598b, lVar.f179598b) && Intrinsics.f(this.f179599c, lVar.f179599c);
    }

    public final int hashCode() {
        return this.f179599c.hashCode() + t61.a.a(this.f179597a.hashCode() * 31, 31, this.f179598b.f179596a);
    }
}
