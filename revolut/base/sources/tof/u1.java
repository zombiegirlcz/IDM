package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273097a;

    public u1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273097a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u1) && Intrinsics.f(this.f273097a, ((u1) obj2).f273097a);
    }

    public final String getId() {
        return this.f273097a;
    }

    public final int hashCode() {
        return this.f273097a.hashCode();
    }
}
