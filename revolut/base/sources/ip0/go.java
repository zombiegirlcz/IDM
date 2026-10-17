package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f164455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f164456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f164457c;
    public final aw0.v5 d;

    public go(Clause startLabel, Clause endLabel, int i, fo barColor) {
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        Intrinsics.checkNotNullParameter(barColor, "barColor");
        aw0.v5 barColor2 = new aw0.v5(barColor.f164293a);
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        Intrinsics.checkNotNullParameter(barColor2, "barColor");
        this.f164455a = startLabel;
        this.f164456b = endLabel;
        this.f164457c = i;
        this.d = barColor2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof go)) {
            return false;
        }
        go goVar = (go) obj2;
        return this.f164455a.equals(goVar.f164455a) && this.f164456b.equals(goVar.f164456b) && this.f164457c == goVar.f164457c && this.d.equals(goVar.d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d.f10572a) + j6.a.b(this.f164457c, p.a.b(this.f164455a.hashCode() * 31, 31, this.f164456b), 31);
    }
}
