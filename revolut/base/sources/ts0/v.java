package ts0;

import aw0.n1;
import aw0.p1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f273911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f273912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f273913c;

    public v(ArrayList icons, p1 clauses, n1 style) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(clauses, "clauses");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f273911a = icons;
        this.f273912b = clauses;
        this.f273913c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f273911a.equals(vVar.f273911a) && Intrinsics.f(this.f273912b, vVar.f273912b) && this.f273913c == vVar.f273913c;
    }

    public final int hashCode() {
        return this.f273913c.hashCode() + ((this.f273912b.hashCode() + (this.f273911a.hashCode() * 31)) * 31);
    }
}
