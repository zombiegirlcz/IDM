package p01;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.PercentageClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f231458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PercentageClause f231459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color.Solid f231460c;

    public v(int i, PercentageClause text, Color.Solid color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        this.f231458a = i;
        this.f231459b = text;
        this.f231460c = color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f231458a == vVar.f231458a && this.f231459b.equals(vVar.f231459b) && this.f231460c.equals(vVar.f231460c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f231460c.f51464b) + ((this.f231459b.hashCode() + (Integer.hashCode(this.f231458a) * 31)) * 31);
    }
}
