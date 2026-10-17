package ly9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f200762a;

    public h(i username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f200762a = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f200762a, ((h) obj2).f200762a);
    }

    public final int hashCode() {
        return this.f200762a.f200763a.hashCode();
    }
}
