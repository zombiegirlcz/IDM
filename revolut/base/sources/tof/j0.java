package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272840b;

    public j0(String id10, String link) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f272839a = id10;
        this.f272840b = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f272839a, j0Var.f272839a) && Intrinsics.f(this.f272840b, j0Var.f272840b);
    }

    public final int hashCode() {
        return this.f272840b.hashCode() + (this.f272839a.hashCode() * 31);
    }
}
