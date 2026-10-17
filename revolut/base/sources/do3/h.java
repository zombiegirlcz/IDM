package do3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f116401a;

    public h(g state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f116401a = state;
    }

    public final g a() {
        return this.f116401a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f116401a == ((h) obj2).f116401a;
    }

    public final int hashCode() {
        return this.f116401a.hashCode();
    }
}
