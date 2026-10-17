package b6i;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f12806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f12807c;

    public o(List items, m navBarState, f buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f12805a = items;
        this.f12806b = navBarState;
        this.f12807c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f12805a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f12805a, oVar.f12805a) && Intrinsics.f(this.f12806b, oVar.f12806b) && Intrinsics.f(this.f12807c, oVar.f12807c);
    }

    public final int hashCode() {
        return this.f12807c.hashCode() + ((this.f12806b.hashCode() + (this.f12805a.hashCode() * 31)) * 31);
    }
}
