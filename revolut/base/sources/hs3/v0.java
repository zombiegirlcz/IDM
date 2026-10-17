package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154956a;

    public v0(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f154956a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v0) && Intrinsics.f(this.f154956a, ((v0) obj2).f154956a);
    }

    public final int hashCode() {
        return this.f154956a.hashCode();
    }
}
