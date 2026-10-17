package b75;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f12918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12919b;

    public i(lw0.a headerModel, aim.e items) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f12918a = headerModel;
        this.f12919b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f12919b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f12918a.equals(iVar.f12918a) && Intrinsics.f(this.f12919b, iVar.f12919b);
    }

    public final int hashCode() {
        return this.f12919b.hashCode() + (this.f12918a.hashCode() * 31);
    }
}
