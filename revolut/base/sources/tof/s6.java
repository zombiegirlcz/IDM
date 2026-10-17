package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273046a;

    public s6(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273046a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s6) && Intrinsics.f(this.f273046a, ((s6) obj2).f273046a);
    }

    public final int hashCode() {
        return this.f273046a.hashCode();
    }
}
