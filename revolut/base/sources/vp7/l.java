package vp7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f291118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f291119b;

    public l(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f291118a = items;
        this.f291119b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f291118a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f291118a.equals(lVar.f291118a) && this.f291119b == lVar.f291119b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f291119b) + (this.f291118a.hashCode() * 31);
    }
}
