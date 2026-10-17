package ew4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f130086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f130087b;

    public t(s toolbarState, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f130086a = toolbarState;
        this.f130087b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f130087b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f130086a, tVar.f130086a) && Intrinsics.f(this.f130087b, tVar.f130087b);
    }

    public final int hashCode() {
        return this.f130087b.hashCode() + (this.f130086a.hashCode() * 31);
    }
}
