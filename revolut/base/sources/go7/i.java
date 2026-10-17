package go7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f145097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145098b;

    public i(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145097a = items;
        this.f145098b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f145097a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f145097a.equals(iVar.f145097a) && this.f145098b == iVar.f145098b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145098b) + (this.f145097a.hashCode() * 31);
    }
}
