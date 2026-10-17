package q49;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f242086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f242087b;

    public e(aim.e items, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f242086a = items;
        this.f242087b = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f242086a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f242086a.equals(eVar.f242086a) && this.f242087b.equals(eVar.f242087b);
    }

    public final int hashCode() {
        return this.f242087b.hashCode() + (this.f242086a.hashCode() * 31);
    }
}
