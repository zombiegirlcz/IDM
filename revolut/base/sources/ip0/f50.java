package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f50 implements i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j50 f164193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c50 f164194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164195c;

    public f50(j50 style, c50 position, boolean z) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f164193a = style;
        this.f164194b = position;
        this.f164195c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f50)) {
            return false;
        }
        f50 f50Var = (f50) obj2;
        return this.f164193a == f50Var.f164193a && this.f164194b == f50Var.f164194b && this.f164195c == f50Var.f164195c;
    }

    @Override // ip0.i50
    public final c50 getPosition() {
        return this.f164194b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164195c) + ((this.f164194b.hashCode() + (this.f164193a.hashCode() * 31)) * 31);
    }
}
