package e93;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f123866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f123867c;

    public g0(String id10, i0 state, ArrayList imageIds) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(imageIds, "imageIds");
        this.f123865a = id10;
        this.f123866b = state;
        this.f123867c = imageIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f123865a, g0Var.f123865a) && this.f123866b == g0Var.f123866b && this.f123867c.equals(g0Var.f123867c);
    }

    public final int hashCode() {
        return this.f123867c.hashCode() + ((this.f123866b.hashCode() + (this.f123865a.hashCode() * 31)) * 31);
    }
}
