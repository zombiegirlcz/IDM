package gdc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f143140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f143141b;

    public n(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f143140a = items;
        this.f143141b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f143140a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f143140a.equals(nVar.f143140a) && this.f143141b == nVar.f143141b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143141b) + (this.f143140a.hashCode() * 31);
    }
}
