package e10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f121827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f121828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f121829c;
    public final b d;

    public n(b topLef, b topRight, b bottomLeft, b bottomRight) {
        Intrinsics.checkNotNullParameter(topLef, "topLef");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.f121827a = topLef;
        this.f121828b = topRight;
        this.f121829c = bottomLeft;
        this.d = bottomRight;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f121827a, nVar.f121827a) && Intrinsics.f(this.f121828b, nVar.f121828b) && Intrinsics.f(this.f121829c, nVar.f121829c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f121829c.hashCode() + ((this.f121828b.hashCode() + (this.f121827a.hashCode() * 31)) * 31)) * 31);
    }
}
