package k77;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f181840b;

    public l(ArrayList pinned, List assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(pinned, "pinned");
        this.f181839a = assets;
        this.f181840b = pinned;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f181839a, lVar.f181839a) && this.f181840b.equals(lVar.f181840b);
    }

    public final int hashCode() {
        return this.f181840b.hashCode() + (this.f181839a.hashCode() * 31);
    }
}
