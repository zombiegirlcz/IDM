package okb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f225952a;

    public b(e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f225952a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f225952a == ((b) obj2).f225952a;
    }

    public final int hashCode() {
        return this.f225952a.hashCode();
    }
}
