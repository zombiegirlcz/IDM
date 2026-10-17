package rgf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f254157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f254158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f254159c;

    public i(ArrayList items, List actions, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f254157a = items;
        this.f254158b = actions;
        this.f254159c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f254157a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f254157a.equals(iVar.f254157a) && Intrinsics.f(this.f254158b, iVar.f254158b) && this.f254159c == iVar.f254159c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254159c) + p.a.d(this.f254157a.hashCode() * 31, 31, this.f254158b);
    }
}
