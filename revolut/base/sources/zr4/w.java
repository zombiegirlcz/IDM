package zr4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f324579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324580b;

    public w(v toolbarState, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f324579a = toolbarState;
        this.f324580b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f324580b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f324579a, wVar.f324579a) && Intrinsics.f(this.f324580b, wVar.f324580b);
    }

    public final int hashCode() {
        return this.f324580b.hashCode() + (this.f324579a.hashCode() * 31);
    }
}
