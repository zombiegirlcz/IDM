package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f325783b;

    public f1(String campaign, e1 badge) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f325782a = campaign;
        this.f325783b = badge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f325782a, f1Var.f325782a) && Intrinsics.f(this.f325783b, f1Var.f325783b);
    }

    public final int hashCode() {
        return this.f325783b.hashCode() + (this.f325782a.hashCode() * 31);
    }
}
