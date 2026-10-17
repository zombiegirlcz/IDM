package wg2;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f297222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f297223b;

    public f(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f297222a = items;
        this.f297223b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f297222a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f297222a.equals(fVar.f297222a) && this.f297223b == fVar.f297223b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f297223b) + (this.f297222a.hashCode() * 31);
    }
}
