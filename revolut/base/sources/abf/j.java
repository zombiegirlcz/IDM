package abf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2954a;

    public j(ArrayList assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f2954a = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f2954a.equals(((j) obj2).f2954a);
    }

    public final int hashCode() {
        return this.f2954a.hashCode();
    }
}
