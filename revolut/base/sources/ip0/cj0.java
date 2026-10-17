package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cj0 implements dj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz0.a f163751a;

    public cj0(pz0.a track) {
        Intrinsics.checkNotNullParameter(track, "track");
        this.f163751a = track;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof cj0) && Intrinsics.f(this.f163751a, ((cj0) obj2).f163751a);
    }

    public final int hashCode() {
        return this.f163751a.hashCode();
    }
}
