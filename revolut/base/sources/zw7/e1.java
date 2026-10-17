package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f325777b;

    public e1(String label, d1 icon) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f325776a = label;
        this.f325777b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f325776a, e1Var.f325776a) && this.f325777b == e1Var.f325777b;
    }

    public final int hashCode() {
        return this.f325777b.hashCode() + (this.f325776a.hashCode() * 31);
    }
}
