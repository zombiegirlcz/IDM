package v30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f285811b;

    public o0(String title, String tag2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f285810a = title;
        this.f285811b = tag2;
    }

    public final String a() {
        return this.f285811b;
    }

    public final String b() {
        return this.f285810a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f285810a, o0Var.f285810a) && Intrinsics.f(this.f285811b, o0Var.f285811b);
    }

    public final int hashCode() {
        return this.f285811b.hashCode() + (this.f285810a.hashCode() * 31);
    }
}
