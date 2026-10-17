package hmi;

import kotlin.jvm.internal.Intrinsics;
import mm0.q;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f153982a;

    public d(q token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f153982a = token;
    }

    public final q a() {
        return this.f153982a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f153982a, ((d) obj2).f153982a);
    }

    public final int hashCode() {
        return this.f153982a.hashCode();
    }
}
