package n01;

import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f210853a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return Dp.m3299equalsimpl0(this.f210853a, ((f) obj2).f210853a);
        }
        return false;
    }

    public final int hashCode() {
        return Dp.m3300hashCodeimpl(this.f210853a);
    }

    public final String toString() {
        return p.a.p("Fixed(value=", Dp.m3301toStringimpl(this.f210853a), ")");
    }
}
