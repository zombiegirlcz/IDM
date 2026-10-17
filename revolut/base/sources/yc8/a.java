package yc8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wc8.a f312564a;

    public a(wc8.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f312564a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f312564a == ((a) obj2).f312564a;
    }

    public final int hashCode() {
        return this.f312564a.hashCode();
    }
}
