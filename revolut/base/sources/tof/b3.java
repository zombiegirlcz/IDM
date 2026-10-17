package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272644a;

    public b3(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f272644a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b3) && Intrinsics.f(this.f272644a, ((b3) obj2).f272644a);
    }

    public final int hashCode() {
        return this.f272644a.hashCode();
    }
}
