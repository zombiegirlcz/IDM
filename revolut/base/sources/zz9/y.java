package zz9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f326635a;

    public y(r keyboardAnimationState) {
        Intrinsics.checkNotNullParameter(keyboardAnimationState, "keyboardAnimationState");
        this.f326635a = keyboardAnimationState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f326635a == ((y) obj2).f326635a;
    }

    public final int hashCode() {
        return this.f326635a.hashCode();
    }
}
