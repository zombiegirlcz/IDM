package hm8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f153538a;

    public b(a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f153538a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f153538a == ((b) obj2).f153538a;
    }

    public final int hashCode() {
        return this.f153538a.hashCode();
    }
}
