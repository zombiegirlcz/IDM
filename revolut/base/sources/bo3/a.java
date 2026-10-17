package bo3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co3.a f17282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f17283b;

    public a(co3.a topLeft, co3.a bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.f17282a = topLeft;
        this.f17283b = bottomRight;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f17282a, aVar.f17282a) && Intrinsics.f(this.f17283b, aVar.f17283b);
    }

    public final int hashCode() {
        return this.f17283b.hashCode() + (this.f17282a.hashCode() * 31);
    }
}
