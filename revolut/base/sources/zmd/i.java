package zmd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f323466b;

    public i(List items, h toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f323465a = items;
        this.f323466b = toolbarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f323465a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f323465a, iVar.f323465a) && Intrinsics.f(this.f323466b, iVar.f323466b);
    }

    public final int hashCode() {
        return this.f323466b.hashCode() + (this.f323465a.hashCode() * 31);
    }
}
