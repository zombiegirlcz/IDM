package hw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f156020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f156021b;

    public u(float f, v style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f156020a = f;
        this.f156021b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Float.compare(this.f156020a, uVar.f156020a) == 0 && this.f156021b == uVar.f156021b;
    }

    public final int hashCode() {
        return this.f156021b.hashCode() + (Float.hashCode(this.f156020a) * 31);
    }
}
