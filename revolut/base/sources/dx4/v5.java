package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5 f120803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5 f120804b;

    public v5(t5 backgroundColor, u5 iconColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.f120803a = backgroundColor;
        this.f120804b = iconColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj2;
        return this.f120803a == v5Var.f120803a && this.f120804b == v5Var.f120804b;
    }

    public final int hashCode() {
        return this.f120804b.hashCode() + (this.f120803a.hashCode() * 31);
    }
}
