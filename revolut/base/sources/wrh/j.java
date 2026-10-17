package wrh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f299589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f299590b;

    public j(ArrayList items, i bottomButtons) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomButtons, "bottomButtons");
        this.f299589a = items;
        this.f299590b = bottomButtons;
    }

    @Override // jki.n
    public final List c() {
        return this.f299589a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f299589a.equals(jVar.f299589a) && this.f299590b.equals(jVar.f299590b);
    }

    public final int hashCode() {
        return this.f299590b.hashCode() + (this.f299589a.hashCode() * 31);
    }
}
