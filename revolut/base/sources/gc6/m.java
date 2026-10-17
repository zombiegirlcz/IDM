package gc6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f142358a;

    public m(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f142358a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f142358a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f142358a.equals(((m) obj2).f142358a);
    }

    public final int hashCode() {
        return this.f142358a.hashCode();
    }
}
