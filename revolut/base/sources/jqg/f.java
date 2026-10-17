package jqg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate.Model f177716a;

    public f(FullScreenStateDelegate.Model state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f177716a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f177716a, ((f) obj2).f177716a);
    }

    public final int hashCode() {
        return this.f177716a.hashCode();
    }
}
