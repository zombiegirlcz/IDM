package g8i;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f141398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f141399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f141400c;

    public w(aim.e items, q buttonState, s navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f141398a = items;
        this.f141399b = buttonState;
        this.f141400c = navBarState;
    }

    @Override // jki.n
    public final List c() {
        return this.f141398a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f141398a, wVar.f141398a) && Intrinsics.f(this.f141399b, wVar.f141399b) && Intrinsics.f(this.f141400c, wVar.f141400c);
    }

    public final int hashCode() {
        return this.f141400c.hashCode() + ((this.f141399b.hashCode() + (this.f141398a.hashCode() * 31)) * 31);
    }
}
