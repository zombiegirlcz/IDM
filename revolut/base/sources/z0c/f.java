package z0c;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f318205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f318206b;

    public f(ArrayList actions, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f318205a = items;
        this.f318206b = actions;
    }

    @Override // cli.p
    public final List c() {
        return this.f318205a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f318205a, fVar.f318205a) && this.f318206b.equals(fVar.f318206b);
    }

    public final int hashCode() {
        return this.f318206b.hashCode() + (this.f318205a.hashCode() * 31);
    }
}
