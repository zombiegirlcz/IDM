package k4l;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f180975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f180976c;

    public h(int i, dj0.d others, List primary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(others, "others");
        this.f180974a = primary;
        this.f180975b = others;
        this.f180976c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f180974a, hVar.f180974a) && Intrinsics.f(this.f180975b, hVar.f180975b) && this.f180976c == hVar.f180976c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180976c) + v7.c(this.f180974a.hashCode() * 31, 31, this.f180975b);
    }
}
