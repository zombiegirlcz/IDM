package rm2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em2.e f255192a;

    public k(em2.e background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f255192a = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f255192a, ((k) obj2).f255192a);
    }

    public final int hashCode() {
        return this.f255192a.hashCode();
    }
}
