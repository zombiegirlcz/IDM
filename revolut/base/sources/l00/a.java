package l00;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rzl.c f191134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rzl.c f191135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rzl.c f191136c;
    public final rzl.c d;

    public a(rzl.c topLeft, rzl.c topRight, rzl.c bottomRight, rzl.c bottomLeft) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        this.f191134a = topLeft;
        this.f191135b = topRight;
        this.f191136c = bottomRight;
        this.d = bottomLeft;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f191134a, aVar.f191134a) && Intrinsics.f(this.f191135b, aVar.f191135b) && Intrinsics.f(this.f191136c, aVar.f191136c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f191136c.hashCode() + ((this.f191135b.hashCode() + (this.f191134a.hashCode() * 31)) * 31)) * 31);
    }
}
