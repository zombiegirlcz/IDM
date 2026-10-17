package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h50 implements i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j50 f164508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c50 f164509b;

    public h50(j50 style, c50 position) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f164508a = style;
        this.f164509b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h50)) {
            return false;
        }
        h50 h50Var = (h50) obj2;
        return this.f164508a == h50Var.f164508a && this.f164509b == h50Var.f164509b;
    }

    @Override // ip0.i50
    public final c50 getPosition() {
        return this.f164509b;
    }

    public final int hashCode() {
        return this.f164509b.hashCode() + (this.f164508a.hashCode() * 31);
    }
}
