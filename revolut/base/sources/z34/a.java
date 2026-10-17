package z34;

import ft3.h1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f319157a;

    public a(h1 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f319157a = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f319157a, ((a) obj2).f319157a);
    }

    public final int hashCode() {
        return this.f319157a.hashCode();
    }
}
