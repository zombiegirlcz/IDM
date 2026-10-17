package bs9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f18131a;

    public w(q keyboardAnimationState) {
        Intrinsics.checkNotNullParameter(keyboardAnimationState, "keyboardAnimationState");
        this.f18131a = keyboardAnimationState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f18131a == ((w) obj2).f18131a;
    }

    public final int hashCode() {
        return this.f18131a.hashCode();
    }
}
